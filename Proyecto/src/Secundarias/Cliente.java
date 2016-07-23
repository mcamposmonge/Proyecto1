
package Secundarias;
import Principales.Persona;


public class Cliente extends Persona{
    
    private String fechaInclusion;
    
    public String SolicitarTaxi(){
                return "El taxi fue solicitado";
    }

    public String getFechaInclusion() {
        return fechaInclusion;
    }

    public void setFechaInclusion(String fechaInclusion) {
        this.fechaInclusion = fechaInclusion;
    }
    
    public Cliente(int id, String nombre,String apellido, char genero, int edad, String telefono, String email, String direccionFisica,String fechaInclusion){
        
            setId(id);
            setNombre(nombre);
            setApellido(apellido);
            setGenero(genero);
            setEdad(edad);
            setTelefono(telefono);
            setEmail(email);
            setDireccionFisica(direccionFisica);
            setFechaInclusion(fechaInclusion);
    
    }
    
}//Fin Cliente