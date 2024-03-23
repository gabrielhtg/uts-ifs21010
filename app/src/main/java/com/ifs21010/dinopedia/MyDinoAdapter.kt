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
            namaDino = dinoView.findViewById(R.id.family_name)
            descSingkatDino = dinoView.findViewById(R.id.familyDesc)

            dinoView.setOnClickListener (this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            val currentDino = dinoList[position]

            val intent = Intent(v!!.context, DetailDinoActivity::class.java).apply {
                putExtra("dinoImage", currentDino.dinoImage)
                putExtra("dinoName", currentDino.dinoName)
                putExtra("dinoDesc", currentDino.dinoDesc)
                putExtra("dinoChar", currentDino.dinoKarakter)
                putExtra("dinoGroup", currentDino.dinoKelompok)
                putExtra("dinoHabitat", currentDino.dinoHabitat)
                putExtra("dinoDiet", currentDino.dinoMakanan)
                putExtra("dinoLength", currentDino.dinoPanjang)
                putExtra("dinoHeigt", currentDino.dinoTinggi)
                putExtra("dinoWeight", currentDino.dinoBobot)
                putExtra("dinoWeakness", currentDino.dinoKelemahan)
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
        holder.namaDino.text = dinoList[position].dinoName
        holder.descSingkatDino.text = dinoList[position].dinoDesc
        holder.gambarDino.setImageResource(dinoList[position].dinoImage)
    }
}
