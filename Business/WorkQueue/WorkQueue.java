/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author bbpri
 */
public class WorkQueue {
    private ArrayList<WorkRequest> workRequestTeacherList;
    private ArrayList<WorkRequest> workRequestNutritionList;
    private ArrayList<WorkRequest> workRequestPsychiatrist;
    private ArrayList<WorkRequest> emergencyWorkRequest;

    public WorkQueue() {
        workRequestTeacherList = new ArrayList();
        workRequestNutritionList = new ArrayList();
        workRequestPsychiatrist=new ArrayList<>();
        emergencyWorkRequest = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestTeacherList() {
        return workRequestTeacherList;
    }

    public ArrayList<WorkRequest> getWorkRequestNutritionList() {
        return workRequestNutritionList;
    }
    
    public ArrayList<WorkRequest> getWorkRequestPsychiatrist() {
        return workRequestPsychiatrist;
    }
    
    public ArrayList<WorkRequest> getEmergencyWorkRequest() {
        return emergencyWorkRequest;
    }
}
