package io.koalalabs.journaler.activity

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import io.koalalabs.journaler.Journaler
import io.koalalabs.journaler.R
import io.koalalabs.journaler.fragment.ItemsFragment
import kotlinx.android.synthetic.main.activity_main.*

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pager.adapter = ViewPagerAdapter(supportFragmentManager)
        /**
         * handle with a FrameLayout
         *
        val items = ItemsFragment()
        supportFragmentManager.beginTransaction().add(R.id.fragment_container, items).commit()
        filter_menu.setText("H")
        filter_menu.setOnClickListener {
            val manuel = ManuelFragment()
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, manuel).addToBackStack(manuel.tag).commit()
        }
        **/
    }
}

private class ViewPagerAdapter(manager: FragmentManager) : FragmentStatePagerAdapter(manager) {
    override fun getItem(position: Int): Fragment {
        return ItemsFragment()
    }

    override fun getCount(): Int {
        return 5
    }
}