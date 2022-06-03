package com.bridgelab.Java;

import java.util.Scanner;

public class StopWatch {

    long startTimer = 0;
    long stopTimer = 0;
    double elapsed = 0;

    public  void start()
    {
        startTimer = System.currentTimeMillis();
        System.out.println("Start time is :" +startTimer);

    }
    public void stop()
    {
        stopTimer = System.currentTimeMillis();
        System.out.println("stop time :" +stopTimer);
    }
    public void getElapsed()
    {
        elapsed = stopTimer - startTimer;
       // System.out.println("elapsed time in millseconds  is :" +elapsed);
        System.out.println("elapsed time in seconds  is :" +elapsed/1000);
    }

    public static void main(String[] args)
    {
        StopWatch stopWatch = new StopWatch();
        System.out.println("enter 1 to start the timer");
        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();
        if ( input == 1) {
            stopWatch.start();
            System.out.println("enter 2 to stop the timer");
            int in = scn.nextInt();
            if (in == 2)
                stopWatch.stop();
        }
        stopWatch.getElapsed();
    }
}


