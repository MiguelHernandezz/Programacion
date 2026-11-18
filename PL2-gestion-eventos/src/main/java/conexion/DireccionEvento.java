
package conexion;

import java.io.Serializable;


public class DireccionEvento implements Serializable{
    
    private String CalleEvento;
    private String NumeroEvento;
    private String CuidadEvento;
    private String CodigoPostalEvento;

    public DireccionEvento(String CalleEvento, String NumeroEvento, String CuidadEvento, String CodigoPostalEvento) {
        this.CalleEvento = CalleEvento;
        this.NumeroEvento = NumeroEvento;
        this.CuidadEvento = CuidadEvento;
        this.CodigoPostalEvento = CodigoPostalEvento;
    }

    public String getCalleEvento() {
        return CalleEvento;
    }

    public void setCalleEvento(String CalleEvento) {
        this.CalleEvento = CalleEvento;
    }

    public String getNumeroEvento() {
        return NumeroEvento;
    }

    public void setNumeroEvento(String NumeroEvento) {
        this.NumeroEvento = NumeroEvento;
    }

    public String getCuidadEvento() {
        return CuidadEvento;
    }

    public void setCuidadEvento(String CuidadEvento) {
        this.CuidadEvento = CuidadEvento;
    }

    public String getCodigoPostalEvento() {
        return CodigoPostalEvento;
    }

    public void setCodigoPostalEvento(String CodigoPostalEvento) {
        this.CodigoPostalEvento = CodigoPostalEvento;
    }

    @Override
    public String toString() {
        return "DireccionEvento{" + "CalleEvento=" + CalleEvento + ", NumeroEvento=" + NumeroEvento + ", CuidadEvento=" + CuidadEvento + ", CodigoPostalEvento=" + CodigoPostalEvento + '}';
    }

    
    
    
}
