package com.mthu.merchantguide.service;

import com.mthu.merchantguide.model.Metals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntergalaxyDirtImplementation implements Intergalaxy{
    private final RomanNumeralsToInt romanNumeralsToInteger;

    @Autowired
    public IntergalaxyDirtImplementation(RomanNumeralsToInt romanNumeralsToInteger) {
        this.romanNumeralsToInteger = romanNumeralsToInteger;
    }

    @Override
    public double convert(List<Metals> metals) {

        StringBuilder romanNumeral = new StringBuilder();
        for (Metals metal : metals){

            romanNumeral.append(metal.getRomanNumeral());

        }
        return romanNumeralsToInteger.romanToInteger(romanNumeral.toString());
    }


}
