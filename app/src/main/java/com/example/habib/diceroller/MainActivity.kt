package com.example.habib.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var btn : Button
    lateinit var img : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        img = findViewById(R.id.img_dice)
        btn = findViewById(R.id.btn_roll)
        btn.setOnClickListener {
            diceRoll()
        }
    }

    private fun diceRoll() {
        val random = Random().nextInt(6) + 1
        var dice = when(random){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        img.setImageResource(dice)
    }
}
