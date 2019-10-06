package id.seedgrow.androidintent.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Profile(
    val image: Int,
    val name: String,
    val job: String,
    val studying: String,
    val age: Int,
    val address: String,
    val religion: String
) : Parcelable