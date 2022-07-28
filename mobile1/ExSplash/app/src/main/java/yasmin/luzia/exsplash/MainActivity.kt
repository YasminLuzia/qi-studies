package yasmin.luzia.exsplash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.view.*
import yasmin.luzia.exsplash.model.Character

class MainActivity : AppCompatActivity() {

    private lateinit var editTextCharacterName: EditText
    private lateinit var spinnerFolk: Spinner
    private lateinit var spinnerClass: Spinner
    private lateinit var buttonDone : Button

    private lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializer()

        buttonDone.setOnClickListener {
            if(editTextCharacterName.text.isEmpty() || spinnerFolk.selectedItemPosition == 0 || spinnerClass.selectedItemPosition == 0){
                Toast.makeText(baseContext, getText(R.string.toast_required), Toast.LENGTH_LONG)
                return@setOnClickListener
            }
            val character = Character(editTextCharacterName.text.toString(), spinnerFolk.selectedItem.toString(), spinnerClass.selectedItem.toString())
            val intent = Intent(this@MainActivity, SecondaryActivity::class.java)
            intent.putExtra("character", character)

            startActivity(intent)
        }
    }

    private fun initializer() {
        editTextCharacterName = findViewById(R.id.editTextCharacterName)
        spinnerFolk = findViewById(R.id.spinnerSelectFolk)
        spinnerClass = findViewById(R.id.spinnerSelectClass)
        editTextCharacterName = findViewById(R.id.editTextCharacterName)
        buttonDone = findViewById(R.id.buttonDone)

        val listClass = arrayOf("Select", "Barbarian","Bard", "Warlock", "Cleric", "Druid", "Sorcerer", "Warrior", "Rogue", "Wizard", "Monk", "Paladin", "Ranger")

        adapter = ArrayAdapter(this@MainActivity, android.R.layout.simple_dropdown_item_1line, listClass)

        spinnerClass.adapter = adapter
    }
}