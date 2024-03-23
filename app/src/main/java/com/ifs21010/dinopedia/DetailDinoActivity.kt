package com.ifs21010.dinopedia

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailDinoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_dino)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val dinoImage = intent.getIntExtra("dinoImage", 0)
        val dinoName = intent.getStringExtra("dinoName")
        val dinoDesc = intent.getStringExtra("dinoDesc")
        val dinoChar = intent.getStringExtra("dinoChar")
        val dinoGroup = intent.getStringExtra("dinoGroup")
        val dinoHabitat = intent.getStringExtra("dinoHabitat")
        val dinoDiet = intent.getStringExtra("dinoDiet")
        val dinoLength = intent.getStringExtra("dinoLength")
        val dinoWeight = intent.getStringExtra("dinoWeight")
        val dinoHeight = intent.getStringExtra("dinoHeight")
        val dinoWeakness = intent.getStringExtra("dinoWeakness")

        findViewById<TextView>(R.id.nama_dino_detail).text = dinoName
        findViewById<ImageView>(R.id.gambar_dino_detail).setImageResource(dinoImage)
        findViewById<TextView>(R.id.content_dino_description).text = dinoDesc
        findViewById<TextView>(R.id.content_dino_characteristics).text = dinoChar
        findViewById<TextView>(R.id.content_dino_group).text = dinoGroup
        findViewById<TextView>(R.id.content_dino_habitat).text = dinoHabitat
        findViewById<TextView>(R.id.content_dino_diet).text = dinoDiet
        findViewById<TextView>(R.id.content_dino_length).text = dinoLength
        findViewById<TextView>(R.id.content_dino_weight).text = dinoWeight
        findViewById<TextView>(R.id.content_dino_weakness).text = dinoWeakness

        val tombolBack : ImageView = findViewById(R.id.tombol_back_about)
        val tombolShare : ImageView = findViewById(R.id.tombol_share)

        tombolBack.setOnClickListener {
            finish()
        }

        tombolShare.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT, "${dinoName}\n\n${dinoDesc}")
            startActivity(Intent.createChooser(intent, "Bagikan melalui"))
        }
    }
}