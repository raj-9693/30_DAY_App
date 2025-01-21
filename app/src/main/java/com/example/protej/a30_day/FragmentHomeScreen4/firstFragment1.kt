package com.example.protej.a30_day.FragmentHomeScreen4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.protej.a30_day.R
import com.example.protej.a30_day.databinding.FragmentFirst1Binding


class firstFragment1 : Fragment() {
private var _binding:FragmentFirst1Binding?=null
    private val binding get()=_binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding=FragmentFirst1Binding.inflate(inflater,container, false)

        binding.buttonnumber.setOnClickListener {
            val result = binding.editText.text.toString().trim()

            // पहले यह चेक करें कि result खाली न हो और यह एक वैध संख्या हो
            if (result.isNotEmpty() && result.toIntOrNull() != null) {
                val number = result.toInt() // result को Int में कन्वर्ट करें

                val sum = when (number){
                     in 0..33 -> "Fail"
                     in 34..45 -> "Good"
                     in 46..60 -> "Very Good"
                     in 61..100 -> "Nice"
                    else -> "Invalid Input" // अगर नंबर 0-100 के बाहर हो
                }

                binding.textnumber.text = sum
            } else {
                binding.textnumber.text = "Please enter a valid number" // अगर input सही न हो
            }
        }




        return binding.root
    }


    }
