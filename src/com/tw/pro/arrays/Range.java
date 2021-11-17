package com.tw.pro.arrays;

import java.util.Scanner;

public class Range {
    int n;
    int[] array;

    public void setInput(){
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        array = new int[n];
        for(int i = 0; i < n; i++)
            array[i] = input.nextInt();
    }

    public int findRange(){
        int max_ele = Integer.MIN_VALUE;
        int min_ele = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(array[i] > max_ele)
                max_ele = array[i];

            if(array[i] < min_ele)
                min_ele = array[i];
        }
        return max_ele-min_ele;
    }
}
