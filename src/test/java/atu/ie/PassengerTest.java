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
    void TestTitleMrs() {
        myPassenger = new Passenger("Mrs", "name", "id", "0123456789", 0);
        assertEquals("Mrs",myPassenger.Title(), "Passenger title must be either Mrs, Mr or Ms");
    }

    @Test
    void TestTitleMr() {
        myPassenger = new Passenger("Mr", "name", "id", "0123456789", 0);
        assertEquals("Mr",myPassenger.Title(), "Passenger title must be either Mrs, Mr or Ms");
    }

    @Test
    void TestrTitleMs() {
        myPassenger = new Passenger("Ms", "name", "id", "0123456789", 0);
        assertEquals("Ms",myPassenger.Title(), "Passenger title must be either Mrs, Mr or Ms");
    }

    @Test
    void TestTitleFail() {
        myPassenger = new Passenger("Sir", "name", "id", "0123456789", 0);
        assertThrows(IllegalArgumentException.class,
                () -> {
                    myPassenger.Title();
                });
    }

    @Test
    void TestNameLength(){
        myPassenger = new Passenger("title", "Joe", "id", "0123456789", 0);
        assertTrue(myPassenger.Name() >= 3,"Name should be more than 3 letters");
    }

    @Test
    void TestNameLengthFail() {
        myPassenger = new Passenger("tile", "Jo", "id", "0123456789", 0);
        assertThrows(IllegalArgumentException.class,
                () -> {
                    myPassenger.Name();
                });
    }

    @AfterEach
    void tearDown() {
    }
}