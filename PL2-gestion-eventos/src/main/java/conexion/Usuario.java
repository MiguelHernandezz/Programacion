
package conexion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Usuario implements Serializable{
    private String nombre;
    private String correo;
    private String Clave;
    private String  telefono;
    private Direccion  Direccion;
    private TarjetaCredito TarjetaCredito;
    private boolean VIP;
        private List<Reserva> Reservas;
    public Usuario(String nombre, String correo, String Clave, String telefono, Direccion Direccion, TarjetaCredito TarjetaCredito, boolean VIP) {
        //super(nombre, correo, Clave);
        this.nombre = nombre;
        this.correo = correo;
        this.Clave = Clave;
        this.telefono = telefono;
        this.Direccion = Direccion;
        this.TarjetaCredito = TarjetaCredito;
        this.VIP = VIP;
        this.Reservas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return Direccion;
    }

    public void setDireccion(Direccion Direccion) {
        this.Direccion = Direccion;
    }

    public TarjetaCredito getTarjetaCredito() {
        return TarjetaCredito;
    }

    public void setTarjetaCredito(TarjetaCredito TarjetaCredito) {
        this.TarjetaCredito = TarjetaCredito;
    }

    public boolean isVIP() {
        return VIP;
    }

    public void setVIP(boolean VIP) {
        //if (VIP==true) {Double precio=precio*0.1;}
        this.VIP = VIP;
    }

    public List<Reserva> getReservas() {
        return Reservas;
    }

    public void setReservas(List<Reserva> Reservas) {
        this.Reservas = Reservas;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", correo=" + correo + ", Clave=" + Clave + ", telefono=" + telefono + ", Direccion=" + Direccion + ", TarjetaCredito=" + TarjetaCredito + ", VIP=" + VIP + ", Reservas=" + Reservas + '}';
    }

    public boolean autenticar(String correo, String clave) {
        return this.correo.equals(correo) && this.Clave.equals(clave);
    
        }
    
    
}
