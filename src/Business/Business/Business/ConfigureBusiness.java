/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Business;

import Business.Roles.AdminRole;
import Business.Roles.NutritionistRole;

import Business.Parent.Parent;
import Business.Parent.ParentDirectory;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.EnterpriseNetwork;
import Business.Organization.Organization;
import Business.Organization.StudentOrganization;
import Business.Roles.AdminRole;
import Business.Roles.DentalDoctorRole;
import Business.Roles.ParentRole;
import Business.Roles.StudentRole;
import Business.Roles.NutritionistRole;
import Business.Roles.MedicalDoctorRole;
import Business.Roles.PsychiatristRole;
import Business.Roles.Role;
import Business.Roles.SportsCoachRole;
import Business.Roles.SportsEventManagerRole;
import Business.Roles.SuperAdminRole;
import Business.Roles.TeacherRole;
import Business.Student.Student;
import Business.Student.StudentDirectory;
import Business.UserAccount.UserAccount;

/**
 *
 * @author bbpri
 */
public class ConfigureBusiness {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();
        EnterpriseNetwork network = system.createAndAddNetwork();
        // Set a name for the network
        network.setName("YouthWiseNetwork");

        Employee employee1 = system.getEmployeeDirectory().createEmployee("superadmin");
        UserAccount superadmin = system.getUserAccountDirectory().createUserAccount("superadmin", "superadmin", employee1, new SuperAdminRole());

        // Create and add a Educational Enterprise to the network
        Enterprise enterprise1 = network.getEnterpriseDirectory().createAndAddEnterprise("EducationalEnterprise", Enterprise.EnterpriseType.EducationalEnterprise, network);
        Organization organization = enterprise1.getOrganizationDirectory().createOrganization(Organization.Type.Teacher, "TeacherOrganization");
        System.out.println("Created organization type: " + organization.getName());

        Employee employee2 = organization.getEmployeeDirectory().createEmployee("Ross Geller");
        UserAccount ua1 = organization.getUserAccountDirectory().createUserAccount("Ross", "Ross@1234", employee2, new TeacherRole());
        Employee employee3 = organization.getEmployeeDirectory().createEmployee("Rachel Green");
        UserAccount ua2 = organization.getUserAccountDirectory().createUserAccount("Rachel", "Rachel@1234", employee3, new TeacherRole());
        Employee enterpriseadmin1 = enterprise1.getEmployeeDirectory().createEmployee("EducationalEnterpriseAdmin");
        UserAccount uaea1 = enterprise1.getUserAccountDirectory().createUserAccount("EducationAdmin", "Education@1234", enterpriseadmin1, new AdminRole());

        // Create and add HealthCare Enterprise to the network
        Enterprise enterprise2 = network.getEnterpriseDirectory().createAndAddEnterprise("HealthCareEnterprise", Enterprise.EnterpriseType.HealthCareEnterprise, network);
        Organization organization2 = enterprise2.getOrganizationDirectory().createOrganization(Organization.Type.MedicalDoctor, "MedicalDoctorOrganization");
        Employee employee4 = organization2.getEmployeeDirectory().createEmployee("Harshita");
        UserAccount ua3 = organization2.getUserAccountDirectory().createUserAccount("Harshita", "Harshita@1234", employee4, new MedicalDoctorRole());
        Organization organization8 = enterprise2.getOrganizationDirectory().createOrganization(Organization.Type.DentalDoctor, "DentalDoctorOrganization");
        Employee employee5 = organization8.getEmployeeDirectory().createEmployee("Meghana");
        UserAccount ua4 = organization8.getUserAccountDirectory().createUserAccount("Meghana", "Megana@1234", employee5, new DentalDoctorRole());
        Organization organization9 = enterprise2.getOrganizationDirectory().createOrganization(Organization.Type.Psychiatrist, "PsychiatristOrganization");
        Employee employee12 = organization9.getEmployeeDirectory().createEmployee("Rakshita");
        UserAccount ua13 = organization9.getUserAccountDirectory().createUserAccount("Rakshita", "Rakshita@1234", employee12, new PsychiatristRole());
        Employee enterpriseadmin2 = enterprise2.getEmployeeDirectory().createEmployee("HealthCareEnterpriseAdmin");
        UserAccount uaea2 = enterprise2.getUserAccountDirectory().createUserAccount("HealthCareAdmin", "HealthCare@1234", enterpriseadmin2, new AdminRole());

        // Create and add a Nutrition Enterprise to the network
        Enterprise enterprise3 = network.getEnterpriseDirectory().createAndAddEnterprise("NutritionEnterprise", Enterprise.EnterpriseType.NutritionEnterprise, network);
        Organization organization3 = enterprise3.getOrganizationDirectory().createOrganization(Organization.Type.Nutritionist, "NutritionistOrganization");
        Employee employee6 = organization3.getEmployeeDirectory().createEmployee("Prakash");
        UserAccount ua5 = organization3.getUserAccountDirectory().createUserAccount("Prakash", "Prakash@1234", employee6, new NutritionistRole());
        Employee employee7 = organization3.getEmployeeDirectory().createEmployee("Praveen");
        UserAccount ua6 = organization3.getUserAccountDirectory().createUserAccount("Praveen", "Praveen@1234", employee7, new NutritionistRole());
        Employee enterpriseadmin3 = enterprise3.getEmployeeDirectory().createEmployee("NutritionEnterpriseAdmin");
        UserAccount uaea3 = enterprise3.getUserAccountDirectory().createUserAccount("NutritionAdmin", "Nutrition@1234", enterpriseadmin3, new AdminRole());

        // Create and add a SportsEnterprise to the network
        Enterprise enterprise4 = network.getEnterpriseDirectory().createAndAddEnterprise("SportsEnterprise", Enterprise.EnterpriseType.SportsEnterprise, network);
        Organization organization4 = enterprise4.getOrganizationDirectory().createOrganization(Organization.Type.SportsCoach, "SportsCoachOrganization");
        Employee employee8 = organization4.getEmployeeDirectory().createEmployee("Manish");
        UserAccount ua7 = organization4.getUserAccountDirectory().createUserAccount("Manish", "Manish@1234", employee8, new SportsCoachRole());
//        Employee employee9 = organization4.getEmployeeDirectory().createEmployee("FootballCoach");
//        UserAccount ua8 = organization4.getUserAccountDirectory().createUserAccount("FootballCoach", "football@1234", employee9, new SportsCoachRole());

        // Add a SportsEventManager Organization to SportsEnterprise in the network
        Organization organization5 = enterprise4.getOrganizationDirectory().createOrganization(Organization.Type.SportsEventManager, "SportsEventManagerOrganization");
        Employee employee10 = organization5.getEmployeeDirectory().createEmployee("CricketTournament");
        UserAccount ua9 = organization5.getUserAccountDirectory().createUserAccount("CricketFournament", "criket@1234", employee10, new SportsEventManagerRole());
        Employee employee11 = organization5.getEmployeeDirectory().createEmployee("FootballTournament");
        UserAccount ua10 = organization5.getUserAccountDirectory().createUserAccount("FootballTournament", "football@1234", employee11, new SportsEventManagerRole());
        Employee enterpriseadmin4 = enterprise4.getEmployeeDirectory().createEmployee("SportsEnterpriseAdmin");
        UserAccount uaea4 = enterprise4.getUserAccountDirectory().createUserAccount("SportsAdmin", "Sports@1234", enterpriseadmin4, new AdminRole());

        //Parent account creation
        Organization organization6 = system.getOrganizationDirectory().createOrganization(Organization.Type.Parent, "Parent");
        ParentDirectory parentlist = new ParentDirectory();
        Parent parent = parentlist.createParent("Mary", "mary@gmail.com", "+919898989888", "John");
        UserAccount ua11 = organization6.getUserAccountDirectory().createUserAccount("mary", "mary@1234", new ParentRole());
        ua11.setParent(parent);

        //TODO : Student account creation
        Organization organization7 = system.getOrganizationDirectory().createOrganization(Organization.Type.Student, "Student");
        StudentDirectory studentlist = new StudentDirectory();
        Student student = studentlist.createStudent("Madhu", 12, "Female", "Mary", "+919898989888", 161, 78,"abc@gmail.com");
        UserAccount ua12 = organization.getUserAccountDirectory().createUserAccount("Madhu", "Madhu@1234", new StudentRole());
        System.out.println("Student name is " + student.getName() + " Parent name is " + student.getParentname());
        parent.setParentof("Madhu");
        student.setParent(parent);
        parent.addStudent(student);
        ua12.setStudent(student);

        if (ua1.getRole() instanceof TeacherRole) {
            TeacherRole teacherRole = (TeacherRole) ua1.getRole();
            teacherRole.registerStudent(student, "Grade 5");
        } else {
            System.out.println("The user is not assigned a TeacherRole.");
        }

        System.out.println(student.getGrade());

        System.out.println("System in configure business is " + system);
        return system;
    }
}
