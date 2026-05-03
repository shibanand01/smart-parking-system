package com.parking.customer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidationTest {
    Validation v1;

    @BeforeEach
    void setup(){
        v1= new Validation();
    }

    @Test
    void EmailTest(){
        String input = "shibanand3787@gmail.com";

        assertTrue(v1.checkEmail(input));
    }
    @Test
    void EmailTest2(){
        String input = "soubhagya.2mail@gmail.com";

        assertTrue(v1.checkEmail(input));
    }
    @Test
    void EmailTest3(){
        String input = "shibanand3787@trident.ac.in";

        assertTrue(v1.checkEmail(input));
    }
    @Test
    void EmailTest4(){
        String input = "shibanand3787";

        assertFalse(v1.checkEmail(input));
    }
    @Test
    void EmailTest5(){
        String input = "shibanand3787@.com";

        assertFalse(v1.checkEmail(input));
    }
    @Test
    void PhoneTest(){
        String input = "7894329127";
        assertTrue(v1.checkPhone(input));
    }
    @Test
    void PhoneTest2(){
        String input = "894329127";
        assertFalse(v1.checkPhone(input));
    }
    @Test
    void PhoneTest3(){
        String input = "78943291127";
        assertFalse(v1.checkPhone(input));
    }

}
