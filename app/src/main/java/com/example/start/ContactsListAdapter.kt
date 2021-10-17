package com.example.start

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ContactsListAdapter (val itemList : List<Contacts>) :
    RecyclerView.Adapter<ContactsViewHolder>() {
    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        val inflatedView = LayoutInflater.from(parent.context).inflate(R.layout.activity_contacts_view_holder,parent,false)
        return ContactsViewHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val item = itemList[position]
        holder.apply {
            bind(item)
        }
    }

}