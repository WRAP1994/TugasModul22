package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static Stepdef.baseTest.generateEmail;

public class models {
    private static RequestSpecification request;
    public static void setupHeaders() {
        request = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Authorization", "Bearer d00080c2c41351a7a10fe2d68981e2147b5c6f37c51308fe95f0d2ad54f55fb7");
    }

    public static Response getListUsers(String endpoint) {
        setupHeaders();
        return request.get(endpoint);
    }

}
