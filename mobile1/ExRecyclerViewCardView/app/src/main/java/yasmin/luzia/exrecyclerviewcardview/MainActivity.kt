package yasmin.luzia.exrecyclerviewcardview

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import yasmin.luzia.exrecyclerviewcardview.adapters.CharacterAdapter
import yasmin.luzia.exrecyclerviewcardview.dao.CharacterDAO
import yasmin.luzia.exrecyclerviewcardview.extentions.toast
import yasmin.luzia.exrecyclerviewcardview.model.Character

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: CharacterAdapter
    private var characters = arrayListOf<Character>()

    private lateinit var characterDAO: CharacterDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializer()

        buttonOk.setOnClickListener {
            var character = Character(1, editTextName.text.toString(), editTextCharClass.text.toString(), editTextLevel.text.toString().toInt())

            this.characters.add(character)
//            adapter.notifyDataSetChanged()

            this.characterDAO.store(character)

            adapter.notifyInsertedList()
            toast(R.string.added_char)
        }

    }

    override fun onPause() {
        super.onPause()
        characterDAO.closeDatabase()
    }

    override fun onRestart() {
        super.onRestart()
        characterDAO.openDatabaseWritable()
    }

    private fun resultItemClicked(character: Character) {
        toast("You clicked in $character")

        val dialogBuilder = AlertDialog.Builder(this@MainActivity)

        val alert = dialogBuilder
            .setTitle("Attention")
            .setCancelable(false)
            .setMessage("Delete or go to next screen?")
            .setPositiveButton("Delete", DialogInterface.OnClickListener() {
                    dialog, id ->

                if(this.characterDAO.delete(character)) toast("Deleted successfully!") else toast("Error")
                this.characters.remove(character)
                this.adapter.notifyData()

            })
            .setNegativeButton("Next screen", DialogInterface.OnClickListener() {
                    dialog, id ->

                val intent = Intent(this@MainActivity, CharacterDetail::class.java)
                intent.putExtra("character", character)
                startActivity(intent)

            }).create()

        alert.show()

    }

    private fun initializer() {

        this.characterDAO = CharacterDAO(this@MainActivity)
        this.characterDAO.openDatabaseWritable()

        this.characters = this.characterDAO.fetchCharacters() as ArrayList<Character>

        adapter = CharacterAdapter(characters, this@MainActivity, {
            character: Character -> resultItemClicked(character)
        })
        buttonRecyclerViewCharacters.adapter = adapter

        buttonRecyclerViewCharacters.layoutManager = LinearLayoutManager(this@MainActivity)
//        buttonRecyclerViewCharacters.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

    }
}