package com.rooms.kshare.shareon

import android.content.Context
import android.util.Log

class KotlinStruct(val context : Context, val msg : String) {

    val TAG = KotlinStruct::class.simpleName;
    var type : Int = 0

    init {
        Log.d(TAG, "init")

        Log.d(TAG, "constructor context : " + context)
        Log.d(TAG, "constructor msg : " + msg)
    }

    constructor(context : Context, msg : String, type : Int) : this(context, msg) {
        Log.d(TAG, "constructor type : " + type)
        this.type = type

    }
}