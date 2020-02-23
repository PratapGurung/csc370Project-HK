package com.example.pratapgurung.softengproj

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    //
    fun setFirstName(view : View){
        val myIntent = Intent(this, firstName::class.java)
        startActivity(myIntent);
        //findViewById<TextView>(R.id.clientFirstNameView).text = "Ryan"
    }

    //
    fun setSecondName(view : View){
        val myIntent = Intent(this, secondName::class.java)
        startActivity(myIntent);
        //findViewById<TextView>(R.id.clientFirstNameView).text = "Ryan"
    }
    fun setPassword(view : View){
        val myIntent = Intent(this, password::class.java)
        startActivity(myIntent);
        //findViewById<TextView>(R.id.clientFirstNameView).text = "Ryan"
    }

    fun setPhoneNumber(view : View){
        val myIntent = Intent(this, phoneNumber::class.java)
        startActivity(myIntent);
        //findViewById<TextView>(R.id.clientFirstNameView).text = "Ryan"
    }

    fun setEmail(view : View){
        val myIntent = Intent(this, phoneNumber::class.java)
        startActivity(myIntent);
        //findViewById<TextView>(R.id.clientFirstNameView).text = "Ryan"
    }
}
