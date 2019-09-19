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
        val inputAnswerSet = mutableSetOf<Int>()
        val oneAnswer = et_input_one_answer.text.toString()
        val twoAnswer = et_input_two_answer.text.toString()
        val threeAnswer = et_input_three_answer.text.toString()

        if (oneAnswer.isBlank() || twoAnswer.isBlank() || threeAnswer.isBlank()) {
            toast(R.string.main_activity_please_input_three_number)
        } else {
            inputAnswerSet.add(oneAnswer.toInt())
            inputAnswerSet.add(twoAnswer.toInt())
            inputAnswerSet.add(threeAnswer.toInt())

            if (inputAnswerSet.size == 3) {

            } else {
                toast(R.string.main_activity_please_input_numbers_not_overlap)
            }
        }
    }

    /**
     * 숫자 야구때 사용할 번호 반환
     */
    private fun getBaseballNumber(): String {

        val numberSet = mutableSetOf<Int>()

        while (true) {
            // (n..m).random 은 1 부터 9 까지의 랜덤한 숫자를 반환
            val randomTemp = (1..9).random()
            numberSet.add(randomTemp)

            if (numberSet.size == 3) {
                break
            }
        }

        return numberSet.toString()

    }

}
