package com.learning.test;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.get;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("restRegression")
public class GetRequestTest {
    @BeforeAll
    static void setup(){
        RestAssured.baseURI = "https://e619d7c2-28f4-4cf5-924c-7182fa6ae844.mock.pstmn.io";
    }

    @Test
    void sendRequest(){
        String body = get("/mock").then().statusCode(200).extract().body().asString();
        System.out.println(body);
        assertEquals("Response from get!", body);
    }
}
