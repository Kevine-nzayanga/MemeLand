package com.example.memeland

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Memethree : AppCompatActivity() {
    lateinit var bnext4:Button
    lateinit var bprev4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memethree)
        bnext4 = findViewById(R.id.bnext4)
        bnext4.setOnClickListener {
            val intent = Intent(this, Meme4::class.java)
            startActivity(intent)
        }
        bprev4 = findViewById(R.id.bprev4)
        bprev4.setOnClickListener {
            val intent = Intent(this,Meme2::class.java)
            startActivity(intent)
        }

    }
}