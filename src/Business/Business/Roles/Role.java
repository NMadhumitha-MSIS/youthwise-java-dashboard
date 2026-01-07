/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.Business.EcoSystem;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import Business.Enterprise.Enterprise;
import javax.swing.JSplitPane;

/**
 *
 * @author bbpri
 */
public abstract class Role {

    public enum RoleType {
        EnterpriseAdmin("Enterprise Admin"),
        Admin("Admin"),
        Teacher("Teacher"),
        Student("Student"),
        Parent("Parent"),
        MedicalDoctor("Medical Doctor"),
        DentalDoctor("Dental Doctor"),
        Psychiatrist("Psychiatrist"),
        Nutritionist("Nutritionist"),
        SportsCoachs("SportsCoach"),
        SportsEventManager("SportsEventManager");
        

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public RoleType type;
    public abstract JPanel createWorkArea(JSplitPane splitPane, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business);
    
    @Override
    public String toString() {
        return (type != null) ? this.type.getValue() : this.getClass().getName();
    }  

}
