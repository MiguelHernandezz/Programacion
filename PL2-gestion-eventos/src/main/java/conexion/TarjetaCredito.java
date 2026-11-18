
package conexion;

import java.io.Serializable;
import java.util.Date;

public class TarjetaCredito implements Serializable{
    
    private String Titular;
    private String NumeroTarjeta;
    private Date Caducidad;

    public TarjetaCredito(String Titular, String NumeroTarjeta, Date Caducidad) {
        this.Titular = Titular;
        this.NumeroTarjeta = NumeroTarjeta;
        this.Caducidad = Caducidad;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public String getNumeroTarjeta() {
        return NumeroTarjeta;
    }

    public void setNumeroTarjeta(String NumeroTarjeta) {
        this.NumeroTarjeta = NumeroTarjeta;
    }

    public Date getCaducidad() {
        return Caducidad;
    }

    public void setCaducidad(Date Caducidad) {
        this.Caducidad = Caducidad;
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" + "Titular=" + Titular + ", NumeroTarjeta=" + NumeroTarjeta + ", Caducidad=" + Caducidad + '}';
    }

    
    
    
    
    
}
