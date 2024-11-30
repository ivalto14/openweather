package com.example;

import com.example.Karate.Test;
import com.intuit.karate.junit5.Karate;

public class KarateTestSuite {

    @Test
    Karate testAll() {
        return Karate.run("classpath:com/example/weather").relativeTo(getClass());
    }
}


