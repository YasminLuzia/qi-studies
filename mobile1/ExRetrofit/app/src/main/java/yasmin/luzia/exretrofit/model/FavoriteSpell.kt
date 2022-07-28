package yasmin.luzia.exretrofit.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorite_spell")
class FavoriteSpell(
    @PrimaryKey(autoGenerate = true)
    var id: Int?,
    var name: String?)