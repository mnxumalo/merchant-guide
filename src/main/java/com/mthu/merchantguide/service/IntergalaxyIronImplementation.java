package com.mthu.merchantguide.service;

import com.mthu.merchantguide.model.Metals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IntergalaxyIronImplementation implements Intergalaxy{
    private final RomanNumeralsToInt romanNumeralsToInteger;
    private final double IRON = 195.5;

    @Autowired
    public IntergalaxyIronImplementation(RomanNumeralsToInt romanNumeralsToInteger) {
        this.romanNumeralsToInteger = romanNumeralsToInteger;
    }

    @Override
    public double convert(List<Metals> metals) {

        StringBuilder romanNumeral = new StringBuilder();
        for (Metals metal : metals){

            romanNumeral.append(metal.getRomanNumeral());

        }
        return romanNumeralsToInteger.romanToInteger(romanNumeral.toString()) * IRON;
    }


}
