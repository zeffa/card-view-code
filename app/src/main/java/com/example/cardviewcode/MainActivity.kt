package com.example.cardviewcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.cardviewcode.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initializeList()
    }

    private fun initializeList() {
        val contacts  = listOf(
            Contact(name = "Juliet Olieng", phone = "07612524172", email =  "juliet@gmail.com"),
            Contact(name = "Onduso", phone = "0706567060", email =  "zeffah@gmail.com"),
            Contact(name = "Dummy", phone = "07065670981", email =  "dummy@gmail.com"),
            Contact(name = "Dummy", phone = "07065670981", email =  "dummy@gmail.com"),
            Contact(name = "Dummy", phone = "07065670981", email =  "dummy@gmail.com"),
            Contact(name = "Dummy", phone = "07065670981", email =  "dummy@gmail.com"),
            Contact(name = "Dummy", phone = "07065670981", email =  "dummy@gmail.com"),
            Contact(name = "Dummy", phone = "07065670981", email =  "dummy@gmail.com"),
            Contact(name = "Dummy", phone = "07065670981", email =  "dummy@gmail.com"),
            Contact(name = "Dummy", phone = "07065670981", email =  "dummy@gmail.com"),
            Contact(name = "Dummy", phone = "07065670981", email =  "dummy@gmail.com"),
        )
        val contactsAdapter = ContactAdapter(contacts)
        binding.list.apply {
            adapter = contactsAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
        }
    }
}