package yasmin.luzia.exsplash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import yasmin.luzia.exsplash.model.Character

class SecondaryActivity : AppCompatActivity() {

    private lateinit var textViewCharacter: TextView
    private lateinit var textViewResult: TextView
    private lateinit var buttonRoll: Button
    private lateinit var radioButtonAdvDis: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        initializer()

        val character = intent.getParcelableExtra<Character>("character")

        textViewCharacter.text = character.toString()

        buttonRoll.setOnClickListener {
            val roll = (1..20).random()

            if(radioButtonAdvDis.isChecked){
                val rollAdvantageDisadvantage = (1..20).random()
                textViewResult.text = "$roll - $rollAdvantageDisadvantage"
            }
            textViewResult.text = "$roll"
        }
    }

    private fun initializer() {
        textViewCharacter = findViewById(R.id.textViewCharacter)
        textViewResult = findViewById(R.id.textViewResult)
        buttonRoll = findViewById(R.id.buttonRoll)
        radioButtonAdvDis =findViewById(R.id.radioButtonAdvDis)
    }
}