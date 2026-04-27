package com.parking.vehicle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidationTest {
    private Validation v1;

    @BeforeEach
    void setup(){
        v1= new Validation();
    }

    @Test
    void FormatCheck1(){
        //od no.
        assertTrue(v1.checkReg("OD02BT1942"));

    }
    @Test
    void FormatCheck2() {
        //bh  no.
        assertTrue(v1.checkReg("24BH6444K"));
    }
    @Test
    void FormatCheck3() {
        //invalid no.
        assertFalse(v1.checkReg("DCVBSA1234"));
    }
    @Test
    void FormatCheck4() {
        //invalid no.
        assertFalse(v1.checkReg(" "));
    }
    @Test
    void FormatCheck5() {
        //invalid no.
        assertFalse(v1.checkReg(null));
    }
}
