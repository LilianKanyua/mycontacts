package com.example.mycontacts

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.mycontacts.databinding.ContactListBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation


//private var ImageView.text: String
//    get() {}
//    set() {}

class ContactAdapter(val contactList: List<ContactData>): RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding =
            ContactListBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactList.get(position)
        val binding=holder.binding
//        binding.ivContactIcon.text = currentContact.contactIcon
        binding.tvName.text = currentContact.contactName
        binding.tvPhoneNo.text=currentContact.contactNumber
        binding.tvEmail.text = currentContact.emailAddress
        Picasso
            .get()
            .load(currentContact.contactIcon)
//            .resize(80,80)
//            .centerCrop()
              .transform(/* transformation = */ CropCircleTransformation())
            .placeholder(R.drawable.contact)
            .into(binding.ivContactIcon)

//            .centerCrop()

    }

    override fun getItemCount(): Int {
            return  contactList.size
        }
    }
class ContactViewHolder( var binding:ContactListBinding): RecyclerView.ViewHolder(binding.root) {

}





