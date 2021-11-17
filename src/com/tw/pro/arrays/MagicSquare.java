package com.tw.pro.arrays;

import java.util.Scanner;

public class MagicSquare {
    int row = 0;
    int[][] matrix;

    public void setArray(){
        Scanner input = new Scanner(System.in);
        row = input.nextInt();
        matrix = new int[row][row];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < row; j++)
                matrix[i][j] = input.nextInt();
        }

    }

    public String findMagicSquare(){

        int magic_sum = 0;
        //Finding sum
        for(int i = 0; i < row; i++)
            magic_sum += matrix[0][i];

        // Row
        for(int i = 1; i < row; i++){
            int row_sum = 0;
            for(int j = 0; j < row; j++){
                row_sum += matrix[i][j];
            }
            if(row_sum != magic_sum)
                return "No";
        }

        // column
        for(int i = 0; i < row; i++){
            int col_sum = 0;
            for(int j = 0; j < row; j++){
                col_sum += matrix[j][i];
            }
            if(col_sum != magic_sum)
                return "No";
        }

        // Diagonal
        int b_diagonal_sum = 0;
        int f_diagonal_sum = 0;
        for(int i = 0; i < row; i++){
            b_diagonal_sum += matrix[i][i];
            f_diagonal_sum += matrix[row-i-1][i];
        }

        //System.out.println(b_diagonal_sum +" "+f_diagonal_sum);
        if(b_diagonal_sum != magic_sum || f_diagonal_sum != magic_sum)
            return "No";

        return "Yes";
    }
}
