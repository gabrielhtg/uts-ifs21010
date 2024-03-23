package com.ifs21010.dinopedia

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        val buttonAbout : ImageButton = findViewById(R.id.button_profile)

        buttonAbout.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }

        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )

        val listDinoFamily: ArrayList<DinoFamily> = ArrayList()

        println(resources.getStringArray(R.array.saurischia)[0])

        val saurischia = DinoFamily(
            R.drawable.saurischia,
            "Saurischia",
            resources.getStringArray(R.array.saurischia)[0],
            resources.getStringArray(R.array.saurischia)[1],
            resources.getStringArray(R.array.saurischia)[2],
            resources.getStringArray(R.array.saurischia)[3],
            resources.getStringArray(R.array.saurischia)[4],
            resources.getStringArray(R.array.saurischia)[5],
        )

        val ornithischia = DinoFamily(
            R.drawable.ornithischia,
            "Ornithischians",
            resources.getStringArray(R.array.ornithischians)[0],
            resources.getStringArray(R.array.ornithischians)[1],
            resources.getStringArray(R.array.ornithischians)[2],
            resources.getStringArray(R.array.ornithischians)[3],
            resources.getStringArray(R.array.ornithischians)[4],
            resources.getStringArray(R.array.ornithischians)[5],
        )

        val theropods = DinoFamily(
            R.drawable.theropoda,
            "Theropods",
            resources.getStringArray(R.array.theropods)[0],
            resources.getStringArray(R.array.theropods)[1],
            resources.getStringArray(R.array.theropods)[2],
            resources.getStringArray(R.array.theropods)[3],
            resources.getStringArray(R.array.theropods)[4],
            resources.getStringArray(R.array.theropods)[5],
        )

        val sauropodomorpha = DinoFamily(
            R.drawable.sauropodomorpha,
            "Sauropodomorpha",
            resources.getStringArray(R.array.sauropodomorpha)[0],
            resources.getStringArray(R.array.sauropodomorpha)[1],
            resources.getStringArray(R.array.sauropodomorpha)[2],
            resources.getStringArray(R.array.sauropodomorpha)[3],
            resources.getStringArray(R.array.sauropodomorpha)[4],
            resources.getStringArray(R.array.sauropodomorpha)[5],
        )

        val ornithopoda = DinoFamily(
            R.drawable.ornithopoda,
            "Ornithopoda",
            resources.getStringArray(R.array.ornithopoda)[0],
            resources.getStringArray(R.array.ornithopoda)[1],
            resources.getStringArray(R.array.ornithopoda)[2],
            resources.getStringArray(R.array.ornithopoda)[3],
            resources.getStringArray(R.array.ornithopoda)[4],
            resources.getStringArray(R.array.ornithopoda)[5],
        )

        val ceratopsia = DinoFamily(
            R.drawable.ceratopsia,
            "Ceratopsia",
            resources.getStringArray(R.array.ceratopsia)[0],
            resources.getStringArray(R.array.ceratopsia)[1],
            resources.getStringArray(R.array.ceratopsia)[2],
            resources.getStringArray(R.array.ceratopsia)[3],
            resources.getStringArray(R.array.ceratopsia)[4],
            resources.getStringArray(R.array.ceratopsia)[5],
        )

        val ankylosauria = DinoFamily(
            R.drawable.ankylosauria,
            "Ankylosauria",
            resources.getStringArray(R.array.ankylosauria)[0],
            resources.getStringArray(R.array.ankylosauria)[1],
            resources.getStringArray(R.array.ankylosauria)[2],
            resources.getStringArray(R.array.ankylosauria)[3],
            resources.getStringArray(R.array.ankylosauria)[4],
            resources.getStringArray(R.array.ankylosauria)[5],
        )

        val pterosauria = DinoFamily(
            R.drawable.pterosauria,
            "Pterosauria",
            resources.getStringArray(R.array.pterosauria)[0],
            resources.getStringArray(R.array.pterosauria)[1],
            resources.getStringArray(R.array.pterosauria)[2],
            resources.getStringArray(R.array.pterosauria)[3],
            resources.getStringArray(R.array.pterosauria)[4],
            resources.getStringArray(R.array.pterosauria)[5],
        )

        listDinoFamily.add(saurischia)
        listDinoFamily.add(ornithischia)
        listDinoFamily.add(theropods)
        listDinoFamily.add(sauropodomorpha)
        listDinoFamily.add(ornithopoda)
        listDinoFamily.add(ceratopsia)
        listDinoFamily.add(ankylosauria)
        listDinoFamily.add(pterosauria)

        val adapter = MyDinoFamilyAdapter(listDinoFamily)
        recyclerView.adapter = adapter
    }
}