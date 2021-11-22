package com.tw.pro.ExceptionalHandling;

import java.util.Scanner;

public class ElectionEligibility {
    public static void checkEligibilityToVote(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("Age is not valid to vote");
        else
            System.out.println("You are eligible");
    }

    public static void main(String[] args) throws InvalidAgeException {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        checkEligibilityToVote(age);
    }



}
