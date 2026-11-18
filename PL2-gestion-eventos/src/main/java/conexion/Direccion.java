
package conexion;

import java.io.Serializable;

public class Direccion implements Serializable {
    
    private String Calle;
    private String numero;
    private String ciudad;
    private String codigo_postal;

    public Direccion(String Calle, String numero, String ciudad, String codigo_postal) {
        this.Calle = Calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.codigo_postal = codigo_postal;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    @Override
    public String toString() {
        return "Direccion{" + "Calle=" + Calle + ", numero=" + numero + ", ciudad=" + ciudad + ", codigo_postal=" + codigo_postal + '}';
    }
    
    
    
    
}
