/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Network.EnterpriseNetwork;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author bbpri
 */
public class NutritionEnterprise extends Enterprise {
    public NutritionEnterprise(String name, EnterpriseNetwork network){
        super(name,Enterprise.EnterpriseType.NutritionEnterprise, network);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
