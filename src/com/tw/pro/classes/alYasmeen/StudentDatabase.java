package com.tw.pro.classes.alYasmeen;

public class StudentDatabase {
    private int studentRegistrationNo;
    private String studentName;
    private char studentGrade;

    StudentDatabase(int registrationNo, String name, char grade){
        this.studentRegistrationNo = registrationNo;
        this.studentName = name;
        this.studentGrade = grade;
    }

    String getStudentName(){
        return this.studentName;
    }

    int getStudentRegistrationNo(){
        return this.studentRegistrationNo;
    }

    char getStudentGrade(){
        return this.studentGrade;
    }

    void setStudentName(String name){
        this.studentName = name;
    }

    void setStudentRegistrationNo(int registrationNo){
        this.studentRegistrationNo = registrationNo;
    }

    void setStudentGrade(char grade){
        this.studentGrade = grade;
    }
}
