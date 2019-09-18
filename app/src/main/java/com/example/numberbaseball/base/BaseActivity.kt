package com.example.numberbaseball.base

import android.os.Bundle
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity(
    @LayoutRes
    private val layoutId: Int
) : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutId)
    }

    protected fun @receiver:StringRes Int.toast() {
        getString(this).toast()
    }

    private fun String.toast() {
        Toast.makeText(this@BaseActivity, this, Toast.LENGTH_LONG).show()
    }
}