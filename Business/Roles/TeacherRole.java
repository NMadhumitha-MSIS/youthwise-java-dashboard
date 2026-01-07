/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Student.Student;
import Business.UserAccount.UserAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import ui.Organization.TeacherRole.TeacherWorkAreaJPanel;

/**
 *
 * @author bbpri
 */
public class TeacherRole extends Role {

    private List<Student> registeredStudents;

    public TeacherRole() {
        this.type = Role.RoleType.Teacher;
        registeredStudents = new ArrayList<>();
    }

    @Override
    public JPanel createWorkArea(JSplitPane splitPane, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new TeacherWorkAreaJPanel(splitPane, account, organization, system);
    }

    public void registerStudent(Student student, String grade) {
        student.setGrade(grade);
        registeredStudents.add(student);
        System.out.println("Student " + student.getName() + " registered in grade " + grade);
    }

    /**
     * update marks function to update marks of a student in a specif test
     * @param student
     * @param testName
     * @param marks 
     */
    public void updateStudentMarks(Student student, String testName, Map<String, Integer> marks) {
        if (student != null) {
            student.setMarksForTest(testName, marks);
            System.out.println("Marks updated for student: " + student.getName() + " for test: " + testName);
        } else {
            System.out.println("Invalid student.");
        }
    }

    public void updateAttendance(Student student, int attendancePercentage) {
        if (student != null) {
            student.setAttendancePercentage(attendancePercentage);
            System.out.println("Updated attendance for " + student.getName() + ": " + attendancePercentage + "%");
        } else {
            System.out.println("Invalid student.");
        }
    }

    public List<Student> getRegisteredStudents() {
        return registeredStudents;
    }

    // Update immunization records for a student
    public void updateImmunizationRecords(Student student, Map<String, Boolean> immunizations) {
        if (student != null) {
            for (Map.Entry<String, Boolean> entry : immunizations.entrySet()) {
                student.updateImmunization(entry.getKey(), entry.getValue());
            }
            System.out.println("Immunization records updated for student: " + student.getName());
        } else {
            System.out.println("Invalid student.");
        }
    }

}
