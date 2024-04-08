package main;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import main.Client;
import main.Destinataire;

public class EmailSender {
    public static void main(String[] args) {
        
        Client gabriel = new Client();
        Destinataire isis = new Destinataire();
        
        
        String recipient = isis.getAdresse();
        String subject = "Sujet de l'e-mail";
        String body = "Contenu de l'e-mail.";

        // Configuration des propriétés
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");

        // Session de messagerie
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(gabriel.getEmail(),gabriel.getPassword());
            }
        });

        try {
            // Création du message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(gabriel.getEmail()));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
            message.setSubject(subject);
            message.setText(body);

            // Envoi de l'e-mail
            Transport.send(message);
            System.out.println("E-mail envoyé avec succès !");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
