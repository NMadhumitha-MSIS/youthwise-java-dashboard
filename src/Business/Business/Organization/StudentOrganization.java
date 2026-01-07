/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Roles.StudentRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author bbpri
 */
public class StudentOrganization extends Organization {
//    public StudentOrganization() {
//        super(Organization.Type.Student.getValue());
//    }
    public StudentOrganization() {
        super("Student Organization",Type.Student);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new StudentRole());
        return roles;
    }
    
}
