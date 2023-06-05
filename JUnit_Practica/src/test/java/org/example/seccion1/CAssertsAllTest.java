package org.example.seccion1;

import org.example.service.SmartPhoneService;
import org.example.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CAssertsAllTest {
    @Test
    void assertAllTest() {

        // Class Under Test
        // System Under Test (SUT)
        SmartPhoneService service = new SmartPhoneServiceImpl();

        Integer count = service.count();

        // aserciones

        assertAll("Comprobaciones",
                () -> assertNotNull(count),
                () -> assertTrue(count > 0),
                () -> assertEquals(3, count)
        );
    }
}
