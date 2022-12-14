package com.example.covid19_vaccination_map

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.covid19_vaccination_map.databinding.SplashFragmentBinding
import kotlinx.coroutines.delay

class SplashFragment : Fragment() {
    private lateinit var binding: SplashFragmentBinding
    private lateinit var navController: NavController
    private lateinit var vaccinationViewModel: VaccinationViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SplashFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vaccinationViewModel = ViewModelProvider(this).get(VaccinationViewModel::class.java)
        navController = Navigation.findNavController(view)
    }

    override fun onStart() {
        super.onStart()

        runVaccinationAPI()

        Handler(Looper.getMainLooper()).postDelayed({
            navController.navigate(R.id.action_splashFragment_to_mapFragment)
        }, 5000)

    }

    fun runVaccinationAPI() {
    }
}