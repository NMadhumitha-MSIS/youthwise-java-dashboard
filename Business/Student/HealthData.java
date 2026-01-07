/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Student;

import java.util.List;

/**
 *
 * @author bbpri
 */
public class HealthData {

    private double bmi;
    private double bloodPressure;
    private double cholesterolLevel;
    private List<String> medicalConditions;  // E.g., diabetes, asthma
    private boolean isAllergicToCertainFoods;
    private String recentPrescriptions;

    public HealthData(double bmi, double bloodPressure, double cholesterolLevel, boolean isAllergicToCertainFoods, String recentPrescriptions) {
        this.bmi = bmi;
        this.bloodPressure = bloodPressure;
        this.cholesterolLevel = cholesterolLevel;
        this.medicalConditions = medicalConditions;
        this.isAllergicToCertainFoods = isAllergicToCertainFoods;
        this.recentPrescriptions = recentPrescriptions;
    }
        
}
