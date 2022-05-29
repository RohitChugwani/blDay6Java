package com.bridgelab.Java;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args)
    {
        boolean IsPrime = true;
        Scanner scn = new Scanner(System.in);
        System.out.println("enter any number");
        int input = scn.nextInt();
        for (int i =2 ; i <= input/2 ;i++)
        {
            if(input % i == 0)
            {
                IsPrime = false;
                break;
            }
        }
        if ( IsPrime == true)
            System.out.println( input+ "is prime");
        else
            System.out.println( input+ "is not prime");

    }
}
