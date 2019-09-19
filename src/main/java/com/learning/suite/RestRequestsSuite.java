package com.learning.suite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;
import com.learning.test.GetRequestTest;
import com.learning.test.PostRequestTest;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("All rest requests.")
@SelectClasses({GetRequestTest.class, PostRequestTest.class})
public class RestRequestsSuite {
    private RestRequestsSuite(){

    }
}
