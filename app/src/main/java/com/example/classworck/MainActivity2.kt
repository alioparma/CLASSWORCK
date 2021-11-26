package com.example.classworck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

lateinit var imageView:ImageView
lateinit var btnBack:Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        imageView = findViewById(R.id.imageView)
        btnBack = findViewById(R.id.btnnext)

        val number = intent.getIntExtra("NUMBER", 0)
        if (number == 1){
            imageView.setImageResource(R.drawable.photo)
        } else if(number == 2) {
            imageView.setImageResource(R.drawable.ic_launcher_background)
        }else if(number == 3){
            imageView.setImageResource(R.drawable.ic_launcher_foreground)
        }


        btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}