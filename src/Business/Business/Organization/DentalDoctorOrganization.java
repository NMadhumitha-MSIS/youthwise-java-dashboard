/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Roles.DentalDoctorRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author bbpri
 */
public class DentalDoctorOrganization extends Organization{
    public DentalDoctorOrganization() {
        super(Type.DentalDoctor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DentalDoctorRole());
        return roles;
    }
}
