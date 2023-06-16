package com.example.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mycontacts.databinding.AddContactBinding

class AddContact : AppCompatActivity() {
    lateinit var binding: AddContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AddContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSave.setOnClickListener {
            validateContact()
            clearErrors()
        }
    }
    fun validateContact(){
        val name = binding.etAddName.text.toString()
        val number = binding.etAddNumber.text.toString()
        val email = binding.etAddEmail.text.toString()
        var error = false

        if (name.isBlank()) {
            binding.etAddName.error
//            binding.tilAddName.error = "Name is required"
            error = true
        }
        if (number.isBlank()) {
            binding.etAddNumber.error = "Number is required"
            error = true
        }
        if (email.isBlank()) {
            binding.etAddEmail.error = "Email is required"
            error = true
        }
        if (!error) {
            Toast.makeText(
                this,
                " Contact added successfully! ",
                Toast.LENGTH_LONG
            ).show()
    }
        }
    fun clearErrors() {
        binding.tilAddName.error = null
        binding.tilAddNumber.error = null
        binding.tilAddEmail.error = null

    }
    }
