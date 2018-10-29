package com.rooms.kshare.shareon

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class SecondFragment : BaseFragment() {

    val TAG = SecondFragment::class.simpleName;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        Log.d(TAG, "onCreateView!")

        var view = inflater.inflate(R.layout.view_fragment_second, container, false)

        return view
    }
}