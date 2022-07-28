package yasmin.luzia.exretrofit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_favorite_spells.*
import yasmin.luzia.exretrofit.adapters.SpellAdapter
import yasmin.luzia.exretrofit.dao.AppDatabase
import yasmin.luzia.exretrofit.model.FavoriteSpell

class FavoriteSpellsActivity : AppCompatActivity() {

    private lateinit var adapter: SpellAdapter
    private var spells = arrayListOf<String>()

    private lateinit var favoriteSpellsFromDatabase: List<FavoriteSpell>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite_spells)

        val database = AppDatabase.openDatabase(this@FavoriteSpellsActivity)
        favoriteSpellsFromDatabase = database!!.favoriteSpellDao().fetch()

        initializer()

        if(favoriteSpellsFromDatabase.isNotEmpty()) {
            for(index in favoriteSpellsFromDatabase.indices) {
                spells.add(favoriteSpellsFromDatabase[index].name.toString())

            }
            adapter.notifyItemInserted()
            
            favoriteSpellsTextViewNoFavorites.visibility = View.INVISIBLE
        }
    }

    private fun initializer() {
        adapter = SpellAdapter(spells, this@FavoriteSpellsActivity) { spell: String -> resultItemClicked(spell)}

        favoriteSpellsRecyclerView.adapter = adapter
        favoriteSpellsRecyclerView.layoutManager = LinearLayoutManager(this@FavoriteSpellsActivity)
    }

    private fun resultItemClicked(spell: String) {
        val intent = Intent(this@FavoriteSpellsActivity, SpellDataActivity::class.java)
        intent.putExtra("spellName", spell)
        startActivity(intent)
    }
}