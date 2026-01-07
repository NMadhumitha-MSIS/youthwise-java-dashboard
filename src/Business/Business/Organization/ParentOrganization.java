/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Roles.ParentRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author bbpri
 */
public class ParentOrganization  extends Organization{
//    public ParentOrganization() {
//        super(Organization.Type.Parent.getValue());
//    }
    public ParentOrganization() {
        super("Parent Organiztion", Type.Parent);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ParentRole());
        return roles;
    }
    
}
