
package conexion;

import java.io.IOException;


public class RegistrarEventoAdmin {
    
        private static final RegistrarEventoAdmin instance = new RegistrarEventoAdmin();

    
       private RegistrarEventoAdmin() {}
       
       
    
    public static RegistrarEventoAdmin getInstance() {
        return instance;
    }

    public boolean registrarEvento(Eventos eventos) throws IOException, ClassNotFoundException {
        
        EstructuraDeDatos db = EstructuraDeDatos.getInstance();
        if (db.existeEvento(eventos.getTitulo())){
            System.out.println("False");
        return false;}
        else {
        System.out.println("True");
        db.getEventos().put(eventos.getTitulo(), eventos);
        db.guardarDatabase();
        return true;}
        
    }
    
    
}
