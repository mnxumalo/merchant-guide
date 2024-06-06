package com.mthu.merchantguide.service;

import com.mthu.merchantguide.component.ValidateRomanNumerals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class RomanNumeralsToInteger implements RomanNumeralsToInt {
    private final ValidateRomanNumerals validateRomanNumerals;

    @Autowired
    public RomanNumeralsToInteger(ValidateRomanNumerals validateRomanNumerals) {
        this.validateRomanNumerals = validateRomanNumerals;
    }

    @Override
    public int romanToInteger(String roman) {

        if(validateRomanNumerals.hasThreeRepeatCharacters(roman)){
            throw new IllegalArgumentException("Invalid roman numeral: " + roman);
        }

        if(validateRomanNumerals.hasTwoRepeatCharacters(roman)){
            throw new IllegalArgumentException("Invalid roman numeral: " + roman);
        }

        int[] storeInt = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] storeRoman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int num = 0;

        for (int i = 0; i < storeRoman.length; i++) {
            while (roman.startsWith(storeRoman[i])) {
                num += storeInt[i];
                roman = roman.substring(storeRoman[i].length());
            }
        }

        return num;
    }
}
