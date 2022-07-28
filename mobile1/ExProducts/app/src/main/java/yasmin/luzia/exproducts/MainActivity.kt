package yasmin.luzia.exproducts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonToRegister.setOnClickListener {
            startActivity(Intent(this@MainActivity, RegisterProductActivity::class.java))
        }

        buttonToProducts.setOnClickListener {
            startActivity(Intent(this@MainActivity, RegisterProductActivity::class.java))
        }

    }
}