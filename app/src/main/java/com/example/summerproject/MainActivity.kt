package com.example.summerproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var editText1: EditText? = null
    private var editText2: EditText? = null
    private var editText3: EditText? = null
    private var editText4: EditText? = null
    private var button: Button? = null
    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.answer)
        editText1 = findViewById(R.id.editName)
        editText2 = findViewById(R.id.editWeight)
        editText3 = findViewById(R.id.editHeight)
        editText4 = findViewById(R.id.editAge)
        button = findViewById(R.id.Button)
        button?.setOnClickListener{
            validation()
        }
    }

    private fun validation() {

        val name = editText1?.text.toString()

        val weight:Double = if(editText2?.text?.isNotEmpty() == true) {
            editText2?.text.toString().toDouble()
        }
        else 0.0

        val height:Int = if(editText3?.text?.isNotEmpty() == true) {
            editText3?.text.toString().toInt()
        }
        else 0

        val age:Int = if(editText4?.text?.isNotEmpty() == true) {
            editText4?.text.toString().toInt()
        }
        else 0

        val User1 = User(name, weight, height, age)
        val value:Double = User1.count()
        return (if(User1.name.length in 1..50 && User1.weight in 1.0..250.0 && User1.height in 1..250 && User1.age in 1..150){
            return textView?.setText("Ответ: $value")!!
        } else{
            textView?.setText("Данные введены некорректно.")
        })!!
    }
}
