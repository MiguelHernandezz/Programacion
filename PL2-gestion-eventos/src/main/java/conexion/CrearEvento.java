
package conexion;

import java.io.IOException;
import java.util.Date;
import javax.swing.ImageIcon;


public class CrearEvento {
    
    public boolean ObtenerEvento(
        String Titulo,
        String Tipo,
        String CalleEvento,
        String NumeroEvento,
        String CiudadEvento,
        String CodigoPostaEvento,
        Date FechaEvento,
        String Precio
        ) throws IOException, ClassNotFoundException {
        
        
        // Crear objetos de dirección y tarjeta
        DireccionEvento direccionEvento = new DireccionEvento(CalleEvento, NumeroEvento, CiudadEvento, CodigoPostaEvento);
        
        // Crear el nuevo Evento
        Eventos nuevoEvento = new Eventos(Titulo, Tipo, direccionEvento, FechaEvento, Precio);
        
        
        return VerificarEvento.getInstance().registrarEvento(nuevoEvento);
    }
}
    
    

