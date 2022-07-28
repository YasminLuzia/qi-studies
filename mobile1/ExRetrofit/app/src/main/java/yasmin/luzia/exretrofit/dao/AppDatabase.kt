package yasmin.luzia.exretrofit.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import yasmin.luzia.exretrofit.model.FavoriteSpell

@Database(entities = arrayOf(FavoriteSpell::class), version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun favoriteSpellDao() : FavoriteSpellDAO

    companion object {
        var INSTANCE: AppDatabase? = null

        fun openDatabase(context: Context) : AppDatabase? {
            if(INSTANCE == null) {
                synchronized(AppDatabase::class) {
                    INSTANCE = Room.databaseBuilder(
                        context,
                        AppDatabase::class.java,
                        "mini_spellbook.db")
                        .allowMainThreadQueries()
                        .build()
                }
            }
            return INSTANCE
        }
    }
}