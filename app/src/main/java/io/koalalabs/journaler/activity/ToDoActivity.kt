package io.koalalabs.journaler.activity

import io.koalalabs.journaler.R

/**
 * Created by serkand on 15/03/2018.
 */
class ToDoActivity :ItemActivity() {
    override val tag: String
        get() = this.localClassName

    override fun getLayout(): Int {
        return R.layout.activity_todo
    }

    override fun getActivityTitle(): Int {
        return R.string.app_name
    }
}