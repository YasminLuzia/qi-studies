package yasmin.luzia.expostest.model

import android.content.Context
import yasmin.luzia.expostest.R

class Month(var monthNumber: Int, var context: Context) {
    fun showMonth(): String {
        return when(this.monthNumber) {
            1 -> context.getString(R.string.month_january)
            2 -> context.getString(R.string.month_february)
            3 -> context.getString(R.string.month_march)
            4 -> context.getString(R.string.month_april)
            5 -> context.getString(R.string.month_may)
            6 -> context.getString(R.string.month_june)
            7 -> context.getString(R.string.month_july)
            8 -> context.getString(R.string.month_august)
            9 -> context.getString(R.string.month_september)
            10 -> context.getString(R.string.month_october)
            11 -> context.getString(R.string.month_november)
            12 -> context.getString(R.string.month_december)
            else -> context.getString(R.string.insert_valid_month)
        }
    }

    override fun toString(): String {
        return showMonth()
    }

}