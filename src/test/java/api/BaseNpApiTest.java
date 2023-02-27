package api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.BeforeEach;

public class BaseNpApiTest {
    protected String ApiKey = "252b1fbbf76c795e0b8961e2444c81c9";
    protected RequestSpecification reqSpec;
    protected ResponseSpecification respSpec;

    @BeforeEach
    public void setSpecs (){
        reqSpec = new RequestSpecBuilder()
                .log(LogDetail.BODY)
                .setBaseUri("https://api.novaposhta.ua/v2.0/json/")
                .build();
        respSpec = new ResponseSpecBuilder()
                .log(LogDetail.ALL)
                .build();
    }

}
