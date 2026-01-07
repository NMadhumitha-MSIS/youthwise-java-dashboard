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
import ui.Organization.PsychiatristRole.PsychiatristWorkAreaJPanel;


/**
 *
 * @author bbpri
 */
public class PsychiatristRole extends Role {
    public PsychiatristRole(){  
        this.type = Role.RoleType.Psychiatrist;
    }


    @Override
    public JPanel createWorkArea(JSplitPane splitPane, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new PsychiatristWorkAreaJPanel( splitPane, account, organization, system);
    }
    
}
