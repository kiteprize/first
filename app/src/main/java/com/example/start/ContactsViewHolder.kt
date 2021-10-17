package com.example.start

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_contacts_view_holder.view.*

class ContactsViewHolder (v:View) : RecyclerView.ViewHolder(v){
    var view : View = v

    fun bind(item:Contacts){
        view.mName.text=item.name
        view.mTel.text=item.tel
    }
}


