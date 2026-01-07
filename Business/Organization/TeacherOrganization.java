/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Roles.Role;
import Business.Roles.TeacherRole;
import Business.Student.StudentDirectory;
import java.util.ArrayList;

/**
 *
 * @author bbpri
 */
public class TeacherOrganization extends Organization{
    
    StudentDirectory studentDirectory;

    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(StudentDirectory studentDirectory) {
        this.studentDirectory = studentDirectory;
    }
    
    public TeacherOrganization() {
        super("Teacher Organization",Type.Teacher);
    }

    // public TeacherOrganization() {
    //     super(Organization.Type.Teacher.getValue());
    // }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TeacherRole());
        return roles;
    }
    
    
}
