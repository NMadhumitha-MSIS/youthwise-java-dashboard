/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Business;

import javax.swing.JOptionPane;

/**
 *
 * @author bbpri
 */
public class Validation {

    // Validates a name (letters only, minimum length 5)
    public static boolean validateName(String name) {
        if (name == null || name.isEmpty() || !name.matches("^[A-Za-z]+(\\s[A-Za-z]+)*$") || name.length() < 5) {
            JOptionPane.showMessageDialog(null,
                    "Invalid Name or Parent Name: The name should contain only letters and be at least 5 characters long.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    // // Validates a parent name (letters only, minimum length 5)
    // public static boolean validateName(String name) {
    // if (name == null || name.isEmpty() ||
    // !name.matches("^[A-Za-z]+(\\s[A-Za-z]+)*$") || name.length() < 5) {
    // JOptionPane.showMessageDialog(null, "Invalid Name: The name should contain
    // only letters and be at least 5 characters long.", "Error",
    // JOptionPane.ERROR_MESSAGE);
    // return false;
    // }
    // return true;
    // }

    // Validates username (letters only, minimum length 5)
    public static boolean validateUsername(String username) {
        if (username == null || username.isEmpty() || !username.matches("^[A-Za-z]+$") || username.length() < 5) {
            JOptionPane.showMessageDialog(null,
                    "Invalid Username: The username should contain only letters and be at least 5 characters long.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public static boolean validateEmail(String email) {
        if (email == null || email.isEmpty() || !email.matches("^[\\w\\.-]+@[\\w\\.-]+\\.[a-zA-Z]{2,6}$")) {
            JOptionPane.showMessageDialog(null,
                    "Invalid Email: Please enter a valid email address in the format 'example@domain.com'.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public static boolean validatePassword(String password) {
        if (password == null || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&+=~|?])(?=\\S+$).{8,}$";

        if (!password.matches(PASSWORD_PATTERN)) {
            JOptionPane.showMessageDialog(null, "Invalid Password: A valid password must:\n" +
                    "- Be at least 8 characters long\n" +
                    "- Contain at least one uppercase letter\n" +
                    "- Contain at least one lowercase letter\n" +
                    "- Contain at least one digit\n" +
                    "- Contain at least one special character (!@#$%^&+=~|?)",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    // Validates age (between 15 and 18)
    public static boolean validateAge(String ageText) {
        try {
            int age = Integer.parseInt(ageText);
            if (age < 15 || age > 18) {
                JOptionPane.showMessageDialog(null, "Age must be between 15 and 18 for higher secondary students.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid numeric age.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    // Validates height (between 1.2 and 2.0 meters)
    public static boolean validateHeight(String heightText) {
        try {
            double height = Double.parseDouble(heightText);
            if (height < 1.2 || height > 2.0) {
                JOptionPane.showMessageDialog(null,
                        "Height must be between 1.2 meters and 2.0 meters for higher secondary students.", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid numeric height.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    // Validates weight (between 30kg and 150kg)
    public static boolean validateWeight(String weightText) {
        try {
            double weight = Double.parseDouble(weightText);
            if (weight < 30 || weight > 150) {
                JOptionPane.showMessageDialog(null,
                        "Weight must be between 30kg and 150kg for higher secondary students.", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid numeric weight.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    // Validates phone number (10 digits)
    public static boolean validatePhoneNumber(String phone) {
        if (phone == null || !phone.matches("^[0-9]{10}$")) {
            JOptionPane.showMessageDialog(null, "Invalid Phone Number: Must be 10 digits.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    // Validates if the field is empty
    public static boolean validateNotEmpty(String field, String fieldName) {
        if (field == null || field.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, fieldName + " cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

}
