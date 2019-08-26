package com.example.numberbaseball

import android.os.Bundle
import com.example.numberbaseball.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    private fun initView() {
        // 버튼 클릭 시 숫자를 랜덤하게 보여줌
        btn_get_random_number.setOnClickListener {
            tv_random_number.text = getRandomNumber()
        }
    }

    /**
     * Single-expression functions
     * 1~9 사이의 랜덤숫자를 반환
     */
    private fun getRandomNumber(): String = (1..9).random().toString()
}
