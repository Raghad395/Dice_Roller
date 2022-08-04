package com.example.myfirstapplication
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // must have if we delete it > no interface UI
        setContentView(R.layout.activity_main)
        // reference
        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener {
            rollDice()
        }
        /* notification message
            Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT).show()
            numberText.text = roll().toString() // in java > setText */
    }
/**
 * Roll the dice and update the screen with the result.
 */
private fun rollDice() {
    // create object from class Dice
    val dice = Dice(6)
    // save the result number from fun roll()
    val diceRoll = dice.roll()
    // reference to imageView
    val diceImage : ImageView = findViewById(R.id.img_dice) //R > means reference to resources file
    // check number and update screen (UI)
    when (diceRoll) {
        1 -> diceImage.setImageResource(R.drawable.dice_1)
        2 -> diceImage.setImageResource(R.drawable.dice_2)
        3 -> diceImage.setImageResource(R.drawable.dice_3)
        4 -> diceImage.setImageResource(R.drawable.dice_4)
        5 -> diceImage.setImageResource(R.drawable.dice_5)
        6 -> diceImage.setImageResource(R.drawable.dice_6)
    } // End when
} // End rollDice()
    }

/* link: when expression kotlin
    the final result with when we save it in value so we can use it anywhere in the code
    val imageResult = when(diceRoll){
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6 // we should have else with when expression

        // Update the Imageview with the correct drawable resources
        diceImage.setImageResource(imageResult)
     */
