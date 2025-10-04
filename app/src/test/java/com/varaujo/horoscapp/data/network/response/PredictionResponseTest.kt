package com.varaujo.horoscapp.data.network.response

import com.varaujo.horoscapp.motherobject.HoroscopeMotherObject
import io.kotlintest.shouldBe
import org.junit.Test


class PredictionResponseTest {

    @Test
    fun toDomainShouldReturnACorrectPredictionModel(){

        //Given
        //val horoscopeResponse = HoroscopeMotherObject.anyResponse.copy(sign="libra")
        val horoscopeResponse = HoroscopeMotherObject.anyResponse
        //When
        val predictionModel = horoscopeResponse.toDomain()
        //Then
        predictionModel.sign shouldBe horoscopeResponse.sign
        predictionModel.horoscope shouldBe horoscopeResponse.horoscope
    }

}