package yasmin.luzia.exrecyclerviewcardview.dao

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, "character.db", null, 1) {

    companion object {
        val TABLE_CHARACTER : String = "table_character"
        val TABLE_CHARACTER_ID : String = "table_character_id"
        val TABLE_CHARACTER_NAME : String = "table_character_name"
        val TABLE_CHARACTER_CHARCLASS : String = "table_character_char_class"
        val TABLE_CHARACTER_LEVEL : String = "table_character_level"

        val TABLE_CHARACTER_COLUMNS = arrayOf(
            TABLE_CHARACTER_ID,
            TABLE_CHARACTER_NAME,
            TABLE_CHARACTER_CHARCLASS,
            TABLE_CHARACTER_LEVEL
        )
    }

    val CREATE_TABLE_CHARACTER =
        "CREATE TABLE if not exists " + TABLE_CHARACTER + "(" +
                "${TABLE_CHARACTER_ID} integer PRIMARY KEY autoincrement," +
                "${TABLE_CHARACTER_NAME} text," +
                "${TABLE_CHARACTER_CHARCLASS} text," +
                "${TABLE_CHARACTER_LEVEL} integer" +
                ")"

    override fun onCreate(database: SQLiteDatabase?) {
        database?.execSQL(CREATE_TABLE_CHARACTER)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        //faz nada....
    }
}