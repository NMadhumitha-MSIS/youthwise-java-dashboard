/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Teacher;

import Business.Student.Student;

/**
 *
 * @author bbpri
 */
public class Teacher {
    private String teacherId;
    private String name;

    public Teacher(String teacherId, String name) {
        this.teacherId = teacherId;
        this.name = name;
    }

    public void registerStudent(Student student, String grade) {
        student.setGrade(grade);
        System.out.println("Student " + student.getName() + " registered in grade " + grade);
    }

//    public void updateAttendance(Student student, int daysPresent) {
//        student.getActivityData().setAttendance(daysPresent);
//    }

    public void raiseHealthConcern(Student student, String concern) {
        System.out.println("Health concern raised for " + student.getName() + ": " + concern);
    }
    
}
