package yasmin.luzia.exretrofit.dao

import androidx.room.*
import yasmin.luzia.exretrofit.model.FavoriteSpell

@Dao
interface FavoriteSpellDAO {

    @Query("SELECT * FROM favorite_spell")
    fun fetch() : List<FavoriteSpell>

    @Query("DELETE FROM favorite_spell WHERE name = :spellName")
    fun deleteByName(spellName: String)

    @Insert
    fun store(vararg favoriteSpell: FavoriteSpell)

    @Delete
    fun delete(favoriteSpell: FavoriteSpell)
}