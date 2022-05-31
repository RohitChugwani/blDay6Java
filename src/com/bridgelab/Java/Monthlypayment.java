package com.bridgelab.Java;

import java.util.Scanner;

public class Monthlypayment {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the Principal ,Time(in years),Rate");
        int P = scn.nextInt();
        int T = scn.nextInt();
        double R = scn.nextDouble();
        int n = 12*T;
        double r = R/(12*100);
        double payment = P*r/(1-Math.pow(1+r,-n));
        System.out.println("Monthly payment :" +payment);

    }
}
