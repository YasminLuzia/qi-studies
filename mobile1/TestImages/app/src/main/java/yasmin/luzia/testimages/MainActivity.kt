package yasmin.luzia.testimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private lateinit var beauAlert : Button
    private lateinit var beauToast : Button

    private lateinit var cadAlert : Button
    private lateinit var cadToast : Button

    private lateinit var calebAlert : Button
    private lateinit var calebToast : Button

    private lateinit var fjordAlert : Button
    private lateinit var fjordToast : Button

    private lateinit var jesterAlert : Button
    private lateinit var jesterToast : Button

    private lateinit var mollyAlert : Button
    private lateinit var mollyToast : Button

    private lateinit var nottAlert : Button
    private lateinit var nottToast : Button

    private lateinit var yashaAlert : Button
    private lateinit var yashaToast : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        beauAlert = findViewById(R.id.button_beau)
        beauToast = findViewById(R.id.button_beau)

        cadAlert = findViewById(R.id.button_cad)
        cadToast = findViewById(R.id.button_cad)

        calebAlert = findViewById(R.id.button_caleb)
        calebToast = findViewById(R.id.button_caleb)

        fjordAlert = findViewById(R.id.button_fjord)
        fjordToast = findViewById(R.id.button_fjord)

        jesterAlert = findViewById(R.id.button_jester)
        jesterToast = findViewById(R.id.button_jester)

        mollyAlert = findViewById(R.id.button_molly)
        mollyToast = findViewById(R.id.button_molly)

        nottAlert = findViewById(R.id.button_nott)
        nottToast = findViewById(R.id.button_nott)

        yashaAlert = findViewById(R.id.button_yasha)
        yashaToast = findViewById(R.id.button_yasha)

        beauAlert.setOnLongClickListener(object : View.OnLongClickListener{
            override fun onLongClick(p0: View?): Boolean {
                var alertLore = AlertDialog.Builder(this@MainActivity)

                alertLore.setMessage(getText(R.string.lore_beau))
                alertLore.setTitle(getText(R.string.lore))
                alertLore.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.icon_cr))
                alertLore.setNeutralButton(getText(R.string.close_lore), null)
                alertLore.show()
                return true
            }
        })

        beauToast.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity, getText(R.string.name_beau), Toast.LENGTH_LONG).show()
            }
        })

        cadAlert.setOnLongClickListener(object : View.OnLongClickListener{
            override fun onLongClick(p0: View?): Boolean {
                var alertLore = AlertDialog.Builder(this@MainActivity)

                alertLore.setMessage(getText(R.string.lore_cad))
                alertLore.setTitle(getText(R.string.lore))
                alertLore.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.icon_cr))
                alertLore.setNeutralButton(getText(R.string.close_lore), null)
                alertLore.show()
                return true
            }
        })

        cadToast.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity, getText(R.string.name_cad), Toast.LENGTH_LONG).show()
            }
        })

        calebAlert.setOnLongClickListener(object : View.OnLongClickListener{
            override fun onLongClick(p0: View?): Boolean {
                var alertLore = AlertDialog.Builder(this@MainActivity)

                alertLore.setMessage(getText(R.string.lore_caleb))
                alertLore.setTitle(getText(R.string.lore))
                alertLore.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.icon_cr))
                alertLore.setNeutralButton(getText(R.string.close_lore), null)
                alertLore.show()
                return true
            }
        })

        calebToast.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity, getText(R.string.name_caleb), Toast.LENGTH_LONG).show()
            }
        })

        fjordAlert.setOnLongClickListener(object : View.OnLongClickListener{
            override fun onLongClick(p0: View?): Boolean {
                var alertLore = AlertDialog.Builder(this@MainActivity)

                alertLore.setMessage(getText(R.string.lore_fjord))
                alertLore.setTitle(getText(R.string.lore))
                alertLore.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.icon_cr))
                alertLore.setNeutralButton(getText(R.string.close_lore), null)
                alertLore.show()
                return true
            }
        })

        fjordToast.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity, getText(R.string.name_fjord), Toast.LENGTH_LONG).show()
            }
        })

        jesterAlert.setOnLongClickListener(object : View.OnLongClickListener{
            override fun onLongClick(p0: View?): Boolean {
                var alertLore = AlertDialog.Builder(this@MainActivity)

                alertLore.setMessage(getText(R.string.lore_jester))
                alertLore.setTitle(getText(R.string.lore))
                alertLore.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.icon_cr))
                alertLore.setNeutralButton(getText(R.string.close_lore), null)
                alertLore.show()
                return true
            }
        })

        jesterToast.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity, getText(R.string.name_jester), Toast.LENGTH_LONG).show()
            }
        })

        mollyAlert.setOnLongClickListener(object : View.OnLongClickListener{
            override fun onLongClick(p0: View?): Boolean {
                var alertLore = AlertDialog.Builder(this@MainActivity)

                alertLore.setMessage(getText(R.string.lore_molly))
                alertLore.setTitle(getText(R.string.lore))
                alertLore.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.icon_cr))
                alertLore.setNeutralButton(getText(R.string.close_lore), null)
                alertLore.show()
                return true
            }
        })

        mollyToast.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity, getText(R.string.name_molly), Toast.LENGTH_LONG).show()
            }
        })

        nottAlert.setOnLongClickListener(object : View.OnLongClickListener{
            override fun onLongClick(p0: View?): Boolean {
                var alertLore = AlertDialog.Builder(this@MainActivity)

                alertLore.setMessage(getText(R.string.lore_nott))
                alertLore.setTitle(getText(R.string.lore))
                alertLore.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.icon_cr))
                alertLore.setNeutralButton(getText(R.string.close_lore), null)
                alertLore.show()
                return true
            }
        })

        nottToast.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity, getText(R.string.name_nott), Toast.LENGTH_LONG).show()
            }
        })

        yashaAlert.setOnLongClickListener(object : View.OnLongClickListener{
            override fun onLongClick(p0: View?): Boolean {
                var alertLore = AlertDialog.Builder(this@MainActivity)

                alertLore.setMessage(getText(R.string.lore_yasha))
                alertLore.setTitle(getText(R.string.lore))
                alertLore.setIcon(ContextCompat.getDrawable(this@MainActivity, R.drawable.icon_cr))
                alertLore.setNeutralButton(getText(R.string.close_lore), null)
                alertLore.show()
                return true
            }
        })

        yashaToast.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity, getText(R.string.name_yasha), Toast.LENGTH_LONG).show()
            }
        })

    }

}