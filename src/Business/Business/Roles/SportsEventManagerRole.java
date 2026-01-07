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
import ui.Organization.SportsEventManagerRole.SportsEventManagerWorkAreaJPanel;

/**
 *
 * @author bbpri
 */
public class SportsEventManagerRole extends Role{
    public SportsEventManagerRole(){  
        this.type = Role.RoleType.SportsEventManager;
    }


    @Override
    public JPanel createWorkArea(JSplitPane splitPane, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new SportsEventManagerWorkAreaJPanel( splitPane, account, organization, system);
    }
    
}
