package com.varaujo.horoscapp.ui.horoscope

import com.varaujo.horoscapp.data.providers.HoroscopeProvider
import com.varaujo.horoscapp.motherobject.HoroscopeMotherObject.horoscopeInfoList
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class HoroscopeViewModelTest {

    @MockK(relaxed = true)
    lateinit var horoscopeProvider : HoroscopeProvider

    private lateinit var viewModel: HoroscopeViewModel

    @Before
    fun setUp(){
        MockKAnnotations.init(this, relaxUnitFun = true)
    }

    @Test
    fun whenViewModelIsCreatedThenHoroscopesAreLoaded(){
        every {horoscopeProvider.getHoroscopes()} returns horoscopeInfoList
        viewModel = HoroscopeViewModel(horoscopeProvider)

        val horoscopes = viewModel.horoscope.value

        assertTrue(horoscopes.isNotEmpty())

    }
}