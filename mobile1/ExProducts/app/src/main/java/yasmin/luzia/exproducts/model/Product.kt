package yasmin.luzia.exproducts.model

import java.io.Serializable

class Product(var id: Int,
            var name: String,
            var type: String,
            var price: Double) : Serializable {

    override fun toString(): String {
        return "Product(id=$id, name='$name', type='$type', price=$price)"
    }
}