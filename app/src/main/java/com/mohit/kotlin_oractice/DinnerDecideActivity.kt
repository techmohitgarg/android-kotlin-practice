package com.mohit.kotlin_oractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class DinnerDecideActivity : AppCompatActivity() {

    val foodItemList = arrayListOf("Chinese", "Indian", "Pizza", "Bugger")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        decideBtn.setOnClickListener {
            val random = Random()
            val randomIndex = random.nextInt(foodItemList.size)
            selectedFoodTxt.text = foodItemList[randomIndex]
        }

        addFoodBtn.setOnClickListener {
            val addText = addFoodTxt.text.toString()
            if (addText.isNotEmpty()) {
                foodItemList.add(addText)
                selectedFoodTxt.text = addText
                println(foodItemList)
            } else
                addFoodTxt.error = "Add food item"

        }
    }
}