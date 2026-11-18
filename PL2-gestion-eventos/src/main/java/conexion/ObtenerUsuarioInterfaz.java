package conexion;

import java.io.IOException;
import java.util.Date;

public class ObtenerUsuarioInterfaz {
    public boolean ObtenerUsuario(
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
        
        return VerificarUsuario.getInstance().registrarUsuario(NuevoUsuario);
    }
}