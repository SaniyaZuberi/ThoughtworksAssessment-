package com.tw.pro.arrays;

import java.util.Scanner;

public class ArrayType {
    int[] array;
    int n;

    public void setInput(){
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        array = new int[n];

        for(int i = 0; i < n; i++)
            array[i] = input.nextInt();
    }

    public int determineArrayType(){
        int even_count = 0;
        int odd_count = 0;

        for(int i = 0; i < n; i++) {
            if (array[i] % 2 == 0)
                even_count++;
            else
                odd_count++;
        }

            if(even_count == n)
                return 1;
            else if(odd_count == n)
                return 2;
            else
                return 3;

    }
}
