package com.rooms.kshare.shareon

import android.content.Context
import android.support.v4.app.Fragment
import android.util.Log

/*
    [Kotlin] This type is final, So it cannot be inherited from..
    reason  : Kotlin 에서는 기본적으로 모든 Class 가 final 이다.
             따라서 상속하여 재정의 하려면, 상속을 허용하는 open 키워드를 붙여주어야 한다.
    resolve : Class 에 open 키워드를 삽입해준다.
*/
open class BaseFragment : Fragment() {

    private val TAG = BaseFragment::class.simpleName;

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