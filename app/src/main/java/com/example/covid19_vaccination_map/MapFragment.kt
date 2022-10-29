package com.example.covid19_vaccination_map

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.covid19_vaccination_map.databinding.MapFragmentBinding

class MapFragment : Fragment() {
    private lateinit var binding: MapFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MapFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}