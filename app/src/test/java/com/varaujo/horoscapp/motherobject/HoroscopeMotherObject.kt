package com.varaujo.horoscapp.motherobject

import com.varaujo.horoscapp.data.network.response.PredictionResponse
import com.varaujo.horoscapp.domain.model.HoroscopeInfo.Aquarius
import com.varaujo.horoscapp.domain.model.HoroscopeInfo.Aries
import com.varaujo.horoscapp.domain.model.HoroscopeInfo.Cancer
import com.varaujo.horoscapp.domain.model.HoroscopeInfo.Capricorn
import com.varaujo.horoscapp.domain.model.HoroscopeInfo.Gemini
import com.varaujo.horoscapp.domain.model.HoroscopeInfo.Leo
import com.varaujo.horoscapp.domain.model.HoroscopeInfo.Libra
import com.varaujo.horoscapp.domain.model.HoroscopeInfo.Pisces
import com.varaujo.horoscapp.domain.model.HoroscopeInfo.Sagittarius
import com.varaujo.horoscapp.domain.model.HoroscopeInfo.Scorpio
import com.varaujo.horoscapp.domain.model.HoroscopeInfo.Taurus
import com.varaujo.horoscapp.domain.model.HoroscopeInfo.Virgo

object HoroscopeMotherObject {

    val anyResponse = PredictionResponse("date","prediction","taurus")

    val horoscopeInfoList = listOf(
        Aries,
        Taurus,
        Gemini,
        Cancer,
        Leo,
        Virgo,
        Libra,
        Scorpio,
        Sagittarius,
        Capricorn,
        Aquarius,
        Pisces
    )
}