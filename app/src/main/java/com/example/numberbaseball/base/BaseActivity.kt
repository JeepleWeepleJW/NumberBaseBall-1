package com.example.numberbaseball.base

import android.content.Context
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

    protected fun @receiver:StringRes Int.toast(context: Context){
        getString(this).toast(context)
    }

    private fun String.toast(context: Context) {
        Toast.makeText(context, this, Toast.LENGTH_LONG).show()
    }
}