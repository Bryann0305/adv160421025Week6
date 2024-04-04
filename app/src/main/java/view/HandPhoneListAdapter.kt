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
        holder.binding.txtBrand.text = handphoneList[position].brand
        holder.binding.txtModel.text = handphoneList[position].model
        holder.binding.txtYear.text = handphoneList[position].year.toString()
        holder.binding.txtSpecs.text = handphoneList[position].specs.toString()
        holder.binding.txtColors.text = handphoneList[position].colors.toString()
    }
    fun updateDrinkList(newDrinkList: ArrayList<Handphone>) {
        handphoneList.clear()
        handphoneList.addAll(newDrinkList)
        notifyDataSetChanged()
    }


}