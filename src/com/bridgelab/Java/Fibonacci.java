package com.bridgelab.Java;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the end number of series");
        int input = scn.nextInt();
        int first = 0;
        int second = 1;

        System.out.println(first);
        System.out.println(second);
        for (int i=2 ; i<=input;i++)
        {
            int next = first + second;
            System.out.println(next);
            first = second;
            second = next;
        }

    }
}
