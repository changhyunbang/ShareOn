package com.rooms.kshare.shareon

import android.os.Handler
import android.os.Message

class JavaActivity {
    private val DELAY = 3000

    internal var handler: Handler = object : Handler() {
        override fun handleMessage(msg: Message) {
            super.handleMessage(msg)
        }
    }

    init {
        Handler().sendMessageDelayed(Message(), DELAY.toLong())
    }

    companion object {

        val TAG = JavaActivity::class.java.simpleName
    }

}
