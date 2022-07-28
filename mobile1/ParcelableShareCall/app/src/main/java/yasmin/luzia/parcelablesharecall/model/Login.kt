package yasmin.luzia.parcelablesharecall.model

import android.os.Parcel
import android.os.Parcelable

class Login(var email: String?) : Parcelable {
    override fun toString(): String {
        return "Welcome, $email!"
    }

    constructor(source: Parcel) : this(
        source.readString()
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeString(email)
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<Login> = object : Parcelable.Creator<Login> {
            override fun createFromParcel(source: Parcel): Login = Login(source)
            override fun newArray(size: Int): Array<Login?> = arrayOfNulls(size)
        }
    }
}