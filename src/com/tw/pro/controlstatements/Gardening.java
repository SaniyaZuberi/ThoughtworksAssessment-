package com.tw.pro.controlstatements;

import java.util.Scanner;

public class Gardening {
    int row = 0;
    int col = 0;
    int value = 0;

    public void setInput(){
        Scanner input = new Scanner(System.in);
        row = input.nextInt();
        col = input.nextInt();
        value = input.nextInt();
    }

    public String determineMangoTree(){
        int pointer = 1;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(pointer == value){
                    if(i == 0 || j == 0 || j == col-1)
                        return "Yes";
                }
                pointer++;
            }
        }
        return "No";
    }
}
