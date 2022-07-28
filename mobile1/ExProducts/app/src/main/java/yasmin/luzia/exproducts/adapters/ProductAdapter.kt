package yasmin.luzia.exproducts.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_product.view.*
import yasmin.luzia.exproducts.R
import yasmin.luzia.exproducts.model.Product

class ProductAdapter(val products: List<Product>, val context: Context, val listener: (Product) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    //2.1
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.row_product, parent, false))
    }

    //1
    override fun getItemCount(): Int {
        return this.products.size
    }

    //3.0
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val product = this.products[position]

        if(holder is ViewHolder) {
            holder.bind(product, position, context, listener)
        }
    }

    public fun notifyInsertedItemList() {
        this.notifyItemInserted(this.products.size)
    }

    public fun notifyData() {
        this.notifyDataSetChanged()
    }
}

//2.0
class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(product: Product?, position: Int?, context: Context, listener: (Product) -> Unit) = with(itemView) {

        val rowTextViewDiceName = itemView.textViewDiceName
        val rowTextViewDiceType = itemView.textViewDiceType
        val rowTextViewDicePrice = itemView.textViewDicePrice
        var rowDiceLayout = itemView.rowDiceLayout

        product?.let {
            rowTextViewDiceName.text = it.name
            rowTextViewDiceType.text = it.type
            rowTextViewDicePrice.text = "R$ ${it.price.toString()}"

            itemView.setOnClickListener {
                listener(product)
            }

        }

    }
}