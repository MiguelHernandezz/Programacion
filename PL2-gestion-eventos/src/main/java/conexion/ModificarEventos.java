
package conexion;

import java.io.IOException;
import java.util.Date;
import javax.swing.ImageIcon;

public class ModificarEventos {
    
    
    public boolean Modificar(
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
        Eventos eventos = MantenerEvento.obtenerEventos();
        EstructuraDeDatos db = EstructuraDeDatos.getInstance();
        
        if (eventos != nuevoEvento) {
        db.getEventos().remove(eventos.getTitulo(), eventos);
        VerificarEvento.getInstance().registrarEvento(nuevoEvento);
        }
        
        return VerificarEvento.getInstance().registrarEvento(nuevoEvento);
    }
    
    
}
