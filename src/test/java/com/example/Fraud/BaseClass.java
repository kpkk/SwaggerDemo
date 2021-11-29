package com.example.Fraud;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;

public class BaseClass {

    @BeforeEach
    public void setup(){
        RestAssuredMockMvc.standaloneSetup(new FraudController());
    }

}
