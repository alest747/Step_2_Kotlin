package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var tvText: TextView? = null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            var alphaList = mutableListOf<Char>()
            var simvols = 'A'..'Z'

            for(tipe in simvols){
                alphaList.add(tipe)
                print(" $tipe")
                }




        tvText = findViewById(R.id.TvText)
        tvText?.setText(alphaList.toString())


    }


}
