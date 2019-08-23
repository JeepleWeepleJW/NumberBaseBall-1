package com.example.numberbaseball

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        init()
    }

    fun init() {
        val logger = Logger.getLogger(MainActivity::class.java.name)
        val randomValue = (1..9).random()
        logger.info("random value $randomValue")
        textTT.text = randomValue.toString()

    }

}
