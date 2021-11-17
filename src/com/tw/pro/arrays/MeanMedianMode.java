package com.tw.pro.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class MeanMedianMode {
    int size;
    int[] array;

    public void setArrayInputs(){
            Scanner input = new Scanner(System.in);
            size = input.nextInt();
            array = new int[size];
            for(int i = 0; i < size; i++) {
                array[i] = input.nextInt();

            }
        }

    public float getMean(){
            float mean = 0;
            for(int i = 0; i < size; i++){
                mean += array[i];
            }

            mean /= size;
            return mean;
        }

     public float getMedian(){
            //float median = 0;
            Arrays.sort(array);
            if(size % 2 == 0)
                return (array[size/2 + 1] + array[size/2])/2;
            else
                return array[(size/2)];
        }

      public int getMode(){
            int maxValue = 0, maxCount = 0;

            for (int i = 0; i < size; i++) {
                int count = 0;
                for (int j = 0; j < size; j++) {
                    if (array[j] == array[i])
                        ++count;
                }

                if (count > maxCount) {
                    maxCount = count;
                    maxValue = array[i];
                }
            }
            return maxValue;
        }
}
