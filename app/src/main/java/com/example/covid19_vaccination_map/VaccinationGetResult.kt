package com.example.covid19_vaccination_map

data class VaccinationGetResult(
    val currentCount: Int,
    val data: List<VaccinationCenterData>,
    val matchCount: Int,
    val page: Int,
    val perPage: Int,
    val totalCount: Int
)

data class VaccinationCenterData(
    val address: String,
    val centerName: String,
    val centerType: String,
    val createdAt: String,
    val facilityName: String,
    val id: Int,
    val lat: String,
    val lng: String,
    val org: String,
    val phoneNumber: String,
    val sido: String,
    val sigungu: String,
    val updatedAt: String,
    val zipCode: String
)