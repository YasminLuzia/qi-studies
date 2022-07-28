package yasmin.luzia.exretrofit

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabsPagerAdapter(fragmentManager: FragmentManager,
                       lifeCycle: Lifecycle,
                       private var numberOfTabs: Int) : FragmentStateAdapter(fragmentManager, lifeCycle) {

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> FragmentSearchSpellByClass.newInstance("title fragment search spell by class", "xxx")
            1 -> FragmentSearchSpell.newInstance("title fragment search spell", "xxx")
            else -> FragmentSearchSpellByClass()
        }
    }

    override fun getItemCount(): Int {
        return numberOfTabs
    }
}