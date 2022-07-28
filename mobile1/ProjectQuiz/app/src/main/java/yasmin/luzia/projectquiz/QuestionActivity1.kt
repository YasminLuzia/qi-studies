package yasmin.luzia.projectquiz

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_question1.*
import toast
import vibrate
import yasmin.luzia.projectquiz.model.Quiz

class QuestionActivity1 : AppCompatActivity() {

    private var mediaPlayer = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question1)

        buttonNext1.visibility = View.INVISIBLE

        Quiz.questionsShuffle()
        val question = Quiz.questionsArray.get(0)

        getScore()

        textViewQuestion1.text = question.questionDescription.toString()
        radioButtonAnswerA1.text = question.option1.toString()
        radioButtonAnswerB1.text = question.option2.toString()
        radioButtonAnswerC1.text = question.option3.toString()
        radioButtonAnswerD1.text = question.option4.toString()

        buttonSelectAnswer1.setOnClickListener {
            buttonNext1.visibility = View.VISIBLE
            buttonSelectAnswer1.visibility = View.INVISIBLE

            val id = radioGroupAnswers1.checkedRadioButtonId
            val radio: RadioButton = findViewById(id)

            if(Quiz.verifyTheCorrectAnswer(radio.text.toString())) {
                soundEffectPlay(this@QuestionActivity1, R.raw.correct_answer)
                toast(R.string.correct)
                getScore()
            } else {
                soundEffectPlay(this@QuestionActivity1, R.raw.wrong_answer)
                vibrate(this@QuestionActivity1)
                toast(R.string.incorrect)
            }
        }

        buttonNext1.setOnClickListener {
            startActivity(Intent(this@QuestionActivity1, QuestionActivity2::class.java))
            finish()
        }
    }

    fun getScore() {
        textViewScore1.text = Quiz.score().toString()
    }

    fun soundEffectPlay(context: Context, sound: Int) {
        mediaPlayer = MediaPlayer.create(context, sound)
        mediaPlayer.start()
    }

}