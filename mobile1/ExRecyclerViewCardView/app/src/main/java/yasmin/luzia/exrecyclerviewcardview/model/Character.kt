package yasmin.luzia.exrecyclerviewcardview.model

import java.io.Serializable

class Character(
    var id: Int,
    var name: String,
    var charClass: String,
    var level: Int
) : Serializable {

    override fun toString(): String {
        return "$name, $charClass, Lvl $level"
    }
}