package com.ssaapp.c_eats

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chickfilaButton = findViewById<Button>(R.id.button1)
        val subwayButton = findViewById<Button>(R.id.button2)
        val starbucksButton = findViewById<Button>(R.id.button3)
        val milkHoneyButton = findViewById<Button>(R.id.button4)
        val menuImageView: ImageView = findViewById(R.id.menuImageView)

        chickfilaButton.setOnClickListener {
            // Set the image resource for Chickfila menu

            menuImageView.setImageResource(R.drawable.chickfilam)
            // Make the menu image visible
            menuImageView.visibility = View.VISIBLE
        }

        subwayButton.setOnClickListener {
            // Set the image resource for Subway menu
            menuImageView.setImageResource(R.drawable.subwaymenu)
            // Make the menu image visible
            menuImageView.visibility = View.VISIBLE
        }

        starbucksButton.setOnClickListener {
            // Set the image resource for Starbucks menu
            menuImageView.setImageResource(R.drawable.starbucksmenu)
            // Make the menu image visible
            menuImageView.visibility = View.VISIBLE
        }

        milkHoneyButton.setOnClickListener {
            // Set the image resource for Milk & Honey menu
            menuImageView.setImageResource(R.drawable.milkandhoneymenu)
            // Make the menu image visible
            menuImageView.visibility = View.VISIBLE
        }






        }
    }






