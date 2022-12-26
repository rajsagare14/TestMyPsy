package com.testmypsy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class AggressionTest : AppCompatActivity() {
    fun getRes(radio:String):Int{
        var result:Int = 0
        if(radio == "Extremely Unlikely"){
            result = 1
        }
        else if(radio == "Somewhat Unlikely"){
            result = 2
        }
        else if(radio == "Neutral"){
            result = 3
        }
        else if(radio == "Somewhat Likely"){
            result = 4
        }
        else if(radio == "Extremely Likely"){
            result = 5
        }
        return result
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agression_test)
        val rg1 = findViewById<RadioGroup>(R.id.rg1)
        rg1.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg2 = findViewById<RadioGroup>(R.id.rg2)
        rg2.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val rg3 = findViewById<RadioGroup>(R.id.rg3)
        rg3.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext," On checked change :"+
                        " ${radio.text}",
                    Toast.LENGTH_SHORT).show()
            })
        val submitButton = findViewById<Button>(R.id.submitButton)
        submitButton.setOnClickListener{
            // Get the checked radio button id from radio group
            var rg1id: Int = rg1.checkedRadioButtonId
            var atq1res:Int
            if (rg1id!=-1){ // If any radio button checked from radio group
                // Get the instance of radio button using id
                val radio:RadioButton = findViewById(rg1id)
                atq1res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq1res = $atq1res",
                    Toast.LENGTH_SHORT).show()
            }else{
                // If no radio button checked in this radio group
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            var rg2id: Int = rg2.checkedRadioButtonId
            var atq2res:Int
            if (rg2id!=-1){ // If any radio button checked from radio group
                // Get the instance of radio button using id
                val radio:RadioButton = findViewById(rg2id)
                atq2res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq1res = $atq2res",
                    Toast.LENGTH_SHORT).show()
            }else{
                // If no radio button checked in this radio group
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
            var rg3id: Int = rg3.checkedRadioButtonId
            var atq3res:Int
            if (rg3id!=-1){ // If any radio button checked from radio group
                // Get the instance of radio button using id
                val radio:RadioButton = findViewById(rg3id)
                atq3res = getRes(radio.text.toString())
                Toast.makeText(applicationContext,"On button click :" +
                        " ${radio.text}" + "\natq3res = $atq3res",
                    Toast.LENGTH_SHORT).show()
            }else{
                // If no radio button checked in this radio group
                Toast.makeText(applicationContext,"On button click :" +
                        " nothing selected",
                    Toast.LENGTH_SHORT).show()
            }
        }

//        submitButton.setOnClickListener {
//            val intent = Intent(this,ATResult::class.java)
//            startActivity(intent)
//        }
    }
}