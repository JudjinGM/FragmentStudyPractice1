package com.example.fragmentstudypractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentstudypractice.databinding.FragmentRegistrationBinding

class FragmentRegistration : Fragment() {
    private var _binding: FragmentRegistrationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegistrationBinding.inflate(inflater, container, false)

        binding.registrationBackButton.setOnClickListener {
            activity?.onBackPressedDispatcher?.onBackPressed()
        }
        return binding.root
    }
}