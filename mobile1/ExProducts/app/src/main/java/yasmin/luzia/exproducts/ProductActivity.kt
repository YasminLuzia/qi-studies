package yasmin.luzia.exproducts

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_product.*
import yasmin.luzia.exproducts.adapters.ProductAdapter
import yasmin.luzia.exproducts.dao.ProductDAO
import yasmin.luzia.exproducts.extentions.toast
import yasmin.luzia.exproducts.model.Product

class ProductActivity : AppCompatActivity() {
    private lateinit var adapter: ProductAdapter
    private var products = arrayListOf<Product>()

    private lateinit var productDAO: ProductDAO

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        initializer()
    }

    override fun onPause() {
        super.onPause()
        this.productDAO.closeDatabase()
    }

    override fun onRestart() {
        super.onRestart()
        this.productDAO.openDatabaseWritable()
    }

    private fun resultItemClicked(product: Product) {
        toast("Você clicou em: ${product.toString()}")

        val dialogBuilder = AlertDialog.Builder(this@ProductActivity)

        val alert = dialogBuilder
            .setTitle("Atenção")
            .setMessage("Você deseja excluir ou ver detalhes?!")
            .setCancelable(false)
            .setPositiveButton("Excluir", DialogInterface.OnClickListener {
                    dialog, id ->
                //todo delete

                if(this.productDAO.delete(product.id)) {
                    toast("Cliente excluído com sucesso!")
                    this.products.remove(product)

                    if(this.products.isEmpty()) {
                        toast("Não há mais clientes cadastrados!")
                    }

                    this.adapter.notifyData()
                } else {
                    toast("Erro ao excluir!")
                }
            })
            .setNegativeButton("Não", DialogInterface.OnClickListener {
                    dialog, id ->
                return@OnClickListener
            }
            ).create()

        alert.show()
    }

    private fun initializer() {

        this.productDAO = ProductDAO(this@ProductActivity)
        this.productDAO.openDatabaseReadable()

        this.products = this.productDAO.fetch() as ArrayList<Product> //cast

        adapter = ProductAdapter(products, this@ProductActivity, {product: Product -> resultItemClicked(product)})
        buttonRecyclerViewProducts.adapter = adapter

        buttonRecyclerViewProducts.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
    }
}