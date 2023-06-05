package org.example.seccion1;

import org.example.service.SmartPhoneService;
import org.example.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class BExceptionsTest {
    @Test
    void findOneIllegalArgumentExceptionTest() {

        SmartPhoneService service = new SmartPhoneServiceImpl();

        assertThrows(IllegalArgumentException.class, () -> service.findOne(null));


    }
}
