package com.tw.pro.arrays;

import java.util.Scanner;

public class DetectTriangle {
    int size = 0;
    int[][] array;

    public void setInput(){
        Scanner input = new Scanner(System.in);
        size = input.nextInt();
        array = new int[size][size];

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                array[i][j] = input.nextInt();
            }
        }
    }

    public String checkUpperTriangle(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j <= i; j++){
                if(array[j][i] == 0)
                    return "No";
            }
        }
        return "Yes";
    }

    public String checkLowerTriangle(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j <= i; j++){
                if(array[i][j] == 0)
                    return "No";
            }
        }
        return "Yes";
    }
}
