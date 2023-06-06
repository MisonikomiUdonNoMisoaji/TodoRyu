package com.example.todoryu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val array = arrayOf("リスト1", "リスト2", "リスト3")
        val listView = findViewById<ListView>(R.id.list_view)
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, array)
        listView.adapter = adapter
    }
}