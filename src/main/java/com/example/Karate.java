package com.example;

import org.testng.annotations.Test;

public class Karate {

    @Test
    Karate testAll() {
        return Karate.run("classpath:com/example/weather").relativeTo(getClass());
    }

    static com.intuit.karate.Runner.Builder<com.intuit.karate.Runner.Builder> run(String s) {
    }

    public @interface Test {
    }
}




