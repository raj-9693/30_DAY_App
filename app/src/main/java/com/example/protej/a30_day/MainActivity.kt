package com.example.protej.a30_day

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.protej.a30_day.FragmentHomeScreen4.FragmentUtils
import com.example.protej.a30_day.FragmentHomeScreen4.FragmentUtils.Companion.loadFragment
import com.example.protej.a30_day.FragmentHomeScreen4.firstFragment1
import com.example.protej.a30_day.FragmentHomeScreen4.fourFragment4
import com.example.protej.a30_day.FragmentHomeScreen4.secondFragment2
import com.example.protej.a30_day.FragmentHomeScreen4.threedFragment3
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button1)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }

        val bottemnavegation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        loadFragment(this, firstFragment1(), R.id.fragment_container)

        bottemnavegation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_rj -> loadFragment(this, secondFragment2(), R.id.fragment_container
                )


                R.id.nav_search
                -> loadFragment(this, firstFragment1(), R.id.fragment_container)

                R.id.nav_profile

                -> FragmentUtils.loadFragment(this, threedFragment3(), R.id.fragment_container)

                R.id.nav_home

                -> FragmentUtils.loadFragment(this, fourFragment4(), R.id.fragment_container)

                else -> false

            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
