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
class IntergalaxyIronImplementationTest {

    @Autowired
    IntergalaxyIronImplementation intergalaxyIronImplementation;

    @Test
    void convert_glob_glob_iron() {
        List<Metals> metals = new ArrayList<>();

        DirtMetal pish = new DirtMetal("pish", "X");
        metals.add(pish);
        DirtMetal pish1 = new DirtMetal("pish", "X");
        metals.add(pish1);

        Assertions.assertEquals(3910.0, intergalaxyIronImplementation.convert(metals));
    }

    @Test
    void convert_glob_prok_iron() {
        List<Metals> metals = new ArrayList<>();

        DirtMetal pish = new DirtMetal("glob", "I");
        metals.add(pish);
        DirtMetal pish1 = new DirtMetal("prok", "V");
        metals.add(pish1);

        Assertions.assertEquals(782.0, intergalaxyIronImplementation.convert(metals));
    }
}