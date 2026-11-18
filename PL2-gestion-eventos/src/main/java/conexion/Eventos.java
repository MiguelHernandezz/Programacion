
package conexion;

import java.io.Serializable;
import java.util.Date;

public class Eventos implements Serializable{
    private String Titulo;
    private String Tipo;
    private DireccionEvento DireccionEvento ;
    private Date Fecha ;
    private String Precio;
    //private ImageIcon Icono;
    private Double Calificacion;

    public Eventos(String Titulo, String Tipo, DireccionEvento DireccionEvento, Date Fecha, String Precio) {
        this.Titulo = Titulo;
        this.Tipo = Tipo;
        this.DireccionEvento = DireccionEvento;
        this.Fecha = Fecha;
        this.Precio = Precio;
        this.Calificacion = Calificacion;
        //this.Icono = Icono;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        if (Tipo!="Concierto" || Tipo!="Deporte" || Tipo!="Musical" || Tipo!="Teatro") {
        throw new IllegalArgumentException("Debes introducir un tipo de evento entre Concierto, Deporte, Musial o Teatro");}
        this.Tipo = Tipo;
    }

    public DireccionEvento getDireccionEvento() {
        return DireccionEvento;
    }

    public void setDireccionEvento(DireccionEvento DireccionEvento) {
        this.DireccionEvento = DireccionEvento;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }


    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public Double getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(Double Calificacion) {
        if (Calificacion<0 && Calificacion>5) {
            System.out.println("Debes introducir un numero entre 0 y 5");
        }
        this.Calificacion = Calificacion;
    }

    /*public ImageIcon getIcono() {
        return Icono;
    }

    public void setIcono(ImageIcon Icono) {
        this.Icono = Icono;
    }*/
    

    @Override
    public String toString() {
        return "Eventos{" + "Titulo=" + Titulo + ", Tipo=" + Tipo + ", DireccionEvento=" + DireccionEvento + ", Fecha=" + Fecha +  ", Precio=" + Precio + "$" + ", Calificacion=" + Calificacion + '}';
    }
    
    
}
