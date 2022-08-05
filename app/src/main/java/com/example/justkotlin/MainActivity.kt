package com.example.justkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    var n = 0

    fun submitOrder(view: View) {
        var txtView = findViewById<TextView>(R.id.showNumbers)
        n++;
        txtView.text = "$n"
    }

}