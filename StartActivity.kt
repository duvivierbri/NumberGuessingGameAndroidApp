package com.example.numberguessinggame

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

import kotlinx.android.synthetic.main.startactivity.*
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class StartActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.startactivity)
        setSupportActionBar(toolbar)
    }

    fun startGame(view: View){ /* THIS IS THE FUNCTION FOR THE START BUTTON TO CHANGE ACTIVITIES/ROOMS*/
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

}
