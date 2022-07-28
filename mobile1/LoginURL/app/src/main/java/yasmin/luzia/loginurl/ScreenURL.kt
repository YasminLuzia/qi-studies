package yasmin.luzia.loginurl

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ScreenURL : AppCompatActivity() {

    private val TAG_LOG_MAIN_ACTIVITY: String = "TagMainActivity"
    private lateinit var buttonFacebook : Button
    private lateinit var editTextBrowser : EditText
    private lateinit var buttonBrowser : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_u_r_l)
        Log.d(TAG_LOG_MAIN_ACTIVITY, "Entrou no onCreate")

        initializer()

        val valueEmail = intent.getStringExtra("valueEmail")

        Toast.makeText(baseContext, "${getString(R.string.welcome)}$valueEmail!",Toast.LENGTH_LONG).show()

        buttonFacebook.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://facebook.com"))
            startActivity(intent)
        }

        buttonBrowser.setOnClickListener {
            val URL = editTextBrowser.text.toString()
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://${URL}"))
            startActivity(intent)
        }

    }

    private fun initializer() {
        buttonFacebook = findViewById(R.id.buttonToFacebook)
        editTextBrowser = findViewById(R.id.editTextBrowser)
        buttonBrowser = findViewById(R.id.buttonBrowser)
    }
}