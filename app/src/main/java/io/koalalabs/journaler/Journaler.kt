package io.koalalabs.journaler

import android.app.Application
import android.content.Context
import android.util.Log

/**
 * Created by serkand on 15/03/2018.
 */
class Journaler : Application() {
    companion object {
        val tag = "Journaler"
        var ctx:Context? = null
    }

    override fun onCreate() {
        super.onCreate()
        ctx = applicationContext
        Log.v(tag,"[APPLICATION ON CREATE]")
    }

    override fun onLowMemory() {
        super.onLowMemory()
        Log.w(tag,"[ON LOW MEMORY]")
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
        Log.d(tag, "[ON TRIM MEMORY]")
    }
}