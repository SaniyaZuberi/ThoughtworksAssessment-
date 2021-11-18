package com.tw.pro.controlstatements;

import java.util.Scanner;

public class Salary {
    int extraHourAbove8 = 15;
    int extraWeekHourAbove40 = 25;
    int saturdayBonus = 125; // per hour 100 so 25% = 125
    int sundayBonus = 150;
    int[] weekHour = new int[7];

    public void setInput(){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 7; i++)
            weekHour[i] = input.nextInt();
    }

    public int getSalary(){
        int salary = 0;
        int totalHours = 0;
        int i = 0;
        while(i < 5){
            totalHours += weekHour[i];
            if(weekHour[i] <= 8)
                salary += weekHour[i] * 100;
            else if(weekHour[i] > 8)
                salary += (extraHourAbove8 * (weekHour[i]-8)) + 800;

            i++;
        }

        if(totalHours > 40)
            salary += (totalHours-40) * extraWeekHourAbove40;

        if(weekHour[5] != 0)
            salary += weekHour[5] * saturdayBonus;

        if(weekHour[6] != 0)
            salary += weekHour[6] * sundayBonus;

        return salary;
    }
}
