package com.mthu.merchantguide.service;

import com.mthu.merchantguide.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class IntergalaxyDirtImplementationTest {

    @Autowired
    IntergalaxyDirtImplementation intergalaxyDirtImplementation;
    @Test
    void convert_glob() {
        List<Metals> metals = new ArrayList<>();
        DirtMetal glob = new DirtMetal("glob", "I");
        metals.add(glob);
        Assertions.assertEquals(1.0, intergalaxyDirtImplementation.convert(metals));
    }

    @Test
    void convert_glob_prok() {
        List<Metals> metals = new ArrayList<>();
        DirtMetal glob = new DirtMetal("glob", "I");
        metals.add(glob);
        DirtMetal prok = new DirtMetal("prok", "V");
        metals.add(prok);
        Assertions.assertEquals( 4.0, intergalaxyDirtImplementation.convert(metals));
    }

    @Test
    void convert_pish_tegj_glob_glob() {
        List<Metals> metals = new ArrayList<>();
        DirtMetal pish = new DirtMetal("pish", "X");
        metals.add(pish);
        DirtMetal tegj = new DirtMetal("tegj", "L");
        metals.add(tegj);
        DirtMetal glob = new DirtMetal("glob", "I");
        metals.add(glob);
        metals.add(glob);
        Assertions.assertEquals(42.0, intergalaxyDirtImplementation.convert(metals));
    }


}