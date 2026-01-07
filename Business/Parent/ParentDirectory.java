/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Parent;

import java.util.ArrayList;

/**
 *
 * @author bbpri
 */
public class ParentDirectory {
    private ArrayList<Parent> parentList;
    Parent parent;

    public ParentDirectory() {
        parentList = new ArrayList();
    }
    
    public Parent createParent(String name,String email, String pno, String parentOf) {
        Parent parent=new Parent(name,email,pno, parentOf);
        parentList.add(parent);
        return parent; 
    }
    
    public boolean findParent(Parent p){
        boolean flag=false;
        for(Parent par:parentList){
            if(par.getId()==p.getId()){
                flag=true;
                break;
            }
        }
        return flag;
    }

    public ArrayList<Parent> getParentList(){
        return parentList;
    }
   
    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }
    
}
