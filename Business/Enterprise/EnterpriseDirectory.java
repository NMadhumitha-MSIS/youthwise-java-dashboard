/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Network.EnterpriseNetwork;
import java.util.ArrayList;

/**
 *
 * @author bbpri
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type, EnterpriseNetwork network){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.EducationalEnterprise){
            enterprise=new EducationalEnterprise(name, network);
            enterpriseList.add(enterprise);
        } else if (type==Enterprise.EnterpriseType.HealthCareEnterprise){
            enterprise=new HealthCareEnterprise(name, network);
            enterpriseList.add(enterprise);
        }else if (type==Enterprise.EnterpriseType.NutritionEnterprise){
            enterprise=new NutritionEnterprise(name, network);
            enterpriseList.add(enterprise);
        }else if (type==Enterprise.EnterpriseType.SportsEnterprise){
            enterprise=new SportsEnterprise(name, network);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
    // Find enterprises by type
//    public ArrayList<Enterprise> findEnterprisesByType(Enterprise.EnterpriseType type) {
      public ArrayList<Enterprise> findEnterprisesByType(Enterprise.EnterpriseType type) {
        ArrayList<Enterprise> result = new ArrayList<>();
        for (Enterprise enterprise : enterpriseList) {
            if (enterprise.getEnterpriseType() == type) {
                result.add(enterprise);
            }
        }
        return result;
    }
    
     // Find enterprise by name
    public Enterprise findEnterpriseByName(String name) {
        for (Enterprise enterprise : enterpriseList) {
            if (enterprise.getName().equalsIgnoreCase(name)) {
                return enterprise;
            }
        }
        return null;
    }
    
}
