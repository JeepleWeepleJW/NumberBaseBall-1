package com.example.numberbaseball.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by jiwun on 2019-08-23.
 */
abstract class BaseActivity(@LayoutRes val layoutId:Int) : AppCompatActivity() {

    /**
     * onCreate 이후 초기화하는 메소드
     */
    abstract fun createAfterInit()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)

        createAfterInit()
    }


}