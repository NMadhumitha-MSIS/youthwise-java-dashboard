/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Student;

import Business.Parent.Parent;
import java.util.ArrayList;

/**
 *
 * @author bbpri
 */
public class StudentDirectory {
    private ArrayList<Student> studentList;
    Student student;

    public StudentDirectory() {
        studentList = new ArrayList();
    }
    
    public Student createStudent(String name, int age, String gender, String parentname,String phonenumber, double height, double weight, String email){
        Student student= new Student(name, age, gender,parentname,phonenumber,height,weight, email);
        studentList.add(student);    
        return student;
    }
    
    public Student findStudent(int studentid){
        for(Student s:studentList){
            if(s.getStudentid()==studentid){
                return s;
            }
        }
        return null;
    }
    
    public void deleteStudent(int studentid){
        Student s=findStudent(studentid);
        if(!(s==null)){
            studentList.remove(s);
        }else{
            System.out.println("Student not found");
        } 
    }
    
    public ArrayList<Student> getStudentList(){
        return studentList;
    }

    public Student findStudentByName(String name) {
        for (Student student : studentList) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student; // Student found
            }
        }
        return null; // Student not found
    }
    
}
