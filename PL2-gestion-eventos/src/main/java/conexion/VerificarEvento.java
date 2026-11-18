
package conexion;

import java.io.IOException;


public class VerificarEvento {
    private static final VerificarEvento instance = new VerificarEvento();
    
    private VerificarEvento() {}
    
    public static VerificarEvento getInstance() {
        return instance;
    }
    
    public boolean registrarEvento(Eventos eventos) throws IOException, ClassNotFoundException {
        
        EstructuraDeDatos db = EstructuraDeDatos.getInstance();
        if (db.existeEvento(eventos.getTitulo())){
            MantenerEvento.guardarEvento(eventos);
            System.out.println("False");
        return false;}
        else {
        System.out.println("True");
        db.getEventos().put(eventos.getTitulo(), eventos);
        db.guardarDatabase();
        return true;}
        
    }
    
    
    
    
}
