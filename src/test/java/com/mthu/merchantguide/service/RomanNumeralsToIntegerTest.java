package com.mthu.merchantguide.service;

import com.mthu.merchantguide.component.ValidateRomanNumerals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RomanNumeralsToIntegerTest {

    @Autowired
    ValidateRomanNumerals validateRomanNumerals;
    @Test
    void romanToInteger3Characters() {
        Assertions.assertTrue(validateRomanNumerals.hasThreeRepeatCharacters("III"));
    }

    @Test
    void romanToInteger4Characters() {
        Assertions.assertFalse(validateRomanNumerals.hasThreeRepeatCharacters("IIII"));
    }

    @Test
    void romanToInteger2Characters() {
        Assertions.assertTrue(validateRomanNumerals.hasTwoRepeatCharacters("DD"));
    }

    @Test
    void romanToIntegerHasNoRepeatCharacters() {
        Assertions.assertFalse(validateRomanNumerals.hasTwoRepeatCharacters("LD"));
    }
}