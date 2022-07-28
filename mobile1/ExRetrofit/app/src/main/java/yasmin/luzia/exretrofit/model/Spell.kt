package yasmin.luzia.exretrofit.model

data class Spell(
    val classes: List<Class>,
    val index: String,
    val level: Int,
    val name: String,
    val school: School,
    val desc: List<String>,
    val components: List<String>,
    val concentration: Boolean,
    val duration: String,
    val range: String,
    val ritual: Boolean,
    val material: String,
    val casting_time: String

//    val _id: String,
//    val area_of_effect: AreaOfEffect,
//    val subclasses: List<Subclass>,
//    val dc: Dc,
//    val url: String,
//    val damage: Damage,
//    val higher_level: List<String>,
)

data class SpellBase(
    val count: Int,
    var results: List<SpellResults>
)

data class SpellResults(
    var index: String,
    var name: String
)

data class Class(
    val name: String,
    val url: String
) {
    override fun toString(): String {
        return name
    }
}




data class School(
    val name: String,
    val url: String
)

//data class AreaOfEffect(
//    val size: Int,
//    val type: String
//)

//data class Damage(
//    val damage_at_slot_level: DamageAtSlotLevel,
//    val damage_type: DamageType
//)

//data class Dc(
//    val dc_success: String,
//    val dc_type: DcType
//)

//data class Subclass(
//    val name: String,
//    val url: String
//)

//data class DamageAtSlotLevel(
//    val `3`: String,
//    val `4`: String,
//    val `5`: String,
//    val `6`: String,
//    val `7`: String,
//    val `8`: String,
//    val `9`: String
//)

//data class DamageType(
//    val name: String,
//    val url: String
//)

//data class DcType(
//    val name: String,
//    val url: String
//)