package com.mikepenz.fastadapter

import android.os.Bundle
import android.view.MotionEvent
import android.view.View

import androidx.recyclerview.widget.RecyclerView

/**
 * Created by mikepenz on 04/06/2017.
 */

interface IAdapterExtension<Item : IItem<out RecyclerView.ViewHolder>> {
    fun withSavedInstanceState(savedInstanceState: Bundle?, prefix: String)

    fun saveInstanceState(savedInstanceState: Bundle?, prefix: String)

    fun onClick(v: View, pos: Int, fastAdapter: FastAdapter<Item>, item: Item): Boolean

    fun onLongClick(v: View, pos: Int, fastAdapter: FastAdapter<Item>, item: Item): Boolean

    fun onTouch(
        v: View,
        event: MotionEvent,
        position: Int,
        fastAdapter: FastAdapter<Item>,
        item: Item
    ): Boolean

    fun notifyAdapterDataSetChanged()

    fun notifyAdapterItemRangeInserted(position: Int, itemCount: Int)

    fun notifyAdapterItemRangeRemoved(position: Int, itemCount: Int)

    fun notifyAdapterItemMoved(fromPosition: Int, toPosition: Int)

    fun notifyAdapterItemRangeChanged(position: Int, itemCount: Int, payload: Any?)

    operator fun set(items: List<Item>, resetFilter: Boolean)

    fun performFiltering(constraint: CharSequence?)
}
