package com.rooms.kshare.shareon

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class IntroActivity : AppCompatActivity() {

    // add Reflection library in gradle dependencies
    val TAG = IntroActivity::class.java.simpleName
    val CHANGE_DELAY = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val mainVar = MainActivity.pubVar
        val mainTag = MainActivity::TAG

        Log.d(TAG, "mainVar : " + mainVar + " mainTag : " + mainTag)

        var handler = Handler()
        handler.postDelayed({
            var intent = Intent(this, MainActivity::class.java)
            this.startActivity(intent)
        }, CHANGE_DELAY.toLong())
    }
}