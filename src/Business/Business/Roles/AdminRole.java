/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import ui.Enterprise.AdminRole.AdminWorkAreaJPanel;

/**
 *
 * @author bbpri
 */
public class AdminRole extends Role {
        public AdminRole(){
        this.type = RoleType.EnterpriseAdmin;
    }
    
    @Override
    public JPanel createWorkArea(JSplitPane splitPane, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        
        return new AdminWorkAreaJPanel(splitPane, business, enterprise, account);
    }

    
}
