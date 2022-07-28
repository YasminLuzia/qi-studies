package yasmin.luzia.exretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_spell_data.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import yasmin.luzia.exretrofit.dao.AppDatabase
import yasmin.luzia.exretrofit.extention.toast
import yasmin.luzia.exretrofit.model.FavoriteSpell
import yasmin.luzia.exretrofit.model.Spell

class SpellDataActivity : AppCompatActivity(), View.OnClickListener {

    private var database: AppDatabase? = null

    private lateinit var favoriteSpellsList: List<FavoriteSpell>
    private lateinit var spell: Spell

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spell_data)

        initializer()

        val spellName = intent.getStringExtra("spellName").toString()

        spellDataTextViewTitle.text = getString(R.string.spell_data_textview_title, spellName)

        makeSpellCall(spellName)

        spellDataFloatingButtonFavorite.setOnClickListener(this)
    }

    override fun onClick(button: View?) {
        when(button?.id) {
            R.id.spellDataFloatingButtonFavorite -> {
                favoriteSpellsList = database!!.favoriteSpellDao().fetch()

                if(favoriteSpellsList.isNotEmpty()) {
                    val listSpellName = arrayListOf<String>()

                    for (index in favoriteSpellsList.indices) {
                        listSpellName.add(favoriteSpellsList[index].name.toString())
                    }

                    if (listSpellName.contains(spell.name)) {
                        removeFavoriteSpellFromDatabase(spell.name)
                    } else {
                        addFavoriteSpellToDatabase()
                    }
                } else {
                    addFavoriteSpellToDatabase()
                }
            }
        }
    }

    private fun initializer() {
        database = AppDatabase.openDatabase(this@SpellDataActivity)

        favoriteSpellsList = database!!.favoriteSpellDao().fetch()
    }

    private fun makeSpellCall(spellName: String) {

        val callSpellData = RetrofitInitializer().spellService().findSpellsByName(transformSpellNameIntoIndex(spellName))

        callSpellData.enqueue(object : Callback<Spell> {

            override fun onFailure(call: Call<Spell>, t: Throwable) {
                spellDataTextViewSearching.visibility = View.INVISIBLE
                spellDataProgressBar.visibility = View.INVISIBLE
                spellDataTextViewError.visibility = View.VISIBLE

                spellDataTextViewError.text = getString(R.string.callback_error_no_internet_connection)
            }

            override fun onResponse(call: Call<Spell>, response: Response<Spell>) {
                spellDataTextViewSearching.visibility = View.INVISIBLE
                spellDataProgressBar.visibility = View.INVISIBLE

                if(response.isSuccessful) {

                    spellDataLayout.visibility = View.VISIBLE
                    spellDataFloatingButtonFavorite.visibility = View.VISIBLE

                    spell = response.body() as Spell

                    setTextViewText(spell)

                    for(index in favoriteSpellsList.indices) {
                        if(favoriteSpellsList[index].name.equals(spell.name)) {
                            spellDataFloatingButtonFavorite.setImageDrawable(getDrawable(R.drawable.button_star_on))
                        }
                    }

                } else {
                    spellDataTextViewError.visibility = View.VISIBLE
                    spellDataTextViewError.text = getString(R.string.callback_error_nothing_found)
                }
            }
        })
    }

    private fun setTextViewText(spell: Spell) {
        spellDataTextViewSpellName.text = spell.name
        spellDataTextViewSpellSchool.text = spell.school.name
        spellDataTextViewSpellRange.text = spell.range
        spellDataTextViewSpellCastingTime.text = spell.casting_time

        spellDataTextViewSpellClasses.text = spell.classes.joinToString(", ")
        spellDataTextViewSpellComponents.text = spell.components.joinToString(", ")
        spellDataTextViewSpellDescription.text = spell.desc.joinToString("\n\n")

        if(spell.level != 0) spellDataTextViewSpellLevel.text = spell.level.toString()
        if(spell.components.contains("M")) spellDataTextViewSpellMaterial.text = spell.material

        if(spell.ritual) spellDataTextViewSpellRitual.text = getString(R.string.string_yes)

        if(spell.concentration) spellDataTextViewSpellDuration.text = "${getString(R.string.spell_data_textview_spell_duration_concentration)}. ${spell.duration} "
        else spellDataTextViewSpellDuration.text = spell.duration
    }

    private fun transformSpellNameIntoIndex(spellName: String) : String {
        return spellName.toLowerCase()
            .replace(Regex("[/, ]"), "-")
            .replace("'", "")
    }

    private fun addFavoriteSpellToDatabase() {
        database!!.favoriteSpellDao().store(FavoriteSpell(null, spell.name))
        spellDataFloatingButtonFavorite.setImageDrawable(getDrawable(R.drawable.button_star_on))
        toast(getString(R.string.toast_spell_added_to_favorites))
    }

    private fun removeFavoriteSpellFromDatabase(spellName: String) {
        database!!.favoriteSpellDao().deleteByName(spellName)
        spellDataFloatingButtonFavorite.setImageDrawable(getDrawable(R.drawable.button_star_off))
        toast(getString(R.string.toast_spell_removed_from_favorites))
    }
}