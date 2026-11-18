
package conexion;

import java.io.IOException;

public class IniciarSesion{
    public Boolean ComprobarUsuario(String Correo, String Clave) throws IOException, ClassNotFoundException{
        return VerificarUsuario.getInstance().login(Correo, Clave);
       
}}

