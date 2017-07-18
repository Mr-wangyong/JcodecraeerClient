package com.mrwang.jcodecraeerclient.view

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.marktony.fanfouhandpick.interfaze.OnRecyclerViewOnClickListener
import com.mrwang.jcodecraeerclient.R
import com.mrwang.jcodecraeerclient.model.NewItem
import kotlinx.android.synthetic.main.new_item_view.view.*

/**
 * User: chengwangyong(chengwangyong@blinnnk.com)
 * Date: 2017/7/4
 * Time: 下午7:22
 */
class NewListAdapter(var items: MutableList<NewItem>, var context: Context) : RecyclerView.Adapter<NewItemHolder>() {


    private val inflater: LayoutInflater = LayoutInflater.from(context)

    private var mListener: OnRecyclerViewOnClickListener? = null

    override
    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewItemHolder? {
        val view: View = inflater.inflate(R.layout.new_item_view, parent, false)
        return NewItemHolder(view, mListener!!)
    }

    override
    fun onBindViewHolder(holder: NewItemHolder, position: Int) {

        val item = items[position]

        Glide.with(context).load(item.user.face).asBitmap().into(holder.itemView.avatar)

        holder.itemView.tv_author.text = item.user.nickname
        holder.itemView.tv_content.text = item.title
        holder.itemView.tv_time.text = item.pubDate
        holder.postion = position
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setItemClickListener(listener: OnRecyclerViewOnClickListener) {
        this.mListener = listener
    }

    fun addData(items: List<NewItem>) {
        val size = this.items.size
        this.items.addAll(items)
        val start = if (size > 0) size - 1 else 0
        if (items.isNotEmpty()) {
            notifyItemRangeChanged(start, items.size)
        }
    }
}

class NewItemHolder(itemView: View, var listener: OnRecyclerViewOnClickListener?) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
    var postion:Int = 0

    init {
        itemView.setOnClickListener(this)
    }

    override
    fun onClick(view: View) {
        listener?.OnItemClick(view, postion)
    }

}