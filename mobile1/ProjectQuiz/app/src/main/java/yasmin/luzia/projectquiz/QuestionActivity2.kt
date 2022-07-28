package yasmin.luzia.projectquiz

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_question2.*
import toast
import vibrate
import yasmin.luzia.projectquiz.model.Quiz

class QuestionActivity2 : AppCompatActivity() {

    private var mediaPlayer = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question2)

        buttonNext2.visibility = View.INVISIBLE

        Quiz.questionsShuffle()
        val question = Quiz.questionsArray.get(0)

        getScore()

        textViewQuestion2.text = question.questionDescription.toString()
        radioButtonAnswerA2.text = question.option1.toString()
        radioButtonAnswerB2.text = question.option2.toString()
        radioButtonAnswerC2.text = question.option3.toString()
        radioButtonAnswerD2.text = question.option4.toString()

        buttonSelectAnswer2.setOnClickListener {
            buttonNext2.visibility = View.VISIBLE
            buttonSelectAnswer2.visibility = View.INVISIBLE

            val id = radioGroupAnswers2.checkedRadioButtonId
            val radio: RadioButton = findViewById(id)

            if(Quiz.verifyTheCorrectAnswer(radio.text.toString())) {
                soundEffectPlay(this@QuestionActivity2, R.raw.correct_answer)
                toast(R.string.correct)
                getScore()
            } else {
                soundEffectPlay(this@QuestionActivity2, R.raw.wrong_answer)
                vibrate(this@QuestionActivity2)
                toast(R.string.incorrect)
            }
        }

        buttonNext2.setOnClickListener {
            startActivity(Intent(this@QuestionActivity2, QuestionActivity3::class.java))
            finish()
        }
    }

    fun getScore() {
        textViewScore2.text = Quiz.score().toString()
    }

    fun soundEffectPlay(context: Context, sound: Int) {
        mediaPlayer = MediaPlayer.create(context, sound)
        mediaPlayer.start()
    }

}