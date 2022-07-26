package com.example.myconstraintlayout

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners(){
        val boxOne = findViewById<TextView>(R.id.BoxOne)
        val boxTwo = findViewById<TextView>(R.id.BoxTwo)
        val boxThree = findViewById<TextView>(R.id.BoxThree)
        val boxFour = findViewById<TextView>(R.id.BoxFour)
        val boxFive = findViewById<TextView>(R.id.BoxFive)

        val clickables : List<View> =
            listOf(
                boxOne,boxTwo,boxThree,boxFour,boxFive
            )

        for (item in clickables){
            item.setOnClickListener { makeColoured(it) }
        }
    }

    private fun makeColoured(view: View){
        when(view.id){
            R.id.BoxOne -> view.setBackgroundColor(Color.BLUE)
            R.id.BoxTwo -> view.setBackgroundColor(Color.RED)
            R.id.BoxThree -> view.setBackgroundColor(Color.YELLOW)
            R.id.BoxFour -> view.setBackgroundColor(Color.GREEN)
            R.id.BoxFive -> view.setBackgroundColor(Color.MAGENTA)
        }
    }
}