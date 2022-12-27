package com.testmypsy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ATResult : AppCompatActivity() {
    lateinit var res : String
    lateinit var disp : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_atresult)
        disp = findViewById(R.id.textView2)
        disp.text = res
    }
}