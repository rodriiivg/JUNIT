package org.example.seccion2;

import org.example.service.SmartPhoneService;
import org.example.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BMethodTest {
    SmartPhoneService service;
    @BeforeEach
    void setUp() {
        System.out.println("setUp");
        service = new SmartPhoneServiceImpl();
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown");

    }

    @Test
    void test1() {
        System.out.println("test1");
        assertTrue(true);
    }

    @Test
    void test2() {
        System.out.println("test2");
        assertTrue(true);
    }
}
