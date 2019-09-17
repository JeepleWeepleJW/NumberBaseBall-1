package com.example.numberbaseball.base

import android.app.Application
import com.example.numberbaseball.BuildConfig
import timber.log.Timber

/**
 * Created by jiwun on 2019-09-17.
 */
class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
        }
    }

}