package com.testmypsy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class PTest : AppCompatActivity() {
    lateinit var results : TextView
    lateinit var disp : TextView
    lateinit var back : Button
    lateinit var tres : String
    fun getRes(radio:String):Int{
        var result = 0
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
        setContentView(R.layout.activity_ptest)
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
        val rg23 = findViewById<RadioGroup>(R.id.rg23)
        rg23.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val rg24 = findViewById<RadioGroup>(R.id.rg24)
        rg24.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val rg25 = findViewById<RadioGroup>(R.id.rg25)
        rg25.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val rg26 = findViewById<RadioGroup>(R.id.rg26)
        rg26.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val rg27 = findViewById<RadioGroup>(R.id.rg27)
        rg27.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val rg28 = findViewById<RadioGroup>(R.id.rg28)
        rg28.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val rg29 = findViewById<RadioGroup>(R.id.rg29)
        rg29.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
//                Toast.makeText(applicationContext," On checked change :"+
//                        " ${radio.text}",
//                    Toast.LENGTH_SHORT).show()
            })
        val rg30 = findViewById<RadioGroup>(R.id.rg30)
        rg30.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)

            })
        val rg31 = findViewById<RadioGroup>(R.id.rg31)
        rg31.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)

            })
        val rg32 = findViewById<RadioGroup>(R.id.rg32)
        rg32.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)

            })
        val rg33 = findViewById<RadioGroup>(R.id.rg33)
        rg33.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)

            })
        val rg34 = findViewById<RadioGroup>(R.id.rg34)
        rg34.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
            })
        val rg35 = findViewById<RadioGroup>(R.id.rg35)
        rg35.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)

            })
        val rg36 = findViewById<RadioGroup>(R.id.rg36)
        rg36.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)

            })
        val rg37 = findViewById<RadioGroup>(R.id.rg37)
        rg37.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)

            })
        val rg38 = findViewById<RadioGroup>(R.id.rg38)
        rg38.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)

            })
        val rg39 = findViewById<RadioGroup>(R.id.rg39)
        rg39.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)

            })
        val rg40 = findViewById<RadioGroup>(R.id.rg40)
        rg40.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)

            })
        val rg41 = findViewById<RadioGroup>(R.id.rg41)
        rg41.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)

            })
        val rg42 = findViewById<RadioGroup>(R.id.rg42)
        rg42.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)

            })
        val rg43 = findViewById<RadioGroup>(R.id.rg43)
        rg43.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)

            })
        val rg44 = findViewById<RadioGroup>(R.id.rg44)
        rg44.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
            })
        val rg45 = findViewById<RadioGroup>(R.id.rg45)
        rg45.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)

            })
        val rg46 = findViewById<RadioGroup>(R.id.rg46)
        rg46.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)

            })
        val rg47 = findViewById<RadioGroup>(R.id.rg47)
        rg47.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)

            })
        val rg48 = findViewById<RadioGroup>(R.id.rg48)
        rg48.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)

            })
        val rg49 = findViewById<RadioGroup>(R.id.rg49)
        rg49.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)

            })
        val rg50 = findViewById<RadioGroup>(R.id.rg50)
        rg50.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)

            })

        val submitButton = findViewById<Button>(R.id.submitButton)
        submitButton.setOnClickListener{
            val rg1id: Int = rg1.checkedRadioButtonId
            var ptq1res:Int =0
            if (rg1id!=-1){
                val radio:RadioButton = findViewById(rg1id)
                ptq1res = getRes(radio.text.toString())
            }
            val rg2id: Int = rg2.checkedRadioButtonId
            var ptq2res:Int = 0
            if (rg2id!=-1){
                val radio:RadioButton = findViewById(rg2id)
                ptq2res = getRes(radio.text.toString())
            }
            val rg3id: Int = rg3.checkedRadioButtonId
            var ptq3res:Int = 0
            if (rg3id!=-1){
                val radio:RadioButton = findViewById(rg3id)
                ptq3res = getRes(radio.text.toString())
            }
            val rg4id: Int = rg4.checkedRadioButtonId
            var ptq4res:Int = 0
            if (rg4id!=-1){
                val radio:RadioButton = findViewById(rg4id)
                ptq4res = getRes(radio.text.toString())
            }
            val rg5id: Int = rg5.checkedRadioButtonId
            var ptq5res:Int = 0
            if (rg5id!=-1){
                val radio:RadioButton = findViewById(rg5id)
                ptq5res = getRes(radio.text.toString())
            }
            val rg6id: Int = rg6.checkedRadioButtonId
            var ptq6res:Int = 0
            if (rg6id!=-1){
                val radio:RadioButton = findViewById(rg6id)
                ptq6res = getRes(radio.text.toString())
            }
            val rg7id: Int = rg7.checkedRadioButtonId
            var ptq7res:Int = 0
            if (rg7id!=-1){
                val radio:RadioButton = findViewById(rg7id)
                ptq7res = getRes(radio.text.toString())
                ptq7res = rev(ptq7res)
            }
            val rg8id: Int = rg8.checkedRadioButtonId
            var ptq8res:Int = 0
            if (rg8id!=-1){
                val radio:RadioButton = findViewById(rg8id)
                ptq8res = getRes(radio.text.toString())
            }
            val rg9id: Int = rg9.checkedRadioButtonId
            var ptq9res:Int = 0
            if (rg9id!=-1){
                val radio:RadioButton = findViewById(rg9id)
                ptq9res = getRes(radio.text.toString())
            }
            val rg10id: Int = rg10.checkedRadioButtonId
            var ptq10res:Int = 0
            if (rg10id!=-1){
                val radio:RadioButton = findViewById(rg10id)
                ptq10res = getRes(radio.text.toString())
            }
            val rg11id: Int = rg11.checkedRadioButtonId
            var ptq11res:Int =0
            if (rg11id!=-1){
                val radio:RadioButton = findViewById(rg11id)
                ptq11res = getRes(radio.text.toString())
            }
            val rg12id: Int = rg12.checkedRadioButtonId
            var ptq12res:Int = 0
            if (rg12id!=-1){
                val radio:RadioButton = findViewById(rg12id)
                ptq12res = getRes(radio.text.toString())
            }
            val rg13id: Int = rg13.checkedRadioButtonId
            var ptq13res:Int = 0
            if (rg13id!=-1){
                val radio:RadioButton = findViewById(rg13id)
                ptq13res = getRes(radio.text.toString())
            }
            val rg14id: Int = rg14.checkedRadioButtonId
            var ptq14res:Int = 0
            if (rg14id!=-1){
                val radio:RadioButton = findViewById(rg14id)
                ptq14res = getRes(radio.text.toString())
            }
            val rg15id: Int = rg15.checkedRadioButtonId
            var ptq15res:Int = 0
            if (rg15id!=-1){
                val radio:RadioButton = findViewById(rg15id)
                ptq15res = getRes(radio.text.toString())
            }
            val rg16id: Int = rg16.checkedRadioButtonId
            var ptq16res:Int = 0
            if (rg16id!=-1){
                val radio:RadioButton = findViewById(rg16id)
                ptq16res = getRes(radio.text.toString())
            }
            val rg17id: Int = rg17.checkedRadioButtonId
            var ptq17res:Int = 0
            if (rg17id!=-1){
                val radio:RadioButton = findViewById(rg17id)
                ptq17res = getRes(radio.text.toString())
                ptq17res = rev(ptq17res)
            }
            val rg18id: Int = rg18.checkedRadioButtonId
            var ptq18res:Int = 0
            if (rg18id!=-1){
                val radio:RadioButton = findViewById(rg18id)
                ptq18res = getRes(radio.text.toString())
            }
            val rg19id: Int = rg19.checkedRadioButtonId
            var ptq19res:Int = 0
            if (rg19id!=-1){
                val radio:RadioButton = findViewById(rg19id)
                ptq19res = getRes(radio.text.toString())
            }
            val rg20id: Int = rg20.checkedRadioButtonId
            var ptq20res:Int = 0
            if (rg20id!=-1){
                val radio:RadioButton = findViewById(rg20id)
                ptq20res = getRes(radio.text.toString())
            }
            val rg21id: Int = rg21.checkedRadioButtonId
            var ptq21res:Int =0
            if (rg21id!=-1){
                val radio:RadioButton = findViewById(rg21id)
                ptq21res = getRes(radio.text.toString())
            }
            val rg22id: Int = rg22.checkedRadioButtonId
            var ptq22res:Int = 0
            if (rg22id!=-1){
                val radio:RadioButton = findViewById(rg22id)
                ptq22res = getRes(radio.text.toString())
            }
            val rg23id: Int = rg23.checkedRadioButtonId
            var ptq23res:Int = 0
            if (rg23id!=-1){
                val radio:RadioButton = findViewById(rg23id)
                ptq23res = getRes(radio.text.toString())
            }
            val rg24id: Int = rg24.checkedRadioButtonId
            var ptq24res:Int = 0
            if (rg24id!=-1){
                val radio:RadioButton = findViewById(rg24id)
                ptq24res = getRes(radio.text.toString())
            }
            val rg25id: Int = rg25.checkedRadioButtonId
            var ptq25res:Int = 0
            if (rg25id!=-1){
                val radio:RadioButton = findViewById(rg25id)
                ptq25res = getRes(radio.text.toString())
            }
            val rg26id: Int = rg26.checkedRadioButtonId
            var ptq26res:Int = 0
            if (rg26id!=-1){
                val radio:RadioButton = findViewById(rg26id)
                ptq26res = getRes(radio.text.toString())
            }
            val rg27id: Int = rg27.checkedRadioButtonId
            var ptq27res:Int = 0
            if (rg27id!=-1){
                val radio:RadioButton = findViewById(rg27id)
                ptq27res = getRes(radio.text.toString())
                ptq27res = rev(ptq27res)
            }
            val rg28id: Int = rg28.checkedRadioButtonId
            var ptq28res:Int = 0
            if (rg28id!=-1){
                val radio:RadioButton = findViewById(rg28id)
                ptq28res = getRes(radio.text.toString())
            }
            val rg29id: Int = rg29.checkedRadioButtonId
            var ptq29res:Int = 0
            if (rg29id!=-1){
                val radio:RadioButton = findViewById(rg29id)
                ptq29res = getRes(radio.text.toString())
            }
            val rg30id: Int = rg30.checkedRadioButtonId
            var ptq30res:Int = 0
            if (rg30id!=-1){
                val radio:RadioButton = findViewById(rg30id)
                ptq30res = getRes(radio.text.toString())
            }
            val rg31id: Int = rg31.checkedRadioButtonId
            var ptq31res:Int =0
            if (rg31id!=-1){
                val radio:RadioButton = findViewById(rg31id)
                ptq31res = getRes(radio.text.toString())
            }
            val rg32id: Int = rg32.checkedRadioButtonId
            var ptq32res:Int = 0
            if (rg32id!=-1){
                val radio:RadioButton = findViewById(rg32id)
                ptq32res = getRes(radio.text.toString())
            }
            val rg33id: Int = rg33.checkedRadioButtonId
            var ptq33res:Int = 0
            if (rg33id!=-1){
                val radio:RadioButton = findViewById(rg33id)
                ptq33res = getRes(radio.text.toString())
            }
            val rg34id: Int = rg34.checkedRadioButtonId
            var ptq34res:Int = 0
            if (rg34id!=-1){
                val radio:RadioButton = findViewById(rg34id)
                ptq34res = getRes(radio.text.toString())
            }
            val rg35id: Int = rg35.checkedRadioButtonId
            var ptq35res:Int = 0
            if (rg35id!=-1){
                val radio:RadioButton = findViewById(rg35id)
                ptq35res = getRes(radio.text.toString())
            }
            val rg36id: Int = rg36.checkedRadioButtonId
            var ptq36res:Int = 0
            if (rg36id!=-1){
                val radio:RadioButton = findViewById(rg36id)
                ptq36res = getRes(radio.text.toString())
            }
            val rg37id: Int = rg37.checkedRadioButtonId
            var ptq37res:Int = 0
            if (rg37id!=-1){
                val radio:RadioButton = findViewById(rg37id)
                ptq37res = getRes(radio.text.toString())
                ptq37res = rev(ptq37res)
            }
            val rg38id: Int = rg38.checkedRadioButtonId
            var ptq38res:Int = 0
            if (rg38id!=-1){
                val radio:RadioButton = findViewById(rg38id)
                ptq38res = getRes(radio.text.toString())
            }
            val rg39id: Int = rg39.checkedRadioButtonId
            var ptq39res:Int = 0
            if (rg39id!=-1){
                val radio:RadioButton = findViewById(rg39id)
                ptq39res = getRes(radio.text.toString())
            }
            val rg40id: Int = rg40.checkedRadioButtonId
            var ptq40res:Int = 0
            if (rg40id!=-1){
                val radio:RadioButton = findViewById(rg40id)
                ptq40res = getRes(radio.text.toString())
            }
            val rg41id: Int = rg41.checkedRadioButtonId
            var ptq41res:Int =0
            if (rg41id!=-1){
                val radio:RadioButton = findViewById(rg41id)
                ptq41res = getRes(radio.text.toString())
            }
            val rg42id: Int = rg42.checkedRadioButtonId
            var ptq42res:Int = 0
            if (rg42id!=-1){
                val radio:RadioButton = findViewById(rg42id)
                ptq42res = getRes(radio.text.toString())
            }
            val rg43id: Int = rg43.checkedRadioButtonId
            var ptq43res:Int = 0
            if (rg43id!=-1){
                val radio:RadioButton = findViewById(rg43id)
                ptq43res = getRes(radio.text.toString())
            }
            val rg44id: Int = rg44.checkedRadioButtonId
            var ptq44res:Int = 0
            if (rg44id!=-1){
                val radio:RadioButton = findViewById(rg44id)
                ptq44res = getRes(radio.text.toString())
            }
            val rg45id: Int = rg45.checkedRadioButtonId
            var ptq45res:Int = 0
            if (rg45id!=-1){
                val radio:RadioButton = findViewById(rg45id)
                ptq45res = getRes(radio.text.toString())
            }
            val rg46id: Int = rg46.checkedRadioButtonId
            var ptq46res:Int = 0
            if (rg46id!=-1){
                val radio:RadioButton = findViewById(rg46id)
                ptq46res = getRes(radio.text.toString())
            }
            val rg47id: Int = rg47.checkedRadioButtonId
            var ptq47res:Int = 0
            if (rg47id!=-1){
                val radio:RadioButton = findViewById(rg47id)
                ptq47res = getRes(radio.text.toString())
                ptq47res = rev(ptq47res)
            }
            val rg48id: Int = rg48.checkedRadioButtonId
            var ptq48res:Int = 0
            if (rg48id!=-1){
                val radio:RadioButton = findViewById(rg48id)
                ptq48res = getRes(radio.text.toString())
            }
            val rg49id: Int = rg49.checkedRadioButtonId
            var ptq49res:Int = 0
            if (rg49id!=-1){
                val radio:RadioButton = findViewById(rg49id)
                ptq49res = getRes(radio.text.toString())
            }
            val rg50id: Int = rg50.checkedRadioButtonId
            var ptq50res:Int = 0
            if (rg50id!=-1){
                val radio:RadioButton = findViewById(rg50id)
                ptq50res = getRes(radio.text.toString())
            }
            if(rg1id==-1 || rg2id==-1 || rg3id==-1 || rg4id==-1 || rg5id==-1 || rg6id==-1 || rg7id==-1 || rg8id==-1 || rg9id==-1 || rg10id==-1 || rg11id==-1 || rg12id==-1 || rg13id==-1 || rg14id==-1 || rg15id==-1 || rg16id==-1 || rg17id==-1 || rg18id==-1 || rg19id==-1 || rg20id==-1 || rg21id==-1 || rg22id==-1 || rg23id==-1 || rg24id==-1 || rg25id==-1 || rg26id==-1 || rg27id==-1 || rg28id==-1 || rg29id==-1 || rg30id==-1 || rg31id==-1 || rg32id==-1 || rg33id==-1 || rg34id==-1 || rg35id==-1 || rg36id==-1 || rg37id==-1 || rg38id==-1 || rg39id==-1 || rg40id==-1 || rg41id==-1 || rg42id==-1 || rg43id==-1 || rg44id==-1 || rg45id==-1 || rg46id==-1 || rg47id==-1 || rg48id==-1 || rg49id==-1 || rg50id==-1){
                return@setOnClickListener
            }
            var extro = 20 + ptq1res - ptq6res + ptq11res - ptq16res + ptq21res  - ptq26res  + ptq31res - ptq36res + ptq41res  - ptq46res
            var agree = 14 - ptq2res + ptq7res - ptq12res + ptq17res - ptq22res + ptq27res - ptq32res + ptq37res + ptq42res + ptq47res
            var consc = 14 + ptq3res - ptq8res + ptq13res - ptq18res + ptq23res - ptq28res + ptq33res - ptq38res + ptq43res + ptq48res
            var neuro = 38 - ptq4res + ptq9res - ptq14res + ptq19res - ptq24res - ptq29res - ptq34res - ptq39res - ptq44res - ptq49res
            var ote = 8 + ptq5res - ptq10res + ptq15res - ptq20res + ptq25res - ptq30res + ptq35res + ptq40res + ptq45res + ptq50res
            var exroSt = "Extroversion (E) is the personality trait of seeking fulfillment from sources outside the self or in community. High scorers tend to be very social \n" +
                    "while low scorers prefer to work on their projects alone."
            var agreeSt = "Agreeableness (A) reflects how much individuals adjust their behavior to suit others. High scorers are typically polite and like people. Low scorers \n" +
                    "tend to 'tell it like it is'."
            var conscSt = "Conscientiousness (C) is the personality trait of being honest and hardworking. High scorers tend to follow rules and prefer clean homes. Low \n" +
                    "scorers may be messy and cheat others."
            var neuroSt = "Neuroticism (N) is the personality trait of being emotional. High scorers tend to have high emotional reactions to stress. They may perceive \n" +
                    "situations as threatening and be more likely to feel moody, depressed, angry, anxious, and experience mood swing. Low scorers tend to be more \n" +
                    "emotionally stable and less reactive to stress."
            var oteSt = "Openness to Experience (O) is the personality trait of seeking new experiences and intellectual pursuits. High scores may day dream a lot (enjoy \n" +
                    "thinking about new and different things). Low scorers tend to be very down to earth (more of a ‘hear and now’ thinker). Consequently, it is \n" +
                    "thought that people with higher scores might be more creative, flexible, curious, and adventurous, whereas people with lower score might tend to \n" +
                    "enjoy routines, predictability, and structure."
            tres = "\nYour Extroversion rate is ${(extro.toFloat()/40)*100}%"  + "\n" +
                    "Your Agreeableness rate is ${(agree.toFloat() / 40) * 100}%"  + "\nYour Conscientiousness rate is ${(consc.toFloat() / 40) * 100}%"  + "\n" +
                    "Your Neuroticism rate is ${(neuro.toFloat() / 40) * 100}%"  + "\n" +
                    "Your Openness to Experience rate is ${(ote.toFloat() / 40) * 100}%"
            setContentView(R.layout.activity_atresult)
            disp = findViewById(R.id.textView2)
            disp.text = tres
            back = findViewById(R.id.back_button)
            back.setOnClickListener {
                val intent = Intent(this,EITest::class.java)
                startActivity(intent)
            }
        }
    }
}