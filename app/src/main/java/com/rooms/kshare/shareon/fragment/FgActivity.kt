package com.rooms.kshare.shareon.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.rooms.kshare.shareon.R
import kotlinx.android.synthetic.main.activity_fragment.*

class FgActivity : AppCompatActivity() {

    val TAG = FgActivity::class.simpleName;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        // [Kotlin] Direct use viewId instade of FindViewId
        RDG_GROUP.setOnCheckedChangeListener { group, checkedId ->
            Log.d(TAG, "setOnCheckedChangeListener checkedId : " + checkedId)

            // [Kotlin] when instade of switch
            when (checkedId) {
                R.id.RDB_FIRST -> replaceFragment(R.id.LL_CONTAINER, FirstFragment())
                R.id.RDB_SECOND -> replaceFragment(R.id.LL_CONTAINER, SecondFragment())
                else -> Log.d(TAG, "setOnCheckedChangeListener NONE!!")
            }
        }

        RDG_GROUP.check(R.id.RDB_FIRST)
    }

    fun replaceFragment(containerViewId: Int , fragment: Fragment?) {

        Log.d(TAG, "replaceFragment!")

        val srcFragment = fragment
        val manager = supportFragmentManager

        manager.popBackStack()
        val transaction = manager.beginTransaction()

        transaction.replace(containerViewId, srcFragment)
        transaction.addToBackStack(null)

        transaction.commit()
    }
}