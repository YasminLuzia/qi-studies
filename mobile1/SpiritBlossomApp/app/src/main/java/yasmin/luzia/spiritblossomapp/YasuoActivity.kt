package yasmin.luzia.spiritblossomapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class YasuoActivity : AppCompatActivity() {

    private var mediaPlayer = MediaPlayer()
    private lateinit var buttonPlay : Button
    private lateinit var buttonStop : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.yasuo_screen)

        initializer()

        buttonPlay.setOnClickListener {
            mediaPlayer = MediaPlayer.create(this@YasuoActivity, R.raw.yasuo_music)
            mediaPlayer.start()
        }

        buttonStop.setOnClickListener {
            if (mediaPlayer.isPlaying) {
                mediaPlayer.stop()
            }
        }

    }

    private fun initializer() {
        buttonPlay = findViewById(R.id.buttonPlay)
        buttonStop = findViewById(R.id.buttonStop)
    }
}