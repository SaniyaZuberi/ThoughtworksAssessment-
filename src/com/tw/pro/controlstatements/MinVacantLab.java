package com.tw.pro.controlstatements;

import java.util.Scanner;

public class MinVacantLab {
    int x, y, z;
    int n;

    public void setInput(){
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        n = input.nextInt();
    }

    public void detectMinVacantLab(){
        if(n > x && n > y && n > z)
            return;

        if(x < 0 || y < 0 || z < 0 || n < 0)
            return;

        int a, b, c;
        if(x > n)
            a = x - n;
        else
            a = Integer.MAX_VALUE;
        if(y > n)
            b = y - n;
        else
            b = Integer.MAX_VALUE;
        if(z > n)
            c = z - n;
        else
            c = Integer.MAX_VALUE;

        int min1 = Math.min(a,b);
        int min2 = Math.min(min1, c);

        if(min2 == a)
            System.out.println("L1 is the lab \n");
        else if(min2 == b)
            System.out.println("L2 is the lab \n") ;
        else if(min2 == c)
            System.out.println("L3 is the lab \n");
        else
            System.out.println("No lab \n");
    }
}
