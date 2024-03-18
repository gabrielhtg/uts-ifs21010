package com.ifs21010.dinopedia

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyDinoFamilyAdapter (val dinoFamilies : ArrayList<DinoFamily>) : RecyclerView.Adapter<MyDinoFamilyAdapter.MyViewHolder> () {
    inner class MyViewHolder (dinoFamilyView : View) : RecyclerView.ViewHolder(dinoFamilyView),
        View.OnClickListener {
        var gambarDinoFamily : ImageView
        var namaDinoFamily : TextView
        var descSingkatDinoFamily : TextView

        init {
            gambarDinoFamily = dinoFamilyView.findViewById(R.id.imageView)
            namaDinoFamily = dinoFamilyView.findViewById(R.id.nama_planet)
            descSingkatDinoFamily = dinoFamilyView.findViewById(R.id.deskripsi)

            dinoFamilyView.setOnClickListener (this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            val intent = Intent(v!!.context, DetailDinoFamilyActivity::class.java).apply {
                putExtra("gambarDinoFamily", dinoFamilies[position].gambarDinoFamily)
                putExtra("namaDinoFamily", dinoFamilies[position].namaDinoFamily)
                putExtra("descSingkatDinoFamily", dinoFamilies[position].descSingkatDinoFamily)
                putExtra("descLengkapDinoFamily", dinoFamilies[position].descLengkapDinoFamily)
            }
            v.context.startActivity(intent)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.dino_family_item, parent, false)

        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return dinoFamilies.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.namaDinoFamily.text = dinoFamilies[position].namaDinoFamily
        holder.descSingkatDinoFamily.text = dinoFamilies[position].descSingkatDinoFamily
        holder.gambarDinoFamily.setImageResource(dinoFamilies[position].gambarDinoFamily)
    }
}
