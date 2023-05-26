package com.example.mycontacts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mycontacts.databinding.ContactListBinding


class ContactAdapter(var contactList: List<ContactData>): RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding =
            ContactListBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val currentContact=contactList.get(position)
        val binding=holder.binding
        binding.ivContactIcon.=currentContact.contactIcon
                binding.tvNameDisplay.text = currentContact.names
        binding.tvNum.text=currentContact.number
        binding.tvEmail.text = currentContact.email

    }

    override fun getItemCount(): Int {
            return  contactList.size
        }
    }




