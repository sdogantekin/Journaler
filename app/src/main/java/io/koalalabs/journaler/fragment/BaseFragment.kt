package io.koalalabs.journaler.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by serkand on 16/03/2018.
 */
abstract class BaseFragment: Fragment() {
    protected abstract val logTag:String
    protected abstract fun getLayout():Int

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        Log.d(logTag, "${this.javaClass.simpleName} ON CREATE VIEW")
        return inflater?.inflate(getLayout(), container, false)
    }

    override fun onResume() {
        super.onResume()
        Log.d(logTag, "${this.javaClass.simpleName} ON RESUME")
    }

    override fun onPause() {
        super.onPause()
        Log.d(logTag, "${this.javaClass.simpleName} ON PAUSE")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(logTag, "${this.javaClass.simpleName} ON DESTROY")
    }
}