package yasmin.luzia.exretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_search_spell.*

class SearchSpellActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_spell)

        val numberOfTabs = 2

        searchSpellTabLayout.setSelectedTabIndicatorColor(getColor(R.color.brown500))
        searchSpellTabLayout.setBackgroundColor(getColor(R.color.blue500))
        searchSpellTabLayout.tabTextColors = getColorStateList(R.color.brown500)

        searchSpellTabLayout.tabGravity = TabLayout.GRAVITY_FILL
        searchSpellTabLayout.tabMode = TabLayout.MODE_FIXED
        searchSpellTabLayout.isInlineLabel = true

        val adapter = TabsPagerAdapter(supportFragmentManager, lifecycle, numberOfTabs)

        searchSpellViewPager.adapter = adapter
        searchSpellViewPager.isUserInputEnabled = true

        TabLayoutMediator(searchSpellTabLayout, searchSpellViewPager) { tab, position ->
            when(position) {
                0 -> tab.text = getString(R.string.fragment_title_search_spell_by_class)
                1 -> tab.text = getString(R.string.fragment_title_search_spell_individually)
            }
        }.attach()
    }
}