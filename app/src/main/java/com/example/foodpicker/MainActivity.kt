package com.example.foodpicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Random

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Indian", "Hamburger", "Chinese", "McDonalds", "Pizza", "Burger King", "KFC", "Mexican", "Italian")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextItembtn.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectFoodText.text = foodList[randomFood]
        }

        addFoodbtn.setOnClickListener {
            if(addFoodText.text.toString() == "")
                Toast.makeText(this, "Enter food item", Toast.LENGTH_SHORT).show()
            else {
                val newFood = addFoodText.text.toString()
                foodList.add(newFood)
                addFoodText.text.clear()
            }
        }

        decidebtn.setOnClickListener {
            var food = selectFoodText.text.toString()
            Toast.makeText(this, "Yah! You grabbed "+food+".\uD83E\uDD73", Toast.LENGTH_SHORT).show()
        }
    }
}