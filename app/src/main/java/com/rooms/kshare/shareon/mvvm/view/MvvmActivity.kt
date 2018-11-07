package com.rooms.kshare.shareon.mvvm.view

import android.app.Activity
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.rooms.kshare.shareon.R
import com.rooms.kshare.shareon.BR
import com.rooms.kshare.shareon.databinding.ActivityMvvmBinding
import com.rooms.kshare.shareon.mvvm.viewmodel.LoginViewModel

class MvvmActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var activityMvvmBinding: ActivityMvvmBinding = DataBindingUtil.setContentView(this, R.layout.activity_mvvm)
//        activityMvvmBinding.viewModel(LoginViewModel())
        activityMvvmBinding.setVariable(BR.viewModel, LoginViewModel())
        activityMvvmBinding.executePendingBindings()
    }

    fun runMe(view: View, message: String) {
        if (message != null)
            Toast.makeText(view.context, message, Toast.LENGTH_LONG).show()
    }

}