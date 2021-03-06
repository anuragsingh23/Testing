package com.example.testing

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before

import org.junit.Test

class ResourceComparerTest {


    private lateinit var resourceComparer: ResourceComparer


    @Before
    fun setup(){
        resourceComparer = ResourceComparer()
    }

    @After
    fun tearDown(){

    }

    @Test
    fun stringResourceSameAsGivenString_ReturnTrue() {

        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name, "Testing")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentAsGivenString_ReturnTrue() {

        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name, "hello")
        assertThat(result).isFalse()
    }
}