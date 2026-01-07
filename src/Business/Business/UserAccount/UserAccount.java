/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Parent.Parent;
import Business.Roles.Role;
import Business.Student.Student;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author bbpri
 */
public class UserAccount {
    private String username;
    private String password;
    private Employee employee;
    private Parent parent;
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    private Role role;

    public Parent getParent() {
        return parent;
    }
    private WorkQueue workQueue;

    public UserAccount() {
        workQueue = new WorkQueue();
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }


    public void setParent(Parent parent) {
        this.parent = parent;
    }
    
    @Override
    public String toString() {
        return username;
    }
    
}
