package com.chaudharynabin6.unit_testing_android

import android.content.Context

class ResourceComparer {

    fun isEqual(context: Context, resId: Int, string: String): Boolean {
        return context.getString(resId) == string
    }
}