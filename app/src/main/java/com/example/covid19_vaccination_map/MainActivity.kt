package com.example.covid19_vaccination_map

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.covid19_vaccination_map.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.URLDecoder

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController = Navigation.findNavController(this, R.id.nav_host_fragment)

        runAPI()
    }

    fun runAPI() {
        // 레트로핏 생성
        val retrofit = Retrofit.Builder()
            .baseUrl(BuildConfig.VACCINATION_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        // 레트로핏 생성 & 실행
        val page: Int = 1
        val perPage: Int = 3
        val returnType: String = "JSON"

        retrofit.create(VaccinationAPIService::class.java)
            .getVaccinations(page, perPage, returnType, URLDecoder.decode(BuildConfig.VACCINATION_KEY, "UTF-8"))
            .enqueue(object : Callback<VaccinationGetResult> {
                override fun onResponse(
                    call: Call<VaccinationGetResult>,
                    response: Response<VaccinationGetResult>
                ) {
                    val result: VaccinationGetResult? = response.body()
//                    Log.d("성공", "성공 : ${response.raw()}")
                }

                override fun onFailure(call: Call<VaccinationGetResult>, t: Throwable) {
//                    Log.d("실패", "실패 : $t")
                }
            })
    }
}