package yasmin.luzia.spiritblossomapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoveMeterActivity : AppCompatActivity() {

    private lateinit var editTextPersonName : EditText
    private lateinit var editTextChampionName : EditText
    private lateinit var buttonCalculate: Button
    private lateinit var textViewResult : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.love_meter_screen)

        initializer()

        buttonCalculate.setOnClickListener {
        if(editTextPersonName.length() < 2 || editTextChampionName.length() < 2){
            Toast.makeText(baseContext, getString(R.string.invalid_names), Toast.LENGTH_SHORT).show()
            return@setOnClickListener
            } else {
                var championName = editTextChampionName.text.toString()
                val random = (0..100).random()
                var response = when (random) {
                    in 0..40 -> getString(R.string.how_unfortunate)
                    in 41..70 -> getString(R.string.kinda_good)
                    in 71..100 -> getString(R.string.lucky)
                    else -> ""
                }
                textViewResult.text = "${getText(R.string.you_and)} $championName ${getText(R.string.match)} $random %. $response"
                clear()
            }
        }
    }

    private fun initializer() {
        editTextPersonName = findViewById(R.id.editTextPersonName)
        editTextChampionName = findViewById(R.id.editTextChampionName)
        buttonCalculate = findViewById(R.id.buttonLoveMeter)
        textViewResult = findViewById(R.id.textViewResult)
    }

    private fun clear() {
        editTextPersonName.text.clear()
        editTextChampionName.text.clear()
    }
}