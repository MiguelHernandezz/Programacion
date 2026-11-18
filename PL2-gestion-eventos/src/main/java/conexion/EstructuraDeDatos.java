
package conexion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.*;

public class EstructuraDeDatos implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private static EstructuraDeDatos dataBase;
    
    private Map<String, Usuario> usuarios;
    private Map<String, Eventos> eventos;
    private Map<TarjetaCredito, Reserva> reservas;
    private static final String Archivo = System.getProperty("user.dir") + File.separator + "eventos_db.dat";

    public EstructuraDeDatos () {
        
        this.usuarios = new HashMap<>();
        this.eventos = new HashMap<>();
        this.reservas= new HashMap<>();
    }

    public static EstructuraDeDatos getInstance() throws IOException, ClassNotFoundException {
        if (dataBase == null) {
            dataBase = cargarDatabase();
            // Si no existe el archivo, crea una nueva instancia
            if (dataBase == null) {
                dataBase = new EstructuraDeDatos();
            }
        }
        return dataBase;
    }   
    
    public Map<String, Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Map<String, Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    public boolean existeUsuario(String correo){
        return usuarios.containsKey(correo);
    }
    
    public boolean existeEvento(String Titulo){
        return eventos.containsKey(Titulo);
    }
    
    public Map<String, Eventos> getEventos() {
        return eventos;
    }

    public void setEventos(Map<String, Eventos> eventos) {
        this.eventos = eventos;
    }

    public Map<TarjetaCredito, Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(Map<TarjetaCredito, Reserva> reservas) {
        this.reservas = reservas;
    }

    @Override
    public String toString() {
        return "EstructuraDeDatos{" + "usuarios=" + usuarios + ", eventos=" + eventos + ", reservas=" + reservas + '}';
    }
    
    public Boolean autenticarUsuario(String correo, String Clave) {
    Usuario usuario = usuarios.get(correo);
    if (usuario != null && usuario.autenticar(correo, Clave)) {
        
        return true;
    }
        return false;
    
    }
    
    
    
    
    // Métodos para serializar y deserializar
    public void guardarDatabase() throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(Archivo))) {
            oos.writeObject(this);
        }
    }
    
    public static EstructuraDeDatos cargarDatabase() {
        File file = new File(Archivo);
        if (!file.exists()) {
            return new EstructuraDeDatos();
        }
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (EstructuraDeDatos) ois.readObject();
        } catch (Exception e) {
            System.err.println("Error al cargar base de datos, creando nueva");
            return new EstructuraDeDatos();
        }
    }
}

    


