package yasmin.luzia.projectquiz

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_question5.*
import toast
import vibrate
import yasmin.luzia.projectquiz.model.Quiz

class QuestionActivity5 : AppCompatActivity() {
    private var mediaPlayer = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question5)

        buttonNext5.visibility = View.INVISIBLE

        Quiz.questionsShuffle()
        val question = Quiz.questionsArray.get(0)

        getScore()

        textViewQuestion5.text = question.questionDescription.toString()
        radioButtonAnswerA5.text = question.option1.toString()
        radioButtonAnswerB5.text = question.option2.toString()
        radioButtonAnswerC5.text = question.option3.toString()
        radioButtonAnswerD5.text = question.option4.toString()

        buttonSelectAnswer5.setOnClickListener {
            buttonNext5.visibility = View.VISIBLE
            buttonSelectAnswer5.visibility = View.INVISIBLE

            val id = radioGroupAnswers5.checkedRadioButtonId
            val radio: RadioButton = findViewById(id)

            if(Quiz.verifyTheCorrectAnswer(radio.text.toString())) {
                soundEffectPlay(this@QuestionActivity5, R.raw.correct_answer)
                toast(R.string.correct)
                getScore()
            } else {
                soundEffectPlay(this@QuestionActivity5, R.raw.wrong_answer)
                vibrate(this@QuestionActivity5)
                toast(R.string.incorrect)
            }
        }

        buttonNext5.setOnClickListener {
            startActivity(Intent(this@QuestionActivity5, EndActivity::class.java))
            finish()
        }
    }

    fun getScore() {
        textViewScore5.text = Quiz.score().toString()
    }

    fun soundEffectPlay(context: Context, sound: Int) {
        mediaPlayer = MediaPlayer.create(context, sound)
        mediaPlayer.start()
    }
}