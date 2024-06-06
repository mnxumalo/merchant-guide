package com.mthu.merchantguide.service;

import com.mthu.merchantguide.model.Metals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntergalaxySilverImplementation implements Intergalaxy{
    private final RomanNumeralsToInt romanNumeralsToInteger;
    private final double SILVER = 3.4;

    @Autowired
    public IntergalaxySilverImplementation(RomanNumeralsToInt romanNumeralsToInteger) {
        this.romanNumeralsToInteger = romanNumeralsToInteger;
    }

    @Override
    public double convert(List<Metals> metals) {

        StringBuilder romanNumeral = new StringBuilder();
        for (Metals metal : metals){
            romanNumeral.append(metal.getRomanNumeral());

        }
        return romanNumeralsToInteger.romanToInteger(romanNumeral.toString()) * SILVER;

    }
}
