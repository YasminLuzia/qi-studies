package yasmin.luzia.projectquiz

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_end.*
import yasmin.luzia.projectquiz.model.Quiz

class EndActivity : AppCompatActivity() {

    private var mediaPlayer = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)

        getScore()
        soundEffectPlay(this@EndActivity, R.raw.victory_sound)

        buttonPlayAgain.setOnClickListener {
            Quiz.clearAll()
            startActivity(Intent(this@EndActivity, QuestionActivity1::class.java))
            finish()
        }
    }

    fun getScore() {
        textViewScore.text = "${Quiz.score().toString()}/5"
    }

    fun soundEffectPlay(context: Context, sound: Int) {
        mediaPlayer = MediaPlayer.create(context, sound)
        mediaPlayer.start()
    }
}