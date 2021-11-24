package com.tw.pro.classes.alYasmeen;

public class AlYasmeenTeachers extends AlYasmeenAdmin{
    public void displayStudents(){
        super.displayStudents();
    }

    public void updateStudentName(String studentToBeUpdated, String studentUpdatedName){
        super.updateStudentName(studentToBeUpdated, studentUpdatedName);
    }

    public  void updateStudentRegistrationNo(String studentToBeUpdated, int studentUpdatedRegisterNo){
        super.updateStudentRegistrationNo(studentToBeUpdated, studentUpdatedRegisterNo);
    }

    public  void updateStudentGrade(String studentToBeUpdated, char studentUpdatedGrade){
        super.updateStudentRegistrationNo(studentToBeUpdated, studentUpdatedGrade);
    }

    public void addStudents(int studentNo){
        super.addStudents(studentNo);
    }

    public void deleteStudent(String studentToBeDeleted){
        super.deleteStudent(studentToBeDeleted);
    }
}
