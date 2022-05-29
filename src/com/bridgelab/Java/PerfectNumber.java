package com.bridgelab.Java;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args)
    {
        int sum=1;
        Scanner scn = new Scanner(System.in);
        System.out.println("enter any number");
        int input = scn.nextInt();
        for( int i=2 ;i<=input/2 ;i++)
        {
            if ( input%i == 0)
                sum = sum +i;
        }
        if ( sum == input)
            System.out.println( input+ "is perfect number ");
        else
            System.out.println( input+ "is not perfect number ");

    }
}
