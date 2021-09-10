package com.example.proteintracker_v10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvMain : TextView
    lateinit var edInputName : EditText
    lateinit var btnInputName : Button
    lateinit var btnProt : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvMain = findViewById(R.id.tv_main_activity)
        tvMain.text = getString(R.string.resource_text_main)

        edInputName = findViewById(R.id.ed_input_nama)
        btnInputName = findViewById(R.id.btn_input_nama)
        btnProt = findViewById(R.id.btn_prot)

        btnInputName.setOnClickListener(View.OnClickListener { View ->
            var strTmp = edInputName.text.toString()
            tvMain.text = strTmp
        })

        btnProt.setOnClickListener(View.OnClickListener { View ->
            var intent = Intent(this@MainActivity, Tracker::class.java)
            startActivity(intent)
        })

    }
}