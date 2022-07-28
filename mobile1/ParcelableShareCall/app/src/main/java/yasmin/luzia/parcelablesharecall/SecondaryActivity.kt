package yasmin.luzia.parcelablesharecall

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.app.ActivityCompat
import yasmin.luzia.parcelablesharecall.model.Login

class SecondaryActivity : AppCompatActivity() {

    private lateinit var editTextShareContent : EditText
    private lateinit var buttonShare : Button
    private lateinit var editTextPhone : EditText
    private lateinit var buttonCall : Button
    private val CALL_PHONE_REQUEST_CODE: Int = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        initializer()

        val login = intent.getParcelableExtra<Login>("login")
        Toast.makeText(baseContext, "$login" ,Toast.LENGTH_LONG).show()

        buttonShare.setOnClickListener {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, editTextShareContent.text.toString())
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)
        }

        buttonCall.setOnClickListener {
            call()
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when(requestCode) {
            CALL_PHONE_REQUEST_CODE -> {
                if(grantResults.isEmpty() || grantResults[0] != PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(baseContext, getString(R.string.permission_denied), Toast.LENGTH_LONG).show()
                } else {
                    call()
                }
            }
        }
    }

    private fun requestPermission() {
        ActivityCompat.requestPermissions(
            this@SecondaryActivity,
            arrayOf(Manifest.permission.CALL_PHONE),
            CALL_PHONE_REQUEST_CODE
        )
    }

    private fun call() {
        val phone = editTextPhone.text.toString()
        val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:$phone"))

        if(ActivityCompat.checkSelfPermission(this@SecondaryActivity, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
            startActivity(intent)
        } else {
            if(ActivityCompat.shouldShowRequestPermissionRationale(this@SecondaryActivity, Manifest.permission.CALL_PHONE)) {
                Toast.makeText(baseContext, getString(R.string.permission_to_call), Toast.LENGTH_LONG).show()
            }
            requestPermission()
        }
    }

    private fun initializer() {
        editTextShareContent = findViewById(R.id.editTextShareContent)
        buttonShare = findViewById(R.id.buttonShare)
        editTextPhone = findViewById(R.id.editTextPhone)
        buttonCall = findViewById(R.id.buttonCall)
    }
}