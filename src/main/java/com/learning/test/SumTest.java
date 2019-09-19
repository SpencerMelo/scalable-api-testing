package com.learning.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("mathRegression")
public class SumTest {
    @BeforeAll
    static void setup(){

    }

    @Test
    void basicSum(){
        System.out.println("Sum result is : " + (5 + 5));
    }
}
