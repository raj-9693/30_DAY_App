package com.example.protej.a30_day.FragmentHomeScreen4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.protej.a30_day.R
import com.example.protej.a30_day.databinding.FragmentThreed3Binding


class threedFragment3 : Fragment() {
    private var _binding: FragmentThreed3Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentThreed3Binding.inflate(inflater, container, false)
rollDice()


        // Inflate the layout for this fragment
        return binding.root
    }
private fun rollDice(){

    binding.button.setOnClickListener {
        val raj = binding.editText3.text.toString().trim()


        if (raj.isNotEmpty() && raj.toIntOrNull() != null) {

            val number = raj.toInt()
            val image = binding.image1
            val mahi = when (number) {


                1 -> {
                    image.setImageResource(R.drawable.baseline_adb_24)
                    "MANGO MRP= 250, Fresh fruit"

                }

                2 -> {
                    image.setImageResource(R.drawable.ic_launcher_foreground)
                    "APple MRP= 160, Fresh fruit"

                }

                3 -> {
                    image.setImageResource(R.drawable.baseline_add_reaction_24)
                    "Banana MRP= 50, Fresh fruit"

                }

                4 -> {
                    image.setImageResource(R.drawable.baseline_airport_shuttle_24)
                    "orange MRP= 300, Fresh fruit"

                }

                else ->{
                    image.setImageResource(R.drawable.baseline_airplanemode_inactive_24)

                    "not fruti Avavle"

                }
            }
            binding.textView2.text = mahi


        } else {

            binding.textView2.text = "galat he"
        }

    }
}

}