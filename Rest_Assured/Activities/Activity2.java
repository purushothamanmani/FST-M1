package Activities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class Activity2 {

    final static String uri = "https://petstore.swagger.io/v2/user";

    @Test(priority=1)
    public void addNewUserFromFile() throws IOException {

        FileInputStream inputJSON = new FileInputStream("src/test/java/Activities/userinfo.json");

        String reqBody = new String(inputJSON.readAllBytes());

        Response response =
                given().contentType(ContentType.JSON)
                        .body(reqBody)
                        .when().post(uri);

        inputJSON.close();

        // Assertion
        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("80587"));
    }

    @Test(priority=2)
    public void getUserInfo() {

        File outputJSON = new File("src/test/java/activities/userGETResponse.json");

        Response response =
                given().contentType(ContentType.JSON)
                        .pathParam("username", "anand")
                        .when().get(uri + "/{username}");


        String resBody = response.getBody().asPrettyString();

        try {

            outputJSON.createNewFile();

            FileWriter writer = new FileWriter(outputJSON.getPath());
            writer.write(resBody);
            writer.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        // Assertion
        response.then().body("id", equalTo(80587));
        response.then().body("username", equalTo("anand"));
        response.then().body("firstName", equalTo("Justin"));
        response.then().body("lastName", equalTo("Case"));
        response.then().body("email", equalTo("anand@email.com"));
        response.then().body("password", equalTo("password123"));
        response.then().body("phone", equalTo("9812763450"));
    }

    @Test(priority=3)
    public void deleteUser() throws IOException {
        Response response =
                given().contentType(ContentType.JSON) // Set headers
                        .pathParam("username", "anand") // Add path parameter
                        .when().delete(uri + "/{username}"); // Send POST request

        // Assertion
        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("anand"));
    }
}