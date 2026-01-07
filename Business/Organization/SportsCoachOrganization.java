/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Roles.Role;
import Business.Roles.SportsCoachRole;

import java.util.ArrayList;

/**
 *
 * @author bbpri
 */
public class SportsCoachOrganization extends Organization{
    public SportsCoachOrganization() {
        super(Organization.Type.SportsCoach.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SportsCoachRole());
        return roles;
    }
}
