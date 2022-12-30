package com.testmypsy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class sptest : AppCompatActivity() {
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
        setContentView(R.layout.activity_sptest)
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
        val submitButton = findViewById<Button>(R.id.submitButton)
        submitButton.setOnClickListener{
            val rg1id: Int = rg1.checkedRadioButtonId
            var spt1res:Int =0
            if (rg1id!=-1){
                val radio:RadioButton = findViewById(rg1id)
                spt1res = getRes(radio.text.toString())
            }
            val rg2id: Int = rg2.checkedRadioButtonId
            var spt2res:Int = 0
            if (rg2id!=-1){
                val radio:RadioButton = findViewById(rg2id)
                spt2res = getRes(radio.text.toString())
            }
            val rg3id: Int = rg3.checkedRadioButtonId
            var spt3res:Int = 0
            if (rg3id!=-1){
                val radio:RadioButton = findViewById(rg3id)
                spt3res = getRes(radio.text.toString())
            }
            val rg4id: Int = rg4.checkedRadioButtonId
            var spt4res:Int = 0
            if (rg4id!=-1){
                val radio:RadioButton = findViewById(rg4id)
                spt4res = getRes(radio.text.toString())
            }
            val rg5id: Int = rg5.checkedRadioButtonId
            var spt5res:Int = 0
            if (rg5id!=-1){
                val radio:RadioButton = findViewById(rg5id)
                spt5res = getRes(radio.text.toString())
            }
            val rg6id: Int = rg6.checkedRadioButtonId
            var spt6res:Int = 0
            if (rg6id!=-1){
                val radio:RadioButton = findViewById(rg6id)
                spt6res = getRes(radio.text.toString())
            }
            val rg7id: Int = rg7.checkedRadioButtonId
            var spt7res:Int = 0
            if (rg7id!=-1){
                val radio:RadioButton = findViewById(rg7id)
                spt7res = getRes(radio.text.toString())
                spt7res = rev(spt7res)
            }
            val rg8id: Int = rg8.checkedRadioButtonId
            var spt8res:Int = 0
            if (rg8id!=-1){
                val radio:RadioButton = findViewById(rg8id)
                spt8res = getRes(radio.text.toString())
            }
            val rg9id: Int = rg9.checkedRadioButtonId
            var spt9res:Int = 0
            if (rg9id!=-1){
                val radio:RadioButton = findViewById(rg9id)
                spt9res = getRes(radio.text.toString())
            }
            val rg10id: Int = rg10.checkedRadioButtonId
            var spt10res:Int = 0
            if (rg10id!=-1){
                val radio:RadioButton = findViewById(rg10id)
                spt10res = getRes(radio.text.toString())
            }
            val rg11id: Int = rg11.checkedRadioButtonId
            var spt11res:Int =0
            if (rg11id!=-1){
                val radio:RadioButton = findViewById(rg11id)
                spt11res = getRes(radio.text.toString())
            }
            val rg12id: Int = rg12.checkedRadioButtonId
            var spt12res:Int = 0
            if (rg12id!=-1){
                val radio:RadioButton = findViewById(rg12id)
                spt12res = getRes(radio.text.toString())
            }
            val rg13id: Int = rg13.checkedRadioButtonId
            var spt13res:Int = 0
            if (rg13id!=-1){
                val radio:RadioButton = findViewById(rg13id)
                spt13res = getRes(radio.text.toString())
            }
            val rg14id: Int = rg14.checkedRadioButtonId
            var spt14res:Int = 0
            if (rg14id!=-1){
                val radio:RadioButton = findViewById(rg14id)
                spt14res = getRes(radio.text.toString())
            }
            val rg15id: Int = rg15.checkedRadioButtonId
            var spt15res:Int = 0
            if (rg15id!=-1){
                val radio:RadioButton = findViewById(rg15id)
                spt15res = getRes(radio.text.toString())
            }
            val rg16id: Int = rg16.checkedRadioButtonId
            var spt16res:Int = 0
            if (rg16id!=-1){
                val radio:RadioButton = findViewById(rg16id)
                spt16res = getRes(radio.text.toString())
            }
            val rg17id: Int = rg17.checkedRadioButtonId
            var spt17res:Int = 0
            if (rg17id!=-1){
                val radio:RadioButton = findViewById(rg17id)
                spt17res = getRes(radio.text.toString())
                spt17res = rev(spt17res)
            }
            if(rg1id==-1 || rg2id==-1 || rg3id==-1 || rg4id==-1 || rg5id==-1 || rg6id==-1 || rg7id==-1 || rg8id==-1 || rg9id==-1 || rg10id==-1 || rg11id==-1 || rg12id==-1 || rg13id==-1 || rg14id==-1 || rg15id==-1 || rg16id==-1 || rg17id==-1){
                return@setOnClickListener
            }
            var tot = spt1res + spt2res + spt3res + spt4res + spt5res + spt6res + spt7res + spt8res + spt9res + spt10res + spt11res + spt12res + spt13res + spt14res + spt15res + spt16res + spt17res
            tres = "Social Phobia Rate: ${tot}/85\ni.e ${((tot.toFloat()/85)*100)}%\n"
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