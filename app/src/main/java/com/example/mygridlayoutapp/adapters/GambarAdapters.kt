package com.example.mygridlayoutapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.mygridlayoutapp.R
import com.example.mygridlayoutapp.model.gambarvespa

class GambarAdapters(var context: Context, var arrayList: ArrayList<gambarvespa>) :
     RecyclerView.Adapter<GambarAdapters.ItemHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {

        val itemHolder = LayoutInflater.from(parent.context).
        inflate(R.layout.grid_layout_list_item , parent , false)
        return ItemHolder(itemHolder)

    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {

        var gambarvespa:gambarvespa = arrayList.get(position)

        holder.icons.setImageResource(gambarvespa.iconsChar!!)
        holder.gambar.text = gambarvespa.gambarvespa

        holder.gambar.setOnClickListener{
            Toast.makeText(context , gambarvespa.gambarvespa , Toast.LENGTH_LONG).show()

        }

    }

    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var icons: ImageView = itemView.findViewById<ImageView>(R.id.icons_image)
        var gambar : TextView = itemView.findViewById<TextView>(R.id.gambar_text_view)
   }
}
