package com.example.classworck

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import android.widget.Toast.makeText as makeText1

lateinit var button: Button
lateinit var EditText:EditText
lateinit var A:ImageView
lateinit var B:ImageView
lateinit var C:ImageView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        EditText=findViewById(R.id.editText)
        button =findViewById(R.id.button)
        A=findViewById(R.id.imageView1)
        B=findViewById(R.id.imageView2)
        C=findViewById(R.id.imageView4)



        button.setOnClickListener {
            val text = EditText.text
            if (text.isNullOrEmpty()) {
                Toast.makeText(this," слыш пидр заполни меня ", Toast.LENGTH_SHORT).show()
            }
            else {
                val text1 = EditText.text.toString().toInt()
                val intent =Intent (this,MainActivity2 ::class.java)
                intent.putExtra("NUMBER", text1)
                startActivity(intent)
                            }



        }



    }

//        fun OnClickListener(view: View ){
//          val i=intent (this,MainActivity2::class.java)


    }
