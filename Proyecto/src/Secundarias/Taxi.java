
package Secundarias;
import Principales.Carro;

public class Taxi extends Carro{
    
    private String placa;
    private boolean gps;
    private boolean rampaDis;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean getGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean getRampaDis() {
        return rampaDis;
    }

    public void setRampaDis(boolean rampaDis) {
        this.rampaDis = rampaDis;
    }
  
 
}// Fin Taxi
