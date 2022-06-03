package com.bridgelab.Java;

import java.util.Scanner;

public class Binary {
    public static void main(String [] args)
    {

            int remainder = 0;
            int[] arr = new int[8];
            int i =7;
            int sum =0;
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
            int[] swaped_array = new int[8];
            for( i=0 ;i <4 ;i++)
            {
                swaped_array[i] = arr[i+4];
            }
            for( i=0;i<4;i++)
            {
                swaped_array[i+4] = arr[i];
            }
            System.out.print("\n");
            System.out.print("After Swapping the nibles");
            for (i=0; i< swaped_array.length;i++)
                System.out.print(swaped_array[i]);
            System.out.print("\n");
            int j =7;
            for( i =0 ;i< swaped_array.length ; i++)
            {
                sum = sum + swaped_array[i]*(int)(Math.pow(2,j));
                j--;
            }
            System.out.println("Decimal equivalent to swapped nibles is :" +sum);




    }
}
