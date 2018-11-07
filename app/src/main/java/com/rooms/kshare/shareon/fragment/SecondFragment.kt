package com.rooms.kshare.shareon.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rooms.kshare.shareon.R

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