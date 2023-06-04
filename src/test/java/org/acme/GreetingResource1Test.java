package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import jakarta.json.bind.Jsonb;
import org.junit.jupiter.api.Test;

import java.awt.event.TextEvent;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResource1Test {
    @Inject
    private JsonConfigCustomizer.ApplicationRecord applicationRecord;
    @Inject
    private JsonConfigCustomizer.SingletonRecord singletonRecord;
    @Inject
    private Jsonb jsonb;

    @Test
    public void testHelloEndpoint() {
        System.out.println("---"+jsonb.toJson(applicationRecord));
        System.out.println("---"+jsonb.toJson(singletonRecord));
    }




}
