package com.example.pratapgurung.softengproj

import android.app.Activity
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteDatabase.openOrCreateDatabase
import java.util.*

//since we are using text to grab user enetered data
 fun Activity.importDatabase(db_name:String){
    val db: SQLiteDatabase = openOrCreateDatabase(db_name, Context.MODE_PRIVATE, null)
    val resId:Int = resources.getIdentifier(db_name, "raw", packageName)
    val scan = Scanner(resources.openRawResource(resId))

    //build and execute queries
    var query = ""
    while(scan.hasNextLine()){
        val line = scan.nextLine()
        if(line.trim().startsWith("--")) continue //strip comments
        query += "$line\n"
        if(query.trim().endsWith(";")){
            db.execSQL(query)
            query = ""
        }
    }
}