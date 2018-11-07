package com.rooms.kshare.shareon.mvvm.model

import android.text.TextUtils
import android.util.Patterns

class User(val email: String, val password: String) {

    var mEmail: String = ""
    var mPassword: String = ""

    init {
        mEmail = email
        mPassword = password
    }

    public fun isInputDataValid() : Boolean {
        return !TextUtils.isEmpty(mEmail) &&
                Patterns.EMAIL_ADDRESS.matcher(mEmail).matches() &&
                mPassword.length > 5
    }
}