package atu.ie;

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

    public int Name(){
        int length = passengerName.length();
        if (length < 3){
            throw new IllegalArgumentException("Name should be 3 letters or more");
        }
        return length;
    }

    public int ID(){
        int length = passengerID.length();
        if (length < 10){
            throw new IllegalArgumentException("ID should be more than 10 characters");
        }
        return length;
    }

}
