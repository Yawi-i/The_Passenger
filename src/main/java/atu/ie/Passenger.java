package atu.ie;

import java.util.Scanner;

public class Passenger {
    String Title, passName, passID;
    int passPhone, passAge;

    public Passenger(String title,String name,String id,String phone,int age){
        passAge = age;

    }

    public int Age(){

        System.out.println("Age: ");
        Scanner inputs = new Scanner(System.in);
        int age = inputs.nextInt();

        System.out.println("Age is :" +age);

        return age;
    }
}
