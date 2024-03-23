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

        val recyclerView: RecyclerView = findViewById(R.id.dinosaur_family_recycle)
        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )

        val familyName = intent.getStringExtra("familyName")
        val familyImage = intent.getIntExtra("familyImage", 0)
        val familyDesc = intent.getStringExtra("familyDescription")
        val familyLifePeriod = intent.getStringExtra("familyLifePeriod")
        val familyPhysical = intent.getStringExtra("familyPhysical")
        val familyHabitat = intent.getStringExtra("familyHabitat")
        val familyBehavior = intent.getStringExtra("familyBehavior")
        val familyClassification = intent.getStringExtra("familyClassification")

        findViewById<TextView>(R.id.family_name_toolbar).text = familyName
        findViewById<ImageView>(R.id.gambar_famili).setImageResource(familyImage)
        findViewById<TextView>(R.id.nama_famili_dino).text = familyName
        findViewById<TextView>(R.id.content_deskripsi).text = familyDesc
        findViewById<TextView>(R.id.content_life_period).text = familyLifePeriod
        findViewById<TextView>(R.id.content_pyshical).text = familyPhysical
        findViewById<TextView>(R.id.content_habitat).text = familyHabitat
        findViewById<TextView>(R.id.content_behavior).text = familyBehavior
        findViewById<TextView>(R.id.content_classification).text = familyClassification

        val tombolBack : ImageView = findViewById(R.id.tombol_back_about)
        val tombolAllDino : Button = findViewById(R.id.all_dino)

        tombolBack.setOnClickListener {
            finish()
        }

        tombolAllDino.setOnClickListener {
            val intent = Intent(this, AllDinoActivity::class.java)
            startActivity(intent)
        }

        val listDinoTemp : ArrayList<Dino> = ArrayList()
        val listDino : ArrayList<Dino> = ArrayList()

        val tyrannosaurusRex = Dino(
            R.drawable.tyrannosaurus_rex,
            "saurischia",
            "Tyrannosaurus Rex",
            resources.getStringArray(R.array.tyran)[0],
            resources.getStringArray(R.array.tyran)[1],
            resources.getStringArray(R.array.tyran)[2],
            resources.getStringArray(R.array.tyran)[3],
            resources.getStringArray(R.array.tyran)[4],
            resources.getStringArray(R.array.tyran)[5],
            resources.getStringArray(R.array.tyran)[6],
            resources.getStringArray(R.array.tyran)[7],
            resources.getStringArray(R.array.tyran)[8]
        )

        val velociraptor = Dino(
            R.drawable.velociraptor,
            "saurischia",
            "Velociraptor",
            resources.getStringArray(R.array.velociraptor_dinosaur)[0],
            resources.getStringArray(R.array.velociraptor_dinosaur)[1],
            resources.getStringArray(R.array.velociraptor_dinosaur)[2],
            resources.getStringArray(R.array.velociraptor_dinosaur)[3],
            resources.getStringArray(R.array.velociraptor_dinosaur)[4],
            resources.getStringArray(R.array.velociraptor_dinosaur)[5],
            resources.getStringArray(R.array.velociraptor_dinosaur)[6],
            resources.getStringArray(R.array.velociraptor_dinosaur)[7],
            resources.getStringArray(R.array.velociraptor_dinosaur)[8]
        )

        val stegosaurus = Dino(
            R.drawable.stegosaurus,
            "ornithischia",
            "Stegosaurus",
            resources.getStringArray(R.array.stegosaurus)[0],
            resources.getStringArray(R.array.stegosaurus)[1],
            resources.getStringArray(R.array.stegosaurus)[2],
            resources.getStringArray(R.array.stegosaurus)[3],
            resources.getStringArray(R.array.stegosaurus)[4],
            resources.getStringArray(R.array.stegosaurus)[5],
            resources.getStringArray(R.array.stegosaurus)[6],
            resources.getStringArray(R.array.stegosaurus)[7],
            resources.getStringArray(R.array.stegosaurus)[8]
        )

        val hadrosaurus = Dino(
            R.drawable.hadrosaurus,
            "ornithischia",
            "Hadrosaurus",
            resources.getStringArray(R.array.hadrosaurus)[0],
            resources.getStringArray(R.array.hadrosaurus)[1],
            resources.getStringArray(R.array.hadrosaurus)[2],
            resources.getStringArray(R.array.hadrosaurus)[3],
            resources.getStringArray(R.array.hadrosaurus)[4],
            resources.getStringArray(R.array.hadrosaurus)[5],
            resources.getStringArray(R.array.hadrosaurus)[6],
            resources.getStringArray(R.array.hadrosaurus)[7],
            resources.getStringArray(R.array.hadrosaurus)[8]
        )

        val allosaurus = Dino(
            R.drawable.allosaurus,
            "theropoda",
            "Allosaurus",
            resources.getStringArray(R.array.allosaurus)[0],
            resources.getStringArray(R.array.allosaurus)[1],
            resources.getStringArray(R.array.allosaurus)[2],
            resources.getStringArray(R.array.allosaurus)[3],
            resources.getStringArray(R.array.allosaurus)[4],
            resources.getStringArray(R.array.allosaurus)[5],
            resources.getStringArray(R.array.allosaurus)[6],
            resources.getStringArray(R.array.allosaurus)[7],
            resources.getStringArray(R.array.allosaurus)[8]
        )

        val diplodocus = Dino(
            R.drawable.diplodocus,
            "sauropodomorpha",
            "Diplodocus",
            resources.getStringArray(R.array.diplodocus)[0],
            resources.getStringArray(R.array.diplodocus)[1],
            resources.getStringArray(R.array.diplodocus)[2],
            resources.getStringArray(R.array.diplodocus)[3],
            resources.getStringArray(R.array.diplodocus)[4],
            resources.getStringArray(R.array.diplodocus)[5],
            resources.getStringArray(R.array.diplodocus)[6],
            resources.getStringArray(R.array.diplodocus)[7],
            resources.getStringArray(R.array.diplodocus)[8]
        )

        val brachiosaurus = Dino(
            R.drawable.brachiosaurus,
            "sauropodomorpha",
            "Brachiosaurus",
            resources.getStringArray(R.array.brachiosaurus)[0],
            resources.getStringArray(R.array.brachiosaurus)[1],
            resources.getStringArray(R.array.brachiosaurus)[2],
            resources.getStringArray(R.array.brachiosaurus)[3],
            resources.getStringArray(R.array.brachiosaurus)[4],
            resources.getStringArray(R.array.brachiosaurus)[5],
            resources.getStringArray(R.array.brachiosaurus)[6],
            resources.getStringArray(R.array.brachiosaurus)[7],
            resources.getStringArray(R.array.brachiosaurus)[8]
        )

        val apatosaurus = Dino(
            R.drawable.apatosaurus,
            "sauropodomorpha",
            "apatosaurus",
            resources.getStringArray(R.array.apatosaurus)[0],
            resources.getStringArray(R.array.apatosaurus)[1],
            resources.getStringArray(R.array.apatosaurus)[2],
            resources.getStringArray(R.array.apatosaurus)[3],
            resources.getStringArray(R.array.apatosaurus)[4],
            resources.getStringArray(R.array.apatosaurus)[5],
            resources.getStringArray(R.array.apatosaurus)[6],
            resources.getStringArray(R.array.apatosaurus)[7],
            resources.getStringArray(R.array.apatosaurus)[8]
        )

        val iguanodon = Dino(
            R.drawable.iguanodon,
            "ornithopoda",
            "Iguanodon",
            resources.getStringArray(R.array.iguanodon)[0],
            resources.getStringArray(R.array.iguanodon)[1],
            resources.getStringArray(R.array.iguanodon)[2],
            resources.getStringArray(R.array.iguanodon)[3],
            resources.getStringArray(R.array.iguanodon)[4],
            resources.getStringArray(R.array.iguanodon)[5],
            resources.getStringArray(R.array.iguanodon)[6],
            resources.getStringArray(R.array.iguanodon)[7],
            resources.getStringArray(R.array.iguanodon)[8]
        )

        val edmontosaurus = Dino(
            R.drawable.edmontosaurus,
            "ornithopoda",
            "Edmontosaurus",
            resources.getStringArray(R.array.edmontosaurus)[0],
            resources.getStringArray(R.array.edmontosaurus)[1],
            resources.getStringArray(R.array.edmontosaurus)[2],
            resources.getStringArray(R.array.edmontosaurus)[3],
            resources.getStringArray(R.array.edmontosaurus)[4],
            resources.getStringArray(R.array.edmontosaurus)[5],
            resources.getStringArray(R.array.edmontosaurus)[6],
            resources.getStringArray(R.array.edmontosaurus)[7],
            resources.getStringArray(R.array.edmontosaurus)[8]
        )

        val parasaurolophus = Dino(
            R.drawable.parasaurolophus,
            "ornithopoda",
            "Parasaurolophus",
            resources.getStringArray(R.array.parasaurolophus)[0],
            resources.getStringArray(R.array.parasaurolophus)[1],
            resources.getStringArray(R.array.parasaurolophus)[2],
            resources.getStringArray(R.array.parasaurolophus)[3],
            resources.getStringArray(R.array.parasaurolophus)[4],
            resources.getStringArray(R.array.parasaurolophus)[5],
            resources.getStringArray(R.array.parasaurolophus)[6],
            resources.getStringArray(R.array.parasaurolophus)[7],
            resources.getStringArray(R.array.parasaurolophus)[8]
        )

        val triceratops = Dino(
            R.drawable.triceratops,
            "ceratopsia",
            "Triceratops",
            resources.getStringArray(R.array.triceratops)[0],
            resources.getStringArray(R.array.triceratops)[1],
            resources.getStringArray(R.array.triceratops)[2],
            resources.getStringArray(R.array.triceratops)[3],
            resources.getStringArray(R.array.triceratops)[4],
            resources.getStringArray(R.array.triceratops)[5],
            resources.getStringArray(R.array.triceratops)[6],
            resources.getStringArray(R.array.triceratops)[7],
            resources.getStringArray(R.array.triceratops)[8]
        )

        val styracosaurus = Dino(
            R.drawable.styracosaurus,
            "ceratopsia",
            "Styracosaurus",
            resources.getStringArray(R.array.styracosaurus)[0],
            resources.getStringArray(R.array.styracosaurus)[1],
            resources.getStringArray(R.array.styracosaurus)[2],
            resources.getStringArray(R.array.styracosaurus)[3],
            resources.getStringArray(R.array.styracosaurus)[4],
            resources.getStringArray(R.array.styracosaurus)[5],
            resources.getStringArray(R.array.styracosaurus)[6],
            resources.getStringArray(R.array.styracosaurus)[7],
            resources.getStringArray(R.array.styracosaurus)[8]
        )

        val ankylosaurus = Dino(
            R.drawable.ankylosaurus,
            "ankylosauria",
            "Ankylosaurus",
            resources.getStringArray(R.array.ankylosaurus)[0],
            resources.getStringArray(R.array.ankylosaurus)[1],
            resources.getStringArray(R.array.ankylosaurus)[2],
            resources.getStringArray(R.array.ankylosaurus)[3],
            resources.getStringArray(R.array.ankylosaurus)[4],
            resources.getStringArray(R.array.ankylosaurus)[5],
            resources.getStringArray(R.array.ankylosaurus)[6],
            resources.getStringArray(R.array.ankylosaurus)[7],
            resources.getStringArray(R.array.ankylosaurus)[8]

            )

        val pteranodon = Dino(
            R.drawable.pteranodon,
            "pterosauria",
            "Pteranodon",
            resources.getStringArray(R.array.pteranodon)[0],
            resources.getStringArray(R.array.pteranodon)[1],
            resources.getStringArray(R.array.pteranodon)[2],
            resources.getStringArray(R.array.pteranodon)[3],
            resources.getStringArray(R.array.pteranodon)[4],
            resources.getStringArray(R.array.pteranodon)[5],
            resources.getStringArray(R.array.pteranodon)[6],
            resources.getStringArray(R.array.pteranodon)[7],
            resources.getStringArray(R.array.pteranodon)[8]

            )

        val quetzalcoatlus = Dino(
            R.drawable.quetzalcoatlus,
            "pterosauria",
            "Quetzalcoatlus",
            resources.getStringArray(R.array.quetzalcoatlus)[0],
            resources.getStringArray(R.array.quetzalcoatlus)[1],
            resources.getStringArray(R.array.quetzalcoatlus)[2],
            resources.getStringArray(R.array.quetzalcoatlus)[3],
            resources.getStringArray(R.array.quetzalcoatlus)[4],
            resources.getStringArray(R.array.quetzalcoatlus)[5],
            resources.getStringArray(R.array.quetzalcoatlus)[6],
            resources.getStringArray(R.array.quetzalcoatlus)[7],
            resources.getStringArray(R.array.quetzalcoatlus)[8]
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
            if (familyName != null) {
                if (dino.dinoFamily.lowercase() == familyName.lowercase()) {
                    listDino.add(dino)
                }
            }
        }

        val adapter = MyDinoAdapter(listDino)
        recyclerView.adapter = adapter
    }

}