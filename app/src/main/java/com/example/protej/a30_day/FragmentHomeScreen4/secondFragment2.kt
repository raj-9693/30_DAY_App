package com.example.protej.a30_day.FragmentHomeScreen4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.protej.a30_day.R
import com.example.protej.a30_day.databinding.FragmentSecond2Binding


class secondFragment2 : Fragment() {

private var _binding:FragmentSecond2Binding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {






        _binding= FragmentSecond2Binding.inflate(inflater,container, false)
        binding.buttontable.setOnClickListener {
            val raj = binding.editText2.text.toString().trim()

            if (raj.isNotEmpty() && raj.toIntOrNull() != null) {

                val number = raj.toInt()

                if (number % 2 == 0) {
                    binding.textView.text = "this number is Even number"
                } else {
                    binding.textView.text = "this number is odd number"

                }
            } else {
                val raj3=Toast.makeText(activity,"notsuppori",Toast.LENGTH_SHORT)
                    .show()
                binding.textView.text = " $raj3 not support"


            }
        }
        // Inflate the layout for this fragment
        return binding.root
    }


}