import android.app.Activity
import android.content.Context
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import android.widget.Toast


fun Activity.toast(message: Int) {
    Toast.makeText(baseContext, getText(message), Toast.LENGTH_LONG).show()
}

fun Activity.toast(message: String) {
    Toast.makeText(baseContext, message, Toast.LENGTH_LONG).show()
}

fun vibrate(context: Context) {
    val pattern = longArrayOf(0, 300)

    val hardware = context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator

    hardware?.let {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            hardware.vibrate(VibrationEffect.createWaveform(pattern, -1))
        }
    }

}