package com.bitPanda.stepDefinitions;

import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;
public class ApiStepDefs {

    @BeforeClass
    public void before(){
        baseURI = "https://skilling.com/api/";
    }

    @Test(priority = 1)
    public void Get(){

        given().accept(ContentType.JSON)
                .and().queryParam("query","{prices(instrumentIds:[5156, 5157,\n" +
                "5158]){instrumentId,ask,bid,change}}")
                .when().get("public/graphql")
                .then().assertThat().statusCode(200)
                .and().assertThat().body("data.prices.instrumentId[0]",equalTo(5156))//...
        ;
    }

    @Test(priority = 2)
    public void Get2(){

        given().accept(ContentType.JSON)
                .and().queryParam("query","{prices(instrumentIds:[-56, 5157, 5158])\n" +
                "{instrumentId,ask,bid,change}}")
                .when().get("public/graphql")
                .then().assertThat().statusCode(200)
                .and().assertThat().body("data.prices.instrumentId[0]",equalTo(5157))//...
        ;
    }

    @Test(priority = 3)
    public void post(){
        Map<String,Object> requestMap = new HashMap<>();
        requestMap.put("username","email");
        requestMap.put("password","something");


        given().accept(ContentType.JSON)
                .and().contentType(ContentType.JSON)
                .and().body(requestMap)
                .when().post("v1/sessions")
                .then().assertThat().statusCode(422);
    }

}
