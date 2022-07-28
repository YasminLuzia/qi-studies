package yasmin.luzia.exspinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import yasmin.luzia.exspinner.model.Being

class MainActivity : AppCompatActivity() {

    private lateinit var spinnerGender: Spinner
    private lateinit var buttonChoose: Button
    private lateinit var layout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializer()

        buttonChoose.setOnClickListener {
            val being = Being(spinnerGender.selectedItem.toString())
            if(spinnerGender.selectedItemPosition == 0){
                toast("Select a gender")
                layout.setBackgroundColor(getColor(R.color.red700))
                return@setOnClickListener
            }
            layout.setBackgroundColor(getColor(R.color.green700))
            toast("${being.toString()}")
        }

        spinnerGender.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {}

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if(p2 != 0) {
                    val being = Being(spinnerGender.getItemAtPosition(p2).toString())
                    toast("${being.toString()}")
                }
            }
        }
    }

    private fun toast(message: String) {
        Toast.makeText(baseContext, message, Toast.LENGTH_LONG).show()
    }

    private fun initializer() {
        spinnerGender = findViewById(R.id.spinnerGender)
        buttonChoose = findViewById(R.id.buttonChoose)
        layout = findViewById(R.id.layout)
    }
}