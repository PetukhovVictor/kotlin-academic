// "Add ''@Transient'' annotation" "true"
// WITH_RUNTIME

package com.myapp.activity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Test : Parcelable {
    @Transient
    val <caret>a = 5
}