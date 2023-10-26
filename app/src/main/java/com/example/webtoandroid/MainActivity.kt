package com.example.webtoandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edt_text:EditText=findViewById(R.id.edt_1)
        val button:Button=findViewById(R.id.button_swap)

        button.setOnClickListener {
            val intent=Intent(this,webtoandroid::class.java)
            intent.putExtra("link",edt_text.text.toString())
            startActivity(intent)
        }
    }
}