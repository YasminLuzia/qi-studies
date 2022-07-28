package yasmin.luzia.exsplash.model

import android.os.Parcel
import android.os.Parcelable

class Character(var name: String?, var folk: String?, var classe: String?) : Parcelable {

    override fun toString(): String {
        return "\nName: $name \nFolk: $folk \nClass: $classe"
    }

    constructor(source: Parcel) : this(
        source.readString(),
        source.readString(),
        source.readString()
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeString(name)
        writeString(folk)
        writeString(classe)
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<Character> = object : Parcelable.Creator<Character> {
            override fun createFromParcel(source: Parcel): Character = Character(source)
            override fun newArray(size: Int): Array<Character?> = arrayOfNulls(size)
        }
    }
}