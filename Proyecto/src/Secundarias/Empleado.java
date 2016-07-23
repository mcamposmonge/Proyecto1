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

    public void setPlaca(String placa) {
        this.taxi.setPlaca(placa);
    }
    
    public String getPlaca() {
        return this.taxi.getPlaca();
    }

    public boolean getGps() {
        return this.taxi.getGps();
    }

    public void setGps(boolean gps) {
        this.taxi.setGps(gps);
    }

    public boolean getRampaDis() {
        return this.taxi.getRampaDis();
    }

    public void setRampaDis(boolean rampaDis) {
        this.taxi.setRampaDis(rampaDis);
    }
   
    public int getCilindrajeMotor() {
        return this.taxi.getCilindrajeMotor();
    }

    public void setCilindrajeMotor(int cilindrajeMotor) {
        this.taxi.setCilindrajeMotor(cilindrajeMotor);
    }

    public String getTipoFreno() {
        return this.taxi.getTipoFreno();
    }

    public void setTipoFreno(String tipoFreno) {
        this.taxi.setTipoFreno(tipoFreno);
    }

    public boolean getHidraulica() {
        return this.taxi.getHidraulica();
    }

    public void setHidraulica(boolean hidraulica) {
        this.taxi.setHidraulica(hidraulica);
    }

    public String getColor() {
        return this.taxi.getColor();
    }

    public void setColor(String color) {
        this.taxi.setColor(color);
    }

    public String getModelo() {
        return this.taxi.getModelo();
    }

    public void setModelo(String modelo) {
        this.taxi.setModelo(modelo);
    }

    public int getCantidadPuertas() {
        return this.taxi.getCantidadPuertas();
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.taxi.setCantidadPuertas(cantidadPuertas);
    }

    public String getMarca() {
        return this.taxi.getMarca();
    }

    public void setMarca(String marca) {
        this.taxi.setMarca(marca);
    }

    public int getCantidadVentanas() {
        return this.taxi.getCantidadVentanas();
    }

    public void setCantidadVentanas(int cantidadVentanas) {
        this.taxi.setCantidadVentanas(cantidadVentanas);
    }

    public int getCantidadPasejeros() {
        return this.taxi.getCantidadPasejeros();
    }

    public void setCantidadPasejeros(int cantidadPasejeros) {
        this.taxi.setCantidadPasejeros(cantidadPasejeros);
    }

    public String getTipoLlantas() {
        return this.taxi.getTipoLlantas();
    }

    public void setTipoLlantas(String tipoLlantas) {
        this.taxi.setTipoLlantas(tipoLlantas);
    }

    public String getTipoCombustible() {
        return this.taxi.getTipoCombustible();
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.taxi.setTipoCombustible(tipoCombustible);
    }
    
    
    //Comportamientos
        public String AtenderCliente(){
                return "El cliente esta siendo atendido";
        }
        
        public String CobrarTarifa(int km, int cobroxKM){
                return "El total a pagar es: " + km*cobroxKM+ " colones";
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


