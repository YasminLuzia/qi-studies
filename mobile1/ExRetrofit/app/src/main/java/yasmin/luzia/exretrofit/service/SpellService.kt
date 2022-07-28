package yasmin.luzia.exretrofit.service

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import yasmin.luzia.exretrofit.model.Spell
import yasmin.luzia.exretrofit.model.SpellBase

interface SpellService {
    
//    @GET("{zipcode}/json")
//    fun findAddressByZipcode(@Path("zipcode") zipcode: String) : Call<Zipcode>

    @GET("spells/{name}")
    fun findSpellsByName(@Path("name") name: String) : Call<Spell>

    @GET("spells")
    fun findAllSpells() : Call<SpellBase>

    @GET("classes/{className}/spells")
    fun findSpellsByClass(@Path("className") className: String) : Call<SpellBase>

}