package yasmin.luzia.exretrofit

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_search_spell.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import yasmin.luzia.exretrofit.adapters.SpellAdapter
import yasmin.luzia.exretrofit.extention.alert
import yasmin.luzia.exretrofit.model.SpellBase

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentSearchSpell.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentSearchSpell : Fragment(), View.OnClickListener {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var adapter: SpellAdapter
    private var spells = arrayListOf<String>()

    private var spellsContains = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_search_spell, container, false)

        val buttonToSpellData = view.findViewById<Button>(R.id.fragmentSearchSpellButtonToSpellData)

        buttonToSpellData.setOnClickListener(this)

        return view
    }

    override fun onClick(button: View?) {
        when(button?.id) {
            R.id.fragmentSearchSpellButtonToSpellData -> {
                if(fragmentSearchSpellEditTextSpellName.text.isNotEmpty()) {

                    adapter = SpellAdapter(spells, button.context) { spell: String -> resultItemClicked(spell, button.context)}

                    fragmentSearchSpellRecyclerView.adapter = adapter
                    fragmentSearchSpellRecyclerView.layoutManager = LinearLayoutManager(button.context)

                    makeSpellSearch()

                } else {
                    alert(button.context,
                        getString(R.string.alert_title_search_spell_individually),
                        getString(R.string.alert_message_search_spell_individually))
                }
            }
        }
    }

    private fun makeSpellSearch() {
        fragmentSearchSpellButtonToSpellData.isClickable = false

        spells.clear()
        adapter.notifyItemRangeChanged(0, spells.size)

        fragmentSearchSpellTextViewSearching.visibility = View.VISIBLE
        fragmentSearchSpellProgressBar.visibility = View.VISIBLE
        fragmentSearchSpellTextViewError.visibility = View.INVISIBLE
        fragmentSearchSpellTextViewListTitle.visibility = View.INVISIBLE

        val callSpellSearch = RetrofitInitializer().spellService().findAllSpells()

        callSpellSearch.enqueue(object: Callback<SpellBase> {
            override fun onFailure(call: Call<SpellBase>, t: Throwable) {

                fragmentSearchSpellTextViewSearching.visibility = View.INVISIBLE
                fragmentSearchSpellProgressBar.visibility = View.INVISIBLE
                fragmentSearchSpellTextViewError.visibility = View.VISIBLE

                fragmentSearchSpellTextViewError.text = getString(R.string.callback_error_no_internet_connection)

                fragmentSearchSpellButtonToSpellData.isClickable = true
            }

            override fun onResponse(call: Call<SpellBase>, response: Response<SpellBase>) {

                fragmentSearchSpellTextViewSearching.visibility = View.INVISIBLE
                fragmentSearchSpellProgressBar.visibility = View.INVISIBLE

                if(response.isSuccessful) {
                    val searchingFor = fragmentSearchSpellEditTextSpellName.text.toString()

                    val spellBase = response.body() as SpellBase

                    for (index in spellBase.results.indices) {
                        if (spellBase.results[index].name.contains(searchingFor)) {
                            spells.add(spellBase.results[index].name)
                        }
                    }
                    spells.sort()

                    adapter.notifyItemInserted()

                    if (spells.isNotEmpty()) {
                        fragmentSearchSpellTextViewListTitle.visibility = View.VISIBLE
                        fragmentSearchSpellTextViewListTitle.text = getString(R.string.fragment_search_spell_list_title, searchingFor, spells.size)
                    } else {
                        fragmentSearchSpellTextViewError.visibility = View.VISIBLE
                        fragmentSearchSpellTextViewError.text =
                            getString(R.string.callback_error_nothing_found)
                    }
                }

                fragmentSearchSpellButtonToSpellData.isClickable = true
            }

        })
    }

    private fun resultItemClicked(spell: String, context: Context) {
        val intent = Intent(context, SpellDataActivity::class.java)
        intent.putExtra("spellName", spell)
        startActivity(intent)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FragmentSearchSpell.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FragmentSearchSpell().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}