
package Secundarias;
import Principales.Persona;


public class Empleado extends Persona{
    
    private String licencia;
    private String fechaInclusion;
    private Taxi taxi;

  

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getFechaInclusion() {
        return fechaInclusion;
    }

    public void setFechaInclusion(String fechaInclusion) {
        this.fechaInclusion = fechaInclusion;
    }

   
    
    //Comportamientos
        public String AtenderCliente(){
                return "El cliente esta siendo atendido";
        }
        
        public String CobrarTarifa(int km, int cobroxKM){
                return "El total a pagar es: " + km*cobroxKM;
        }
            
            
    
    public Empleado(int id, String nombre,String apellido, char genero, int edad, String telefono, String email,
            String direccionFisica, String licencia,String fechaInclusion,String placa, boolean gps, boolean rampaDis, 
            int cilindrajeMotor, String tipoFreno,boolean hidraulica, String color, String modelo, int cantidadPuertas,
            String marca, int cantidadVentanas,int cantidadPasajeros, String tipoLlanta, String tipoCombustible){
        
            this.taxi = new Taxi();
       
        //Locales 
            setLicencia(licencia);
            setFechaInclusion(fechaInclusion);
            
        //Extranjeras
            setId(id);
            setNombre(nombre);
            setApellido(apellido);
            setGenero(genero);
            setEdad(edad);
            setTelefono(telefono);
            setEmail(email);
            setDireccionFisica(direccionFisica);
            
        //Taxi
            this.taxi.setCantidadPasejeros(cantidadPasajeros);
            this.taxi.setCantidadPuertas(cantidadPuertas);
            this.taxi.setCantidadVentanas(cantidadVentanas);
            this.taxi.setCilindrajeMotor(cilindrajeMotor);
            this.taxi.setColor(color);
            this.taxi.setGps(gps);
            this.taxi.setHidraulica(hidraulica);
            this.taxi.setMarca(marca);
            this.taxi.setModelo(modelo);
            this.taxi.setPlaca(placa);
            this.taxi.setRampaDis(rampaDis);
            this.taxi.setTipoCombustible(tipoCombustible);
            this.taxi.setTipoFreno(tipoFreno);
            this.taxi.setTipoLlantas(tipoLlanta);
            
    }
    
}//Fin Empleado

