package com.tw.pro.controlstatements;

import java.util.Scanner;

public class CollatzSequence {
    int number;

    public void setNumber(){
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
    }

    public void generateCollatzSequence(){
        if(number == 1) {
            System.out.println("1 0\n");
            return;
        }

        System.out.println(number + " ");
        while(number != 1){
            if(number % 2 == 0)
                number /= 2;
            else
                number = 3 * number + 1;

            System.out.println(number + " ");
        }

        return;
    }
}
