package com.varaujo.horoscapp.ui.provides

import org.junit.Assert.*
import org.junit.Test

class RandomCardProviderTest {

    @Test
    fun getRandomCardShouldReturnARandomCard(){
        val randomCard = RandomCardProvider()

        val card = randomCard.getLucky()

        assertNotNull(card)
    }
}