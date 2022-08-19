package com.example.justkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    // Global variables
    var numberOfCoffee = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun incrementBtn(view: View){
        numberOfCoffee++
        display(numberOfCoffee)
    }

    fun decrementBtn(view: View){
        numberOfCoffee--
        display(numberOfCoffee)
    }

    // Display text on TextView
    fun display(numberOfCoffeePar: Int){
        var txtDisplay = findViewById<TextView>(R.id.numberOfCoffeeId)

        txtDisplay.text = "$numberOfCoffeePar"
    }

    fun submitOrder(view: View) {
        var totalTxtView = findViewById<TextView>(R.id.totalPriceId)

        "Total Price:$${numberOfCoffee * 5}\nThank your!".also { totalTxtView.text = it }
    }

}