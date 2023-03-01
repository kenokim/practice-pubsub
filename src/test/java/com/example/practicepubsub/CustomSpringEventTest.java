package com.example.practicepubsub;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CustomSpringEventTest {
    @Autowired
    private CustomSpringEventPublisher eventPublisher;

    @Test
    void simpleEventTest() {
        eventPublisher.publishCustomEvent("Hello");
        try {
            Thread.sleep(1);
            System.out.println("??");
        } catch (Exception e) {

        }
    }
}
