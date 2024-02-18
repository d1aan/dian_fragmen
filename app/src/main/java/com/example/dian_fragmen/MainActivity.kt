package com.example.dian_fragmen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTl = findViewById<Button>(R.id.btnTl)
        val btnTo = findViewById<Button>(R.id.btnTo)
        val btnpplg = findViewById<Button>(R.id.btnpplg)
        val btnkuliner = findViewById<Button>(R.id.btnkuliner)
        val btnbusana = findViewById<Button>(R.id.btnbusana)

        btnTl.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, BlankFragment())
            fragmentTransaction.commit()
        }

        btnTo.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, BlankFragment2())
            fragmentTransaction.commit()
        }

        btnpplg.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer,BlankFragment3 ())
            fragmentTransaction.commit()
        }

        btnkuliner.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, BlankFragment4())
            fragmentTransaction.commit()
        }

        btnbusana.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, BlankFragment5 ())
            fragmentTransaction.commit()
        }
    }
}