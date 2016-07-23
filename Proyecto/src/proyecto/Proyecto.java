            
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
                                
                               /* int id = Integer.parseInt(JOptionPane.showInputDialog("Digite su ID"));
                                String nombre = JOptionPane.showInputDialog("Digite su nombre");
                                String apellido = JOptionPane.showInputDialog("Digite su apellido");
                                
                               //Definicion de Genero Empleado
                                char genero;
                                int gene = JOptionPane.showOptionDialog( null,"Genero","Ingrese Genero",JOptionPane.YES_NO_CANCEL_OPTION,
                                           JOptionPane.QUESTION_MESSAGE,null,new Object[] { "Masculino", "Femenino"},"Masculino");
                                if(gene == 0){
                                    genero = 'M';
                                }else{
                                    genero = 'F';
                                }
                               //////////////////////////////////
                                
                                int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad"));
                                String telefono= JOptionPane.showInputDialog("Digite su telefono");
                                String email = JOptionPane.showInputDialog("Digite su email");
                                String direccionFisica = JOptionPane.showInputDialog("Digite su direccion fisica");
                                
                               //Definicion de Fecha Inclusion Empleado
                                Calendar fecha = Calendar.getInstance();
                                String fechaInclusion = Integer.toString(fecha.get(Calendar.DAY_OF_MONTH))+"-"+Integer.toString(fecha.get(Calendar.MONTH))+"-"+Integer.toString(fecha.get(Calendar.YEAR));
                               /////////////////////////////////
                                
                                Cliente tempClient = new Cliente(id, nombre, apellido, genero, edad, telefono, email, direccionFisica, fechaInclusion);
                                clientes.add(tempClient);*/
                                
                            break;
                            
                            case 2://Buscar Empleado
                                
                            break;
                            
                            case 3://Eliminar Empleado
                                
                            break;
                            
                            case 4://Atender Cliente
                                
                            break;
                            
                            case 5://Cobrar Tarifa
                                
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
                                int gene = JOptionPane.showOptionDialog( null,"Genero","Ingrese Genero",JOptionPane.YES_NO_CANCEL_OPTION,
                                           JOptionPane.QUESTION_MESSAGE,null,new Object[] { "Masculino", "Femenino"},"Masculino");
                                if(gene == 0){
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
                                            JOptionPane.showInputDialog("Cliente "+idBusqueda+" eliminado");
                                            Correo correo= new Correo();
                                            JOptionPane.showInputDialog(correo.EnviarCorreo(tempClient));
                                    }
                                }
                                if(valida == false){
                                    JOptionPane.showMessageDialog(null, "El cliente "+idBusqueda+" NO EXISTE","ERROR EN LA BUSQUEDA", JOptionPane.ERROR_MESSAGE);
                                }            
                                
                            break;
                            
                            case 4://Solicitar Taxi
                                
                                valida = false;
                                idBusqueda = Integer.parseInt(JOptionPane.showInputDialog("Digite su ID"));
                                
                                for(int i=0; i <= clientes.size()-1; i++ ){
                                    tempClient = clientes.get(i);
                                    if(tempClient.getId() == idBusqueda){
                                            JOptionPane.showInputDialog(tempClient.SolicitarTaxi()+" para el cliente "+idBusqueda);
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