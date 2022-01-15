package com.example.firsthomework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firsthomework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener { loginForm() }
    }

    private fun loginForm() {
        //TODO("Not yet implemented")
        val intent = Intent(this, RegistrationForm::class.java)
        startActivity(intent)
        finish()
    }
}