package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.model.ChildrenItem
import com.example.myapplication.model.Data

/**
 * Created by Abhishek Dubey on 13,December,2019
 */

class RedditAdapter(private val context: Context,private val data: List<ChildrenItem>) : RecyclerView.Adapter<RedditAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      Glide.with(context)
          .load(data[position].data?.thumbnail)
          .into(holder.imageview)
        holder.name.setText(data[position].data?.title)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageview = itemView.findViewById(R.id.imageview) as ImageView
        var name = itemView.findViewById(R.id.name) as TextView
    }
}