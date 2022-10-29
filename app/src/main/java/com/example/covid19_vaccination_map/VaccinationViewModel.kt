package com.example.covid19_vaccination_map

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class VaccinationViewModel : ViewModel() {
    private var data = MutableLiveData<String>()

    init {
        data.value = ""
    }
}