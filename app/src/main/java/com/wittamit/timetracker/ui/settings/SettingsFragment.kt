package com.wittamit.timetracker.ui.settings

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.wittamit.timetracker.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }
}