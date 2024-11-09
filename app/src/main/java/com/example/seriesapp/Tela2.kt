package com.example.seriesapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tela2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            return@setOnApplyWindowInsetsListener insets
        }
        findViewById<Button>(R.id.botaoVoltar).setOnClickListener(){finish()}


        val serieNameTela2 = intent.getStringExtra("serieName")
        val serieAnoTela2 = intent.getStringExtra("serieAno")
        val serieDescricao = intent.getStringExtra("serieDesc")
        val serieImage = intent.getIntExtra("serieImage", 0)
        val serieTemporadas = intent.getStringExtra("serieTemporadas")


        val serieNameTextView = findViewById<TextView>(R.id.idNome)
        val serieAnoTextView = findViewById<TextView>(R.id.idAnoTela2)
        val serieDescTextView = findViewById<TextView>(R.id.idDescTela2)
        val serieImageView = findViewById<ImageView>(R.id.idImagemTela2)
        val serieTemporadasTextView = findViewById<TextView>(R.id.idTemporadaTela2)


        serieNameTextView.text = serieNameTela2
        serieAnoTextView.text = serieAnoTela2
        serieDescTextView.text = serieDescricao
        serieImageView.setImageResource(serieImage)
        serieTemporadasTextView.text = serieTemporadas

    }

}