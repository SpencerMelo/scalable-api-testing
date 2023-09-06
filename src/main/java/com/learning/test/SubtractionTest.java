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
public class SubtractionTest {
    @BeforeAll
    static void setup() {

    }

    @ParameterizedTest(name = "Subtraction of {0} by it half should be same as it half.")
    @ValueSource(ints = {5, 10, 15, 20, 25})
    @DisplayName("Function should be able to handle a subtraction of a number by your half.")
    void basicSubtraction(int number) {
        int expectedResult = number - number / 2;
        int actualResult = number - number / 2;
        System.out.println("Subtraction result is : " + actualResult);

        //Just for testing purpose.
        if(number == 20)
            actualResult--;

        Assertions.assertEquals(expectedResult, actualResult, "Expected result: " + expectedResult + " - Actual result: " + actualResult);
    }
}
