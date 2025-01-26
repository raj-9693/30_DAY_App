package com.example.protej.a30_day.FragmentHomeScreen4

import android.media.Image
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.protej.a30_day.R

class FragmentUtils {

    companion object {

        fun loadFragment(
            activity: AppCompatActivity,
            fragment: Fragment,
            containerId: Int
        ): Boolean {
            activity.supportFragmentManager.beginTransaction()
                .replace(containerId, fragment)
                .commit()
            return true
        }

        fun webViewSetup(webView: WebView) {
            // WebViewClient सेट करें ताकि URL WebView के अंदर ही खुले
            webView.webViewClient = WebViewClient()

            // WebView की सेटिंग्स को कस्टमाइज़ करें
            webView.apply {
                settings.javaScriptEnabled = true // JavaScript सपोर्ट चालू करें
                settings.domStorageEnabled = true // DOM Storage सक्षम करें
                settings.useWideViewPort = true // Content को स्क्रीन के हिसाब से सेट करें
                settings.loadWithOverviewMode = true  // Zoom आउट व्यू सक्षम करें

            }
        }
    }


        }



