package yasmin.luzia.exrecyclerviewcardview.dao

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import yasmin.luzia.exrecyclerviewcardview.model.Character

class CharacterDAO {

    var database : SQLiteDatabase? = null
    var databaseHelper : DatabaseHelper? = null

    constructor(context: Context) {
        this.databaseHelper = DatabaseHelper(context)
    }

    public fun openDatabaseWritable() {
        database = this.databaseHelper?.writableDatabase
    }

    public fun openDatabaseReadable() {
        database = this.databaseHelper?.readableDatabase
    }

    public fun closeDatabase() {
        this.databaseHelper?.close()
    }

    public fun store(character: Character): Long {

        val values = ContentValues()
        values.put(DatabaseHelper.TABLE_CHARACTER_NAME, character.name)
        values.put(DatabaseHelper.TABLE_CHARACTER_CHARCLASS, character.charClass)
        values.put(DatabaseHelper.TABLE_CHARACTER_LEVEL, character.level)

        return this.database!!.insert(
            DatabaseHelper.TABLE_CHARACTER,
            null,
            values)

    }

    public fun delete(character: Character): Boolean {

        return this.database!!.delete(
            DatabaseHelper.TABLE_CHARACTER,
            DatabaseHelper.TABLE_CHARACTER_ID+"=?",
            arrayOf(character.id.toString())) != -1

    }

    public fun update(character: Character): Int {

        val values = ContentValues()
        values.put(DatabaseHelper.TABLE_CHARACTER_NAME, character.name)
        values.put(DatabaseHelper.TABLE_CHARACTER_CHARCLASS, character.charClass)
        values.put(DatabaseHelper.TABLE_CHARACTER_LEVEL, character.level)

        return this.database!!.update(
            DatabaseHelper.TABLE_CHARACTER,
            values,
            DatabaseHelper.TABLE_CHARACTER_ID+"=?",
            arrayOf(character.id.toString()))

    }

    public fun fetchCharacters(): MutableList<Character> {

        val listCharacters: MutableList<Character> = mutableListOf<Character>()

        val cursor: Cursor = this.database!!.query(
            DatabaseHelper.TABLE_CHARACTER,
            DatabaseHelper.TABLE_CHARACTER_COLUMNS,
            null, null, null, null, null
        )

        try {
            while (cursor.moveToNext()) {
                val character = Character(
                    cursor.getInt(cursor.getColumnIndex(DatabaseHelper.TABLE_CHARACTER_ID)),
                    cursor.getString(cursor.getColumnIndex(DatabaseHelper.TABLE_CHARACTER_NAME)),
                    cursor.getString(cursor.getColumnIndex(DatabaseHelper.TABLE_CHARACTER_CHARCLASS)),
                    cursor.getInt(cursor.getColumnIndex(DatabaseHelper.TABLE_CHARACTER_LEVEL))
                )

                listCharacters.add(character)
            }
        } finally {
            cursor.close()
        }
        return listCharacters
    }

}