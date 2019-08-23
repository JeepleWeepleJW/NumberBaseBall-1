package com.example.numberbaseball

import com.example.numberbaseball.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.logging.Logger

class MainActivity : BaseActivity(R.layout.activity_main) {

    private val logger = Logger.getLogger(MainActivity::class.java.name)

    override fun createAfterInit() {
        val randomValue = (1..9).random()
        logger.info("random value $randomValue")
        tvRandomText.text = randomValue.toString()
    }
}
