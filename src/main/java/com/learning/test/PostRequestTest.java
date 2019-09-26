package com.learning.test;

import static io.restassured.RestAssured.post;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.learning.rules.Report;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@Tag("restRegression")
@ExtendWith(Report.class)
public class PostRequestTest {
    @BeforeAll
    static void setup() {
        RestAssured.baseURI = "https://e619d7c2-28f4-4cf5-924c-7182fa6ae844.mock.pstmn.io";
    }

    @Test
    void sendRequest() {
        String body = post("/mock").then().statusCode(200).extract().body().asString();
        System.out.println(body);
        assertEquals("Response from post!", body);
    }
}
