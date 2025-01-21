package com.example.protej.a30_day.FragmentHomeScreen4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.protej.a30_day.R
import com.example.protej.a30_day.databinding.FragmentFour4Binding
import com.example.protej.a30_day.databinding.FragmentSecond2Binding


class fourFragment4 : Fragment() {
private var _binding:FragmentFour4Binding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       _binding=FragmentFour4Binding.inflate(inflater,container, false)



        // Inflate the layout for this fragment
        return binding.root
    }


}