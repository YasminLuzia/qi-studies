package thiago.araujo.provan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var buttonCalculator: Button
    private lateinit var buttonRandom: Button
    private lateinit var textViewAbout: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializer()

        buttonCalculator.setOnClickListener(this@MainActivity)
        buttonRandom.setOnClickListener(this@MainActivity)
        textViewAbout.setOnClickListener(this@MainActivity)
    }

    private fun initializer() {
        buttonCalculator = findViewById(R.id.buttonToCalculator)
        buttonRandom = findViewById(R.id.buttonToRandom)
        textViewAbout = findViewById(R.id.textViewToAbout)
    }

    override fun onClick(button: View?) {
        when(button?.id) {
            R.id.buttonToCalculator -> {
                val intent = Intent(this@MainActivity, CalculatorScreen::class.java)
                startActivity(intent)
            }
            R.id.buttonToRandom -> {
                val intent = Intent(this@MainActivity, RandomScreen::class.java)
                startActivity(intent)
            }
            R.id.textViewToAbout -> {
                val intent = Intent(this@MainActivity, AboutScreen::class.java)
                startActivity(intent)
            }
        }
    }
}