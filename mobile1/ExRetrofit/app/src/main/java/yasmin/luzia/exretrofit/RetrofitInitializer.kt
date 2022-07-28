package yasmin.luzia.exretrofit

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import yasmin.luzia.exretrofit.service.SpellService

class RetrofitInitializer {

    var gson = GsonBuilder()
        .setDateFormat("yyy-MM-dd'T'HH:mm:ss")
        .create()

    private val retrofit: Retrofit

    init {
        retrofit = Retrofit.Builder()
            .baseUrl(Constant.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }

    fun spellService() = retrofit.create(SpellService::class.java)

}