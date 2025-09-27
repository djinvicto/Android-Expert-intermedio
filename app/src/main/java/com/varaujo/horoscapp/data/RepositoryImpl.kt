package com.varaujo.horoscapp.data

import android.util.Log
import com.varaujo.horoscapp.data.network.HoroscopeApiService
import com.varaujo.horoscapp.domain.Repository
import com.varaujo.horoscapp.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("Prueba", "Ha ocurrido un error {it.message}") }
        return null
    }
}