package com.example.memeland

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Memeone : AppCompatActivity() {
    lateinit var nexttwo:Button
    lateinit var bprevtwo:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memeone)
        nexttwo = findViewById(R.id.nexttwo)
          nexttwo.setOnClickListener{
            val intent= Intent(this, Meme2::class.java)
            startActivity(intent)
    }
        bprevtwo = findViewById(R.id.bprevtwo)
          bprevtwo.setOnClickListener{
              val intent = Intent(this, MainActivity::class.java)
              startActivity(intent)

          }

}
}