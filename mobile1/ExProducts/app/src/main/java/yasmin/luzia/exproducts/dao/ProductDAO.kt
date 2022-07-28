package yasmin.luzia.exproducts.dao

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import yasmin.luzia.exproducts.model.Product

class ProductDAO {

    var database: SQLiteDatabase? = null
    var databaseHelper: DatabaseHelper? = null

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

    //CRUD

    public fun store(product: Product): Long {

        val values = ContentValues()

        values.put(DatabaseHelper.TABLE_PRODUCT_NAME, product.name)
        values.put(DatabaseHelper.TABLE_PRODUCT_TYPE, product.type)
        values.put(DatabaseHelper.TABLE_PRODUCT_PRICE, product.price)

        return this.database!!.insert(
            DatabaseHelper.TABLE_PRODUCT,
            null,
            values
        )
    }

    public fun delete(id: Int): Boolean {
        return this.database!!.delete(
            DatabaseHelper.TABLE_PRODUCT,
            DatabaseHelper.TABLE_PRODUCT_ID + "=?",
            arrayOf(id.toString())) != -1
    }

    public fun update(product: Product): Boolean {

        val values = ContentValues()

        values.put(DatabaseHelper.TABLE_PRODUCT_NAME, product.name)
        values.put(DatabaseHelper.TABLE_PRODUCT_TYPE, product.type)
        values.put(DatabaseHelper.TABLE_PRODUCT_PRICE, product.price)

        return this.database!!.update(
            DatabaseHelper.TABLE_PRODUCT,
            values,
            DatabaseHelper.TABLE_PRODUCT_ID + "=?",
            arrayOf(product.id.toString())) != -1
    }

    public fun fetch(): MutableList<Product> {

        val listProducts: MutableList<Product> = mutableListOf<Product>()

        val cursor: Cursor = this.database!!.query(
            DatabaseHelper.TABLE_PRODUCT,
            DatabaseHelper.TABLE_PRODUCT_COLUMNS,
            null, null, null, null, null
        )

        try {
            while(cursor.moveToNext()) {
                val product = Product(
                    cursor.getInt(cursor.getColumnIndex(DatabaseHelper.TABLE_PRODUCT_ID)),
                    cursor.getString(cursor.getColumnIndex(DatabaseHelper.TABLE_PRODUCT_NAME)),
                    cursor.getString(cursor.getColumnIndex(DatabaseHelper.TABLE_PRODUCT_TYPE)),
                    cursor.getDouble(cursor.getColumnIndex(DatabaseHelper.TABLE_PRODUCT_PRICE))
                )

                listProducts.add(product)

            }
        } finally {
            cursor.close()
        }
        return listProducts
    }

}