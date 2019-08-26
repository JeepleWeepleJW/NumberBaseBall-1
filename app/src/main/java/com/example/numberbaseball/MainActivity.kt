package com.example.numberbaseball

import android.os.Bundle
import com.example.numberbaseball.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.logging.Logger

class MainActivity : BaseActivity(R.layout.activity_main) {

    private val logger = Logger.getLogger(MainActivity::class.java.name)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewInit()
    }

    /**
     * 뷰 초기화
     */
    private fun viewInit() {
        val randomValue = (1..9).random()
        logger.info("random value $randomValue")
        tv_random_number.text = randomValue.toString()
    }
}
