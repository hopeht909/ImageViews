package com.example.imageviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    lateinit var image : ImageView
    lateinit var btDay : Button
    lateinit var btNight : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btNight = findViewById(R.id.btNight)
        image = findViewById(R.id.imageView)
        btDay = findViewById(R.id.btDay)


        btDay.setOnClickListener {

            image.setImageDrawable(ContextCompat.getDrawable(this ,R.drawable.day))
        }
        btNight.setOnClickListener {

           image.setImageDrawable(ContextCompat.getDrawable(this ,R.drawable.night))
        }
    }
}