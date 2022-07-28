package yasmin.luzia.lifecirclelogcat

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private val TAG_LOG_MAIN_ACTIVITY: String = "Log MainActivity"
    private lateinit var editTextURL: EditText
    private lateinit var buttonBrowser: Button
    private lateinit var editTextPhone: EditText
    private lateinit var buttonDial: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG_LOG_MAIN_ACTIVITY, "Entrou no onCreate")
        initializer()
        Log.d(TAG_LOG_MAIN_ACTIVITY, "Passou do initializer")

        buttonBrowser.setOnClickListener {
            Log.d(TAG_LOG_MAIN_ACTIVITY, "Clicou no botão Browser")
            val URL = editTextURL.text.toString()
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://${URL}"))
            startActivity(intent)
        }

        buttonDial.setOnClickListener {
            Log.d(TAG_LOG_MAIN_ACTIVITY, "Clicou no botão Dial")
            val phone = editTextPhone.text.toString()
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${phone}"))
            startActivity(intent)
        }

    }

    private fun initializer() {
        Log.d(TAG_LOG_MAIN_ACTIVITY, "Entrou no initializer")
        editTextURL = findViewById(R.id.editTextURL)
        buttonBrowser = findViewById(R.id.buttonBrowser)
        editTextPhone = findViewById(R.id.editTextPhone)
        buttonDial = findViewById(R.id.buttonDial)
        Log.d(TAG_LOG_MAIN_ACTIVITY, "Saiu do initializer")
    }

//    Ciclo de vida activity e LogCat
//    override fun onStart() {
//        super.onStart()
//        Log.i(TAG_LOG_MAIN_ACTIVITY, "Entrou no onStart")
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.i(TAG_LOG_MAIN_ACTIVITY, "Entrou no onResume")
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Log.i(TAG_LOG_MAIN_ACTIVITY, "Entrou no onPause")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Log.i(TAG_LOG_MAIN_ACTIVITY, "Entrou no onStop")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.i(TAG_LOG_MAIN_ACTIVITY, "Entrou no onDestroy")
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//        Log.i(TAG_LOG_MAIN_ACTIVITY, "Entrou no onRestart")
//    }
}