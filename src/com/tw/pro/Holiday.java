package com.tw.pro.classes;

import java.lang.String;
public class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month){
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public boolean inSameMonth(Holiday h){
        if(this.name == h.name && this.month == h.month && this.day == h.day)
            return true;
        // ob1.equals(obj2) can be used
        return false;
    }

    public double avgDate(Holiday[] holidays){
        double average = 0;
        for(int i = 0; i < holidays.length; i++){
            average += holidays[i].day;
        }

        return average/holidays.length;
    }
}
