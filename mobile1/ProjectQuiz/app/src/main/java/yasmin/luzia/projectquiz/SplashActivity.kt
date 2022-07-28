package yasmin.luzia.projectquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowInsets
import android.view.WindowInsetsController
import android.view.WindowManager
import android.widget.ProgressBar

class SplashActivity : AppCompatActivity() {
    private lateinit var progressBar: ProgressBar

    private var delayHandler: Handler? = null
    private val SPLASH_DURATION: Long = 3000

    internal var runnable = Runnable {
        if(!isFinishing) {
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        delayHandler = Handler()
        delayHandler!!.postDelayed(runnable, SPLASH_DURATION)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
    }

    override fun onDestroy() {
        super.onDestroy()
        delayHandler?.let { it.removeCallbacks(runnable) }
    }
}