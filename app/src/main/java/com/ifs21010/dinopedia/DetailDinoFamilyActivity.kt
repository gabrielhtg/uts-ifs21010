package com.ifs21010.dinopedia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DetailDinoFamilyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_dino_family)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val recyclerView: RecyclerView = findViewById(R.id.recycleview_dino)
        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )

        val gambarDinoFamily = intent.getIntExtra("gambarDinoFamily", 0)
        val namaDinoFamily = intent.getStringExtra("namaDinoFamily")
        val descSingkatDinoFamily = intent.getIntExtra("descSingkatDinoFamily", 0)
        val descLengkapDinoFamily = intent.getStringExtra("descLengkapDinoFamily")

        val gambarDinoFamilyImageView : ImageView = findViewById(R.id.gambar_planet_detail)
        val namaDinoFamilyTextView : TextView = findViewById(R.id.nama_planet_detail)
        val descLengkapDinoFamilyTextView : TextView = findViewById(R.id.detail_planet)
        findViewById<TextView>(R.id.nama_planet_toolbar).text = namaDinoFamily

        gambarDinoFamilyImageView.setImageResource(gambarDinoFamily)
        namaDinoFamilyTextView.text = namaDinoFamily
        descLengkapDinoFamilyTextView.text = descLengkapDinoFamily

        val tombolBack : ImageView = findViewById(R.id.tombol_back_about)
        val tombolShare : Button = findViewById(R.id.all_dino)

        tombolBack.setOnClickListener {
            finish()
        }

        tombolShare.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT, "${namaDinoFamilyTextView.text}\n\n${descSingkatDinoFamily}")
            startActivity(Intent.createChooser(intent, "Bagikan melalui"))
        }

        val listDinoTemp : ArrayList<Dino> = ArrayList()
        val listDino : ArrayList<Dino> = ArrayList()

        val tyrannosaurusRex = Dino(
            R.drawable.tyrannosaurus_rex,
            "saurischia",
            "Tyrannosaurus Rex",
            resources.getString(R.string.desc_singkat_1),
            resources.getString(R.string.desc_lengkap_1)
        )

        val velociraptor = Dino(
            R.drawable.velociraptor,
            "saurischia",
            "Velociraptor",
            resources.getString(R.string.desc_singkat_2),
            resources.getString(R.string.desc_lengkap_2)
        )

        val stegosaurus = Dino(
            R.drawable.stegosaurus,
            "ornithischia",
            "Stegosaurus",
            resources.getString(R.string.desc_singkat_3),
            resources.getString(R.string.desc_lengkap_3)
        )

        val hadrosaurus = Dino(
            R.drawable.hadrosaurus,
            "ornithischia",
            "Hadrosaurus",
            resources.getString(R.string.desc_singkat_4),
            resources.getString(R.string.desc_lengkap_4)
        )

        val allosaurus = Dino(
            R.drawable.allosaurus,
            "theropoda",
            "Allosaurus",
            resources.getString(R.string.desc_singkat_5),
            resources.getString(R.string.desc_lengkap_5)
        )

        val diplodocus = Dino(
            R.drawable.diplodocus,
            "sauropodomorpha",
            "Diplodocus",
            resources.getString(R.string.desc_singkat_6),
            resources.getString(R.string.desc_lengkap_6)
        )

        val brachiosaurus = Dino(
            R.drawable.brachiosaurus,
            "sauropodomorpha",
            "brachiosaurus",
            resources.getString(R.string.desc_singkat_1),
            resources.getString(R.string.desc_lengkap_1)
        )

        val apatosaurus = Dino(
            R.drawable.apatosaurus,
            "sauropodomorpha",
            "apatosaurus",
            resources.getString(R.string.desc_singkat_1),
            resources.getString(R.string.desc_lengkap_1)
        )

        val iguanodon = Dino(
            R.drawable.iguanodon,
            "ornithopoda",
            "Iguanodon",
            resources.getString(R.string.desc_singkat_1),
            resources.getString(R.string.desc_lengkap_1)
        )

        val edmontosaurus = Dino(
            R.drawable.edmontosaurus,
            "ornithopoda",
            "Edmontosaurus",
            resources.getString(R.string.desc_singkat_1),
            resources.getString(R.string.desc_lengkap_1)
        )

        val parasaurolophus = Dino(
            R.drawable.parasaurolophus,
            "ornithopoda",
            "Parasaurolophus",
            resources.getString(R.string.desc_singkat_1),
            resources.getString(R.string.desc_lengkap_1)
        )

        val triceratops = Dino(
            R.drawable.triceratops,
            "ceratopsia",
            "Triceratops",
            resources.getString(R.string.desc_singkat_1),
            resources.getString(R.string.desc_lengkap_1)
        )

        val styracosaurus = Dino(
            R.drawable.styracosaurus,
            "ceratopsia",
            "Styracosaurus",
            resources.getString(R.string.desc_singkat_1),
            resources.getString(R.string.desc_lengkap_1)
        )

        val ankylosaurus = Dino(
            R.drawable.ankylosaurus,
            "ankylosauria",
            "Ankylosaurus",
            resources.getString(R.string.desc_singkat_1),
            resources.getString(R.string.desc_lengkap_1)
        )

        val pteranodon = Dino(
            R.drawable.pteranodon,
            "pterosauria",
            "Pteranodon",
            resources.getString(R.string.desc_singkat_1),
            resources.getString(R.string.desc_lengkap_1)
        )

        val quetzalcoatlus = Dino(
            R.drawable.quetzalcoatlus,
            "pterosauria",
            "Quetzalcoatlus",
            resources.getString(R.string.desc_singkat_1),
            resources.getString(R.string.desc_lengkap_1)
        )

        listDinoTemp.add(tyrannosaurusRex)
        listDinoTemp.add(velociraptor)
        listDinoTemp.add(stegosaurus)
        listDinoTemp.add(hadrosaurus)
        listDinoTemp.add(allosaurus)
        listDinoTemp.add(diplodocus)
        listDinoTemp.add(brachiosaurus)
        listDinoTemp.add(apatosaurus)
        listDinoTemp.add(iguanodon)
        listDinoTemp.add(edmontosaurus)
        listDinoTemp.add(parasaurolophus)
        listDinoTemp.add(triceratops)
        listDinoTemp.add(styracosaurus)
        listDinoTemp.add(ankylosaurus)
        listDinoTemp.add(pteranodon)
        listDinoTemp.add(quetzalcoatlus)

        listDinoTemp.forEach { dino ->
            if (namaDinoFamily != null) {
                if (dino.family.lowercase() == namaDinoFamily.lowercase()) {
                    listDino.add(dino)
                }
            }
        }

        val adapter = MyDinoAdapter(listDino)
        recyclerView.adapter = adapter
    }

}