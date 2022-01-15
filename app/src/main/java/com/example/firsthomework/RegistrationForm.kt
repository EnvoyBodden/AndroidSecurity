package com.example.firsthomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firsthomework.databinding.ActivityMainBinding
import com.example.firsthomework.databinding.ActivityRegistrationFormBinding

class RegistrationForm : AppCompatActivity() {

    private lateinit var binding: ActivityRegistrationFormBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signupButton.setOnClickListener { signupForm() }

        passwordFocusListener()
    }

    private fun passwordFocusListener() {
        binding.newPasswordEditText.setOnFocusChangeListener { _, focused ->
            if (!focused){
                binding.newPasswordLayout.helperText = validPassword()
            }
        }
    }

    private fun validPassword(): String? {
       val passwordText = binding.newPasswordEditText.text.toString()

        if(passwordText.length < 8){
            return "Must have a minimum of 8 characters password"
        }
        if (!passwordText.matches(".*[A-Z]*.".toRegex())) {
            return "Must have 1 upper-case character"
        }
        if (!passwordText.matches(".*[a-z]*.".toRegex())) {
            return "Must have 1 lower-case character"
        }
        if (!passwordText.matches(".*[@#\$^&+=]*.".toRegex())) {
            return "Must contain 1 special character"
        }

        return null
    }

    private fun signupForm() {
        TODO("Not yet implemented")
    }
}