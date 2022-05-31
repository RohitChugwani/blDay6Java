package com.bridgelab.Java;

import java.util.Scanner;

public class TemperatureUnitConversion {
    public static void main(String [] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("press 1 to convert from celsius to fahrenheit \n press 2 to convert from fahrenheit to celsius");
        int input = scn.nextInt();
        if ( input ==1 )
        {
            System.out.println("enter temperature in celsius");
            double C = scn.nextDouble();
            ctof(C);
        }
        if (input ==2)
        {
            System.out.println("enter temperature in Fahrenheit");
            double F = scn.nextDouble();
            ftoc(F);
        }
    }
    public static void ctof(double C)
    {
        double f = (C*9/5) +32 ;
        System.out.println(C+"C=" +f +"F");
    }
    public static void  ftoc (double F)
    {
        double c = (F-32) *5/9;
        System.out.println(F+ " F =" +c+ "C");
    }

}

