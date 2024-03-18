package com.ifs21010.dinopedia

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AllDinoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_all_dino)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

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

        val listDinoTemp : ArrayList<Dino> = ArrayList()

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

        val adapter = MyDinoAdapter(listDinoTemp)
        recyclerView.adapter = adapter
    }
}