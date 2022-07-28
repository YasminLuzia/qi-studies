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
import kotlinx.android.synthetic.main.fragment_search_spell_by_class.*
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
 * Use the [FragmentSearchSpellByClass.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentSearchSpellByClass : Fragment(), View.OnClickListener {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var adapter: SpellAdapter
    private var spells = arrayListOf<String>()

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

        val view: View = inflater.inflate(R.layout.fragment_search_spell_by_class, container, false)

        val buttonToSpellsListFromClass = view.findViewById<Button>(R.id.fragmentSearchSpellByClassButtonSearch)

        buttonToSpellsListFromClass.setOnClickListener(this)

        return view
    }

    override fun onClick(button: View?) {
        when(button?.id) {
            R.id.fragmentSearchSpellByClassButtonSearch -> {
                if (fragmentSearchSpellByClassSpinnerClasses.selectedItemPosition != 0) {

                    adapter = SpellAdapter(spells, button.context) { spell: String -> resultItemClicked(spell, button.context)}

                    fragmentSearchSpellByClassRecyclerView.adapter = adapter
                    fragmentSearchSpellByClassRecyclerView.layoutManager = LinearLayoutManager(button.context)

                    makeSpellByClassCall(fragmentSearchSpellByClassSpinnerClasses.selectedItem.toString())

                } else {
                    alert(button.context,
                          getString(R.string.alert_title_search_spell_by_class),
                          getString(R.string.alert_message_search_spell_by_class))
                }
            }
        }
    }

    private fun resultItemClicked(spell: String, context: Context) {
        val intent = Intent(context, SpellDataActivity::class.java)
        intent.putExtra("spellName", spell)
        startActivity(intent)
    }

    private fun makeSpellByClassCall(className: String) {
        fragmentSearchSpellByClassButtonSearch.isClickable = false

        spells.clear()
        adapter.notifyItemRangeChanged(0, spells.size)
        
        fragmentSearchSpellByClassTextViewSearching.visibility = View.VISIBLE
        fragmentSearchSpellByClassProgressBar.visibility = View.VISIBLE
        fragmentSearchSpellByClassTextViewError.visibility = View.INVISIBLE
        fragmentSearchSpellByClassTextViewListTitle.visibility = View.INVISIBLE

        val callSpellsByClass = RetrofitInitializer().spellService().findSpellsByClass(className.toLowerCase())

        callSpellsByClass.enqueue(object: Callback<SpellBase> {
            override fun onFailure(call: Call<SpellBase>, t: Throwable) {

                fragmentSearchSpellByClassTextViewSearching.visibility = View.INVISIBLE
                fragmentSearchSpellByClassProgressBar.visibility = View.INVISIBLE
                fragmentSearchSpellByClassTextViewError.visibility = View.VISIBLE

                fragmentSearchSpellByClassTextViewError.text = getString(R.string.callback_error_no_internet_connection)

                fragmentSearchSpellByClassButtonSearch.isClickable = true
            }

            override fun onResponse(call: Call<SpellBase>, response: Response<SpellBase>) {

                fragmentSearchSpellByClassTextViewSearching.visibility = View.INVISIBLE
                fragmentSearchSpellByClassProgressBar.visibility = View.INVISIBLE

                if(response.isSuccessful) {

                    val spellBase = response.body() as SpellBase

                    for (index in spellBase.results.indices) {
                        spells.add(spellBase.results[index].name)
                    }
                    spells.sort()

                    adapter.notifyItemInserted()

                    fragmentSearchSpellByClassTextViewListTitle.visibility = View.VISIBLE
                    fragmentSearchSpellByClassTextViewListTitle.text = getString(R.string.fragment_spells_by_class_textview_list_title, className, spells.size)
                } else {
                    fragmentSearchSpellByClassTextViewError.visibility = View.VISIBLE
                    fragmentSearchSpellByClassTextViewError.text = getString(R.string.callback_error_nothing_found)
                }

                fragmentSearchSpellByClassButtonSearch.isClickable = true
            }
        })
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FragmentSearchSpellByClass.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FragmentSearchSpellByClass().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}