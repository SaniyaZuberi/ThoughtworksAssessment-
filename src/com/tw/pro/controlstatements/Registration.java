package com.tw.pro.controlstatements;

import java.util.Scanner;

public class Registration {

        String possibleTopper = "No";
        int registrationNumber = 0;

        public void getInput(){
            Scanner input = new Scanner(System.in);
            registrationNumber = input.nextInt();
        }

        public String isPossibleTopper(){
            int odd = 0;
            int even = 0;
            int remainder;

            while(registrationNumber != 0){
                remainder = registrationNumber % 10;
                if(remainder % 2 == 0)
                    even += remainder;
                else
                    odd += remainder;

                registrationNumber = registrationNumber / 10;
            }

            if(even == odd)
                possibleTopper = "Yes";

            return possibleTopper;
        }


}
