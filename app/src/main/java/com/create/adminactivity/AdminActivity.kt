package com.create.adminactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout

class AdminActivity : AppCompatActivity() {
    lateinit var tv_ahaa: TextView
    lateinit var inputUserName: TextInputLayout
    lateinit var inputEmail: TextInputLayout
    lateinit var inputPassword: TextInputLayout
    lateinit var inputConfirmPassword: TextInputLayout
    lateinit var btnRegister: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()

    }

    override fun onResume() {
        super.onResume()
        tv_ahaa.setOnClickListener {
            val intent = Intent(this, loginActivity::class.java)
            startActivity(intent)
        }
        btnRegister.setOnClickListener {
            clearerrors()
            validateSignUp()
        }
    }

    fun castViews() {
        tv_ahaa = findViewById(R.id.tv_ahaa)
        inputUserName = findViewById(R.id.inputUserName)
        inputEmail = findViewById(R.id.inputEmail)
        inputPassword = findViewById(R.id.inputPassword)
        inputPassword = findViewById(R.id.inputPassword)
        btnRegister= findViewById(R.id.btnRegister)
    }

    fun validateSignUp() {
        val firstName = inputUserName.toString()
        val email = inputEmail.toString()
        val password = inputPassword.toString()
        val confirmation = inputConfirmPassword.toString()
        var error = false
        if (firstName.isBlank()) {
            inputUserName.error = "Firstname is required"
            error = true
        }

        if (email.isBlank()) {
            inputEmail.error = "Email address is required"
            error = true
        }
        if (password.isBlank()) {
            inputPassword.error = "password is required"
            error = true
        }
        if (password != confirmation) {
            inputPassword.error = "password and confirmation do not match"
            error = true
        }
        if (!error) {
            Toast.makeText(this, "${inputUserName}Name  $email", Toast.LENGTH_LONG).show()
        }
    }

    fun clearerrors() {
        inputUserName.error = null
        inputEmail.error = null
        inputPassword.error = null
        inputConfirmPassword.error = null

    }
}
