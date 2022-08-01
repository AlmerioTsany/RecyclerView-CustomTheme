package com.almerio.recyclerview.secondrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.almerio.recyclerview.R
import com.almerio.recyclerview.secondrecyclerview.data.Cars
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListCarAdapter(private val listCars: ArrayList<Cars>): RecyclerView.Adapter<ListCarAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var imgcars: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_car, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val cars = listCars[position]
        Glide.with(holder.itemView.context)
            .load(cars.img)
            .apply(RequestOptions().override(150, 150))
            .into(holder.imgcars)
        holder.tvName.text = cars.name
    }

    override fun getItemCount(): Int {
        return listCars.size
    }

}