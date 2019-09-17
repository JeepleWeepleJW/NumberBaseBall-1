package com.example.numberbaseball

import android.os.Bundle
import com.example.numberbaseball.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import timber.log.Timber

class MainActivity : BaseActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    private fun initView() {
        // 버튼 클릭 시 숫자를 랜덤하게 보여줌
        btn_get_random_number.setOnClickListener {
            tv_random_number.text = getBaseballNumber()
        }

        btn_check_answer.setOnClickListener {
            checkNumberBaseBallAnswer()
        }
    }

    private fun checkNumberBaseBallAnswer() {
        val checkInputNumber = et_input_number_baseball_answer.text.toString()
        when {
            checkInputNumber.isBlank() -> R.string.main_activity_please_input_data.toast(this)
            checkInputNumber.length != 3 -> R.string.main_activity_please_input_three_number.toast(this)
            else -> Timber.d("입력한 값 : $checkInputNumber")
        }
    }

    /**
     * 숫자 야구때 사용할 번호 반환
     */
    private fun getBaseballNumber(): String {

        val numberMap = mutableMapOf<Int, Int>()

        while (true) {
            // (n..m).random 은 1 부터 9 까지의 랜덤한 숫자를 반환
            val randomTemp = (1..9).random()
            numberMap[randomTemp] = randomTemp

            if (numberMap.size == 3) {
                break
            }
        }

        Timber.d("숫자 야구 숫자 : ${numberMap.values}")
        return numberMap.values.toString()

    }

}
