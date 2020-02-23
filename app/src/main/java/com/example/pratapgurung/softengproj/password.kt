package com.example.pratapgurung.softengproj

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.View
import android.widget.Button

import kotlinx.android.synthetic.main.activity_password.*

class password : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    fun retClientPassword(view : View){
        val name = findViewById<Button>(R.id.saveBtn).text
        val myIntent = Intent(this, MainActivity::class.java)
        startActivity(myIntent);
        //findViewById<TextView>(R.id.clientFirstNameView).text = "Ryan"
    }

}
