package yasmin.luzia.projectquiz.model

import android.content.Context
import yasmin.luzia.projectquiz.R

class Quiz {
    companion object {
        val questionsArray = ArrayList<Question>()
        var context: Context? = null

        init {
            generateQuestions()
            questionsShuffle()
        }

        fun generateQuestions() {
            questionsArray.add(Question(context?.getString(R.string.question_1), context?.getString(R.string.question_1_option_1), context?.getString(R.string.question_1_option_2), context?.getString(R.string.question_1_option_3), context?.getString(R.string.question_1_option_4), context?.getString(R.string.question_1_option_3)))

            questionsArray.add(Question(context?.getString(R.string.question_2), context?.getString(R.string.question_2_option_1), context?.getString(R.string.question_2_option_2), context?.getString(R.string.question_2_option_3), context?.getString(R.string.question_2_option_4), context?.getString(R.string.question_2_option_4)))

            questionsArray.add(Question(context?.getString(R.string.question_3), context?.getString(R.string.question_3_option_1), context?.getString(R.string.question_3_option_2), context?.getString(R.string.question_3_option_3), context?.getString(R.string.question_3_option_4), context?.getString(R.string.question_3_option_3)))

            questionsArray.add(Question(context?.getString(R.string.question_4), context?.getString(R.string.question_4_option_1), context?.getString(R.string.question_4_option_2), context?.getString(R.string.question_4_option_3), context?.getString(R.string.question_4_option_4), context?.getString(R.string.question_4_option_1)))

            questionsArray.add(Question(context?.getString(R.string.question_5), context?.getString(R.string.question_5_option_1), context?.getString(R.string.question_5_option_2), context?.getString(R.string.question_5_option_3), context?.getString(R.string.question_5_option_4), context?.getString(R.string.question_5_option_2)))

            questionsArray.add(Question(context?.getString(R.string.question_6), context?.getString(R.string.question_6_option_1), context?.getString(R.string.question_6_option_2), context?.getString(R.string.question_6_option_3), context?.getString(R.string.question_6_option_4), context?.getString(R.string.question_6_option_1)))

            questionsArray.add(Question(context?.getString(R.string.question_7), context?.getString(R.string.question_5_option_1), context?.getString(R.string.question_5_option_2), context?.getString(R.string.question_5_option_3), context?.getString(R.string.question_5_option_4), context?.getString(R.string.question_5_option_2)))

            questionsArray.add(Question(context?.getString(R.string.question_8), context?.getString(R.string.question_8_option_1), context?.getString(R.string.question_8_option_2), context?.getString(R.string.question_8_option_3), context?.getString(R.string.question_8_option_4), context?.getString(R.string.question_8_option_4)))

            questionsArray.add(Question(context?.getString(R.string.question_9), context?.getString(R.string.question_9_option_1), context?.getString(R.string.question_9_option_2), context?.getString(R.string.question_9_option_3), context?.getString(R.string.question_9_option_4), context?.getString(R.string.question_9_option_1)))

            questionsArray.add(Question(context?.getString(R.string.question_10), context?.getString(R.string.question_10_option_1), context?.getString(R.string.question_10_option_2), context?.getString(R.string.question_10_option_3), context?.getString(R.string.question_10_option_4), context?.getString(R.string.question_10_option_3)))

        }

        fun markAsRepeatedAnswer() {
            questionsArray.get(0).repeatedQuestion = true
        }

        fun questionsShuffle() {
            do {
                questionsArray.shuffle()
            }while (questionsArray.get(0).repeatedQuestion)
            markAsRepeatedAnswer()
        }

        fun score(): Int {
            var score = 0
            for(question in questionsArray) {
                if (question.correctAnswer) {
                    score++
                }
            }
            return score
        }

        fun verifyTheCorrectAnswer(answer: String): Boolean {
            println("answer: ${answer}")
            println("questionsArray.get(0): ${questionsArray.get(0).toString()}")
            if(answer.equals(questionsArray.get(0).correctOptionAnswer)) {
                questionsArray.get(0).correctAnswer = true
                return true
            } else {
                return false
            }
        }

        fun clearAll() {
            questionsArray.clear()
            generateQuestions()
        }
    }
}