
package conexion;

import java.io.IOException;


public class InicioEstructuraDeDatos {
    //private static final String Datos = "C:\\Users\\Miguel\\Documents\\NetBeansProjects\\Proyecto final\\build\\classes\\EstructuraDeDatos\\base";
    
    public static EstructuraDeDatos cargarBase() throws IOException, ClassNotFoundException{
        
    return EstructuraDeDatos.cargarDatabase();
    }
    
    public static void guardarBase(EstructuraDeDatos db) throws IOException {
        
        db.guardarDatabase();}
    
    
    
        
    }
