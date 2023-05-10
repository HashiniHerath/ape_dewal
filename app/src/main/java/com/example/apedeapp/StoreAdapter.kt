package com.example.apedeapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StoreAdapter (
    private val storeItemsList: ArrayList<Store>,
    private val context: Context,
) : RecyclerView.Adapter<StoreAdapter.StoreViewHolder>()  {

    class StoreViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val sellerID: TextView = itemView.findViewById(R.id.sellerId)
        val itemTitle: TextView = itemView.findViewById(R.id.selItemTitle)
        val itemPrice: TextView = itemView.findViewById(R.id.price)
        val itemDescription: TextView = itemView.findViewById(R.id.desription)
        val itemColor: TextView = itemView.findViewById(R.id.color)
        val randomID: TextView = itemView.findViewById(R.id.randomId)

        val updateBtn: Button = itemView.findViewById(R.id.button5)
        val deleteBtn: Button = itemView.findViewById(R.id.button2)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.single_item_to_seller,parent,false)
        return StoreViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: StoreViewHolder, position: Int) {
        holder.sellerID.text = storeItemsList[position].sellerID
        holder.itemTitle.text = storeItemsList[position].itemName
        holder.itemPrice.text = storeItemsList[position].ItemPrice
        holder.itemDescription.text = storeItemsList[position].ItemDescription
        holder.itemColor.text = storeItemsList[position].itemColor
        holder.randomID.text = storeItemsList[position].randomID
    }

    override fun getItemCount(): Int {
        return storeItemsList.size
    }
}