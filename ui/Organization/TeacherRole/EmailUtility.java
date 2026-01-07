/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.Organization.TeacherRole;

import jakarta.mail.*;
import jakarta.mail.internet.*;
//import jakarta.mail.internet.MimeMessage;
//import jakarta.mail.Authenticator;
//import jakarta.mail.PasswordAuthentication;
import java.util.Properties;

/**
 *
 * @author bbpri
 */
public class EmailUtility {
    public static void sendEmail(String recipient, String subject, String messageBody) {
        String senderEmail = "bpriyanka153@gmail.com"; // Your email
        String senderPassword = "uxqtbczyxtgihkvv"; // Your email password or app password
//        String recipientEmail = "bpriyanka153@gmail.com";

        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com"); 
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true"); 

        
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
           
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(
                Message.RecipientType.TO,
                InternetAddress.parse(recipient)
            );
            message.setSubject(subject);
            message.setText(messageBody);

            try {
                Transport.send(message);
                System.out.println("Email sent successfully to " + recipient);
            } catch (MessagingException e) {
                e.printStackTrace();
                System.out.println("Error sending email: " + e.getMessage());
            }

            System.out.println("Email sent successfully to " + recipient);

        } catch (MessagingException e) {
            e.printStackTrace();
            System.out.println("Failed to send email: " + e.getMessage());
        }
    }

//     //Test the method
//    public static void main(String[] args) {
//        String recipient = "recipient-email@example.com";
//        String subject = "Test Email";
//        String message = "This is a test email sent from JavaMail API.";
//
//        sendEmail(recipient, subject, message);
//    }
//    
}
