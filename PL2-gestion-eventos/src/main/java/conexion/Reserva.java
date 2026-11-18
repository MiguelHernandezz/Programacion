
package conexion;

import java.io.Serializable;
import java.util.Date;

public class Reserva implements Serializable{
    
    private Eventos Eventos;
    private TarjetaCredito tarjetaCredito;
    private Date fechaReserva;
    
    public Reserva(Eventos Eventos, TarjetaCredito tarjetaCredito, Date fechaReserva) {
        this.Eventos = Eventos;
        this.tarjetaCredito = tarjetaCredito;
        this.fechaReserva = fechaReserva;
    }
    
    
    public Eventos getEventos() {
        return Eventos;
    }

    public void setEventos(Eventos Eventos) {
        this.Eventos = Eventos;
    }

    public TarjetaCredito getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    @Override
    public String toString() {
        return "Reserva{" + "Eventos=" + Eventos + ", tarjetaCredito=" + tarjetaCredito + ", fechaReserva=" + fechaReserva + '}';
    }

    
 
    }
    
    
    

