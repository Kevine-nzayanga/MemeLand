package com.example.memeland

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Meme4 : AppCompatActivity() {
    lateinit var bprev5:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme4)
        bprev5 = findViewById(R.id.bprev5)
        bprev5.setOnClickListener {
            val intent= Intent(this, Memethree::class.java)
            startActivity(intent)
        }
    }
}