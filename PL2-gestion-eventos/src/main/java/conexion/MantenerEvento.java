
package conexion;


public class MantenerEvento{
    // Variable estática para almacenar el correo del usuario activo
    private static Eventos eventoActivo = null;
    
    
    /**
     * Guarda el usuario que acaba de iniciar sesión
     * @param correo Correo electrónico del usuario autenticado
     */
    public static void guardarEvento(Eventos eventos) {
        eventoActivo = eventos;
        System.out.println("El usuario guardado es: "+ eventoActivo);
    }
    
    /**
     * Obtiene el usuario actualmente autenticado
     * @return Correo del usuario activo o null si no hay sesión
     */
    public static Eventos obtenerEventos() {
        return eventoActivo;
    }
    
    /**
     * Elimina la referencia al usuario activo (al cerrar sesión)
     */
    public static void cerrarEvento() {
        eventoActivo = null;
    }
    
    /**
     * Verifica si hay un usuario con sesión activa
     * @return true si hay un usuario autenticado, false en caso contrario
     */
    public static boolean SesionActivaEvento() {
        return eventoActivo != null;
    }
    
    
    
    
    
}