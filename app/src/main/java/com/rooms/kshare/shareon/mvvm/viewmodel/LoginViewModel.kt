package com.rooms.kshare.shareon.mvvm.viewmodel

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.util.Log
import com.rooms.kshare.shareon.BR
import com.rooms.kshare.shareon.mvvm.model.User

class LoginViewModel : BaseObservable() {

    val TAG = LoginViewModel::class.java.simpleName

    var user: User? = null

    val successMessage: String = "Login was successful"
    val errorMessage: String = "Email or Password not valid"

    init {
        user = User("", "")
    }

    @Bindable
    private var toastMessage: String? = null

    public fun getToastMessage() : String? {
        return toastMessage
    }


    public fun setToastMessage(toastMessage: String) {
        this.toastMessage = toastMessage
        Log.d(TAG, "setToastMessage = " + this.toastMessage)

        notifyPropertyChanged(BR.toastMessage)
    }

    public fun afterEmailTextChanged(s: CharSequence) {
        user?.mEmail = s.toString()

        Log.d(TAG, "afterPasswordTextChanged = " + user?.mEmail)
    }

    public fun afterPasswordTextChanged(s: CharSequence) {
        user?.mPassword = s.toString()

        Log.d(TAG, "afterPasswordTextChanged = " + user?.mPassword)
    }

    fun onLoginClicked() {
        if (user?.isInputDataValid()!!) {
//            toastMessage = successMessage
            setToastMessage(successMessage)
        } else {
//            toastMessage = errorMessage
            setToastMessage(errorMessage)
        }
    }
}