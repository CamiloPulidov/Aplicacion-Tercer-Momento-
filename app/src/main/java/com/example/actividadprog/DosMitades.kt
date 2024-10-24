package com.example.actividadprog

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DosMitades: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.dosmitades)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.dosmitades)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val boton=findViewById<ImageButton>(R.id.imageButton2)
        val boton1=findViewById<ImageButton>(R.id.imageButton3)

        boton.setOnClickListener {
            val intent = Intent(this,DosPalabras::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }

        boton1.setOnClickListener {
            val intent = Intent(this,Quitar::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
        }
        val editTextInput = findViewById<EditText>(R.id.editTextInput)
        val btnProcess = findViewById<Button>(R.id.btnProcess)
        val textViewResult = findViewById<TextView>(R.id.textViewResult)

        btnProcess.setOnClickListener {
            val input = editTextInput.text.toString()

            if (input.isNotEmpty()) {
                val result = splitAndSwap(input)
                textViewResult.text = result
            } else {
                textViewResult.text = "Por favor, ingresa una cadena."
            }
        }
    }

    // Función que corta la cadena en dos mitades y las intercambia
    private fun splitAndSwap(input: String): String {
        val length = input.length
        val middle = (length + 1) / 2  // Calcula el punto medio (si es impar, agrega el carácter central a la primera mitad)

        // Divide la cadena en dos mitades
        val firstHalf = input.substring(0, middle)
        val secondHalf = input.substring(middle)

        // Devuelve las mitades intercambiadas
        return secondHalf + firstHalf


    }
}