package com.testmypsy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class SaTest : AppCompatActivity() {
    lateinit var results : TextView
    lateinit var disp : TextView
    lateinit var back : Button
    lateinit var tres : String
    fun getRes(radio:String):Int{
        var result = 0
        if(radio == "Extremely Unlikely" || radio == "Very Poor" || radio == "Very Dissatisfied" || radio == "Not at All" || radio == "Never"){
            result = 1
        }
        else if(radio == "Somewhat Unlikely" || radio == "Poor" || radio == "Dissatisfied" || radio == "A Little" || radio == "Seldom"){
            result = 2
        }
        else if(radio == "Neutral" || radio == "Quite Often" || radio == "Neither Satisfied Nor Dissatisfied"|| radio == "Neither poor nor good"|| radio == "A Moderate Amount" || radio == "Moderately"){
            result = 3
        }
        else if(radio == "Somewhat Likely" || radio == "Good" || radio == "Very Often" || radio == "Satisfied" || radio == "Well" || radio == "Mostly" || radio == "Very Much"){
            result = 4
        }
        else if(radio == "Extremely Likely" || radio == "Always" || radio == "Very Satisfied" || radio == "Very Well" || radio == "Completely" || radio == "Extremely" || radio == "An Extreme Amount" || radio == "Very Good"){
            result = 5
        }
        return result
    }
    fun rev(res:Int):Int{
        var res1 = res
        if(res == 1){
            res1 = 5
        }
        else if(res == 2){
            res1 = 4
        }
        else if(res == 4){
            res1 = 2
        }
        else if(res == 5){
            res1 = 1
        }
        else{
            res1 = 3
        }
        return res1
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sa_test)
        val rg1 = findViewById<RadioGroup>(R.id.rg1)
        rg1.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val rg2 = findViewById<RadioGroup>(R.id.rg2)
        rg2.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val rg3 = findViewById<RadioGroup>(R.id.rg3)
        rg3.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val rg4 = findViewById<RadioGroup>(R.id.rg4)
        rg4.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val rg5 = findViewById<RadioGroup>(R.id.rg5)
        rg5.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val rg6 = findViewById<RadioGroup>(R.id.rg6)
        rg6.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val rg7 = findViewById<RadioGroup>(R.id.rg7)
        rg7.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val rg8 = findViewById<RadioGroup>(R.id.rg8)
        rg8.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val rg9 = findViewById<RadioGroup>(R.id.rg9)
        rg9.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val rg10 = findViewById<RadioGroup>(R.id.rg10)
        rg10.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val rg11 = findViewById<RadioGroup>(R.id.rg11)
        rg11.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val rg12 = findViewById<RadioGroup>(R.id.rg12)
        rg12.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val rg13 = findViewById<RadioGroup>(R.id.rg13)
        rg13.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val rg14 = findViewById<RadioGroup>(R.id.rg14)
        rg14.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val rg15 = findViewById<RadioGroup>(R.id.rg15)
        rg15.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val rg16 = findViewById<RadioGroup>(R.id.rg16)
        rg16.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val rg17 = findViewById<RadioGroup>(R.id.rg17)
        rg17.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val rg18 = findViewById<RadioGroup>(R.id.rg18)
        rg18.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val rg19 = findViewById<RadioGroup>(R.id.rg19)
        rg19.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val rg20 = findViewById<RadioGroup>(R.id.rg20)
        rg20.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val rg21 = findViewById<RadioGroup>(R.id.rg21)
        rg21.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val rg22 = findViewById<RadioGroup>(R.id.rg22)
        rg22.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val submitButton = findViewById<Button>(R.id.submitButton)
        submitButton.setOnClickListener{
            val rg1id: Int = rg1.checkedRadioButtonId
            var sa1res:Int =0
            if (rg1id!=-1){ // If any radio button checked from radio group
                // Get the instance of radio button using id
                val radio:RadioButton = findViewById(rg1id)
                sa1res = getRes(radio.text.toString())
//                Toast.makeText(applicationContext,"On button click :" +
//                        " ${radio.text}" + "\nsa1res = $sa1res",
//                    Toast.LENGTH_SHORT).show()
            }
//            else{
//                // If no radio button checked in this radio group
//                Toast.makeText(applicationContext,"On button click :" +
//                        " nothing selected",
//                    Toast.LENGTH_SHORT).show()
//            }
            val rg2id: Int = rg2.checkedRadioButtonId
            var sa2res:Int = 0
            if (rg2id!=-1){ // If any radio button checked from radio group
                // Get the instance of radio button using id
                val radio:RadioButton = findViewById(rg2id)
                sa2res = getRes(radio.text.toString())
//                Toast.makeText(applicationContext,"On button click :" +
//                        " ${radio.text}" + "\nsa1res = $sa2res",
//                    Toast.LENGTH_SHORT).show()
            }
//            else{
//                // If no radio button checked in this radio group
//                Toast.makeText(applicationContext,"On button click :" +
//                        " nothing selected",
//                    Toast.LENGTH_SHORT).show()
//            }
            val rg3id: Int = rg3.checkedRadioButtonId
            var sa3res:Int = 0
            if (rg3id!=-1){ // If any radio button checked from radio group
                // Get the instance of radio button using id
                val radio:RadioButton = findViewById(rg3id)
                sa3res = getRes(radio.text.toString())
//                Toast.makeText(applicationContext,"On button click :" +
//                        " ${radio.text}" + "\nsa3res = $sa3res",
//                    Toast.LENGTH_SHORT).show()
            }
//            else{
//                // If no radio button checked in this radio group
//                Toast.makeText(applicationContext,"On button click :" +
//                        " nothing selected",
//                    Toast.LENGTH_SHORT).show()
//            }
            val rg4id: Int = rg4.checkedRadioButtonId
            var sa4res:Int = 0
            if (rg4id!=-1){ // If any radio button checked from radio group
                // Get the instance of radio button using id
                val radio:RadioButton = findViewById(rg4id)
                sa4res = getRes(radio.text.toString())
//                Toast.makeText(applicationContext,"On button click :" +
//                        " ${radio.text}" + "\nsa4res = $sa4res",
//                    Toast.LENGTH_SHORT).show()
            }
//            else{
//                // If no radio button checked in this radio group
//                Toast.makeText(applicationContext,"On button click :" +
//                        " nothing selected",
//                    Toast.LENGTH_SHORT).show()
//            }
            val rg5id: Int = rg5.checkedRadioButtonId
            var sa5res:Int = 0
            if (rg5id!=-1){
                val radio:RadioButton = findViewById(rg5id)
                sa5res = getRes(radio.text.toString())
                sa5res = rev(sa5res)
//                Toast.makeText(applicationContext,"On button click :" +
//                        " ${radio.text}" + "\nsa5res = $sa5res",
//                    Toast.LENGTH_SHORT).show()
            }
//            else{
//                Toast.makeText(applicationContext,"On button click :" +
//                        " nothing selected",
//                    Toast.LENGTH_SHORT).show()
//            }
            val rg6id: Int = rg6.checkedRadioButtonId
            var sa6res:Int = 0
            if (rg6id!=-1){
                val radio:RadioButton = findViewById(rg6id)
                sa6res = getRes(radio.text.toString())
//                Toast.makeText(applicationContext,"On button click :" +
//                        " ${radio.text}" + "\nsa6res = $sa6res",
//                    Toast.LENGTH_SHORT).show()
            }
//            else{
//                Toast.makeText(applicationContext,"On button click :" +
//                        " nothing selected",
//                    Toast.LENGTH_SHORT).show()
//            }
            val rg7id: Int = rg7.checkedRadioButtonId
            var sa7res:Int = 0
            if (rg7id!=-1){
                val radio:RadioButton = findViewById(rg7id)
                sa7res = getRes(radio.text.toString())
                sa7res = rev(sa7res)
//                Toast.makeText(applicationContext,"On button click :" +
//                        " ${radio.text}" + "\nsa7res = $sa7res",
//                    Toast.LENGTH_SHORT).show()
            }
//            else{
//                Toast.makeText(applicationContext,"On button click :" +
//                        " nothing selected",
//                    Toast.LENGTH_SHORT).show()
//            }
            val rg8id: Int = rg8.checkedRadioButtonId
            var sa8res:Int = 0
            if (rg8id!=-1){
                val radio:RadioButton = findViewById(rg8id)
                sa8res = getRes(radio.text.toString())
                sa8res = rev(sa8res)
//                Toast.makeText(applicationContext,"On button click :" +
//                        " ${radio.text}" + "\nsa8res = $sa8res",
//                    Toast.LENGTH_SHORT).show()
            }
//            else{
//                Toast.makeText(applicationContext,"On button click :" +
//                        " nothing selected",
//                    Toast.LENGTH_SHORT).show()
//            }
            val rg9id: Int = rg9.checkedRadioButtonId
            var sa9res:Int = 0
            if (rg9id!=-1){
                val radio:RadioButton = findViewById(rg9id)
                sa9res = getRes(radio.text.toString())
//                Toast.makeText(applicationContext,"On button click :" +
//                        " ${radio.text}" + "\nsa9res = $sa9res",
//                    Toast.LENGTH_SHORT).show()
            }
//            else{
//                Toast.makeText(applicationContext,"On button click :" +
//                        " nothing selected",
//                    Toast.LENGTH_SHORT).show()
//            }
            val rg10id: Int = rg10.checkedRadioButtonId
            var sa10res:Int = 0
            if (rg10id!=-1){
                val radio:RadioButton = findViewById(rg10id)
                sa10res = getRes(radio.text.toString())
//                Toast.makeText(applicationContext,"On button click :" +
//                        " ${radio.text}" + "\nsa10res = $sa10res",
//                    Toast.LENGTH_SHORT).show()
            }
//            else{
//                Toast.makeText(applicationContext,"On button click :" +
//                        " nothing selected",
//                    Toast.LENGTH_SHORT).show()
//            }
            val rg11id: Int = rg11.checkedRadioButtonId
            var sa11res:Int = 0
            if (rg11id!=-1){
                val radio:RadioButton = findViewById(rg11id)
                sa11res = getRes(radio.text.toString())
//                Toast.makeText(applicationContext,"On button click :" +
//                        " ${radio.text}" + "\nsa11res = $sa11res",
//                    Toast.LENGTH_SHORT).show()
            }
//            else{
//                Toast.makeText(applicationContext,"On button click :" +
//                        " nothing selected",
//                    Toast.LENGTH_SHORT).show()
//            }
            val rg12id: Int = rg12.checkedRadioButtonId
            var sa12res:Int = 0
            if (rg12id!=-1){ // If any radio button checked from radio group
                // Get the instance of radio button using id
                val radio:RadioButton = findViewById(rg12id)
                sa12res = getRes(radio.text.toString())
                sa12res = rev(sa12res)
//                Toast.makeText(applicationContext,"On button click :" +
//                        " ${radio.text}" + "\nsa12res = $sa12res",
//                    Toast.LENGTH_SHORT).show()
            }
//            else{
//                // If no radio button checked in this radio group
//                Toast.makeText(applicationContext,"On button click :" +
//                        " nothing selected",
//                    Toast.LENGTH_SHORT).show()
//            }
            val rg13id: Int = rg13.checkedRadioButtonId
            var sa13res:Int = 0
            if (rg13id!=-1){ // If any radio button checked from radio group
                // Get the instance of radio button using id
                val radio:RadioButton = findViewById(rg13id)
                sa13res = getRes(radio.text.toString())
//                Toast.makeText(applicationContext,"On button click :" +
//                        " ${radio.text}" + "\nsa13res = $sa13res",
//                    Toast.LENGTH_SHORT).show()
            }
//            else{
//                // If no radio button checked in this radio group
//                Toast.makeText(applicationContext,"On button click :" +
//                        " nothing selected",
//                    Toast.LENGTH_SHORT).show()
//            }
            val rg14id: Int = rg14.checkedRadioButtonId
            var sa14res:Int = 0
            if (rg14id!=-1){ // If any radio button checked from radio group
                // Get the instance of radio button using id
                val radio:RadioButton = findViewById(rg14id)
                sa14res = getRes(radio.text.toString())
                sa14res = rev(sa14res)
//                Toast.makeText(applicationContext,"On button click :" +
//                        " ${radio.text}" + "\nsa14res = $sa14res",
//                    Toast.LENGTH_SHORT).show()
            }
//            else{
//                // If no radio button checked in this radio group
//                Toast.makeText(applicationContext,"On button click :" +
//                        " nothing selected",
//                    Toast.LENGTH_SHORT).show()
//            }
            val rg15id: Int = rg15.checkedRadioButtonId
            var sa15res:Int = 0
            if (rg15id!=-1){
                val radio:RadioButton = findViewById(rg15id)
                sa15res = getRes(radio.text.toString())
//                Toast.makeText(applicationContext,"On button click :" +
//                        " ${radio.text}" + "\nsa15res = $sa15res",
//                    Toast.LENGTH_SHORT).show()
            }
//            else{
//                Toast.makeText(applicationContext,"On button click :" +
//                        " nothing selected",
//                    Toast.LENGTH_SHORT).show()
//            }
            val rg16id: Int = rg16.checkedRadioButtonId
            var sa16res:Int = 0
            if (rg16id!=-1){
                val radio:RadioButton = findViewById(rg16id)
                sa16res = getRes(radio.text.toString())
//                Toast.makeText(applicationContext,"On button click :" +
//                        " ${radio.text}" + "\nsa16res = $sa16res",
//                    Toast.LENGTH_SHORT).show()
            }
//            else{
//                Toast.makeText(applicationContext,"On button click :" +
//                        " nothing selected",
//                    Toast.LENGTH_SHORT).show()
//            }
            val rg17id: Int = rg17.checkedRadioButtonId
            var sa17res:Int = 0
            if (rg17id!=-1){
                val radio:RadioButton = findViewById(rg17id)
                sa17res = getRes(radio.text.toString())
                sa17res = rev(sa17res)
//                Toast.makeText(applicationContext,"On button click :" +
//                        " ${radio.text}" + "\nsa17res = $sa17res",
//                    Toast.LENGTH_SHORT).show()
            }
//            else{
//                Toast.makeText(applicationContext,"On button click :" +
//                        " nothing selected",
//                    Toast.LENGTH_SHORT).show()
//            }
            val rg18id: Int = rg18.checkedRadioButtonId
            var sa18res:Int = 0
            if (rg18id!=-1){
                val radio:RadioButton = findViewById(rg18id)
                sa18res = getRes(radio.text.toString())
//                sa18res = rev(sa18res)
//                Toast.makeText(applicationContext,"On button click :" +
//                        " ${radio.text}" + "\nsa18res = $sa18res",
//                    Toast.LENGTH_SHORT).show()
            }
//            else{
//                Toast.makeText(applicationContext,"On button click :" +
//                        " nothing selected",
//                    Toast.LENGTH_SHORT).show()
//            }
            val rg19id: Int = rg19.checkedRadioButtonId
            var sa19res:Int = 0
            if (rg19id!=-1){
                val radio:RadioButton = findViewById(rg19id)
                sa19res = getRes(radio.text.toString())
                sa19res = rev(sa19res)
//                Toast.makeText(applicationContext,"On button click :" +
//                        " ${radio.text}" + "\nsa19res = $sa19res",
//                    Toast.LENGTH_SHORT).show()
            }
//            else{
//                Toast.makeText(applicationContext,"On button click :" +
//                        " nothing selected",
//                    Toast.LENGTH_SHORT).show()
//            }
            val rg20id: Int = rg20.checkedRadioButtonId
            var sa20res:Int = 0
            if (rg20id!=-1){ // If any radio button checked from radio group
                // Get the instance of radio button using id
                val radio:RadioButton = findViewById(rg20id)
                sa20res = getRes(radio.text.toString())
                sa20res = rev(sa20res)
//                Toast.makeText(applicationContext,"On button click :" +
//                        " ${radio.text}" + "\nsa20res = $sa20res",
//                    Toast.LENGTH_SHORT).show()
            }
//            else{
//                // If no radio button checked in this radio group
//                Toast.makeText(applicationContext,"On button click :" +
//                        " nothing selected",
//                    Toast.LENGTH_SHORT).show()
//            }
            val rg21id: Int = rg21.checkedRadioButtonId
            var sa21res:Int = 0
            if (rg21id!=-1){ // If any radio button checked from radio group
                // Get the instance of radio button using id
                val radio:RadioButton = findViewById(rg21id)
                sa21res = getRes(radio.text.toString())
//                Toast.makeText(applicationContext,"On button click :" +
//                        " ${radio.text}" + "\nsa21res = $sa21res",
//                    Toast.LENGTH_SHORT).show()
            }
//            else{
//                // If no radio button checked in this radio group
//                Toast.makeText(applicationContext,"On button click :" +
//                        " nothing selected",
//                    Toast.LENGTH_SHORT).show()
//            }
            val rg22id: Int = rg22.checkedRadioButtonId
            var sa22res:Int = 0
            if (rg22id!=-1){ // If any radio button checked from radio group
                // Get the instance of radio button using id
                val radio: RadioButton = findViewById(rg22id)
                sa22res = getRes(radio.text.toString())
//                Toast.makeText(applicationContext,"On button click :" +
//                        " ${radio.text}" + "\nsa22res = $sa22res",
//                    Toast.LENGTH_SHORT).show()
            }
            if(rg1id==-1 || rg2id==-1 || rg3id==-1 || rg4id==-1 || rg5id==-1 || rg6id==-1 || rg7id==-1 || rg8id==-1 || rg9id==-1 || rg10id==-1 || rg11id==-1 || rg12id==-1 || rg13id==-1 || rg14id==-1 || rg15id==-1 || rg16id==-1 || rg17id==-1 || rg18id==-1 || rg19id==-1 || rg20id==-1 || rg21id==-1 || rg22id==-1 ){
                return@setOnClickListener
            }
            var sum = sa1res + sa2res + sa3res + sa4res + sa5res + sa6res + sa7res + sa8res + sa8res + sa10res + sa11res + sa12res + sa13res + sa14res + sa15res + sa16res + sa17res + sa18res + sa19res + sa20res + sa21res + sa22res
            var loai = ""
            if(sum <= 27){
                loai = "Extremely low Actualization"
            }
            else if(sum <= 42 && sum > 27){
                loai = "Low Actualization"
            }
            else if(sum <= 55 && sum > 42){
                loai = "Below Average Actualization"
            }
            else if(sum <= 75 && sum > 55){
                loai = "Average Actualization"
            }
            else if(sum <= 88 && sum > 75){
                loai = "Above Average Actualization"
            }
            else if(sum <= 102 && sum > 88){
                loai = "High Actualization"
            }
            else if( sum > 102){
                loai = "Extremely High Actualization"
            }
            else{
                loai = "Incorrect result obtained"
            }
            tres = "\nYour self actualization rate is ${sum}/110\n${(sum.toFloat()/110)*100}%\n"+loai
            setContentView(R.layout.activity_atresult)
            disp = findViewById(R.id.textView2)
            disp.text = tres
            back = findViewById(R.id.back_button)
            back.setOnClickListener {
                val intent = Intent(this,AggressionTest::class.java)
                startActivity(intent)
            }
        }

    }
}