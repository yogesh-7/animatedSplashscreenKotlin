package com.example.animatedsplashscreenkotlin

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom)


        val bgapp = findViewById(R.id.bgapp) as ImageView
        val clover = findViewById(R.id.clover) as ImageView
        val textsplash = findViewById(R.id.textsplash) as LinearLayout
        val texthome = findViewById(R.id.texthome) as LinearLayout
        val menus = findViewById(R.id.menus) as LinearLayout

        bgapp.animate().translationY(-1900f).setDuration(800).startDelay = 300
        clover.animate().alpha(0f).setDuration(800).startDelay = 600
        textsplash.animate().translationY(140f).alpha(0f).setDuration(800).startDelay = 300

        texthome.startAnimation(frombottom)
        menus.startAnimation(frombottom)


    }
}