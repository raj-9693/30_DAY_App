package com.example.protej.a30_day.FragmentHomeScreen4

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class FragmentUtils {

        companion object {
            fun loadFragment(activity: AppCompatActivity, fragment: Fragment, containerId: Int): Boolean {
                activity.supportFragmentManager.beginTransaction()
                    .replace(containerId, fragment)
                    .commit()
                return true
            }
        }
    }

