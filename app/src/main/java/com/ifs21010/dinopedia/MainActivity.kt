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

        val saurischia = DinoFamily(
            R.drawable.saurischia,
            "Saurischia",
            resources.getString(R.string.desc_singkat_saurischia),
            resources.getString(R.string.desc_lengkap_saurischia)
        )

        val ornithischia = DinoFamily(
            R.drawable.ornithischia,
            "Ornithischia",
            resources.getString(R.string.desc_singkat_ornithischia),
            resources.getString(R.string.desc_lengkap_ornithopoda)
        )

        val theropoda = DinoFamily(
            R.drawable.theropoda,
            "Theropoda",
            resources.getString(R.string.desc_singkat_theropoda),
            resources.getString(R.string.desc_lengkap_theropoda)
        )

        val sauropodomorpha = DinoFamily(
            R.drawable.sauropodomorpha,
            "Sauropodomorpha",
            resources.getString(R.string.desc_singkat_sauropodomorpha),
            resources.getString(R.string.desc_lengkap_sauropodomorpha)
        )

        val ornithopoda = DinoFamily(
            R.drawable.ornithopoda,
            "Ornithopoda",
            resources.getString(R.string.desc_singkat_ornithopoda),
            resources.getString(R.string.desc_lengkap_ornithopoda)
        )

        val ceratopsia = DinoFamily(
            R.drawable.ceratopsia,
            "Ceratopsia",
            resources.getString(R.string.desc_singkat_ceratopsia),
            resources.getString(R.string.desc_singkat_ceratopsia)
        )

        val ankylosauria = DinoFamily(
            R.drawable.ankylosauria,
            "Ankylosauria",
            resources.getString(R.string.desc_singkat_ankylosauria),
            resources.getString(R.string.desc_lengkap_ankylosauria)
        )

        val pterosauria = DinoFamily(
            R.drawable.pterosauria,
            "Pterosauria",
            resources.getString(R.string.desc_singkat_pterosauria),
            resources.getString(R.string.desc_lengkap_pterosauria)
        )

        listDinoFamily.add(saurischia)
        listDinoFamily.add(ornithischia)
        listDinoFamily.add(theropoda)
        listDinoFamily.add(sauropodomorpha)
        listDinoFamily.add(ornithopoda)
        listDinoFamily.add(ceratopsia)
        listDinoFamily.add(ankylosauria)
        listDinoFamily.add(pterosauria)

        val adapter = MyDinoFamilyAdapter(listDinoFamily)
        recyclerView.adapter = adapter
    }
}