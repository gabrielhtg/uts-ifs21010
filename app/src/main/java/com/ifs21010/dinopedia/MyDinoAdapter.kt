package com.ifs21010.dinopedia

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyDinoAdapter (val dinoList : ArrayList<Dino>) : RecyclerView.Adapter<MyDinoAdapter.MyViewHolder> () {
    inner class MyViewHolder (dinoView : View) : RecyclerView.ViewHolder(dinoView),
        View.OnClickListener {
        var gambarDino : ImageView
        var namaDino : TextView
        var descSingkatDino : TextView

        init {
            gambarDino = dinoView.findViewById(R.id.imageView)
            namaDino = dinoView.findViewById(R.id.nama_planet)
            descSingkatDino = dinoView.findViewById(R.id.deskripsi)

            dinoView.setOnClickListener (this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            val intent = Intent(v!!.context, DetailDinoActivity::class.java).apply {
                putExtra("gambarDino", dinoList[position].gambarDino)
                putExtra("namaDino", dinoList[position].namaDino)
                putExtra("descSingkatDino", dinoList[position].descSingkatDino)
                putExtra("descLengkapDino", dinoList[position].descLengkapDino)
            }
            v.context.startActivity(intent)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.dino_item, parent, false)

        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return dinoList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.namaDino.text = dinoList[position].namaDino
        holder.descSingkatDino.text = dinoList[position].descSingkatDino
        holder.gambarDino.setImageResource(dinoList[position].gambarDino)
    }
}
