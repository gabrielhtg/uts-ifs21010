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
        val gambarDinoFamily : ImageView
        val namaDinoFamily : TextView
        val descDinoFamily : TextView

        init {
            gambarDinoFamily = dinoFamilyView.findViewById(R.id.imageView)
            namaDinoFamily = dinoFamilyView.findViewById(R.id.family_name)
            descDinoFamily = dinoFamilyView.findViewById(R.id.familyDesc)

            dinoFamilyView.setOnClickListener (this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            val intent = Intent(v!!.context, DetailDinoFamilyActivity::class.java).apply {
                putExtra("familyName", dinoFamilies[position].familyName)
                putExtra("familyImage", dinoFamilies[position].familyImage)
                putExtra("familyDescription", dinoFamilies[position].familyDesc)
                putExtra("familyLifePeriod", dinoFamilies[position].familyLifePeriod)
                putExtra("familyPhysical", dinoFamilies[position].familyPhysicalCharacteristics)
                putExtra("familyHabitat", dinoFamilies[position].familyHabitat)
                putExtra("familyBehavior", dinoFamilies[position].familyBehavior)
                putExtra("familyClassification", dinoFamilies[position].familyClassification)
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
        val currentDino  = dinoFamilies[position]

        holder.gambarDinoFamily.setImageResource(currentDino.familyImage)
        holder.namaDinoFamily.text = currentDino.familyName
        holder.descDinoFamily.text = currentDino.familyDesc
    }
}
