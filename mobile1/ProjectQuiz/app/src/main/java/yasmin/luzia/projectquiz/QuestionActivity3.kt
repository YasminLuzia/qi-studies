package yasmin.luzia.projectquiz

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_question3.*
import toast
import vibrate
import yasmin.luzia.projectquiz.model.Quiz

class QuestionActivity3 : AppCompatActivity() {

    private var mediaPlayer = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question3)

        buttonNext3.visibility = View.INVISIBLE

        Quiz.questionsShuffle()
        val question = Quiz.questionsArray.get(0)

        getScore()

        textViewQuestion3.text = question.questionDescription.toString()
        radioButtonAnswerA3.text = question.option1.toString()
        radioButtonAnswerB3.text = question.option2.toString()
        radioButtonAnswerC3.text = question.option3.toString()
        radioButtonAnswerD3.text = question.option4.toString()

        buttonSelectAnswer3.setOnClickListener {
            buttonNext3.visibility = View.VISIBLE
            buttonSelectAnswer3.visibility = View.INVISIBLE

            val id = radioGroupAnswers3.checkedRadioButtonId
            val radio: RadioButton = findViewById(id)

            if(Quiz.verifyTheCorrectAnswer(radio.text.toString())) {
                soundEffectPlay(this@QuestionActivity3, R.raw.correct_answer)
                toast(R.string.correct)
                getScore()
            } else {
                soundEffectPlay(this@QuestionActivity3, R.raw.wrong_answer)
                vibrate(this@QuestionActivity3)
                toast(R.string.incorrect)
            }
        }

        buttonNext3.setOnClickListener {
            startActivity(Intent(this@QuestionActivity3, QuestionActivity4::class.java))
            finish()
        }
    }

    fun getScore() {
        textViewScore3.text = Quiz.score().toString()
    }

    fun soundEffectPlay(context: Context, sound: Int) {
        mediaPlayer = MediaPlayer.create(context, sound)
        mediaPlayer.start()
    }

}