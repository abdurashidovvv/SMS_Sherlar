package com.abdurashidov.sms_sherlar.models

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abdurashidov.sms_sherlar.databinding.RvItemBinding

class RvAdapter(val list:ArrayList<Sher>, val rvClick: RvClick): RecyclerView.Adapter<RvAdapter.Vh>() {

    inner class Vh(val rvItem: RvItemBinding): RecyclerView.ViewHolder(rvItem.root){
        fun onBind(sher:Sher){
            rvItem.name.text=sher.name
            rvItem.shortText.text=sher.shortText
            rvItem.itemCard.setOnClickListener {
                rvClick.onClick(sher)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(RvItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    interface RvClick{
        fun onClick(sher: Sher)
    }

}