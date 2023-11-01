package com.example.intentsexplicitimplicit

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout
import java.util.Calendar

class MainActivity : AppCompatActivity() {


    lateinit var name:TextInputLayout
    lateinit var age:TextInputLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.name_bday)
        age = findViewById(R.id.age_bday)

    }

    fun Wishes_Scr(view: View) {
        val n:String = name.editText?.text.toString()
        val a: String = age.editText?.text.toString()

        val i = Intent(this,Wishes::class.java)
        i.putExtra("name_date", n)
        i.putExtra("name_age", a)
        startActivity(i)

    }

    fun Open_map(view: View) {

        val gmmIntentUri = Uri.parse("google.streetview:cbll=46.414382,10.013988")
        val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
        mapIntent.setPackage("com.google.android.apps.maps")
        startActivity(mapIntent)

    }


}