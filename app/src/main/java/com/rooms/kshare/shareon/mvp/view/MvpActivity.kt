package com.rooms.kshare.shareon.mvp.view

import android.app.Activity
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import android.widget.Toast
import com.rooms.kshare.shareon.R
import com.rooms.kshare.shareon.mvp.PresenterInterface
import com.rooms.kshare.shareon.mvp.presenter.PresenterImplements
import kotlinx.android.synthetic.main.activity_mvp.*

/*
*
* [Kotlin] extends and implements
*
* abstract class SuperClass
* interface MyInterface
* class MyClass : SuperClass(), MyInterface, Serializable
* */
class MvpActivity : Activity(), PresenterInterface.View {

    var studyPresent: PresenterImplements? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvp)

        studyPresent = PresenterImplements(this)

        ET_NICKNAME.setOnEditorActionListener() { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                studyPresent?.setNickName(v.text.toString().trim())
            }
            false
        }

        BTN_NEXT.setOnClickListener() {v ->
            studyPresent?.getNickName()
        }
    }

    override fun snowNickName(nickname: String) {
        Toast.makeText(this, nickname, Toast.LENGTH_LONG).show()
    }

}