package com.gaurav.toastlib

import android.content.Context
import android.widget.Toast

object ToastLib {

    fun showToast(context: Context, message: String, int: Int) {
        Toast.makeText(context, message, int).show()
    }
}