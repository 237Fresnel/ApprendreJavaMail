/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 *
 * @author gabriel
 */
 
public class test {
    
}


 class EmailUtil {
           static  Client send = new Client();
            static Destinataire dest = new Destinataire();
            static String emailSender = send.getEmail();
            static String password = send.getPassword();
     
        
       
        
    public static void main(String[] args) {
         String message = send.getMessage();
         String recipient =dest.getAdresse(); // Adresse e-mail du destinataire
         String subject = "Test de javamail"; // Sujet de l'e-mail
        
        sendEmail(recipient, subject,message);
    }

    public static void sendEmail(String recipient, String subject, String body) {
        // Configuration des propriétés pour la session
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true"); // Activer l'authentification
        properties.put("mail.smtp.starttls.enable", "true"); // Active STARTTLS
        properties.setProperty("mail.transport.protocol", "smtp");
        properties.setProperty("mail.smtp.host", "smtp.gmail.com"); // Remplacez par votre serveur SMTP
        properties.setProperty("mail.smtp.port", "587"); // Port pour le serveur SMTP Gmail
        
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(emailSender, password);
            }
        });
        
        try {
            // Création du message
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(emailSender)); // Votre adresse e-mail
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
            message.setSubject(subject);
            message.setText(body);

            // Envoi du message
            Transport.send(message);
            System.out.println("E-mail envoyé avec succès !");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}

