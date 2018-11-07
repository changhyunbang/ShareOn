package com.rooms.kshare.shareon

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.rooms.kshare.shareon.fragment.FgActivity
import com.rooms.kshare.shareon.mvp.view.MvpActivity
import com.rooms.kshare.shareon.mvvm.view.MvvmActivity

class MainActivity : AppCompatActivity() {

    // define static without instance
    companion object {
        @JvmField
        public val pubVar = "PUBLIC_VAR"
    }

    val TAG = MainActivity::class.simpleName;

    val items : ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addItems()

        var context: Context? = this.applicationContext
        val rv_item_list = findViewById<android.support.v7.widget.RecyclerView>(R.id.rv_item_list)

        if (context != null){
            rv_item_list.layoutManager = LinearLayoutManager(context)
            rv_item_list.adapter = ItemsAdapter(context, items)

            rv_item_list.addOnItemTouchListener(RecyclerItemClickListener(
                    context,
                    rv_item_list,
                    object : RecyclerItemClickListener.OnItemClickListener {
                        override fun onItemClick(view: View, position: Int) {

                            when (position) {
                                0 -> {
                                    startActivity(Intent(context, MvpActivity::class.java))
                                }
                                1 -> {
                                    startActivity(Intent(context, MvvmActivity::class.java))
                                }
                                2 -> {
                                    startActivity(Intent(context, FgActivity::class.java))
                                }
                            }
                        }

                        override fun onLongItemClick(view: View?, position: Int) {

                        }
                    }
            ))
        }
    }

    fun addItems() {
        items.add("01.MVP")
        items.add("02.MVVP")
        items.add("03.Fragment")
    }
}
