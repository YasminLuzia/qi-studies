package yasmin.luzia.exrecyclerviewcardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import yasmin.luzia.exrecyclerviewcardview.extentions.toast
import yasmin.luzia.exrecyclerviewcardview.model.Character

class CharacterDetail : AppCompatActivity() {
    lateinit var character: Character

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character_detail)

        character = intent.getSerializableExtra("character") as Character

        toast("${character.toString()}")
    }
}