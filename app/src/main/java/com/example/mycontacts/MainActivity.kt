package com.example.mycontacts

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mycontacts.databinding.ActivityMainBinding
import com.example.mycontacts.databinding.AddContactBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
//    lateinit var btnNew: AddContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate((layoutInflater))
        setContentView(binding.root)
        binding.btnNew.setOnClickListener {
            val intent = Intent(this,AddContact::class.java)
            startActivity(intent)
        }

    }
    override fun onResume() {
        super.onResume()
        displayContact()
          }
//

    fun displayContact(){
        val contact1=ContactData("https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8cHJvZmlsZSUyMHBpY3R1cmVzfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60", "Mary","071234561","akinyimary@gmail.com")
        val contact2=ContactData("https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8cHJvZmlsZSUyMHBpY3R1cmVzfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60","Lucas","071237890","kamaumichael@gmail.com")
        val contact3= ContactData("https://images.unsplash.com/photo-1522307837370-cc113a36b784?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OHx8cHJvZmlsZSUyMHBpY3R1cmVzfGVufDB8fDB8fHww&auto=format&fit=crop&w=500&q=60","Jules","076754247","nafulajules@gmail.com")
        val contact4=ContactData("https://images.unsplash.com/photo-1488426862026-3ee34a7d66df?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTh8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60", "Nick","071234561","gichukinick@gmail.com")
        val contact5=ContactData("https://images.unsplash.com/photo-1544435253-f0ead49638fa?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjR8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60", "James","071234561","muchemijames@gmail.com")
        val contact6=ContactData("https://images.unsplash.com/photo-1536164261511-3a17e671d380?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjZ8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60", "Anna","071234561","gracianna@gmail.com")
        val contact7=ContactData("https://images.unsplash.com/photo-1474176857210-7287d38d27c6?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzN8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60", "Tina ","071234561","tishanusa@gmail.com")
        val contactList= listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7)
        val ContactAdapter= ContactAdapter(contactList)
//        var binding: ActivityMainBinding

//
      binding.rvContact.layoutManager= LinearLayoutManager(this)
        binding.rvContact.adapter=ContactAdapter
//        binding.btnNew

//        binding.rvContact.layoutManager= LinearLayoutManager(this)
//        binding.rvContact.adapter=ContactAdapter
    }

    }

