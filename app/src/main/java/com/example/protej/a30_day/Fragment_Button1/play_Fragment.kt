package com.example.protej.a30_day.Fragment_Button1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.protej.a30_day.FragmentHomeScreen4.FragmentUtils
import com.example.protej.a30_day.R
import com.example.protej.a30_day.databinding.FragmentPlayBinding


class play_Fragment : Fragment() {

    private var _binding:FragmentPlayBinding?=null
    private  val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding=FragmentPlayBinding.inflate(inflater,container, false)
        val webR= binding.webView2
        FragmentUtils.webViewSetup(webR)
        webR.loadUrl("https://www.youtube.com/")
        // Inflate the layout for this fragment
        return binding.root
    }


    }
