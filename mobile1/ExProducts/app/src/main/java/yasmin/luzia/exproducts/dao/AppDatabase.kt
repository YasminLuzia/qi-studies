//package yasmin.luzia.exproducts.dao
//
//@Database(entities = arrayOf(Client::class), version = 1, exportSchema = false)
//abstract class AppDatabase: RoomDatabase() {
//
//    abstract fun clientDAO(): ClientDAO
//
//    companion object {
//        var INSTANCE: AppDatabase? = null
//
//        fun openDatabase(context: Context): AppDatabase? {
//            if(INSTANCE == null) {
//                synchronized(AppDatabase::class) {
//                    INSTANCE = Room.databaseBuilder(
//                        context,
//                        AppDatabase::class.java,
//                        "client.db")
//                        .allowMainThreadQueries()
//                        .build()
//                }
//            }
//            return INSTANCE
//        }
//
//        fun closeDatabase() {
//            INSTANCE = null
//        }
//    }
//
//}