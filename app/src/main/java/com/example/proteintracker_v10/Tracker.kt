package com.example.proteintracker_v10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Tracker : AppCompatActivity() {
    lateinit var proteinC : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tracker)

        proteinC = findViewById(R.id.prot_cons)
        proteinC.text = getString(R.string.resc_Protein_c)


    }
}