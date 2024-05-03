package br.com.study.resource;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class GeneratePDFResourceTest {
    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/C:/Program Files/Git/pdf")
          .then()
             .statusCode(200)
             .body(is("Hello from Quarkus REST"));
    }

}