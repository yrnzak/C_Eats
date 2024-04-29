package com.ssaapp.c_eats


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chickfilaButton: Button = findViewById(R.id.button1)
        val subwayButton: Button = findViewById(R.id.button2)
        val milkAndHoneyButton: Button = findViewById(R.id.button3)
        val starbucksButton: Button = findViewById(R.id.button4)

        chickfilaButton.setOnClickListener {
            val intent = Intent(this, ChickfilaMenuActivity::class.java)
            startActivity(intent)
        }


        subwayButton.setOnClickListener {
            val intent = Intent(this, SubwayMenuActivity::class.java)
            startActivity(intent)
        }

        milkAndHoneyButton.setOnClickListener {
            val intent = Intent(this, MilkAndHoneyMenuActivity::class.java)
            startActivity(intent)
        }

        starbucksButton.setOnClickListener {
            val intent = Intent(this, StarbucksMenuActivity::class.java)
            startActivity(intent)
        }










        }
    }












