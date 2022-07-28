package yasmin.luzia.exproducts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_product.*
import kotlinx.android.synthetic.main.activity_register_product.*
import yasmin.luzia.exproducts.adapters.ProductAdapter
import yasmin.luzia.exproducts.dao.ProductDAO
import yasmin.luzia.exproducts.extentions.toast
import yasmin.luzia.exproducts.model.Product

class RegisterProductActivity : AppCompatActivity() {
    private lateinit var adapter: ProductAdapter
    private var products = arrayListOf<Product>()

    private lateinit var productDAO: ProductDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_product)

        initializer()

        buttonRegister.setOnClickListener {
            var product = Product(1,
                editTextProductName.text.toString(),
                spinnerProductType.selectedItem.toString(),
                editTextPrice.text.toString().toDouble())
            this.products.add(product) //salvando no array
            this.productDAO.store(product) //salvando no banco de dados!

            adapter.notifyInsertedItemList()

            toast(R.string.dice_registered)
        }

    }

    private fun initializer() {

        this.productDAO = ProductDAO(this@RegisterProductActivity)
        this.productDAO.openDatabaseWritable()

        this.products = this.productDAO.fetch() as ArrayList<Product>
        buttonRecyclerViewProducts.adapter = adapter
    }
}