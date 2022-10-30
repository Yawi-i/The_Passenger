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
    void TestAgePass() {
        myPassenger = new Passenger("title", "name", "id", "0123456789", 16);
        assertTrue(myPassenger.Age() >= 16, "Age must be over 16");
    }

    @Test
    void TestAgeFail() {
        myPassenger = new Passenger("title", "name", "id", "0123456789", 15);
        assertThrows(IllegalArgumentException.class,
                () -> {
                    myPassenger.Age();
                });
    }

    @Test
    void TestPassengerTitleMrs() {
        myPassenger = new Passenger("Mrs", "name", "id", "0123456789", 0);
        assertEquals("Mrs",myPassenger.Title(), "Passenger title must be either Mrs, Mr or Ms");
    }

    @Test
    void TestPassengerTitleMr() {
        myPassenger = new Passenger("Mr", "name", "id", "0123456789", 0);
        assertEquals("Mr",myPassenger.Title(), "Passenger title must be either Mrs, Mr or Ms");
    }

    @Test
    void TestPassengerTitleMs() {
        myPassenger = new Passenger("Ms", "name", "id", "0123456789", 0);
        assertEquals("Ms",myPassenger.Title(), "Passenger title must be either Mrs, Mr or Ms");
    }

    @Test
    void TestPassengerTitleFail() {
        myPassenger = new Passenger("Sir", "name", "id", "0123456789", 0);
        assertThrows(IllegalArgumentException.class,
                () -> {
                    myPassenger.Title();
                });
    }

    @AfterEach
    void tearDown() {
    }
}