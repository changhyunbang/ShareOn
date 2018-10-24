package com.rooms.kshare.shareon

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FirstFragment : Fragment() {

    val TAG = FirstFragment::class.simpleName;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        return super.onCreateView(inflater, container, savedInstanceState)

        Log.d(TAG, "onCreateView!")

        var view = inflater.inflate(R.layout.view_fragment_first, container, false)

        return view
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)

        Log.d(TAG, "onAttach!")
    }

    override fun onDetach() {
        super.onDetach()

        Log.d(TAG, "onDetach!")
    }

    override fun onStart() {
        super.onStart()

        Log.d(TAG, "onStart!")
    }

    override fun onStop() {
        super.onStop()

        Log.d(TAG, "onStop!")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG, "onDestroy!")
    }
}