package Secundarias;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class Correo {
    
    public String EnviarCorreo(Cliente para){
        
        String de = "administrador@progrago.com";
        String pass = "admin";
        String host = "smtp.gmail.com";
        Properties propiedades = System.getProperties();
        propiedades.setProperty("mail.smtp.host", host);
        propiedades.put("mail.smtp.starttls.enable", "true");
        propiedades.put("mail.smtp.host", host);
        propiedades.put("mail.smtp.user", de);
        propiedades.put("mail.smtp.password", pass);
        propiedades.put("mail.smtp.port", 587);
        propiedades.put("mail.smtp.auth", "true");
        Session sesion = Session.getDefaultInstance(propiedades,null);
        try {
            MimeMessage message = new MimeMessage(sesion);
            message.setFrom(new InternetAddress(de));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(para.getEmail()));
            message.setSubject("Eliminacion de Registro");
            message.setText("Se elimino el registro de la persona "+para.getId());
            Transport transport = sesion.getTransport("smtp");
            transport.connect(host, de, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();

        } catch (MessagingException e) {
            e.printStackTrace();

        }
        return "Correo Enviado";        
    }   
}
