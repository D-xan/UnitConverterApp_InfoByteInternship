package com.example.unitconverterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val inputkgvalue = findViewById<EditText>(R.id.kgbox)
        val outputvalue = findViewById<TextView>(R.id.grambox)
        val convertbutton = findViewById<Button>(R.id.convert_button)

        convertbutton.setOnClickListener()
        {
            val kg = inputkgvalue.text.toString().toFloat()
            val gram = kg * 1000
            outputvalue.setText(gram.toString())
        }
    }
}