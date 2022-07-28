package yasmin.luzia.sillycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var editTextSkillName: EditText
    private lateinit var buttonRoll: Button
    private lateinit var textViewResult : TextView
    private lateinit var textViewPercentage : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextSkillName = findViewById(R.id.editTextSkillName)
        buttonRoll = findViewById(R.id.buttonRoll)
        textViewResult = findViewById(R.id.textViewResult)
        textViewPercentage = findViewById(R.id.textViewPercentage)

        buttonRoll.setOnClickListener {
            var skill = editTextSkillName.text.toString()

            val random = (0..100).random()

            textViewResult.text = "${getText(R.string.your)} $skill ${getText(R.string.check)}:"
            textViewPercentage.text = "$random %"

            editTextSkillName.text.clear()
        }

    }

}