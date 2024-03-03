package com.geeks.homework_8_3_ai

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geeks.homework_8_3_ai.databinding.ItemHouseBinding

class HouseAdapter(
    private val house: ArrayList<House>,
    private val onClick: (position: Int) -> Unit
) : RecyclerView.Adapter<HouseAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemHouseBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = house.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(house[position])
        holder.itemView.setOnClickListener {
            onClick(position)
        }
    }

    inner class ViewHolder(private var binding: ItemHouseBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(house: House) {
            binding.tvStudy.text = house.study
            binding.tvName.text = house.name
            binding.imgHouse.loadImage(house.img)
        }
    }

}
