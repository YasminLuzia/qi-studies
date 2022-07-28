package yasmin.luzia.exretrofit.extention

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.widget.Toast
import androidx.fragment.app.Fragment
import yasmin.luzia.exretrofit.R

fun Activity.toast(message: Int) {
    Toast.makeText(baseContext, getText(message), Toast.LENGTH_LONG).show()
}

fun Activity.toast(message: String) {
    Toast.makeText(baseContext, message, Toast.LENGTH_LONG).show()
}

fun Fragment.alert(context: Context, title: String, message: String) {
    AlertDialog.Builder(context)
        .setIcon(R.mipmap.ic_launcher)
        .setTitle(title)
        .setMessage(message)
        .setNeutralButton(R.string.alert_neutral_button, null)
        .setCancelable(false)
        .show()
        .getButton(AlertDialog.BUTTON_NEUTRAL).setTextColor(context.getColor(R.color.blue500))
}