package com.example.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate((layoutInflater))
        setContentView(binding.root)


    }
    override fun onResume() {
        super.onResume()
        displayContact()
    }
    fun displayContact(){
        val contact1=ContactData("", "Mary","071234561","akinyimary@gmail.com")
        val contact2=ContactData("","Lucas","071237890","kamaumichael@gmail.com")
        val contact3= ContactData("","Jules","076754247","nafulajules@gmail.com")
        val contact4=ContactData("", "Nick","071234561","gichukinick@gmail.com")
        val contact5=ContactData("", "James","071234561","muchemijames@gmail.com")
        val contact6=ContactData("", "Anna","071234561","gracianna@gmail.com")
        val contact7=ContactData("", "Tina","071234561","tishanusa@gmail.com")
        val contactList= listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7)
        val contactAdapter= ContactAdapter(contactList)
        binding.rvContactAdapter.layoutManager= LinearLayoutManager(this)
        binding.rvContactAdapter.adapter=contactAdapter
//        binding.rvContact.layoutManager= LinearLayoutManager(this)
//        binding.rvContact.adapter=ContactAdapter
    }
}