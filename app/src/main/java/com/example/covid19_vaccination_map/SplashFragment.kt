package com.example.covid19_vaccination_map

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.covid19_vaccination_map.databinding.SplashFragmentBinding

class SplashFragment : Fragment() {
    private lateinit var binding: SplashFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SplashFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

}