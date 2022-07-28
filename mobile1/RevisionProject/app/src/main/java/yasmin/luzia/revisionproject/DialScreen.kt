package yasmin.luzia.revisionproject

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class DialScreen : AppCompatActivity() {

    private lateinit var editTextPhone: EditText
    private lateinit var buttonDial: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dial_screen)

        initializer()

        buttonDial.setOnClickListener {
            val phone = editTextPhone.text.toString()
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${phone}"))
            startActivity(intent)
        }
    }

    private fun initializer() {
        editTextPhone = findViewById(R.id.editTextPhoneDial)
        buttonDial = findViewById(R.id.buttonDial)
    }
}