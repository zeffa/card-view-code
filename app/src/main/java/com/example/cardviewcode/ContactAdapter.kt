package com.example.cardviewcode

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cardviewcode.databinding.CardItemBinding

class ContactAdapter(
    private val list: List<Contact>
    ): RecyclerView.Adapter<ContactViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding = CardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactViewHolder(binding = binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contact = list[position]
        holder.bindContact(contact)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}

class ContactViewHolder(val binding: CardItemBinding): RecyclerView.ViewHolder(binding.root) {
    fun bindContact(contact: Contact) {
        binding.name.text = contact.name
        binding.phone.text = contact.phone
        binding.email.text = contact.email
    }
}