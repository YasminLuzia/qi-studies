package yasmin.luzia.exproducts.dao

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, "product.db", null, 1)  {

    companion object {
        val  TABLE_PRODUCT: String = "table_product"

        val  TABLE_PRODUCT_ID: String = "table_product_id"
        val  TABLE_PRODUCT_NAME: String = "table_product_name"
        val  TABLE_PRODUCT_TYPE: String = "table_product_type"
        val  TABLE_PRODUCT_PRICE: String = "table_product_price"

        val TABLE_PRODUCT_COLUMNS = arrayOf(
            TABLE_PRODUCT_ID,
            TABLE_PRODUCT_NAME,
            TABLE_PRODUCT_TYPE,
            TABLE_PRODUCT_PRICE
        )
    }

    //SQL - DDL - data definition language.... create, alter, drop....
    val CREATE_TABLE_PRODUCT =
        "CREATE TABLE if not exists " + TABLE_PRODUCT + "(" +
                "${TABLE_PRODUCT_ID} integer primary key autoincrement," +
                "${TABLE_PRODUCT_NAME} text," +
                "${TABLE_PRODUCT_TYPE} text," +
                "${TABLE_PRODUCT_PRICE} double" +
                ")"

    override fun onCreate(database: SQLiteDatabase?) {
        TODO("Not yet implemented")
        database!!.execSQL(CREATE_TABLE_PRODUCT)
    }

    override fun onUpgrade(database: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
        //lógica......
//        if(oldVersion == 1 && newVersion == 2) {
//            database!!.execSQL("alter table ")
//            database!!.execSQL("alter table ")
//            database!!.execSQL("drop table")
//            database!!.execSQL("create table ...")
//        }
    }

}