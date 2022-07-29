package com.almerio.recyclerview.secondrecyclerview.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Cars(
    var name : String?,
    var img : String?
): Parcelable