
package conexion;

import java.io.IOException;
import java.util.Date;

public class ModificarUsuario {
    
    public boolean Modificar(
        String nombre,
        String correo,
        String contraseña,
        String telefono,
        String calle,
        String numero,
        String ciudad,
        String codigoPostal,
        String titular,
        String numeroTarjeta,
        Date caducidad,
        boolean vip) throws IOException, ClassNotFoundException {
        
        
        // Crear objetos de dirección y tarjeta
        Direccion direccion = new Direccion(calle, numero, ciudad, codigoPostal);
        TarjetaCredito tarjetaCredito = new TarjetaCredito(titular, numeroTarjeta, caducidad);
        
        // Crear el nuevo cliente
        Usuario nuevoUsuario = new Usuario(
            nombre,
            correo,
            contraseña,
            telefono,
            direccion,
            tarjetaCredito,
            vip
        );
        
        // Registrar usando VerificarUsuario
        Usuario NuevoUsuario = new Usuario(nombre, correo, contraseña, telefono, direccion, tarjetaCredito, vip);
        Usuario usuario = MantenerUsuario.obtenerUsuario();
        EstructuraDeDatos db = EstructuraDeDatos.getInstance();
        if (usuario != NuevoUsuario) {
        db.getUsuarios().remove(usuario.getCorreo(), usuario);
        VerificarUsuario.getInstance().registrarUsuario(NuevoUsuario);
        }
        
        
        return VerificarUsuario.getInstance().registrarUsuario(NuevoUsuario);
    }
}
 
    
    

