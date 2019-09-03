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
            tv_random_number.text = initBaseballNumber()

        }
    }

    /**
     * 숫자 야구때 사용할 번호 세팅
     */
    private fun initBaseballNumber(): String {
        val randomList = mutableListOf("-1", "-1", "-1")
        var checkCount = 0

        while (true) {
            val randomTemp = getRandomNumber()
            // 중복 유무 체크
            var notOverlap = false

            for (x in 0..2) {
                if (randomList[x] == randomTemp) {
                    notOverlap = false
                    break
                } else {
                    notOverlap = true
                }
            }

            if (notOverlap) {
                randomList[checkCount] = randomTemp
                checkCount++
            }

            println("랜덤 리스트값 : $randomList")

            if (checkCount >= 3) {
                break
            }
        }

        return randomList.toString()

    }

    /**
     * Single-expression functions
     * (n..m).random 은 n 부터 m 까지의 랜덤한 숫자를 반환
     * 따라서 1~9 사이의 랜덤숫자를 반환
     */
    private fun getRandomNumber(): String = (1..9).random().toString()
}
