package atu.ie;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    Passenger myPassenger;

    @BeforeEach
    void setUp() {
    }

    @Test
    void TestAgePass(){
        myPassenger = new Passenger("title","name","id", "0123456789",16);
        assertTrue(myPassenger.Age() >= 16,"Age must be over 16");
    }
    @Test
    void TestAgeFail(){
        myPassenger = new Passenger("title","name","id", "0123456789",15);
        assertThrows(IllegalArgumentException.class,
                () -> {
                    myPassenger.Age();
                });
    }
    @AfterEach
    void tearDown() {
    }
}