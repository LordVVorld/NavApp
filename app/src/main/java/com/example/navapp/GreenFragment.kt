package com.example.navapp

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.navapp.databinding.GreenFragmentBinding

class GreenFragment : BaseFragment(R.layout.green_fragment) {

    private lateinit var binding: GreenFragmentBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = GreenFragmentBinding.bind(view)
        binding.greenButton.setOnClickListener{
            onClick()
        }
    }

    override fun onClick() {
        findNavController().navigate(R.id.action_greenFragment_to_blueFragment)
    }
}