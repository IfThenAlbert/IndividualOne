package com.fsc.individualone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class RegisterScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_screen)
    }

    fun onRegisterButtonTap(v: View) {

        // grab all the views
        var newFirstName:EditText = findViewById(R.id.inp_new_first)
        var newLastName:EditText = findViewById(R.id.inp_new_last)
        var newPassword:EditText = findViewById(R.id.inp_new_pass)

        // check for dummy inputs
        if(newFirstName.text.toString().isEmpty() || newLastName.text.toString().isEmpty() ||
            newPassword.text.toString().isEmpty() ){
            Toast.makeText(applicationContext,"Please fill out all the form",Toast.LENGTH_SHORT).show()
        }else{
            if(newFirstName.text.toString().length <= 2 || newLastName.text.toString().length <= 2 ||
                newPassword.text.toString().length <= 4){

                if(newPassword.text.toString().length <= 4) {
                    Toast.makeText(applicationContext,"Password must be more than 4 characters",Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(applicationContext,"Please fill out the form properly",Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(applicationContext,"SUCCESSFULLY ADDED!",Toast.LENGTH_SHORT).show()

                var goToLogin:Intent = Intent(applicationContext,MainScreen::class.java)
                startActivity(goToLogin)
            }
        }
    }
}