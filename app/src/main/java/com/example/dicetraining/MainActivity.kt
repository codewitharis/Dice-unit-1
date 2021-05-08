package com.example.dicetraining

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set button and how it react
        val changePicture: Button= findViewById(R.id.button)
        changePicture.setOnClickListener {
            diceRoll()      //perform diceRoll function with no return

        }
    }

    private fun diceRoll() {
        val setDice= Dice(6)      //set side for Dice class

        val theDraw =when(setDice.roll()){    //conditioner for pic selection
            1 -> R.drawable.capture
            2 -> R.drawable.img_1408
            3 -> R.drawable.img_1423
            else -> R.drawable.ic_launcher_foreground
        }
        val myPic : ImageView= findViewById(R.id.imageView2)
        myPic.setImageResource(theDraw)
    }
}

class Dice (val numSide :Int){

    fun roll() :Int {
        return (1..numSide).random()

    }
}