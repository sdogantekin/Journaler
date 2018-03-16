package io.koalalabs.journaler.activity

import io.koalalabs.journaler.Journaler
import io.koalalabs.journaler.R

/**
 * Created by serkand on 15/03/2018.
 */
class MainActivity: BaseActivity() {
    override val tag = Journaler.tag

    override fun getLayout(): Int {
        return R.layout.activity_main
    }

    override fun getActivityTitle(): Int {
        return R.string.app_name
    }
}