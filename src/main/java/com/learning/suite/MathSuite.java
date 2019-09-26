package com.learning.suite;

import com.learning.test.SubtractionTest;
import com.learning.test.SumTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("All math things.")
@SelectClasses({SubtractionTest.class, SumTest.class})
public class MathSuite {
    private MathSuite(){

    }
}
