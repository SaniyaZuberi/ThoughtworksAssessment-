package com.tw.pro;

import com.tw.pro.arrays.ArrayType;
import com.tw.pro.arrays.DetectTriangle;
import com.tw.pro.controlstatements.CollatzSequence;

public class Main {

    public static void main(String[] args) {
        /* Registration u = new Registration();
        u.getInput();
        System.out.println((u.isPossibleTopper()));
        */

        /* MeanMedianMode object1 = new MeanMedianMode();
       object1.setArrayInputs();
       System.out.println("Mean:"+String.format("%.4f", object1.getMean()));
        System.out.println("Median:"+String.format("%.4f", object1.getMedian()));
        System.out.println("Mode:"+object1.getMode());

         */

        /* MagicSquare test = new MagicSquare();
        test.setArray();
        System.out.println(test.findMagicSquare());
        */

        /*
        CollatzSequence sequence = new CollatzSequence();
        sequence.setNumber();
        sequence.generateCollatzSequence();
        */

        /*Range r1 = new Range();
        r1.setInput();
        System.out.println("Possible Range:"+ r1.findRange());
         */

        /*ArrayType a1 = new ArrayType();
        a1.setInput();
        if(a1.determineArrayType() == 1)
            System.out.println("Even");
        else if(a1.determineArrayType() == 2)
            System.out.println("Odd");
        else
            System.out.println("Mixed");
         */

        DetectTriangle t1 = new DetectTriangle();
        t1.setInput();
        System.out.println("Lower Triangle:" + t1.checkLowerTriangle());
        System.out.println("Upper Triangle:" + t1.checkUpperTriangle());
 }
}
