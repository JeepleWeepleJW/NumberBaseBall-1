package com.example.numberbaseball.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by jiwun on 2019-08-23.
 *
 * 모든 액티비티에서 사용할 공통 액티비티
 *
 * @param layoutId 레이아웃 아이디
 */
abstract class BaseActivity(
    @LayoutRes
    private val layoutId: Int
) : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)
    }
}