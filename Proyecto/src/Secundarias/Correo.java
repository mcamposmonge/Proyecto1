
package Secundarias;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;



public class Correo {
    
    public String EnviarCorreo(Cliente para){
        
        String de = "pruebaproyectop1";
        String pass = "12345678P";
        String host = "smtp.gmail.com";
        Properties propiedades = System.getProperties();
        propiedades.put("mail.smtp.starttls.enable", "true");
        propiedades.setProperty("mail.smtp.host", host);
        propiedades.put("mail.smtp.user", de);
        propiedades.put("mail.smtp.password", pass);
        propiedades.put("mail.smtp.port", 587);
        propiedades.put("mail.smtp.auth", "true");
        propiedades.put("mail.smtp.starttls.enable", "true");
        
        try {
            Session sesion = Session.getDefaultInstance(propiedades,null);
            MimeMessage message = new MimeMessage(sesion);
            message.setFrom(new InternetAddress(de));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(para.getEmail()));
            message.setSubject("Eliminacion de Registro");
            message.setText("Se elimino el registro de la persona ");
            Transport transport = sesion.getTransport("smtp");
            transport.connect(host, de, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
        return "Correo Enviado";        
    }   
}
