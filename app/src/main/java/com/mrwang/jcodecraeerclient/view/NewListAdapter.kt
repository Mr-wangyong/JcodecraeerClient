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
class NewListAdapter(var items: List<NewItem>?, var context: Context) : RecyclerView.Adapter<NewItemHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    private var mListener: OnRecyclerViewOnClickListener? = null

    override
    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewItemHolder? {
        val view: View = inflater.inflate(R.layout.new_item_view, parent, false)
        return NewItemHolder(view, mListener!!)
    }

    override
    fun onBindViewHolder(holder: NewItemHolder, position: Int) {

        val item = items?.get(position)

        Glide.with(context).load(item?.user?.face).asBitmap().into(holder.itemView.avatar)

        if (!item?.user?.face.isNullOrEmpty()) {
            holder.itemView.iv_main.visibility = View.VISIBLE
        } else {
            holder.itemView.iv_main.visibility = View.INVISIBLE
        }

        holder.itemView.tv_author.text = item?.user?.nickname
        holder.itemView.tv_content.text = item?.title
        holder.itemView.tv_time.text = item?.pubDate
    }

    override fun getItemCount(): Int {
        return items?.size ?: 0
    }

    fun setItemClickListener(listener: OnRecyclerViewOnClickListener) {
        this.mListener = listener
    }
}

class NewItemHolder(itemView: View, var listener: OnRecyclerViewOnClickListener) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
    init {
        itemView.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        listener.OnItemClick(p0!!, layoutPosition)
    }

}