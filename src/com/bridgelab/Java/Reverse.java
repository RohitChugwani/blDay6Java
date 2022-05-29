package com.bridgelab.Java;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args)
    {
        int reverse=0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = scn.nextInt();
        while(input != 0)
        {
            int remainder = input%10;
            input=input/10;
            reverse = reverse*10 + remainder;
        }
        System.out.print("reverse number is " +reverse);

    }


}
