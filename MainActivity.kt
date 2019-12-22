package com.example.numberguessinggame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var goalNum = (0..100).random() /* Sets the goal number */
    var totalGuesses = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun gameSetup(){
        goalNum = (0..100).random() /* Sets the goal number */
        totalGuesses = 0;
    }

    /*Function that will run when the Guess button is clicked*/
    fun buttonClick(view: View) {
        var input = numInput.text.toString();
        var guessedNumber = input.toInt()

        Log.d("B", "YOU TYPED: " + guessedNumber)

        if (guessedNumber > goalNum) {
            gameText.setText(""+guessedNumber + " is too high!")
            totalGuesses++
        } else if (guessedNumber < goalNum){
            gameText.setText(""+guessedNumber + " is too low!")
            totalGuesses++
        } else if (guessedNumber == goalNum){
            gameText.setText("HORRAY! YOU GOT IT!!!")
            totalGuesses++
        }
    }

}
