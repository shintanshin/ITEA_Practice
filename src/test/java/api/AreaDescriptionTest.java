package api;

import dto.AddressGeneral;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AreaDescriptionTest extends BaseNpApiTest {
    Map<String, Object> reqBody = new HashMap<>();

    @BeforeEach
    public void setReqBody() {
        Map<String, Object> methodProperties = new HashMap<>();

        methodProperties.put("FindByString", "Київ");

        reqBody.put("apiKey", ApiKey);
        reqBody.put("modelName", "Address");
        reqBody.put("calledMethod", "getSettlements");
        reqBody.put("methodProperties", methodProperties);
    }

    @Test
    public void checkAreaDescription() {
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
                .body("success", equalTo(true))
                .body("data.AreaDescription", hasItems("Київська", "Миколаївська область"))
                .body("info.totalCount", equalTo(9));
    }

    @Test
    public void checkPoltavskaArea() {
        List<AddressGeneral> addressGeneralList = given()
                .spec(reqSpec)
                .contentType(ContentType.JSON)
                .when()
                .body(reqBody)
                .post()
                .then()
                .spec(respSpec)
                .statusCode(200)
                .extract()
                .body().jsonPath().getList("data", AddressGeneral.class);

        boolean poltavObl = addressGeneralList.stream().filter(el -> el.getAreaDescription().contains("Полтав")).findAny().isPresent();
        assertTrue(poltavObl);
    }
}
