package api;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.equalTo;


public class TestSettlementsApi extends BaseNpApiTest {
    Map<String, Object> reqBody = new HashMap<>();

    @BeforeMethod
    public void setReqBody() {
        Map<String, Object> methodProperties = new HashMap<>();

        methodProperties.put("FindByString", "Київ");
        methodProperties.put("Limit", 1);
        methodProperties.put("Page", 2);

        reqBody.put("apiKey", ApiKey);
        reqBody.put("modelName", "Address");
        reqBody.put("calledMethod", "getSettlements");
        reqBody.put("methodProperties", methodProperties);
    }

    @Test
    public void check() {
        given()
                .spec(reqSpec)
                .body(reqBody)
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then()
                .spec(respSpec)
                .statusCode(200)
                .assertThat()
                .body("success", equalTo(true));
    }

    @Test
    public void checkJsonSchema() {
        given()
                .spec(reqSpec)
                .body(reqBody)
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then()
                .spec(respSpec)
                .statusCode(200)
                .assertThat()
                .body(matchesJsonSchema(new File(System.getProperty("user.dir") +
                        "\\src\\main\\resources\\helpers\\np_adress_schema.json")));
    }
}
