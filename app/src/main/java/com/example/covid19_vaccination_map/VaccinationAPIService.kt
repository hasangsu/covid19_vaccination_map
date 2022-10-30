package com.example.covid19_vaccination_map

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface VaccinationAPIService {
    @GET("api/15077586/v1/centers")
    fun getVaccinations(
        @Query("page")page:Int,
        @Query("perPage")perPage:Int,
        @Query("returnType")returnType:String,
        @Query("serviceKey")serviceKey:String
    ) : Call<VaccinationGetResult>
}