package com.mthu.merchantguide.component;

import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class ValidateNumeralsImplementation implements ValidateRomanNumerals{
    public boolean hasThreeRepeatCharacters(String roman)
    {
        String regex = "\\b([IXCM])\\1\\1\\b";
        Pattern p = Pattern.compile(regex);
        if (roman == null) {
            return false;
        }
        Matcher m = p.matcher(roman);
        return m.matches();
    }

    public boolean hasTwoRepeatCharacters(String roman)
    {
        String regex = "\\b([DLV])\\1\\b";
        Pattern p = Pattern.compile(regex);
        if (roman == null) {
            return false;
        }
        Matcher m = p.matcher(roman);
        return m.matches();
    }




}
