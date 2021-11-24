package com.tw.pro.classes.alYasmeen;

import java.lang.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlYasmeenAdmin {
    private static ArrayList<String> students;
    private Scanner studentData = new Scanner(System.in);

    protected void addStudents(int studentNo){
        students = new ArrayList<String>(studentNo);
        for(int i = 0; i < studentNo; i++) {
            String name = studentData.next();
            students.add(name);
        }
    }

    protected void deleteStudent(String studentToBeDeleted){
        int positionOfStudentToBeDeleted = students.indexOf(studentToBeDeleted);
        students.remove(positionOfStudentToBeDeleted);
    }

    protected void updateStudentData(String studentToBeUpdated, String studentUpdatedData){
        int positionOfStudentToBeUpdated = students.indexOf(studentToBeUpdated);
        students.set(positionOfStudentToBeUpdated, studentUpdatedData);
    }

    public void displayStudents(){
        Iterator it = students.iterator();

        while(it.hasNext())
            System.out.print(it.next() + "\n");
    }
}
