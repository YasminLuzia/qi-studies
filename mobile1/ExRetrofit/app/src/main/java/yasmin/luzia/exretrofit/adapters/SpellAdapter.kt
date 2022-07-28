package yasmin.luzia.exretrofit.adapters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_spell.view.*
import yasmin.luzia.exretrofit.R

class SpellAdapter(val spells: List<String>, val context: Context, val listener: (String) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.row_spell, parent, false))
    }

    override fun getItemCount(): Int {
        return this.spells.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val spell = this.spells[position]

        if(holder is ViewHolder) {
            holder.bind(spell, position, context, listener)
        }
    }

    fun notifyItemInserted() {
        this.notifyItemInserted(spells.size)
    }
}

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(spell: String?, position: Int?, context: Context, listener : (String) -> Unit) = with(itemView) {
        val rowSpellsTextViewName = itemView.rowSpellTextViewSpellName
        val rowSpellsTextViewIndex = itemView.rowSpellTextViewSpellIndex

        spell?.let {
            rowSpellsTextViewName.text = it
            rowSpellsTextViewIndex.text = it.toLowerCase()
                                            .replace(Regex("[/, ]"), "-")
                                            .replace("'", "")

            itemView.setOnClickListener { listener(spell) }
        }
    }

}