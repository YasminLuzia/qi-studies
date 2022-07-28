package yasmin.luzia.projectquiz

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_question4.*
import toast
import vibrate
import yasmin.luzia.projectquiz.model.Quiz

class QuestionActivity4 : AppCompatActivity() {

    private var mediaPlayer = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question4)

        buttonNext4.visibility = View.INVISIBLE

        Quiz.questionsShuffle()
        val question = Quiz.questionsArray.get(0)

        getScore()

        textViewQuestion4.text = question.questionDescription.toString()
        radioButtonAnswerA4.text = question.option1.toString()
        radioButtonAnswerB4.text = question.option2.toString()
        radioButtonAnswerC4.text = question.option3.toString()
        radioButtonAnswerD4.text = question.option4.toString()

        buttonSelectAnswer4.setOnClickListener {
            buttonNext4.visibility = View.VISIBLE
            buttonSelectAnswer4.visibility = View.INVISIBLE

            val id = radioGroupAnswers4.checkedRadioButtonId
            val radio: RadioButton = findViewById(id)

            if(Quiz.verifyTheCorrectAnswer(radio.text.toString())) {
                soundEffectPlay(this@QuestionActivity4, R.raw.correct_answer)
                toast(R.string.correct)
                getScore()
            } else {
                soundEffectPlay(this@QuestionActivity4, R.raw.wrong_answer)
                vibrate(this@QuestionActivity4)
                toast(R.string.incorrect)
            }
        }

        buttonNext4.setOnClickListener {
            startActivity(Intent(this@QuestionActivity4, QuestionActivity5::class.java))
            finish()
        }
    }

    fun getScore() {
        textViewScore4.text = Quiz.score().toString()
    }

    fun soundEffectPlay(context: Context, sound: Int) {
        mediaPlayer = MediaPlayer.create(context, sound)
        mediaPlayer.start()
    }

}