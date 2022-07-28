package yasmin.luzia.revisionproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import yasmin.luzia.revisionproject.model.Square

class SquareScreen : AppCompatActivity() {

    private lateinit var editTextNumberDecimal: EditText
    private lateinit var spinnerTypeOfCalculus: Spinner
    private lateinit var buttonCalculate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square_screen)

        initializer()

        buttonCalculate.setOnClickListener {
            if(editTextNumberDecimal.text.isEmpty() || spinnerTypeOfCalculus.selectedItemPosition == 0) {
                toast("Please, fill the requests")
                return@setOnClickListener
            }
            val square = Square(editTextNumberDecimal.text.toString().toDouble())
            when(spinnerTypeOfCalculus.selectedItemPosition) {
                1 -> toast("The area of the square is ${square.calculateArea()}m².")
                2 -> toast("The perimeter of the square is ${square.calculatePerimeter()}m")
                3 -> toast("The area is ${square.calculateArea()}m² and the perimeter is ${square.calculatePerimeter()}m.")
            }

            clear()
        }

    }

    private fun toast(message: String) {
        Toast.makeText(baseContext, message, Toast.LENGTH_LONG).show()
    }

    private fun initializer() {
        editTextNumberDecimal = findViewById(R.id.editTextNumberDecimal)
        spinnerTypeOfCalculus = findViewById(R.id.spinnerTypeOfCalculus)
        buttonCalculate = findViewById(R.id.buttonCalculate)
    }

    private fun clear() {
        editTextNumberDecimal.text.clear()
        spinnerTypeOfCalculus.setSelection(0)
    }
}