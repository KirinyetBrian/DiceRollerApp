package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.RollDice)
        rollButton.setOnClickListener()
        {
            rollDice ()
        }
        diceImage = findViewById(R.id.Image)

    }
  private fun rollDice () {

    val drawableResource= when (java.util.Random().nextInt(6) + 1)
{
    1->R.drawable.dice_1
    2->R.drawable.dice_2
    3->R.drawable.dice_3
    4->R.drawable.dice_4
    5->R.drawable.dice_5
    else-> R.drawable.dice_6
}
    diceImage.setImageResource(drawableResource)
  }

}