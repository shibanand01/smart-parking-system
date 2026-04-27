package com.parking.vehicle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControllerTest {
    Controller control;

    @BeforeEach
    void setUp(){
        control = new Controller();
    }

    @Test
    void validateRegTest1(){
        assertTrue(control.validateReg("OD02AB1234"));
    }
    @Test
    void validateRegTest2(){
        assertTrue(control.validateReg("22BH6511A"));
    }
    @Test
    void validateRegTest3(){
        assertFalse(control.validateReg("ahdjb382"));
    }
    @Test
    void validateRegTest4(){
        assertFalse(control.validateReg(" "));
    }
    @Test
    void validateRegTest5(){
        assertFalse(control.validateReg(""));
    }
    @Test
    void validateRegTest6(){
        assertFalse(control.validateReg(null));
    }
    @Test
    void validateTypeTest1(){
        assertTrue(control.validateType(VehicleType.BIKE));
    }
    @Test
    void validateTypeTest2(){
        assertTrue(control.validateType(VehicleType.CAR));
    }
    @Test
    void validateTypeTest3(){
        assertTrue(control.validateType(VehicleType.AUTO));
    }
    @Test
    void validateTypeTest4(){
        assertFalse(control.validateType(null));
    }

    @Test
    void createVehicleTest1(){
        Vehicle v = control.createVehicle("OD02AB1234", VehicleType.BIKE);

        assertNotNull(v);
    }
    @Test
    void createVehicleTest2(){
        Vehicle v = control.createVehicle("OD02AB1234", null);

        assertNull(v);
    }

}
