package atu.ie;

//import java.util.Scanner;

public class Passenger {
    String passengerTitle, passengerName, passengerID,passengerPhone;   int passengerAge;

    public Passenger(String title,String name,String id,String phone,int age){      //Constructor
        passengerAge = age;
        passengerTitle = title;
        passengerName = name;
        passengerID = id;
        passengerPhone = phone;
    }

    public int Age(){
        if (passengerAge < 16){
            throw new IllegalArgumentException("Age must be over 16");
        }
        return passengerAge;
    }

    public String Title(){
        if(passengerTitle != "Mr" && passengerTitle != "Mrs" && passengerTitle != "Ms"){
            throw new IllegalArgumentException("Passenger title must be either Mrs, Mr or Ms");
        }
        return passengerTitle;
    }
}
