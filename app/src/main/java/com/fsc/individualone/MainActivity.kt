package com.fsc.individualone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
             var goScreen:Intent = Intent(applicationContext,MainScreen::class.java)
            startActivity(goScreen)
        },4000)
    }

    // preent user from going back
    override fun onBackPressed() {

    }
}