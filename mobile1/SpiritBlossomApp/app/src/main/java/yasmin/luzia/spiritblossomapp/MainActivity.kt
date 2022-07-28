package yasmin.luzia.spiritblossomapp

import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var buttonOpenYasuoActivity : Button
    private lateinit var buttonOpenLoveMeterActivity : Button
    private lateinit var buttonAlertRiven : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_screen)

        initializer()

        buttonOpenYasuoActivity.setOnClickListener {
            val intent = Intent(this@MainActivity, YasuoActivity::class.java)
            startActivity(intent)
        }

        buttonOpenLoveMeterActivity.setOnClickListener {
            val intent = Intent(this@MainActivity, LoveMeterActivity::class.java)
            startActivity(intent)
        }

        buttonAlertRiven.setOnClickListener{
            vibrate()
            var alert = AlertDialog.Builder(this@MainActivity)

            alert.setMessage(getText(R.string.phrase_riven_button))
            alert.setNeutralButton(getText(R.string.neutral_button_oops), null)
            alert.show()
        }
    }

    private fun initializer() {
        buttonOpenYasuoActivity = findViewById(R.id.buttonYasuosMusic)
        buttonOpenLoveMeterActivity = findViewById(R.id.buttonLoveMeter)
        buttonAlertRiven = findViewById(R.id.buttonRiven)
    }

    private fun vibrate() {
        val pattern = longArrayOf(0, 300)

        val hardware = this@MainActivity.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator

        hardware?.let {
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                hardware.vibrate(VibrationEffect.createWaveform(pattern, -1))
            }
        }

    }
}