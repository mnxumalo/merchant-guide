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
class IntergalaxyGoldImplementationTest {

    @Autowired
    IntergalaxyGoldImplementation intergalaxyGoldImplementation;
    @Test
    void convert_glob_prok_gold() {
        List<Metals> metals = new ArrayList<>();

        DirtMetal glob = new DirtMetal("glob", "I");
        metals.add(glob);
        DirtMetal prok = new DirtMetal("prok", "V");
        metals.add(prok);

        Assertions.assertEquals(23120.0, intergalaxyGoldImplementation.convert(metals));
    }
}