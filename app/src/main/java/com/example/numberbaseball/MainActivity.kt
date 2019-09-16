package com.example.numberbaseball

import android.os.Bundle
import android.util.Log
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
            tv_random_number.text = setBaseballNumber()

        }
    }

    /**
     * 숫자 야구때 사용할 번호 세팅
     */
    private fun setBaseballNumber(): String {

        val numberMap = mutableMapOf<Int, Int>()

        while (true) {
            // (n..m).random 은 1 부터 9 까지의 랜덤한 숫자를 반환
            val randomTemp = (1..9).random()
            numberMap[randomTemp] = randomTemp

            Log.d("MainActivity", "numberMap 데이터 : " + numberMap.values)

            if (numberMap.size == 3) {
                break
            }
        }

        return numberMap.values.toString()

    }

}
