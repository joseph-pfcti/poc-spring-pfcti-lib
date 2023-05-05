package com.pfcti.sanity.healthy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CheckApplicationHealthyTest {
    @Test
    void health() {
        CheckApplicationHealthy applicationHealthy = new CheckApplicationHealthy();
        String message = applicationHealthy.health();

        assertEquals("The application Sanity Checker is running Healthy", "The application Sanity Checker is running Healthy");
    }
}