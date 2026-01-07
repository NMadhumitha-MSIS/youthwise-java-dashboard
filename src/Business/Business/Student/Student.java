/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Student;

import Business.Parent.Parent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;

/**
 *
 * @author bbpri
 */
public class Student {

    private int studentid;
    private String name;
    private int age;
    private String gender;
    private String parentname;
    private String parentphno;
    private String parentemail;
    private ImageIcon logoImage;
    private static int count = 0;
    private String grade;
    private Parent parent;
    private double Height;
    private double Weight;
    private Map<String, Boolean> immunizationRecords;
    private Map<String, String> feedback;
    private double bmi;
    private String bmiCategory;
    private String mealPlan;

    private String diagnosis; //Added by Nana

    //for sports
    //Setters and getters for performance metrics
    private String gamePlayed;
    private String speed;
    private String strength;
    private String endurance;
    private String mentalFocus;
    private int performanceScore;
    private String coachComments;

    public void setGamePlayed(String gamePlayed) {
        this.gamePlayed = gamePlayed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public void setEndurance(String endurance) {
        this.endurance = endurance;
    }

    public void setMentalFocus(String mentalFocus) {
        this.mentalFocus = mentalFocus;
    }

    public void setPerformanceScore(int performanceScore) {
        this.performanceScore = performanceScore;
    }

    public void setCoachComments(String coachComments) {
        this.coachComments = coachComments;
    }

    public String getGamePlayed() {
        return gamePlayed;
    }

    public String getSpeed() {
        return speed;
    }

    public String getStrength() {
        return strength;
    }

    public String getEndurance() {
        return endurance;
    }

    public String getMentalFocus() {
        return mentalFocus;
    }

    public int getPerformanceScore() {
        return performanceScore;
    }

    public String getCoachComments() {
        return coachComments;
    }

    private Map<String, Map<String, String>> gamePerformances = new HashMap<>();

    public void addGamePerformance(String gameName, Map<String, String> performance) {
        if (gamePerformances == null) {
            gamePerformances = new HashMap<>();
        }
        gamePerformances.put(gameName, performance);
        System.out.println("Performance added for game " + gameName + ": " + gamePerformances.get(gameName));
    }

    public String getParentemail() {
        return parentemail;
    }

    public void setParentemail(String parentemail) {
        this.parentemail = parentemail;
    }

    public Map<String, Map<String, String>> getGamePerformances() {
        System.out.println("Game performaces are as follows \n" + gamePerformances);
        return gamePerformances;
    }

    public Parent getParent() {
        return parent;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double Height) {
        this.Height = Height;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double Weight) {
        this.Weight = Weight;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    private Map<String, Integer> sleepHours; // Map to store sleep hours for each day
    private Map<String, Integer> calorieIntake; // Map to store calorie intake for each day
//    private Map<String, Integer> weight; // Map to store weight for each day
//    private Map<String, Integer> height;

    // private HealthData healthData;
    // private ActivityData activityData;
    // private MealPlan mealPlan;
    // Map to store test marks
    private Map<String, Map<String, Integer>> testMarks;

    private int attendancePercentage;
    private double totalMarks;
    private double cgpa;
    private String grade_score;

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname;
    }

    public String getParentphno() {
        return parentphno;
    }

    public void setParentphno(String parentphno) {
        this.parentphno = parentphno;
    }

    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public Map<String, Integer> getSleepHours() {
        return sleepHours;
    }

    public void setSleepHours(Map<String, Integer> sleepHours) {
        this.sleepHours = sleepHours;
    }

    public Map<String, Integer> getCalorieIntake() {
        return calorieIntake;
    }

    public void setCalorieIntake(Map<String, Integer> calorieIntake) {
        this.calorieIntake = calorieIntake;
    }

//    public Map<String, Integer> getWeight() {
//        return weight;
//    }
//
//    public void setWeight(Map<String, Integer> weight) {
//        this.weight = weight;
//    }
//    public Map<String, Integer> getHeight() {
//        return height;
//    }
//
//    public void setHeight(Map<String, Integer> height) {
//        this.height = height;
//    }
    public Student(String name, int age, String gender, String parentname, String parentphno, double Height, double Weight,String Email) {
        count++;
        studentid = count;

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.parentname = parentname;
        this.parentphno = parentphno;
        this.testMarks = new HashMap<>();
        this.attendancePercentage = 0;
        this.totalMarks = 0;
        this.cgpa = 0;
        this.grade = "";
        this.Height = Height;
        this.Weight = Weight;
        this.parentemail=Email;
        immunizationRecords = new HashMap<>();
        immunizationRecords.put("Hepatitis", false);
        immunizationRecords.put("Measles", false);
        immunizationRecords.put("Polio", false);
        this.feedback = new HashMap<>();
        gamePerformances = new HashMap<>();

    }

    //  public HealthData getHealthData() {
    //     return healthData;
    // }
    // public ActivityData getActivityData() {
    //     return activityData;
    // }
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    //Added by Nana
    public String getSportsParticipation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //Added by Nana
    /**
     *
     * @param text
     */
    //Added by Nana
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Map<String, Map<String, Integer>> getTestMarks() {
        return testMarks;
    }

    public void setMarksForTest(String testName, Map<String, Integer> marks) {
        this.testMarks.put(testName, marks);
    }

    public Map<String, Integer> getMarksForTest(String testName) {
        return this.testMarks.get(testName);
    }

    public void displayMarks() {
        System.out.println("Marks for " + this.name + ":");
        for (String testName : testMarks.keySet()) {
            System.out.println("Test: " + testName);
            Map<String, Integer> marks = testMarks.get(testName);
            for (String subject : marks.keySet()) {
                System.out.println("  " + subject + ": " + marks.get(subject));
            }
        }
    }

    public int getAttendancePercentage() {
        return attendancePercentage;
    }

    public void setAttendancePercentage(int attendancePercentage) {
        this.attendancePercentage = attendancePercentage;
    }

    @Override
    public String toString() {
        return name;  // Or any other string representation of the student
    }

    public Map<String, String> getFeedback() {
        return feedback;
    }

    public void setFeedback(Map<String, String> feedback) {
        this.feedback = feedback;
    }

    public void setFeedbackTest(String testName, String feedback) {
        this.feedback.put(testName, feedback);
    }

    public String getFeedbackTest(String testName) {
        return this.feedback.getOrDefault(testName, "");
    }

    // Method to calculate total marks
    public double getTotalMarks() {
        double total = 0;
        int subjectCount = 0;

        for (Map<String, Integer> marks : testMarks.values()) {
            for (int mark : marks.values()) {
                total += mark;
                subjectCount++;
            }
        }
        return total;
    }

    // Method to calculate GPA based on total marks
    public double calculateGPA(double totalMarks) {
        double percentage = (totalMarks / getTotalPossibleMarks()) * 100;

        if (percentage >= 90) {
            return 4.0;
        } else if (percentage >= 80) {
            return 3.7;
        } else if (percentage >= 70) {
            return 3.0;
        } else if (percentage >= 60) {
            return 2.5;
        } else if (percentage >= 50) {
            return 2.0;
        } else {
            return 1.0; // Fail
        }
    }

    // Method to calculate CGPA (assuming each test has equal weight)
    public double getCGPA() {
        double totalMarks = getTotalMarks();
        cgpa = calculateGPA(totalMarks);
        return cgpa;
    }

    // Method to calculate the grade
    public String getGrade_Score() {
        double total = getTotalMarks();
        double percentage = (total / getTotalPossibleMarks()) * 100;

        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else {
            grade = "D";
        }
        return grade;
    }

    // Method to get the total possible marks
    public double getTotalPossibleMarks() {
        // Assuming the student is tested on the same number of subjects across all tests
        // The maximum marks for each subject is 100. Modify this if required.
        int totalSubjects = 0;
        for (Map<String, Integer> marks : testMarks.values()) {
            totalSubjects += marks.size(); // Add the number of subjects in each test
        }
        return totalSubjects * 100; // Assuming each subject has a maximum of 100 marks
    }

    // Getter for CGPA
    public double getCGPAValue() {
        return cgpa;
    }

    // Getter for Grade score
    public String getGradeValue() {
        return grade_score;
    }

    public Boolean getImmunizationStatus(String vaccine) {
        return immunizationRecords.getOrDefault(vaccine, false);
    }

    public void updateImmunization(String vaccine, boolean status) {
        immunizationRecords.put(vaccine, status);
    }

    public Map<String, Boolean> getAllImmunizations() {
        return immunizationRecords;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public String getBmiCategory() {
        return bmiCategory;
    }

    public void setBmiCategory(String bmiCategory) {
        this.bmiCategory = bmiCategory;
    }

    public String getMealPlan() {
        return mealPlan;
    }

    public void setMealPlan(String mealPlan) {
        this.mealPlan = mealPlan;
    }

    public String getDoctorComments() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setTreatmentPrescription(String prescription) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getTreatmentPrescription() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setDoctorComments(String doctorComments) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
