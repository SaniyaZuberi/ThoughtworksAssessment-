package com.tw.pro.classes.alYasmeen;

import java.lang.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlYasmeenAdmin {
    private static ArrayList<StudentDatabase> students;
    Scanner studentData = new Scanner(System.in);

    protected void addStudents(int studentNo) {
        students = new ArrayList<StudentDatabase>(studentNo);
        for (int i = 0; i < studentNo; i++) {
            String name = studentData.next();
            int registerNo = studentData.nextInt();
            char grade = studentData.next().charAt(0);

            students.add(new StudentDatabase(registerNo, name, grade));
        }
    }

    protected void deleteStudent(String studentToBeDeleted) {
        for(StudentDatabase student: students) {
            if(student.getStudentName() == studentToBeDeleted) {
                int positionOfStudentToBeDeleted = students.indexOf(studentToBeDeleted);
                students.remove(positionOfStudentToBeDeleted);
            }
        }
    }

    protected void updateStudentName(String studentToBeUpdated, String studentUpdatedName) {
        for(StudentDatabase student: students) {
            if(student.getStudentName().equals(studentToBeUpdated)) {
                //int positionOfStudentToBeUpdated = students.indexOf(studentToBeUpdated);
                student.setStudentName(studentUpdatedName);
                //students.set(positionOfStudentToBeUpdated, student);
                System.out.println("Value Updated");
            }
        }

    }

    protected void updateStudentRegistrationNo(String studentToBeUpdated, int studentUpdatedNumber) {
        for(StudentDatabase student: students) {
            if(student.getStudentName().equals(studentToBeUpdated)) {
                //int positionOfStudentToBeUpdated = students.indexOf(studentToBeUpdated);
                student.setStudentRegistrationNo(studentUpdatedNumber);
                //students.set(positionOfStudentToBeUpdated, student);
            }
        }

    }

    protected void updateStudentGrade(String studentToBeUpdated, char studentUpdatedGrade) {
        for(StudentDatabase student: students) {
            if(student.getStudentName() == studentToBeUpdated) {
                //int positionOfStudentToBeUpdated = students.indexOf(studentToBeUpdated);
                student.setStudentGrade(studentUpdatedGrade);
                //students.set(positionOfStudentToBeUpdated, student);
            }
        }

    }

    public void displayStudents() {
        for(StudentDatabase student: students){
            System.out.println(student.getStudentRegistrationNo()+" "+student.getStudentName()+" "+student.getStudentGrade());
        }
    }
}
