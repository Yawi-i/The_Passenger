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
    void TestAge(){
        myPassenger = new Passenger("title","name","id", "12345678",18);
        assertEquals(18,myPassenger.Age(),"Age must be over 16");
    }
    @AfterEach
    void tearDown() {
    }
}