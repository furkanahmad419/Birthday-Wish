package com.example.intentsexplicitimplicit

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.google.android.material.textfield.TextInputLayout

class Wishes : AppCompatActivity() {

    lateinit var inName:TextView
    lateinit var inage:TextView

    lateinit var img:ImageView
    lateinit var img_cake:ImageView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wishes)

        /**
         * id find
         */

        inName = findViewById(R.id.in_bdayname)
        inage = findViewById(R.id.in_bdayage)
        img = findViewById(R.id.wishes_img)
        img_cake = findViewById(R.id.wishes_cake_img)


        /**
         * get text code
         */
        val i = intent
        val i_n = i.getStringExtra("name_date")
        inName.text = i_n

        val i2 = intent
        val ig = i2.getStringExtra("name_age")

        inage.text = "$ig Th Birthday"

        /**
         * animation code
         */

        val animationFadeOut = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
        animationFadeOut.repeatMode
        inName.startAnimation(animationFadeOut)


        /**
         * image to gif code
         */

        Glide.with(this).load(R.drawable.bdaytwo).into(img)
        Glide.with(this).load(R.drawable.bdaycaketwo).into(img_cake)


    }
}