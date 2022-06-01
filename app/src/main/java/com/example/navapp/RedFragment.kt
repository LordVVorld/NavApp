package com.example.navapp

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.navapp.databinding.RedFragmentBinding

class RedFragment : BaseFragment(R.layout.red_fragment) {
    private lateinit var binding: RedFragmentBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = RedFragmentBinding.bind(view)
        binding.redButton.setOnClickListener{
            onClick()
        }
    }

    override fun onClick() {
        findNavController().navigate(R.id.action_redFragment_to_greenFragment)
    }
}