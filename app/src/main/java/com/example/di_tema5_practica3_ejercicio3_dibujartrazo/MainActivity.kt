package com.example.di_tema5_practica3_ejercicio3_dibujartrazo

import android.graphics.drawable.AnimatedVectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.imageView)

        val transformar = getDrawable(R.drawable.star_animation) as AnimatedVectorDrawable
        image.setImageDrawable(transformar)
        transformar.start()
    }
}