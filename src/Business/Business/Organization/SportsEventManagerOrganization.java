/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Roles.Role;
import Business.Roles.SportsEventManagerRole;
import java.util.ArrayList;

/**
 *
 * @author bbpri
 */
public class SportsEventManagerOrganization extends Organization{
    public SportsEventManagerOrganization() {
        super(Organization.Type.SportsEventManager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SportsEventManagerRole());
        return roles;
    }
    
}
