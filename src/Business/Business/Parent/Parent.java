/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Parent;

import Business.Student.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;

/**
 *
 * @author bbpri
 */
public class Parent {
    
    private String name;
    private int id;
    private String email;
    private String pno;
    private String parentof;
    private static int count = 0;
    private List<Student> students;
    
    public Parent(String Name,String email, String PNo, String ParentOf) {
        count++;
        id = count;
        this.name = Name;
        this.email=email;
        this.pno=PNo;
        this.parentof=ParentOf;
        this.students = new ArrayList<>();
    }
    
    public Parent(String Name,String PNo){
        count++;
        id = count;
        this.name = Name;
        this.pno=PNo;
        this.students = new ArrayList<>();
    }
    
    public void addStudent(Student student){
        students.add(student);
        student.setParent(this);
    }

    public List<Student> getStudent() {
        return students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public String getParentof() {
        return parentof;
    }

    public void setParentof(String parentof) {
        this.parentof = parentof;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
