package yasmin.luzia.expostest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import yasmin.luzia.expostest.model.Month

class MainActivity : AppCompatActivity() {

    private lateinit var editTextNumber: EditText
    private lateinit var button: Button
    private lateinit var textViewResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializer()

        button.setOnClickListener {
            var month = Month(editTextNumber.text.toString().toInt(), this@MainActivity)
            textViewResult.text = month.showMonth()

            editTextNumber.text.clear()
        }
    }

    private fun initializer() {
        editTextNumber = findViewById(R.id.editTextNumber)
        button = findViewById(R.id.button)
        textViewResult = findViewById(R.id.textViewResult)
    }
}