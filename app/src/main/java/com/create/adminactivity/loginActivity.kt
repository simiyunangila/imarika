package com.create.adminactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class loginActivity : AppCompatActivity() {
    lateinit var tv_signup:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        tv_signup=findViewById(R.id.tv_signup)
        tv_signup.setOnClickListener {
            val intent = Intent(this,AdminActivity::class.java)
            startActivity(intent)
        }
    }
}