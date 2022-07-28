package thiago.araujo.provan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class RandomScreen : AppCompatActivity(), View.OnClickListener {

    private lateinit var buttonRandom: Button
    private lateinit var textViewRandom: TextView
    private lateinit var textViewAbout: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_screen)

        initializer()

        buttonRandom.setOnClickListener(this@RandomScreen)
        textViewAbout.setOnClickListener(this@RandomScreen)
    }

    private fun initializer() {
        buttonRandom = findViewById(R.id.buttonRandom)
        textViewRandom = findViewById(R.id.textViewRandom)
        textViewAbout = findViewById(R.id.textViewToAbout)
    }

    override fun onClick(button: View?) {
        when(button?.id) {
            R.id.buttonRandom -> {
                val randomNumber = (1..20).random()
                textViewRandom.text = "$randomNumber"
            }
            R.id.textViewToAbout -> {
                val intent = Intent(this@RandomScreen, AboutScreen::class.java)
                startActivity(intent)
            }
        }
    }
}