package yasmin.luzia.exrecyclerviewcardview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.getColor
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_character.view.*
import yasmin.luzia.exrecyclerviewcardview.R
import yasmin.luzia.exrecyclerviewcardview.model.Character

class CharacterAdapter(val characters: List<Character>, val context: Context, val listener: (Character) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.row_character, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return this.characters.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val character = this.characters[position]

        if (holder is ViewHolder) {
            holder.bind(character, position, context, listener)
        }
    }

    public fun notifyData() {
        this.notifyDataSetChanged()
    }

    public fun notifyInsertedList() {
        this.notifyItemInserted(this.characters.size)
    }
}

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(character: Character?, position: Int?, context: Context, listener: (Character) -> Unit) = with(itemView) {
        val rowCharacterTextViewName = itemView.rowTextViewName
        val rowCharacterTextViewCharClass = itemView.rowTextViewCharClass
        val rowCharacterTextViewLevel = itemView.rowTextViewLevel
        var rowCharactersLayout = itemView.rowCharactersLayout

        character?.let {
            rowCharacterTextViewName.text = it.name
            rowCharacterTextViewCharClass.text = it.charClass
            rowCharacterTextViewLevel.text = it.level.toString()

            itemView.setOnClickListener { listener(character) }
        }

        position?.let {
            if( it % 2 == 0) {
                rowCharactersLayout.setBackgroundColor(getColor(context, R.color.amber300))
            } else {
                rowCharactersLayout.setBackgroundColor(getColor(context, R.color.red300))
            }
        }
    }

}