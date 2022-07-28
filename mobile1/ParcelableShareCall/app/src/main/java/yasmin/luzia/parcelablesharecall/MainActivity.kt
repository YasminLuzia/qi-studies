package yasmin.luzia.parcelablesharecall

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import yasmin.luzia.parcelablesharecall.model.Login

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
            if(editTextEmail.text.isEmpty() || editTextPassword.text.isEmpty()){
                Toast.makeText(baseContext,getString(R.string.toast_credentials), Toast.LENGTH_SHORT).show()
            } else {
                val login = Login(editTextEmail.text.toString())
                val intent = Intent(this@MainActivity, SecondaryActivity::class.java)

                intent.putExtra("login", login)
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