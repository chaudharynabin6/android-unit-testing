package com.chaudharynabin6.unit_testing_android

import android.content.Context
import org.junit.After
import org.junit.Before
import org.junit.Test
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat


class ResourceComparerTest {

    private lateinit var resourceComparer: ResourceComparer
    private lateinit var context : Context
    @Before
    fun setUp() {
        resourceComparer = ResourceComparer()
        context = ApplicationProvider.getApplicationContext()
    }

    @After
    fun tearDown() {
    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue(){
        val result = resourceComparer.isEqual(context, R.string.app_name, "unit-testing-android")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentAsGivenString_returnsFalse() {
        val result = resourceComparer.isEqual(context, R.string.app_name, "Hello")
        assertThat(result).isFalse()
    }

}