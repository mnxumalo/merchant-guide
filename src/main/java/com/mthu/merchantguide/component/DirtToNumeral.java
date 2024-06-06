package com.mthu.merchantguide.component;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DirtToNumeral {
    Map<String, String> symbolValues = new HashMap<>();

    public DirtToNumeral() {
        symbolValues.put("glob", "I");
        symbolValues.put("prok", "V");
        symbolValues.put("pish", "X");
        symbolValues.put("tegj", "L");
    }

    public Map<String, String> getSymbolValues(){
        return symbolValues;
    }
}
