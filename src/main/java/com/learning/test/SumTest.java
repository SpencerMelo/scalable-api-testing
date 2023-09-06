package com.learning.test;

import com.learning.extension.Report;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@Tag("mathRegression")
@ExtendWith(Report.class)
public class SumTest {
    @BeforeAll
    static void setup() {

    }

    @ParameterizedTest(name = "Sum of {0} with {0} should be the same as {0} * 2")
    @ValueSource(ints = {5, 10, 15, 20, 25})
    @DisplayName("Function should be able to handle a sum of a number by itself.")
    void basicSum(int number) {
        int expectedResult = number * 2;
        int actualResult = number + number;
        System.out.println("Sum result is : " + actualResult);

        //Just for testing purpose.
        if(number == 15)
            actualResult++;

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assertions.assertEquals(expectedResult, actualResult, "Expected result: " + expectedResult + " - Actual result: " + actualResult);
    }
}
