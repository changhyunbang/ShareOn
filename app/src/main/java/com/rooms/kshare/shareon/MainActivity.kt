package com.rooms.kshare.shareon

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // define static without instance
    companion object {
        @JvmField
        public val pubVar = "PUBLIC_VAR"
    }

    val TAG = MainActivity::class.simpleName;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replaceFragment(R.id.LL_CONTAINER, MainFragment())

        // [Kotlin] Direct use viewId instade of FindViewId
        BTN_HELLO.setOnClickListener {
            Log.d(TAG, "hello btn clicked!")
            Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show()
        }
    }

    fun replaceFragment(containerViewId: Int , fragment: Fragment?) {

        Log.d(TAG, "replaceFragment!")

        val srcFragment = fragment
        val manager = supportFragmentManager

        val transaction = manager.beginTransaction()

        transaction.replace(containerViewId, srcFragment)
        transaction.addToBackStack(null)

        transaction.commit()
    }
}
