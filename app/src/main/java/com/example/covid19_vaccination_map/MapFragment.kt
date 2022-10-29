package com.example.covid19_vaccination_map

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.covid19_vaccination_map.databinding.MapFragmentBinding
import com.naver.maps.geometry.LatLng
import com.naver.maps.map.CameraPosition
import com.naver.maps.map.NaverMap
import com.naver.maps.map.OnMapReadyCallback

class MapFragment : Fragment(), OnMapReadyCallback {
    private lateinit var binding: MapFragmentBinding
    private lateinit var naverMap: NaverMap

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MapFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onMapReady(map: NaverMap) {
        naverMap = map

        var pos = CameraPosition(
            LatLng(37.5300106, 126.9262812),
            9.0)

        naverMap.cameraPosition = pos
    }
}