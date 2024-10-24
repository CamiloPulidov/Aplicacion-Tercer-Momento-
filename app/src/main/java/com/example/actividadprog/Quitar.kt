package com.example.actividadprog

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Quitar: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.quitar)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.quitar)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val boton=findViewById<ImageButton>(R.id.imageButton)
        val boton1=findViewById<ImageButton>(R.id.imageButton2)

        boton.setOnClickListener {
            val intent = Intent(this,DosMitades::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        boton1.setOnClickListener {
            val intent = Intent(this,DosPalabras::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

    }
}