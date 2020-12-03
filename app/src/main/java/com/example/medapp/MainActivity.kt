package com.example.medapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgBtn_cgeral = findViewById<ImageButton>(R.id.btn_cgeral)

        imgBtn_cgeral.setOnClickListener {
            val intent = Intent(this, ActivityCGeral::class.java)

            startActivity(intent)
        }

        val btn_tooth = findViewById<ImageButton>(R.id.btn_tooth)

        btn_tooth.setOnClickListener {
            val intent = Intent(this, Activity_Dentista::class.java)

            startActivity(intent)
        }

        val btn_cardio = findViewById<ImageButton>(R.id.btn_cardio)

        btn_cardio.setOnClickListener {
            val intent = Intent(this, Activity_Cardio::class.java)

            startActivity(intent)
        }

            val btn_neuro = findViewById<ImageButton>(R.id.btn_neuro)

        btn_neuro.setOnClickListener {
            val intent = Intent(this, Activity_Neuro::class.java)

            startActivity(intent)
        }

            val btn_ofta = findViewById<ImageButton>(R.id.btn_ofto)

        btn_ofta.setOnClickListener {
            val intent = Intent(this, Activity_Ofta::class.java)

            startActivity(intent)
        }

        val btn_exames = findViewById<ImageButton>(R.id.btn_exames)

        btn_exames.setOnClickListener {
            val intent = Intent(this, Activity_Exames::class.java)

            startActivity(intent)
        }
    }
}