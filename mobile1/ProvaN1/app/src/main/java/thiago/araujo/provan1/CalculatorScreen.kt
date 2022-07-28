package thiago.araujo.provan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import thiago.araujo.provan1.model.Calculator

class CalculatorScreen : AppCompatActivity(), View.OnClickListener {

    private lateinit var editTextValue1 : EditText
    private lateinit var editTextValue2 : EditText
    private lateinit var spinnerOperation: Spinner
    private lateinit var buttonCalculate: Button
    private lateinit var textViewAbout: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_screen)

        initializer()

        buttonCalculate.setOnClickListener(this@CalculatorScreen)
        textViewAbout.setOnClickListener(this@CalculatorScreen)
    }

    override fun onClick(button: View?) {
        when(button?.id) {
            R.id.buttonCalculate -> {
                if(validateValues()) {
                    val value1 = editTextValue1.text.toString().toDouble()
                    val value2 = editTextValue2.text.toString().toDouble()

                    val calculator = Calculator(editTextValue1.text.toString().toDouble(), editTextValue2.text.toString().toDouble())

                    if(spinnerOperation.selectedItemPosition == 1) sendToast("$value1 + $value2 = ${calculator.addValues()}")
                    else if(spinnerOperation.selectedItemPosition == 2) sendToast("$value1 - $value2 = ${calculator.subtractValues()}")
                    else if(spinnerOperation.selectedItemPosition == 3) sendToast("$value1 × $value2 = ${calculator.multiplyValues()}")
                    else sendToast("$value1 ÷ $value2 = ${calculator.divideValues()}")
                }
            }
            R.id.textViewToAbout -> {
                val intent = Intent(this@CalculatorScreen, AboutScreen::class.java)
                startActivity(intent)
            }
        }
    }

    private fun initializer() {
        editTextValue1 = findViewById(R.id.editFirstValue)
        editTextValue2 = findViewById(R.id.editSecondValue)
        spinnerOperation = findViewById(R.id.spinnerOperations)
        buttonCalculate = findViewById(R.id.buttonCalculate)
        textViewAbout = findViewById(R.id.textViewToAbout)
    }

    private fun validateValues() : Boolean {
        if(editTextValue1.text.isEmpty()) {
            sendToast(getString(R.string.toast_value1_empty))
            return false
        } else if(editTextValue2.text.isEmpty()) {
            sendToast(getString(R.string.toast_value2_empty))
            return false
        } else if(spinnerOperation.selectedItemPosition == 0) {
            sendToast(getString(R.string.toast_spinner_opertion_invalid))
        } else if(editTextValue2.text.toString().toDouble() == 0.0 && spinnerOperation.selectedItemPosition == 4) {
            sendToast(getString(R.string.toast_value2_is_zero))
        }
        return true
    }

    private fun sendToast(message: String) {
        Toast.makeText(baseContext, message, Toast.LENGTH_SHORT).show()
    }


}