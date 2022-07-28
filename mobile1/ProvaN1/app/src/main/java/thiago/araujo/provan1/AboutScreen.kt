package thiago.araujo.provan1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class AboutScreen : AppCompatActivity() {

    private lateinit var imageViewGif: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_screen)

        initializer()

        Glide.with(this).load(R.drawable.joel_cheers).into(imageViewGif)
    }

    private fun initializer() {
        imageViewGif = findViewById(R.id.imageViewGif)
    }
}