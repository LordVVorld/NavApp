package com.example.navapp

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.navapp.databinding.BlueFragmentBinding

class BlueFragment : BaseFragment(R.layout.blue_fragment) {
    private lateinit var binding: BlueFragmentBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = BlueFragmentBinding.bind(view)
        binding.blueButton.setOnClickListener{
            onClick()
        }
    }

    override fun onClick() {
        findNavController().navigate(R.id.action_blueFragment_to_redFragment)
    }
}