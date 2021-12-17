package com.example.testing



import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "",
            password = "123",
            confirmedPassword = "123"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `valid username  and correctly repeated password  returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Anurag",
            password = "123",
            confirmedPassword = "123"
        )
        assertThat(result).isTrue()
    }
    @Test
    fun ` username  already exists return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "joy",
            password = "123",
            confirmedPassword = "123"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `empty password return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Anurag",
            password = "",
            confirmedPassword = ""
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `incorrect confirmed password  returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Anurag",
            password = "123",
            confirmedPassword = "abcdef"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun `password  contains less than two digit  returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Anurag",
            password = "abcderf1",
            confirmedPassword = "abcderf1"
        )
        assertThat(result).isFalse()
    }
}