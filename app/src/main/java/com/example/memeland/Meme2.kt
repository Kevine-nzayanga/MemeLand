package com.example.memeland

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Meme2 : AppCompatActivity() {
    lateinit var bnext3:Button
    lateinit var bprev3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme2)
        bnext3 = findViewById(R.id.bnext3)
        bnext3.setOnClickListener{
            val intent = Intent(this, Memethree::class.java)
            startActivity(intent)
        }
        bprev3 = findViewById(R.id.bprev3)
        bprev3.setOnClickListener {
            val intent = Intent (this, Memeone::class.java)
            startActivity(intent)
        }

    }
}