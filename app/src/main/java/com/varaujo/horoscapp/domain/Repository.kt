package com.varaujo.horoscapp.domain

import com.varaujo.horoscapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign:String): PredictionModel?
}