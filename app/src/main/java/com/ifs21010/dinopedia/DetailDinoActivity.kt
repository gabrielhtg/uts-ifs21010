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

        val gambarDino = intent.getIntExtra("gambarDino", 0)
        val namaDino = intent.getStringExtra("namaDino")
        val descSingkatDino = intent.getIntExtra("descSingkatDino", 0)
        val descLengkapDino = intent.getStringExtra("descLengkapDino")

        val gambarDinoFamilyImageView : ImageView = findViewById(R.id.gambar_dino_detail)
        val namaDinoFamilyTextView : TextView = findViewById(R.id.nama_dino_detail)
        val descLengkapDinoFamilyTextView : TextView = findViewById(R.id.detail_dino)
        findViewById<TextView>(R.id.nama_planet_toolbar).text = namaDino

        gambarDinoFamilyImageView.setImageResource(gambarDino)
        namaDinoFamilyTextView.text = namaDino
        descLengkapDinoFamilyTextView.text = descLengkapDino

        val tombolBack : ImageView = findViewById(R.id.tombol_back_about)
        val tombolShare : ImageView = findViewById(R.id.tombol_share)

        tombolBack.setOnClickListener {
            finish()
        }

        tombolShare.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT, "${namaDinoFamilyTextView.text}\n\n${descSingkatDino}")
            startActivity(Intent.createChooser(intent, "Bagikan melalui"))
        }
    }
}