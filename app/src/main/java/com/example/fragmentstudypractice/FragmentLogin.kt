package com.example.fragmentstudypractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentstudypractice.databinding.FragmentLoginBinding

class FragmentLogin : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.registerButton.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container, FragmentRegistration())
                ?.addToBackStack("register")?.setReorderingAllowed(true)?.commit()
        }

        binding.loginButton.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragment_container, FragmentMainScreen())?.setReorderingAllowed(true)
                ?.commit()
        }
        binding.loginTextView.text = "Login Screen $this"
        return binding.root
    }
}