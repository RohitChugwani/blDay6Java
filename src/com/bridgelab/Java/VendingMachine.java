package com.bridgelab.Java;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the amount to be withdrawn");
        int input = scn.nextInt();
        int thousand_notes =0;
        int fivehundred_notes =0;
        int hundred_notes = 0;
        int fifty_notes = 0;
        int twenty_notes = 0;
        int ten_notes= 0;
        int five_notes = 0;
        int two_notes = 0;
        int one_note =0;
        if ( input > 1000)
        {
            thousand_notes = input/1000;
            input = input % (thousand_notes*1000);
        }
        if (input > 500)
        {
            fivehundred_notes = input/500;
            input = input % (fivehundred_notes*500);
        }
        if (input > 100)
        {
            hundred_notes = input/100;
            input = input % (hundred_notes*100);
        }
        if (input > 50)
        {
            fifty_notes = input/50;
            input = input % (fifty_notes*50);

        }
        if (input > 20)
        {
            twenty_notes = input/20;
            input = input % (twenty_notes*20);
        }
        if (input > 10)
        {
            ten_notes = input/10;
            input = input % (ten_notes*10);
        }
        if (input > 5)
        {
            five_notes = input/5;
            input = input % (five_notes*5);
        }
        if (input > 2)
        {
            two_notes = input/2;
            input = input % (two_notes * 2);
        }
        if ( input ==1)
        {
            one_note = 1;
        }
        System.out.println( " minimum thousand notes "+thousand_notes  );
        System.out.println( " minimum five hundred  notes "+fivehundred_notes  );
        System.out.println( " minimum hundred notes "+hundred_notes  );
        System.out.println( " minimum fifty notes "+fifty_notes  );
        System.out.println( " minimum twenty notes "+twenty_notes  );
        System.out.println( " minimum ten notes "+ten_notes  );
        System.out.println( " minimum five notes "+five_notes  );
        System.out.println( " minimum two notes "+two_notes  );
        System.out.println( " minimum one notes "+one_note );

    }
}
