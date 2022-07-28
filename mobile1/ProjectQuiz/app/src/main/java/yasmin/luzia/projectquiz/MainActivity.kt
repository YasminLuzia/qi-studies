package yasmin.luzia.projectquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import yasmin.luzia.projectquiz.model.Quiz

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Quiz.context = this@MainActivity
        Quiz.clearAll()

        buttonStart.setOnClickListener {
            startActivity(Intent(this@MainActivity, QuestionActivity1::class.java))
        }
    }

    override fun onRestart() {
        Quiz.clearAll()
    }
}