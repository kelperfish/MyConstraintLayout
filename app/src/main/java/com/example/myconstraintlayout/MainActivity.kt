package com.example.myconstraintlayout

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.myconstraintlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setListeners()
    }

    private fun setListeners(){
//        val boxOne = findViewById<TextView>(R.id.BoxOne)
//        val boxTwo = findViewById<TextView>(R.id.BoxTwo)
//        val boxThree = findViewById<TextView>(R.id.BoxThree)
//        val boxFour = findViewById<TextView>(R.id.BoxFour)
//        val boxFive = findViewById<TextView>(R.id.BoxFive)
//        val rootConstraintLayout = findViewById<View>(R.id.rootConstraintLayout)
//        val redButton = findViewById<Button>(R.id.red_button)
//        val greenButton = findViewById<Button>(R.id.green_button)
//        val yellowButton = findViewById<Button>(R.id.yellow_button)

        val clickables : List<View> =
            listOf(
                binding.BoxOne,binding.BoxTwo,binding.BoxThree,binding.BoxFour,binding.BoxFive,binding.redButton,binding.yellowButton,binding.greenButton
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
            //boxes using custom colors for background
            R.id.red_button -> binding.BoxThree.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> binding.BoxFour.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> binding.BoxFive.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}