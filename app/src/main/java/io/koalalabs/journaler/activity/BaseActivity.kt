package io.koalalabs.journaler.activity

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_header.*

/**
 * Created by serkand on 15/03/2018.
 */
abstract class BaseActivity : FragmentActivity() {
    protected abstract val tag:String
    protected abstract fun getLayout():Int
    protected abstract fun getActivityTitle():Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
        activity_title.setText(getActivityTitle())
        Log.v(tag,"${this.localClassName} ON CREATE")
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        Log.v(tag, "${this.localClassName} ON POST CREATE")
    }

    override fun onStart() {
        super.onStart()
        Log.v(tag, "${this.localClassName} ON START")
    }

    override fun onResume() {
        super.onResume()
        Log.v(tag, "${this.localClassName} ON RESUME")
    }

    override fun onPause() {
        super.onPause()
        Log.v(tag, "${this.localClassName} ON PAUSE")
    }

    override fun onStop() {
        super.onStop()
        Log.v(tag, "${this.localClassName} ON STOP")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(tag, "${this.localClassName} ON DESTROY")
    }

    override fun onPostResume() {
        super.onPostResume()
        Log.v(tag, "${this.localClassName} ON POST RESUME")
    }
}