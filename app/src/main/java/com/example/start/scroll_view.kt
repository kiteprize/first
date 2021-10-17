package com.example.start

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_scroll_view.*

class scroll_view : Activity() {

    val contactsList : List<Contacts> = listOf(
        Contacts("황연상", "010-4853-4294"),
        Contacts("황하영", "010-7657-6600"),
        Contacts("임윤숙", "010-6400-8383"),
        Contacts("황인식", "010-5263-0661"),
        Contacts("황연상", "010-4853-4294"),
        Contacts("황하영", "010-7657-6600"),
        Contacts("임윤숙", "010-6400-8383"),
        Contacts("황인식", "010-5263-0661")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_view)

        val adapter = ContactsListAdapter(contactsList)
        mRecyclerView.adapter = adapter
    }
}