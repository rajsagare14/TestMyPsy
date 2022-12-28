package com.testmypsy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class QOLTest : AppCompatActivity() {
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
        else if(radio == "Neutral" || radio == "Quite Often" || radio == "Neither Satisfied Nor Dissatisfied"|| radio == "Neither poor nor good"|| radio == "A Moderate Amount" || radio == "Moderately "){
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
        setContentView(R.layout.activity_qoltest)
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
        val submitButton = findViewById<Button>(R.id.submitButton)
        submitButton.setOnClickListener{
            val rg1id: Int = rg1.checkedRadioButtonId
            var qol1res:Int =0
            if (rg1id!=-1){
                val radio:RadioButton = findViewById(rg1id)
                qol1res = getRes(radio.text.toString())
            }
            val rg2id: Int = rg2.checkedRadioButtonId
            var qol2res:Int = 0
            if (rg2id!=-1){
                val radio:RadioButton = findViewById(rg2id)
                qol2res = getRes(radio.text.toString())
            }
            val rg3id: Int = rg3.checkedRadioButtonId
            var qol3res:Int = 0
            if (rg3id!=-1){
                val radio:RadioButton = findViewById(rg3id)
                qol3res = getRes(radio.text.toString())
                qol3res = rev(qol3res)
            }
            val rg4id: Int = rg4.checkedRadioButtonId
            var qol4res:Int = 0
            if (rg4id!=-1){
                val radio:RadioButton = findViewById(rg4id)
                qol4res = getRes(radio.text.toString())
                qol4res = rev(qol4res)
            }
            val rg5id: Int = rg5.checkedRadioButtonId
            var qol5res:Int = 0
            if (rg5id!=-1){
                val radio:RadioButton = findViewById(rg5id)
                qol5res = getRes(radio.text.toString())
            }
            val rg6id: Int = rg6.checkedRadioButtonId
            var qol6res:Int = 0
            if (rg6id!=-1){
                val radio:RadioButton = findViewById(rg6id)
                qol6res = getRes(radio.text.toString())
            }
            val rg7id: Int = rg7.checkedRadioButtonId
            var qol7res:Int = 0
            if (rg7id!=-1){
                val radio:RadioButton = findViewById(rg7id)
                qol7res = getRes(radio.text.toString())
                qol7res = rev(qol7res)
            }
            val rg8id: Int = rg8.checkedRadioButtonId
            var qol8res:Int = 0
            if (rg8id!=-1){
                val radio:RadioButton = findViewById(rg8id)
                qol8res = getRes(radio.text.toString())
            }
            val rg9id: Int = rg9.checkedRadioButtonId
            var qol9res:Int = 0
            if (rg9id!=-1){
                val radio:RadioButton = findViewById(rg9id)
                qol9res = getRes(radio.text.toString())
            }
            val rg10id: Int = rg10.checkedRadioButtonId
            var qol10res:Int = 0
            if (rg10id!=-1){
                val radio:RadioButton = findViewById(rg10id)
                qol10res = getRes(radio.text.toString())
            }
            val rg11id: Int = rg11.checkedRadioButtonId
            var qol11res:Int =0
            if (rg11id!=-1){
                val radio:RadioButton = findViewById(rg11id)
                qol11res = getRes(radio.text.toString())
            }
            val rg12id: Int = rg12.checkedRadioButtonId
            var qol12res:Int = 0
            if (rg12id!=-1){
                val radio:RadioButton = findViewById(rg12id)
                qol12res = getRes(radio.text.toString())
            }
            val rg13id: Int = rg13.checkedRadioButtonId
            var qol13res:Int = 0
            if (rg13id!=-1){
                val radio:RadioButton = findViewById(rg13id)
                qol13res = getRes(radio.text.toString())
            }
            val rg14id: Int = rg14.checkedRadioButtonId
            var qol14res:Int = 0
            if (rg14id!=-1){
                val radio:RadioButton = findViewById(rg14id)
                qol14res = getRes(radio.text.toString())
            }
            val rg15id: Int = rg15.checkedRadioButtonId
            var qol15res:Int = 0
            if (rg15id!=-1){
                val radio:RadioButton = findViewById(rg15id)
                qol15res = getRes(radio.text.toString())
            }
            val rg16id: Int = rg16.checkedRadioButtonId
            var qol16res:Int = 0
            if (rg16id!=-1){
                val radio:RadioButton = findViewById(rg16id)
                qol16res = getRes(radio.text.toString())
            }
            val rg17id: Int = rg17.checkedRadioButtonId
            var qol17res:Int = 0
            if (rg17id!=-1){
                val radio:RadioButton = findViewById(rg17id)
                qol17res = getRes(radio.text.toString())
                qol17res = rev(qol17res)
            }
            val rg18id: Int = rg18.checkedRadioButtonId
            var qol18res:Int = 0
            if (rg18id!=-1){
                val radio:RadioButton = findViewById(rg18id)
                qol18res = getRes(radio.text.toString())
            }
            val rg19id: Int = rg19.checkedRadioButtonId
            var qol19res:Int = 0
            if (rg19id!=-1){
                val radio:RadioButton = findViewById(rg19id)
                qol19res = getRes(radio.text.toString())
            }
            val rg20id: Int = rg20.checkedRadioButtonId
            var qol20res:Int = 0
            if (rg20id!=-1){
                val radio:RadioButton = findViewById(rg20id)
                qol20res = getRes(radio.text.toString())
            }
            val rg21id: Int = rg21.checkedRadioButtonId
            var qol21res:Int =0
            if (rg21id!=-1){
                val radio:RadioButton = findViewById(rg21id)
                qol21res = getRes(radio.text.toString())
            }
            val rg22id: Int = rg22.checkedRadioButtonId
            var qol22res:Int = 0
            if (rg22id!=-1){
                val radio:RadioButton = findViewById(rg22id)
                qol22res = getRes(radio.text.toString())
            }
            val rg23id: Int = rg23.checkedRadioButtonId
            var qol23res:Int = 0
            if (rg23id!=-1){
                val radio:RadioButton = findViewById(rg23id)
                qol23res = getRes(radio.text.toString())
            }
            val rg24id: Int = rg24.checkedRadioButtonId
            var qol24res:Int = 0
            if (rg24id!=-1){
                val radio:RadioButton = findViewById(rg24id)
                qol24res = getRes(radio.text.toString())
            }
            val rg25id: Int = rg25.checkedRadioButtonId
            var qol25res:Int = 0
            if (rg25id!=-1){
                val radio:RadioButton = findViewById(rg25id)
                qol25res = getRes(radio.text.toString())
            }
            val rg26id: Int = rg26.checkedRadioButtonId
            var qol26res:Int = 0
            if (rg26id!=-1){
                val radio:RadioButton = findViewById(rg26id)
                qol26res = getRes(radio.text.toString())
                qol26res = rev(qol26res)
            }
            if(rg1id==-1 || rg2id==-1 || rg3id==-1 || rg4id==-1 || rg5id==-1 || rg6id==-1 || rg7id==-1 || rg8id==-1 || rg9id==-1 || rg10id==-1 || rg11id==-1 || rg12id==-1 || rg13id==-1 || rg14id==-1 || rg15id==-1 || rg16id==-1 || rg17id==-1 || rg18id==-1 || rg19id==-1 || rg20id==-1 || rg21id==-1 || rg22id==-1 || rg23id==-1 || rg24id==-1 || rg25id==-1 || rg26id==-1){
                return@setOnClickListener
            }
            var oqolngh = qol1res + qol2res
            var ph = qol3res + qol4res + qol10res + qol17res + qol15res + qol16res + qol18res
            var psy = qol5res + qol6res + qol7res + qol11res + qol19res + qol26res
            var sr = qol20res + qol21res + qol22res
            var env = qol8res + qol9res + qol12res + qol13res + qol14res + qol23res + qol24res + qol25res
            var qol = oqolngh + ph + psy + sr + env
            tres = "Overall Quality of Life and General Health: ${oqolngh}/10 i.e ${(oqolngh.toFloat()/10)*100}%\nPhysical health: ${ph}/35 i.e ${(ph.toFloat()/35)*100}%\nPsychology: ${psy}/30 i.e ${(psy.toFloat()/30)*100}%\nSocial Relationships: ${sr}/15 i.e ${(sr.toFloat()/15)*100}%\nEnviornment: ${env}/40 i.e ${(env.toFloat() / 40) * 100}%\nQuality Of Life: ${qol}/130 i.e ${(qol.toFloat()/130)*100}%\n"
            ATResult().res = tres
            setContentView(R.layout.activity_atresult)
            disp = findViewById(R.id.textView2)
            disp.text = tres
            back = findViewById(R.id.back_button)
            back.setOnClickListener {
                val intent = Intent(this,QOLTest::class.java)
                startActivity(intent)
            }
        }
    }
}