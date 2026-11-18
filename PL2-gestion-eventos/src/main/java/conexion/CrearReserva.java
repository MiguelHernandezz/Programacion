
package conexion;

import java.io.IOException;


public class CrearReserva {

    private static final CrearReserva instance = new CrearReserva();
    
    private CrearReserva() {}
    
    public static CrearReserva getInstance() {
        return instance;
    }
    
    public boolean Nuevareserva(TarjetaCredito tarjetaCredito, Reserva reserva) throws IOException, ClassNotFoundException {
        
        EstructuraDeDatos db = EstructuraDeDatos.getInstance();
        
        db.getReservas().put(MantenerUsuario.obtenerUsuario().getTarjetaCredito(), reserva);
        db.guardarDatabase();
        return true;}
        
    }
    
    
    
    


    

