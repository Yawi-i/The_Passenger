package atu.ie;

import java.util.Scanner;

public class Passenger {
    String passengerTitle, passengerName, passengerID,passengerPhone;   int passengerAge;

    public Passenger(String title,String name,String id,String phone,int age){      //Constructor
        passengerAge = age;

    }
    public int Age(){
        if (passengerAge < 16){
            throw new IllegalArgumentException("Age must be over 16");
        }
        return passengerAge;
    }
}
