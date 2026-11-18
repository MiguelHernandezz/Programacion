
package conexion;

import java.io.IOException;



public class VerificarUsuario {
    
    
    private static final String AdminCorreo = "admin@javaevents.com";
    private static final String AdminClave = "admin";
    
    private static final VerificarUsuario instance = new VerificarUsuario();
    
    private VerificarUsuario() {}
    
    public static VerificarUsuario getInstance() {
        return instance;
    }
    public Boolean login(String correo, String clave) throws IOException, ClassNotFoundException{
    EstructuraDeDatos db = EstructuraDeDatos.getInstance();
    Usuario usuario = db.getUsuarios().get(correo);
        if (usuario.autenticar(correo, clave)) {
            MantenerUsuario.guardarUsuario(usuario);
    
        return true;}
        return false;
        }
    
    public boolean registrarUsuario(Usuario usuario) throws IOException, ClassNotFoundException {
        
        EstructuraDeDatos db = EstructuraDeDatos.getInstance();
        if (db.existeUsuario(usuario.getCorreo())){
            System.out.println("False");
        return false;}
        else {
        System.out.println("True");
        db.getUsuarios().put(usuario.getCorreo(), usuario);
        db.guardarDatabase();
        return true;}
        
    }

    
  
}
    
    
    
    
    
    
        
        
    
    
    
    
    

    
    
    

