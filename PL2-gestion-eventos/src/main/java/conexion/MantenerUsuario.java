package conexion;


public class MantenerUsuario{
    // Variable estática para almacenar el correo del usuario activo
    private static Usuario usuarioActivo = null;
    
    
    /**
     * Guarda el usuario que acaba de iniciar sesión
     * @param correo Correo electrónico del usuario autenticado
     */
    public static void guardarUsuario(Usuario usuario) {
        usuarioActivo = usuario;
        System.out.println("El usuario guardado es: "+ usuarioActivo);
    }
    
    /**
     * Obtiene el usuario actualmente autenticado
     * @return Correo del usuario activo o null si no hay sesión
     */
    public static Usuario obtenerUsuario() {
        return usuarioActivo;
    }
    
    /**
     * Elimina la referencia al usuario activo (al cerrar sesión)
     */
    public static void cerrarSesion() {
        usuarioActivo = null;
    }
    
    /**
     * Verifica si hay un usuario con sesión activa
     * @return true si hay un usuario autenticado, false en caso contrario
     */
    public static boolean haySesionActiva() {
        return usuarioActivo != null;
    }
    
    
    
    
    
}
    
    
    
    
    
    

