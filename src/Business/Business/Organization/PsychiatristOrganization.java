/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Roles.PsychiatristRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author bbpri
 */
public class PsychiatristOrganization extends Organization{
//    public PsychiatristOrganization() {
//        super(Type.Psychiatrist.getValue());
//    }
    
    public PsychiatristOrganization() {
        super("Psychiatrist Organization",Type.Psychiatrist);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PsychiatristRole());
        return roles;
    }
    
}
