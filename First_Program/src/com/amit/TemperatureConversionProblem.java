package com.amit;


import java.util.Scanner;

public class TemperatureConversionProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in celcius: ");
        float tempC = input.nextFloat();
        float tempF = tempC * 9 / 5 + 32;
        System.out.println(tempF);
    }
}./
