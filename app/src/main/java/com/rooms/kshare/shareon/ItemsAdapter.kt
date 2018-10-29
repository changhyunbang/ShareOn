package com.rooms.kshare.shareon

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rooms.kshare.shareon.R
import kotlinx.android.synthetic.main.result_list_item.view.*

class ItemsAdapter(val context : Context, val items : ArrayList<String>) : RecyclerView.Adapter<ItemsAdapter.ViewHolder>() {

    val TAG = ItemsAdapter::class.simpleName;

    init {
        Log.d(TAG, "init!")
        Log.d(TAG, "context = " + context + " items = " + items)
    }

    // [Kotlin] sconstruct with property
    constructor(context : Context, items : ArrayList<String>, count : Int) : this(context, items) {
        Log.d(TAG, "constructor context = " + context + " items = " + items)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d(TAG, "onBindViewHolder position = " + position)

        holder?.tvAnimalType?.text = items.get(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        Log.d(TAG, "onCreateViewHolder")

        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.result_list_item, parent, false))
    }

    override fun getItemCount(): Int {

        Log.d(TAG, "getItemCount")

        return items.size
    }

    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each animal to
        val tvAnimalType = view.TV_ITEM_NAME
    }
}