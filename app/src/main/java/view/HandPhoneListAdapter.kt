package com.ubaya.adv160421025week6.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.ubaya.adv160421025week6.databinding.HandphoneListItemBinding
import com.ubaya.adv160421025week6.model.Handphone


class HandPhoneListAdapter(val handphoneList:ArrayList<Handphone>)
    : RecyclerView.Adapter<HandPhoneListAdapter.HandPhoneViewHolder>()
{
    class HandPhoneViewHolder(var binding: HandphoneListItemBinding)
        : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HandPhoneViewHolder {
        val binding = HandphoneListItemBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return HandPhoneViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return handphoneList.size
    }

    override fun onBindViewHolder(holder: HandPhoneViewHolder, position: Int) {
        holder.binding.txtID.text = handphoneList[position].id
        holder.binding.txtName.text = handphoneList[position].brand
        holder.binding.txtCategory.text = handphoneList[position].model
        holder.binding.txtIngredients.text = handphoneList[position].year.toString()
        holder.binding.txtExtras.text = handphoneList[position].specs.toString()
    }
    fun updateDrinkList(newDrinkList: ArrayList<Handphone>) {
        handphoneList.clear()
        handphoneList.addAll(newDrinkList)
        notifyDataSetChanged()
    }


}