package io.koalalabs.journaler.fragment

import io.koalalabs.journaler.R

/**
 * Created by serkand on 16/03/2018.
 */
class ManuelFragment:BaseFragment() {
    override val logTag: String
        get() = this.javaClass.simpleName

    override fun getLayout(): Int {
        return R.layout.fragment_manuel
    }
}