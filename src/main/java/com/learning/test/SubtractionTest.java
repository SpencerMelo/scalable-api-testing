package com.learning.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("mathRegression")
public class SubtractionTest {
    @BeforeAll
    static void setup(){

    }

    @Test
    void basicSubtraction(){
        System.out.println("Subtraction result is : " + (10 - 5));
    }
}
