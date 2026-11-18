
package conexion;

import java.io.IOException;
import java.util.Date;

public class ReservarEvento {
    EstructuraDeDatos db = new EstructuraDeDatos();
    
    public boolean ObtenerReserva(
        Eventos eventos,
        TarjetaCredito tarjetaCredito,
        Date fecha
                
        ) throws IOException, ClassNotFoundException {
        
        
        // Crear Reserva
        Reserva reserva = new Reserva(eventos, tarjetaCredito, fecha);
        EstructuraDeDatos db = new EstructuraDeDatos();
        
        return CrearReserva.getInstance().Nuevareserva(tarjetaCredito, reserva);
    }
    
    
    
    
    
    
}
    
    

    
    
    
    
    
    
    
    

