package com.testmypsy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val aggressionButton = findViewById<Button>(R.id.aggressionTestButton)
        aggressionButton.setOnClickListener {
            val intent = Intent(this,AggressionTest::class.java)
            startActivity(intent)
        }
        val EIButton = findViewById<Button>(R.id.EITestButton)
        EIButton.setOnClickListener {
            val intent = Intent(this,EITest::class.java)
            startActivity(intent)
        }

    }
}