package yasmin.luzia.loginurl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val TAG_LOG_MAIN_ACTIVITY: String = "TagMainActivity"
    private lateinit var editTextEmail : EditText
    private lateinit var editTextPassword : EditText
    private lateinit var buttonLogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG_LOG_MAIN_ACTIVITY, "Entrou no onCreate")

        initializer()

        buttonLogin.setOnClickListener {
            if(editTextEmail.length() < 2 || editTextPassword.length() < 2){
                Toast.makeText(baseContext,getString(R.string.toast_credentials), Toast.LENGTH_SHORT).show()
            } else {
                val valueEmail = editTextEmail.text.toString()
                val intent = Intent(this@MainActivity, ScreenURL::class.java)

                intent.putExtra("valueEmail", valueEmail)

                startActivity(intent)
            }
        }
    }

    private fun initializer() {
        editTextEmail = findViewById(R.id.editTextEmail)
        editTextPassword = findViewById(R.id.editTextPassword)
        buttonLogin = findViewById(R.id.buttonLogin)
    }
}