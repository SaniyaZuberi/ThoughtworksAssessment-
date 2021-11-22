package com.tw.pro.ExceptionalHandling;

import java.util.Scanner;
import java.lang.Exception;

public class MyException extends Exception
{
    private int detail;
    public MyException(int a)
    {
        detail=a;
    }
    public String toString()
    {
        return "MyException["+detail+"]";
    }
}

