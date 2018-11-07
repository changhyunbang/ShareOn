package com.rooms.kshare.shareon.fragment

import android.content.Context
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rooms.kshare.shareon.ItemsAdapter
import com.rooms.kshare.shareon.R

class FirstFragment : BaseFragment() {

    val TAG = FirstFragment::class.simpleName;

/*
    [Kotlin] Property must be initialized or be abstract
    reason  : Non-null로 선언한 프로퍼티를 선언과 동시에 초기화하지 않았을 경우 발생
    resolve : lateinit은 이 프로퍼티는 절대로 Null이 될 수 없는 프로퍼티인데 초기화를 선언과 동시에 해줄 수 없거나
              성능이나 기타 다른 조건들로 인해 최대한 초기화를 미뤄야 할 때
*/
    lateinit var name: String

    val items : ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        Log.d(TAG, "onCreateView!")

        var view = inflater.inflate(R.layout.view_fragment_first, container, false)

        return view
    }
}