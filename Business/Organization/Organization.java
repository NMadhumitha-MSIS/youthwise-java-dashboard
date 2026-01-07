/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Network.EnterpriseNetwork;
import Business.Roles.Role;
import Business.Student.Student;
import Business.Student.StudentDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bbpri
 */
public abstract class Organization {
    private String name;
    private String orgName;
    private EnterpriseNetwork network;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
     private StudentDirectory studentDirectory;
    private int organizationID;
    private static int counter=0;
    private Type type; 
    
    public enum Type{
        Admin("Admin Organization"),
        Parent("Parent Organization") ,
        Student("Student Organization"),
        Teacher("Teacher Organization"),
        MedicalDoctor("Medical Doctor Organization"),
        DentalDoctor("Dental Doctor Organization"),
        Psychiatrist("Psychiatrist Organization"),
        SportsCoach("Sports Coach Organization"),
        Nutritionist("Nutritionist Organization"),
        SportsEventManager("Sports Event Manager Organization");
       
        private String value;
        
        private Type(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
        
    }


    public Organization(String name) {
        this.name = name;
        this.network = network;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        studentDirectory = new StudentDirectory();
        ++counter;
    }

    public Organization(String name,Type type) {
        this.name = name;
        this.network = network;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        studentDirectory = new StudentDirectory();
        ++counter;
        this.type=type;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    
    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }
    
    public List<Student> getAllStudents() {
        return studentDirectory.getStudentList();
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
