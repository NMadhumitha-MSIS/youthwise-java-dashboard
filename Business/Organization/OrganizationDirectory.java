/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author bbpri
 */
public class OrganizationDirectory {
     private ArrayList<Organization> organizationList;
    Organization orgn;
    
    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Organization.Type type, String orgName) {
        Organization organization = null;
    
        if (type == Organization.Type.Parent) {
            organization = new ParentOrganization();
        } else if (type == Organization.Type.DentalDoctor) {
            organization = new DentalDoctorOrganization();
        } else if (type == Organization.Type.MedicalDoctor) {
            organization = new MedicalDoctorOrganization();
        } else if (type == Organization.Type.Nutritionist) {
            organization = new NutritionistOrganization();
        } else if (type == Organization.Type.Psychiatrist) {
            organization = new PsychiatristOrganization();
        } else if (type == Organization.Type.SportsCoach) {
            organization = new SportsCoachOrganization();
        } else if (type == Organization.Type.SportsEventManager) {
            organization = new SportsEventManagerOrganization();
        } else if (type == Organization.Type.Student) {
            organization = new StudentOrganization();
        } else if (type == Organization.Type.Teacher) {
            organization = new TeacherOrganization();
        }
    
        if (organization != null) {
            organization.setOrgName(orgName);
            organizationList.add(organization);
        }
        return organization;
    }
    
    public Organization findOrganization(Organization.Type type) {
        for (Organization org : organizationList) {
            if (org.getType() == type) { 
                return org;
            }
        }
        return null;
    }
    
}
