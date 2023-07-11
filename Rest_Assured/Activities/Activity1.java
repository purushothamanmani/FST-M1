package Activities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class Activity1 {

    final static String uri = "https://petstore.swagger.io/v2/pet";

    @Test(priority=1)
    public void addNewPet() {

        String reqBody = "{"
                + "\"id\": 885432,"
                + "\"name\": \"Riley\","
                + " \"status\": \"alive\""
                + "}";

        Response response =
                given().contentType(ContentType.JSON)
                        .body(reqBody)
                        .when().post(uri);


        response.then().body("id", equalTo(885432));
        response.then().body("name", equalTo("Riley"));
        response.then().body("status", equalTo("alive"));
    }

    @Test(priority=2)
    public void getPetInfo() {
        Response response =
                given().contentType(ContentType.JSON)
                        .when().pathParam("petId", "885432")
                        .get(uri + "/{petId}");

        response.then().body("id", equalTo(885432));
        response.then().body("name", equalTo("Riley"));
        response.then().body("status", equalTo("alive"));
    }

    @Test(priority=3)
    public void deletePet() {
        Response response =
                given().contentType(ContentType.JSON)
                        .when().pathParam("petId", "885432")
                        .delete(uri + "/{petId}");
        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("885432"));
    }
}