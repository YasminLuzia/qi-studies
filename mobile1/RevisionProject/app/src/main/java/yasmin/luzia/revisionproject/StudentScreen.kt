package yasmin.luzia.revisionproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import yasmin.luzia.revisionproject.model.Grades

class StudentScreen : AppCompatActivity() {

    private lateinit var editTextStudentName: EditText
    private lateinit var editTextGrade1: EditText
    private lateinit var editTextGrade2: EditText
    private lateinit var buttonGrades: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_screen)

        initializer()

        buttonGrades.setOnClickListener {
            if (editTextStudentName.text.isEmpty() || editTextGrade1.text.isEmpty() || editTextGrade2.text.isEmpty()) {
                Toast.makeText(baseContext, "Please, fill the requests.", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            val grades = Grades(editTextGrade1.text.toString().toDouble(), editTextGrade2.text.toString().toDouble())
            var alert = AlertDialog.Builder(this@StudentScreen)
            alert.setMessage("Your average is ${grades.averageGrade()}. You\'ve been ${grades.result()}.")
            alert.setNeutralButton("Ok", null)
            alert.show()
            clear()
        }

    }

    private fun initializer() {
        editTextStudentName = findViewById(R.id.editTextStudentName)
        editTextGrade1 = findViewById(R.id.editTextGrade1)
        editTextGrade2 = findViewById(R.id.editTextGrade2)
        buttonGrades = findViewById(R.id.buttonGrades)
    }

    private fun clear() {
        editTextStudentName.text.clear()
        editTextGrade1.text.clear()
        editTextGrade2.text.clear()
    }
}