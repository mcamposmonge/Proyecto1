
package proyecto;
import Secundarias.*;
import javax.swing.*;
import java.util.*;
import java.util.Calendar;


public class Proyecto {

    
    public static void main(String[] args) {
        boolean opcion = true;
        boolean opcionUno = true;
        int seleccion;
        int seleccionUno;
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        Cliente tempClient;
        Empleado tempEmplea;
        boolean valida;
        int idBusqueda;
        
        while (opcion){
            seleccion = Integer.parseInt(JOptionPane.showInputDialog("1- Empleado\n2- Cliente\n3- Salir"));
            switch(seleccion){
                
                case 1://Empleado
                    
                    while(opcionUno){
                        
                        seleccionUno = Integer.parseInt(JOptionPane.showInputDialog("1- Inlcuir Empleado\n2- Buscar Empleado\n3- Eliminar Empleado\n4- Atender Cliente\n5- Cobrar Tarifa\n6- Salir"));
                        
                        switch(seleccionUno){
                            
                            case 1://Inlcuir Empleado
                                
                                int id = Integer.parseInt(JOptionPane.showInputDialog("Digite su ID"));
                                String nombre = JOptionPane.showInputDialog("Digite su nombre");
                                String apellido = JOptionPane.showInputDialog("Digite su apellido");
                                
                               //Definicion de Genero Empleado
                                char genero;
                                int incognit = JOptionPane.showOptionDialog( null,"Genero","Ingrese Genero",JOptionPane.YES_NO_CANCEL_OPTION,
                                           JOptionPane.QUESTION_MESSAGE,null,new Object[] { "Masculino", "Femenino"},"Masculino");
                                if(incognit == 0){
                                    genero = 'M';
                                }else{
                                    genero = 'F';
                                }
                               //////////////////////////////////
                                
                                int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad"));
                                String telefono= JOptionPane.showInputDialog("Digite su telefono");
                                String email = JOptionPane.showInputDialog("Digite su email");
                                String direccionFisica = JOptionPane.showInputDialog("Digite su direccion fisica");
                                String licencia= JOptionPane.showInputDialog("Digite el tipo de licencia");
                                
                                
                               //Definicion de Fecha Inclusion Empleado
                                Calendar fecha = Calendar.getInstance();
                                String fechaInclusion = Integer.toString(fecha.get(Calendar.DAY_OF_MONTH))+"-"+Integer.toString(fecha.get(Calendar.MONTH))+"-"+Integer.toString(fecha.get(Calendar.YEAR));
                               /////////////////////////////////
                                
                               //Definicion de Taxi
                                JOptionPane.showMessageDialog(null, "Debe de ingresar los datos del Taxi","Datos del Taxi", JOptionPane.INFORMATION_MESSAGE);
                                String placa = JOptionPane.showInputDialog("Digite la placa");
                                
                                boolean gps = false;
                                int incognita = JOptionPane.showOptionDialog( null,"GPS","Posee GPS?",JOptionPane.YES_NO_CANCEL_OPTION,
                                           JOptionPane.QUESTION_MESSAGE,null,new Object[] { "SI", "NO"},"SI");
                                if(incognita == 0){
                                    gps = true;
                                }
                                
                                boolean rampaDis = false;
                                int incognitada = JOptionPane.showOptionDialog( null,"Rampa para Discapacitados","Posee rampa para discapacitados?",JOptionPane.YES_NO_CANCEL_OPTION,
                                           JOptionPane.QUESTION_MESSAGE,null,new Object[] { "SI", "NO"},"SI");
                                if(incognitada == 0){
                                    rampaDis = true;
                                }
                                
                                int cilindrajeMotor = Integer.parseInt(JOptionPane.showInputDialog("Digite cilindraje"));
                                String tipoFreno = JOptionPane.showInputDialog("Digite el tipo de freno");
                                
                                boolean hidraulica = false;
                                int incognitadar = JOptionPane.showOptionDialog( null,"Hidraulica","Posee direccion hidraulica?",JOptionPane.YES_NO_CANCEL_OPTION,
                                           JOptionPane.QUESTION_MESSAGE,null,new Object[] { "SI", "NO"},"SI");
                                if(incognitadar == 0){
                                    hidraulica = true;
                                }
                                
                                String color = JOptionPane.showInputDialog("Digite el color");
                                String modelo = JOptionPane.showInputDialog("Digite el modelo");
                                int cantidadPuertas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad puertas"));
                                String marca = JOptionPane.showInputDialog("Digite la marca");
                                int cantidadVentanas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad ventanas"));
                                int cantidadPasajeros = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad pasajeros"));
                                String tipoLlanta = JOptionPane.showInputDialog("Digite el tipo llanta");
                                String tipoCombustible = JOptionPane.showInputDialog("Digite el tipo combustible");
                                
                               ////////////////////////////////
                                tempEmplea = new Empleado(id, nombre, apellido, genero, edad, telefono, email, direccionFisica, licencia, 
                                                         fechaInclusion, placa, gps, rampaDis, cilindrajeMotor, tipoFreno, hidraulica, color, modelo, cantidadPuertas, 
                                                         marca, cantidadVentanas, cantidadPasajeros, tipoLlanta, tipoCombustible);
                                empleados.add(tempEmplea);
                                
                            break;
                            
                            case 2://Buscar Empleado
                                
                                valida = false;
                                int incognitas = JOptionPane.showOptionDialog( null,"Opcion de Busqueda","Seleccione opcion de busqueda",JOptionPane.YES_NO_CANCEL_OPTION,
                                           JOptionPane.QUESTION_MESSAGE,null,new Object[] { "ID Empleado", "Placa del Taxi"},"ID Empleado");
                                if(incognitas == 0){
                                    int idBusquedaE = Integer.parseInt(JOptionPane.showInputDialog("Digite el ID del empleado"));
                                    for(int i=0; i <= empleados.size()-1; i++ ){
                                        tempEmplea = empleados.get(i);
                                        if(tempEmplea.getId() == idBusquedaE){
                                                JOptionPane.showMessageDialog(null,"ID: "+tempEmplea.getId()+"\nNombre: "+tempEmplea.getNombre()+"\nApellido: "+tempEmplea.getApellido()+"\nGenero: "+
                                                                            tempEmplea.getGenero()+"\nEdad: "+tempEmplea.getEdad()+"\nTelefono:"+tempEmplea.getTelefono()+"\nEmail: "+
                                                                            tempEmplea.getEmail()+"\nDireccion Fisica: "+tempEmplea.getDireccionFisica()+"\nFecha de Inclusion: "+
                                                                            tempEmplea.getFechaInclusion()+"\nLicencia"+tempEmplea.getLicencia()+"\nTaxi:"+"\nCilindraje: "+tempEmplea.getCilindrajeMotor()+
                                                                            "\nTipo Freno: "+tempEmplea.getTipoFreno()+"\nHidraulica: "+tempEmplea.getHidraulica()+"\nColor: "+tempEmplea.getColor()+
                                                                            "\nModelo: "+tempEmplea.getModelo()+"\nMarca: "+tempEmplea.getMarca()+"Cantidad Puertas: "+tempEmplea.getCantidadPuertas()+
                                                                            "\nCantidad Ventanas: "+tempEmplea.getCantidadVentanas()+"\nCantidad Pasajeros: "+tempEmplea.getCantidadPasejeros()+
                                                                            "\nTipo Llantas:"+tempEmplea.getTipoLlantas()+"\nTipo Combustible: "+tempEmplea.getTipoCombustible(),"Resultados de Busqueda", JOptionPane.INFORMATION_MESSAGE);
                                                valida=true;
                                        }
                                    }
                                    if(valida == false){
                                        JOptionPane.showMessageDialog(null, "El cliente "+idBusquedaE+" NO EXISTE","ERROR EN LA BUSQUEDA", JOptionPane.ERROR_MESSAGE);
                                    }
                                }else{
                                    String idBusquedaEn = JOptionPane.showInputDialog("Digite la placa del taxi");
                                    for(int x=0; x <= empleados.size()-1; x++ ){
                                        tempEmplea = empleados.get(x);
                                        if(tempEmplea.getPlaca().equals(idBusquedaEn)){
                                                JOptionPane.showMessageDialog(null,"ID: "+tempEmplea.getId()+"\nNombre: "+tempEmplea.getNombre()+"\nApellido: "+tempEmplea.getApellido()+"\nGenero: "+
                                                                            tempEmplea.getGenero()+"\nEdad: "+tempEmplea.getEdad()+"\nTelefono:"+tempEmplea.getTelefono()+"\nEmail: "+
                                                                            tempEmplea.getEmail()+"\nDireccion Fisica: "+tempEmplea.getDireccionFisica()+"\nFecha de Inclusion: "+
                                                                            tempEmplea.getFechaInclusion()+"\nLicencia"+tempEmplea.getLicencia()+"\nTaxi:"+"\nCilindraje: "+tempEmplea.getCilindrajeMotor()+
                                                                            "\nTipo Freno: "+tempEmplea.getTipoFreno()+"\nHidraulica: "+tempEmplea.getHidraulica()+"\nColor: "+tempEmplea.getColor()+
                                                                            "\nModelo: "+tempEmplea.getModelo()+"\nMarca: "+tempEmplea.getMarca()+"Cantidad Puertas: "+tempEmplea.getCantidadPuertas()+
                                                                            "\nCantidad Ventanas: "+tempEmplea.getCantidadVentanas()+"\nCantidad Pasajeros: "+tempEmplea.getCantidadPasejeros()+
                                                                            "\nTipo Llantas:"+tempEmplea.getTipoLlantas()+"\nTipo Combustible: "+tempEmplea.getTipoCombustible(),"Resultados de Busqueda", JOptionPane.INFORMATION_MESSAGE);
                                                valida=true;
                                        }
                                    }
                                    if(valida == false){
                                        JOptionPane.showMessageDialog(null, "El cliente "+idBusquedaEn+" NO EXISTE","ERROR EN LA BUSQUEDA", JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                                
                            break;
                            
                            case 3://Eliminar Empleado
                                valida = false;
                                int incognitadaE = JOptionPane.showOptionDialog( null,"Opcion de Eliminado","Seleccione opcion de eliminacion",JOptionPane.YES_NO_CANCEL_OPTION,
                                           JOptionPane.QUESTION_MESSAGE,null,new Object[] { "ID Empleado", "Placa del Taxi"},"ID Empleado");
                                if(incognitadaE == 0){
                                     int idBusquedaEm = Integer.parseInt(JOptionPane.showInputDialog("Digite el ID del empleado"));
                                     for(int w=0; w <= empleados.size()-1; w++ ){  
                                        tempEmplea= empleados.get(w);
                                        if(tempEmplea.getId() == idBusquedaEm){
                                                valida = empleados.remove(tempEmplea);
                                                JOptionPane.showMessageDialog(null, "Empleado "+idBusquedaEm+" eliminado","Empleado Eliminado", JOptionPane.INFORMATION_MESSAGE);
                                        }
                                    }
                                    if(valida == false){
                                        JOptionPane.showMessageDialog(null, "El empleado "+idBusquedaEm+" NO EXISTE","ERROR EN LA BUSQUEDA", JOptionPane.ERROR_MESSAGE);
                                    }
                                    
                                }else{
                                    String idBusquedaEn = JOptionPane.showInputDialog("Digite la placa del taxi del empleado a eliminar");
                                    for(int k=0; k <= empleados.size()-1; k++ ){
                                        tempEmplea= empleados.get(k);
                                        if(tempEmplea.getPlaca().equals(idBusquedaEn)){
                                                valida = empleados.remove(tempEmplea);
                                                JOptionPane.showMessageDialog(null, "Empleado "+idBusquedaEn+" eliminado","Empleado Eliminado", JOptionPane.INFORMATION_MESSAGE);
                                        }
                                    }
                                    if(valida == false){
                                        JOptionPane.showMessageDialog(null, "El empleado "+idBusquedaEn+" NO EXISTE","ERROR EN LA BUSQUEDA", JOptionPane.ERROR_MESSAGE);
                                    }
                                
                                }            
                                
                            break;
                            
                            case 4://Atender Cliente
                                
                                valida = false;
                                idBusqueda = Integer.parseInt(JOptionPane.showInputDialog("Digite el ID del empleado"));
                                
                                for(int i=0; i <= empleados.size()-1; i++ ){
                                    tempEmplea = empleados.get(i);
                                    if(tempEmplea.getId() == idBusqueda){
                                            JOptionPane.showMessageDialog(null, tempEmplea.AtenderCliente()+" por el empleado "+idBusqueda,"MENSAJE INFORMATIVO", JOptionPane.ERROR_MESSAGE);
                                            valida=true;
                                    }
                                }
                                if(valida == false){
                                    JOptionPane.showMessageDialog(null, "El empleado "+idBusqueda+" NO EXISTE","ERROR EN LA BUSQUEDA", JOptionPane.ERROR_MESSAGE);
                                } 
                                
                            break;
                            
                            case 5://Cobrar Tarifa
                                
                                valida = false;
                                idBusqueda = Integer.parseInt(JOptionPane.showInputDialog("Digite el id del cliente"));
                                for(int i=0; i <= clientes.size()-1; i++ ){
                                    tempClient = clientes.get(i);
                                    if(tempClient.getId() == idBusqueda){
                                            int idBusquedas = Integer.parseInt(JOptionPane.showInputDialog("Digite el ID del empleado"));
                                            for(int j=0; j <= empleados.size()-1; j++ ){
                                                tempEmplea = empleados.get(j);
                                                if(tempEmplea.getId() == idBusquedas){
                                                    int km = Integer.parseInt(JOptionPane.showInputDialog("Digite total de kilometros"));
                                                    int cobroxKM = Integer.parseInt(JOptionPane.showInputDialog("Digite cobro de kilometro"));
                                                    JOptionPane.showMessageDialog(null, tempEmplea.CobrarTarifa(km, cobroxKM)+" para el cliente "+ idBusqueda+" cobrado por empleado "+idBusquedas,"MENSAJE INFORMATIVO", JOptionPane.INFORMATION_MESSAGE);
                                                }
                                            }
                                            if(valida == false){
                                            JOptionPane.showMessageDialog(null, "El empleado "+idBusquedas+" NO EXISTE","ERROR EN LA BUSQUEDA", JOptionPane.ERROR_MESSAGE);
                                            valida = true;
                                            } 
                                    }
                                }
                                if(valida == false){
                                    JOptionPane.showMessageDialog(null, "El cliente "+idBusqueda+" NO EXISTE","ERROR EN LA BUSQUEDA", JOptionPane.ERROR_MESSAGE);
                                } 
                            break;
                            
                            case 6://Salir
                                opcionUno = false;
                            break;
                        }//Fin Switch Empleado
                    }//Fin While Empleado
                    
                break;
                
                case 2://Cliente
                    
                    while(opcionUno){
                        
                        seleccionUno = Integer.parseInt(JOptionPane.showInputDialog("1- Incluir Cliente\n2- Buscar Cliente\n3- Eliminar Cliente\n4- Solicitar Taxi\n5- Salir"));
                        switch(seleccionUno){
                            
                            case 1://Inlcuir Cliente
                                
                                int id = Integer.parseInt(JOptionPane.showInputDialog("Digite su ID"));
                                String nombre = JOptionPane.showInputDialog("Digite su nombre");
                                String apellido = JOptionPane.showInputDialog("Digite su apellido");
                                
                               //Definicion de Genero Cliente
                                char genero;
                                int incognita = JOptionPane.showOptionDialog( null,"Genero","Ingrese Genero",JOptionPane.YES_NO_CANCEL_OPTION,
                                           JOptionPane.QUESTION_MESSAGE,null,new Object[] { "Masculino", "Femenino"},"Masculino");
                                if(incognita == 0){
                                    genero = 'M';
                                }else{
                                    genero = 'F';
                                }
                               //////////////////////////////////
                                
                                int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad"));
                                String telefono= JOptionPane.showInputDialog("Digite su telefono");
                                String email = JOptionPane.showInputDialog("Digite su email");
                                String direccionFisica = JOptionPane.showInputDialog("Digite su direccion fisica");
                                
                               //Definicion de Fecha Inclusion Cliente
                                Calendar fecha = Calendar.getInstance();
                                String fechaInclusion = Integer.toString(fecha.get(Calendar.DAY_OF_MONTH))+"-"+Integer.toString(fecha.get(Calendar.MONTH))+"-"+Integer.toString(fecha.get(Calendar.YEAR));
                               /////////////////////////////////
                                
                                tempClient = new Cliente(id, nombre, apellido, genero, edad, telefono, email, direccionFisica, fechaInclusion);
                                clientes.add(tempClient);                             
                                                                
                            break;
                            
                            case 2://Buscar Cliente
                                valida = false;
                                idBusqueda = Integer.parseInt(JOptionPane.showInputDialog("Digite ID del cliente a buscar"));
                                
                                for(int i=0; i <= clientes.size()-1; i++ ){
                                    tempClient = clientes.get(i);
                                    if(tempClient.getId() == idBusqueda){
                                            JOptionPane.showMessageDialog(null,"ID: "+tempClient.getId()+"\nNombre: "+tempClient.getNombre()+"\nApellido: "+tempClient.getApellido()+"\nGenero: "+
                                                                        tempClient.getGenero()+"\nEdad: "+tempClient.getEdad()+"\nTelefono:"+tempClient.getTelefono()+"\nEmail: "+
                                                                        tempClient.getEmail()+"\nDireccion Fisica: "+tempClient.getDireccionFisica()+"\nFecha de Inclusion: "+tempClient.getFechaInclusion(),"Resultados de Busqueda", JOptionPane.INFORMATION_MESSAGE);
                                            valida=true;
                                    }
                                }
                                if(valida == false){
                                    JOptionPane.showMessageDialog(null, "El cliente "+idBusqueda+" NO EXISTE","ERROR EN LA BUSQUEDA", JOptionPane.ERROR_MESSAGE);
                                }   
                            break;
                            
                            case 3://Eliminar Cliente
                                
                                valida = false;
                                idBusqueda = Integer.parseInt(JOptionPane.showInputDialog("Digite ID del cliente a eliminar"));
                                
                                for(int i=0; i <= clientes.size()-1; i++ ){
                                    tempClient = clientes.get(i);
                                    if(tempClient.getId() == idBusqueda){
                                            valida = clientes.remove(tempClient);
                                            JOptionPane.showMessageDialog(null, "Cliente "+idBusqueda+" eliminado","Cliente Eliminado", JOptionPane.INFORMATION_MESSAGE);
                                            Correo correo= new Correo();
                                            JOptionPane.showMessageDialog(null, correo.EnviarCorreo(tempClient),"Correo Enviado", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }
                                if(valida == false){
                                    JOptionPane.showMessageDialog(null, "El cliente "+idBusqueda+" NO EXISTE","ERROR EN LA BUSQUEDA", JOptionPane.ERROR_MESSAGE);
                                }            
                                
                            break;
                            
                            case 4://Solicitar Taxi
                                
                                valida = false;
                                idBusqueda = Integer.parseInt(JOptionPane.showInputDialog("Digite el ID del cliente"));
                                
                                for(int i=0; i <= clientes.size()-1; i++ ){
                                    tempClient = clientes.get(i);
                                    if(tempClient.getId() == idBusqueda){
                                            JOptionPane.showMessageDialog(null, tempClient.SolicitarTaxi()+" para el cliente "+idBusqueda,"MENSAJE INFORMATIVO", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                }
                                if(valida == false){
                                    JOptionPane.showMessageDialog(null, "El cliente "+idBusqueda+" NO EXISTE","ERROR EN LA BUSQUEDA", JOptionPane.ERROR_MESSAGE);
                                } 
                            break;
                            
                            case 5://Salir
                                
                                opcionUno = false;
                                
                            break;
                            
                        }//Fin Switch Cliente
                        
                    }//Fin While Cliente
                    
                break;
                
                case 3://Salir
                    
                    opcion=false;
                    
                break;
                
            }//Fin Switch
            
            opcionUno = true;
            
        }//Fin While
        
    }//Fin Main
    
}//Fin Proyecto
