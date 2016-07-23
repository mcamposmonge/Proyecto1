
package Secundarias;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class Correo {
    
    public String EnviarCorreo(Cliente para){
        
        String de = "dsolano26@hotmail.com";
        String host = "localhost";
        Properties propiedades = System.getProperties();
        propiedades.setProperty("mail.smtp.host", host);
        Session sesion = Session.getDefaultInstance(propiedades);
        try{     
                MimeMessage mensaje = new MimeMessage(sesion);
                mensaje.setFrom(new InternetAddress(de));
                mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(para.getEmail()));
                mensaje.setSubject("Cliente Eliminado");
                mensaje.setText("El cliente "+para.getId()+" fue eliminado");
                Transport.send(mensaje);
        } catch (MessagingException e) {
          e.printStackTrace();
        }
        return "Correo Enviado";        
    }   
}
