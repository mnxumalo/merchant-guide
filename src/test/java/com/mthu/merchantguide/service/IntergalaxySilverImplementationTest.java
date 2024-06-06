package com.mthu.merchantguide.service;

import com.mthu.merchantguide.model.DirtMetal;
import com.mthu.merchantguide.model.Metals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class IntergalaxySilverImplementationTest {

    @Autowired
    Intergalaxy intergalaxySilverImplementation;
    @Test
    void convert_glob_glob_silver() {
        List<Metals> metals = new ArrayList<>();

        DirtMetal glob = new DirtMetal("prok", "V");
        metals.add(glob);
        metals.add(glob);
        DirtMetal silver = new DirtMetal("Silver", "Z");
        metals.add(silver);
        Assertions.assertEquals(34.0, intergalaxySilverImplementation.convert(metals));
    }

    @Test
    void convert_glob_prok_silver() {
        List<Metals> metals = new ArrayList<>();

        DirtMetal glob = new DirtMetal("glob", "I");
        metals.add(glob);
        DirtMetal prok = new DirtMetal("prok", "V");
        metals.add(prok);
        DirtMetal silver = new DirtMetal("Silver", "");
        metals.add(silver);
        Assertions.assertEquals(13.6, intergalaxySilverImplementation.convert(metals));
    }
}