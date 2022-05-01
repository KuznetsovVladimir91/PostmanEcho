package ru.netology.Postman;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestData {

    @Test
    void should() {
        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("some value"))
        ;
    }
}
