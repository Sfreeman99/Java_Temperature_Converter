package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String S1 = "What are you starting with?: ";
        System.out.println(S1);
        String startTemp = userInput.next();
        String S2 = "What temp do you want to end with?: ";
        System.out.println(S2);
        String endTemp = userInput.next();
        String S3 = "What is the degrees?:";
        System.out.println(S3);
        double temp = userInput.nextDouble();
        TemperatureConverter Temp = new TemperatureConverter(startTemp, endTemp);
        double convertedTemp = Temp.convert(temp);
        System.out.println("The conversion from" + startTemp + " to " + endTemp + " would make it: " + convertedTemp + " " + endTemp);


    }
}
