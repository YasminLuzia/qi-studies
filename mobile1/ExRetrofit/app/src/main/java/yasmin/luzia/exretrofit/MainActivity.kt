package yasmin.luzia.exretrofit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainButtonToFavoriteSpells.setOnClickListener(this@MainActivity)
        mainButtonToSearchSpell.setOnClickListener(this@MainActivity)
    }

    override fun onClick(button: View?) {
        when(button?.id) {
            R.id.mainButtonToFavoriteSpells -> {
                startActivity(Intent(this@MainActivity, FavoriteSpellsActivity::class.java))
            }
            R.id.mainButtonToSearchSpell -> {
                startActivity(Intent(this@MainActivity, SearchSpellActivity::class.java))
            }
        }
    }
}