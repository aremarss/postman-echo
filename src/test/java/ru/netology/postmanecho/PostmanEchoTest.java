package ru.netology.postmanecho;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PostmanEchoTest {

    @Test
    void shouldReturnBodyAfterPost() {
        given()
                .baseUri("https://postman-echo.com")
                .body("some text")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("some tex"));
    }
}