package yasmin.luzia.revisionproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var buttonToDial: Button
    private lateinit var buttonToStudent: Button
    private lateinit var buttonToSquare: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializer()

        buttonToDial.setOnClickListener {
            val intent = Intent(this@MainActivity, DialScreen::class.java)
            startActivity(intent)
        }

        buttonToStudent.setOnClickListener {
            val intent = Intent(this@MainActivity, StudentScreen::class.java)
            startActivity(intent)
        }

        buttonToSquare.setOnClickListener {
            val intent = Intent(this@MainActivity, SquareScreen::class.java)
            startActivity(intent)
        }

    }

    private fun initializer() {
        buttonToDial = findViewById(R.id.buttonToDial)
        buttonToStudent = findViewById(R.id.buttonToStudent)
        buttonToSquare = findViewById(R.id.buttonToSquare)
    }
}