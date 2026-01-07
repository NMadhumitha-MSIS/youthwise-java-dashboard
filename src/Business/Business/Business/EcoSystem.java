/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Business;

import Business.Events.Event;
import Business.Network.EnterpriseNetwork;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Parent.ParentDirectory;
import Business.Roles.NetworkAdmin;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author bbpri
 */
public class EcoSystem extends Organization  {
    
    private static EcoSystem business;
    private ArrayList<EnterpriseNetwork> networkList;
    private OrganizationDirectory organizationDirectory;
    private EnterpriseNetwork network;
    private ParentDirectory parentdirectory;
    
    // Add an Event Directory
    private ArrayList<Event> eventDirectory;
    
    public static EcoSystem getInstance(){
        if(business==null){
            System.out.println("Ecosystem isntance is null, initializing now.");
            business=new EcoSystem();
        }else{
            System.out.println("Ecosystem instance already exists");
        }
        return business;
    }
    
    public EnterpriseNetwork createAndAddNetwork(){
        EnterpriseNetwork network=new EnterpriseNetwork();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new NetworkAdmin());
        return roleList;
    }
    public EcoSystem(){
        super(null);
        networkList=new ArrayList<EnterpriseNetwork>();
        organizationDirectory=new OrganizationDirectory();
        parentdirectory=new ParentDirectory();
        
        // Initialize the Event Directory
        eventDirectory = new ArrayList<>();
    }
    
        // Method to Add an Event
    public void addEvent(Event event) {
        eventDirectory.add(event);
    }

    // Getter for the Event Directory
    public ArrayList<Event> getEventDirectory() {
        return eventDirectory;
    }

    public ArrayList<EnterpriseNetwork> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<EnterpriseNetwork> networkList) {
        this.networkList = networkList;
    }
    
    public EnterpriseNetwork findNetwork(String name)
    {
        for(EnterpriseNetwork en: networkList)
        {
            if(en.getName().equals(name))
              network=en;  
        }
        return network;
    }
        
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }
    
    public ParentDirectory getParentdirectory() {
        return parentdirectory;
    }

    public void setParentdirectory(ParentDirectory parentdirectory) {
        this.parentdirectory = parentdirectory;
    }
    
    @Override
    public String toString(){
        return "Ecosystem instance with "+networkList.size()+ " networks.";
    }

    public String getCommentsForStudent(int studentid) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
       
}
