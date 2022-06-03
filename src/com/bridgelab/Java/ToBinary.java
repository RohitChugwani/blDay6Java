package com.bridgelab.Java;

import java.util.Scanner;

public class ToBinary {
    public static void main(String[] args)
    {
        int remainder = 0;
        int[] arr = new int[8];
        int i =7;
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the decimal number");
        int input = scn.nextInt();
        while( input != 0)
        {
            remainder = input % 2;
            arr[i] = remainder;
            i--;
            input = input /2 ;

        }
        for ( i=0 ;i< arr.length;i++)
           System.out.print(arr[i]);
    }
}
