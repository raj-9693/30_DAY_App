package com.example.protej.a30_day

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.whenCreated
import com.example.protej.a30_day.FragmentHomeScreen4.FragmentUtils
import com.example.protej.a30_day.FragmentHomeScreen4.FragmentUtils.Companion.loadFragment
import com.example.protej.a30_day.FragmentHomeScreen4.firstFragment1
import com.example.protej.a30_day.Fragment_Button1.car_Fragment
import com.example.protej.a30_day.Fragment_Button1.homeFragment
import com.example.protej.a30_day.Fragment_Button1.play_Fragment
import com.example.protej.a30_day.Fragment_Button1.rj_Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val bottomNavigation=findViewById<BottomNavigationView>(R.id.bottom_navigation)


        loadFragment(this, car_Fragment(), R.id.fragment_container)

        bottomNavigation.setOnItemSelectedListener { item->


            when(item.itemId){
                R.id. nav_rj->FragmentUtils.loadFragment(this, car_Fragment(),R.id.fragment_container)
                R.id.nav_home->FragmentUtils.loadFragment(this, homeFragment(),R.id.fragment_container)
                R.id.nav_profile->FragmentUtils.loadFragment(this,play_Fragment(),R.id.fragment_container)
                R.id.nav_search->FragmentUtils.loadFragment(this,rj_Fragment(),R.id.fragment_container)
                else->false
            }




        }








//        val webR = findViewById<WebView>(R.id.webraj)
//
//        webViewSetup(webR)
//        webR.loadUrl("https://www.codeconvert.ai/")

//        val button=findViewById<Button>(R.id.cearma)
//        val button1=findViewById<Button>(R.id.Broser)
//
//        button.setOnClickListener {
//
//            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE) // Camera kholne ka action
//            startActivity(cameraIntent) // Camera app ko launch karte hain
//        }
//button1.setOnClickListener {
//
//    val intent=Intent(Intent.ACTION_VIEW)
//    intent.data= Uri.parse("https://github.com/raj-9693")
//    startActivity(intent)
//}
        window.statusBarColor = ContextCompat.getColor(this, R.color.bottom_nav_colors)
        window.navigationBarColor = ContextCompat.getColor(this, R.color.white)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    }


