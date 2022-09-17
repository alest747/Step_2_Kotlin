package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var tvText: TextView? = null   //переменная для вывода результата на экран смартфона




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



            var alphaList = mutableListOf<Char>()   //создал коллекцию и переменную к ней
            var simvols = 'A'..'Z'                  // переменная с диапазоном

            for(tipe in simvols){                   //цикл добавления значений в коллекцию
                alphaList.add(tipe)
            }
            print(alphaList)                         //проверка результата содержимого коллекции





        tvText = findViewById(R.id.TvText)
        tvText?.setText(alphaList.toString())      //вывод содержимого коллекции на экран смартфона


    }


}
