package com.fsc.individualone

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import java.io.File
import java.io.PrintWriter

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

    }

    // event methods

    // when user clicks login
    fun onLogInClick(v: View) {
        var usernameField:EditText = findViewById(R.id.inp_username)
        var passwordField:EditText = findViewById(R.id.inp_password)

        if(usernameField.text.toString().isEmpty() || passwordField.text.toString().isEmpty()) {
            Toast.makeText(applicationContext,"Please enter username and password",Toast.LENGTH_SHORT).show()
        }else{
            // when the user is okay
            Toast.makeText(applicationContext,"HORRAY YOU ARE LOGGED IN!",Toast.LENGTH_SHORT).show()
        }
    }

    fun onRegisterClick(v: View) {
        var goRegisterScreen = Intent(applicationContext,RegisterScreen::class.java)
        startActivity(goRegisterScreen)
    }

    // device event
    // prevent user from backing up
    override fun onBackPressed() {

    }
}