    package conexion;
    import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
    import java.util.Map;
    import java.util.Date;
    public class Probar {

        public static void main(String[] args) throws IOException, ClassNotFoundException, ParseException {
            // Crear una dirección
            Direccion dir = new Direccion("Calle Principal", "123", "Madrid", "28001");

            // Crear una tarjeta de crédito
            SimpleDateFormat formato = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", java.util.Locale.ENGLISH);
            

            // Crear un cliente VIP
            Date fecha1 = formato.parse("Sat May 12 20:19:00 CEST 2030");
            TarjetaCredito tarjeta1 = new TarjetaCredito("Juan Pérez", "1234567812345678", fecha1);
            Usuario usuario1 = new Usuario(
                "Juan Pérez",
                "juan@email.com",
                "claveSegura123",
                "+34 600112233",
                dir,
                tarjeta1,
                true
            );
            
            Date fecha2 = formato.parse("Mon Jan 3 11:19:04 CEST 2027");
            TarjetaCredito tarjeta2 = new TarjetaCredito("Lola Rodríguez", "1111222233334444", fecha2);
            Usuario usuario2 = new Usuario(
                "Lola Rodríguez",
                "lola@email.com",
                "lolita1111",
                "+34 667982632",
                dir,
                tarjeta2,
                false
            );
            
            Date fecha3 = formato.parse("Wed Feb 12 17:33:00 CEST 2031");
            TarjetaCredito tarjeta3 = new TarjetaCredito("Antonio Hernández", "0987654332161623", fecha3);
            Usuario usuario3 = new Usuario(
                "Antonio Hernández",
                "antonio@email.com",
                "0000",
                "+34 755423615",
                dir,
                tarjeta3,
                true
            );
            
            Date fecha4 = formato.parse("Wed Feb 12 3:39:40 CEST 2028");
            TarjetaCredito tarjeta4 = new TarjetaCredito("Arturo García", "5555444455556666", fecha4);
            Usuario usuario4 = new Usuario(
                "Arturo García",
                "arturo12@email.com",
                "arturito33",
                "+34 600800983",
                dir,
                tarjeta4,
                false
            );

            DireccionEvento direccionevento1= new DireccionEvento("Calle26", "26", "Madrid", "26789");
            Date fechaevt1 = formato.parse("Sat Sep 22 13:39:40 CEST 2035");
            Eventos evento1 = new Eventos("Quedate", "Concierto", direccionevento1, fechaevt1, "80");

            DireccionEvento direccionevento2= new DireccionEvento("Calle Pedro", "1", "Sevilla", "23344");
            Date fechaevt2 = formato.parse("Sat May 11 20:00:00 CEST 2026");
            Eventos evento2 = new Eventos("Derbi", "Deportes", direccionevento2, fechaevt2, "25");
            
            DireccionEvento direccionevento3= new DireccionEvento("Calle Dominguez", "23", "Madrid", "33233");
            Date fechaevt3 = formato.parse("Fri Jul 22 10:00:00 CEST 2035");
            Eventos evento3= new Eventos("Opera", "Musical", direccionevento3, fechaevt3, "80");
            
            DireccionEvento direccionevento4= new DireccionEvento("Calle San Jose", "33", "Zaragoza", "39723");
            Date fechaevt4 = formato.parse("Tue Aug 20 9:30:00 CEST 2026");
            Eventos evento4 = new Eventos("Maluma", "Concierto", direccionevento4, fechaevt4, "100");
            
            DireccionEvento direccionevento5= new DireccionEvento("Calle Jazmin", "13", "Guadalajara", "11232");
            Date fechaevt5 = formato.parse("Fri Apr 1 18:00:00 CEST 2035");
            Eventos evento5 = new Eventos("Romeo Y Julieta", "Teatro", direccionevento5, fechaevt5, "15");
            
            DireccionEvento direccionevento6= new DireccionEvento("Calle Zaragoza", "18", "Madrid", "11211");
            Date fechaevt6 = formato.parse("Thu Dec 20 21:00:00 CEST 2027");
            Eventos evento6 = new Eventos("Final Champions", "Deporte", direccionevento6, fechaevt6, "40");
            
            //Crear Reservas
            Date fechaRes1 = formato.parse("Fri Dec 26 21:00:00 CEST 2022");
            Reserva reserva1 = new Reserva(evento1,tarjeta1,fechaRes1);
            
            Date fechaRes2 = formato.parse("Tue Aug 2 12:00:00 CEST 2023");
            Reserva reserva2 = new Reserva(evento2,tarjeta2,fechaRes2);
            
            Date fechaRes3 = formato.parse("Thu May 30 15:30:00 CEST 2022");
            Reserva reserva3 = new Reserva(evento3,tarjeta3,fechaRes3);
            
            
            EstructuraDeDatos db = EstructuraDeDatos.getInstance();

            // Agregar usuarios
            db.getUsuarios().put(usuario1.getCorreo(), usuario1);
            db.getUsuarios().put(usuario2.getCorreo(), usuario2);
            db.getUsuarios().put(usuario3.getCorreo(), usuario3);
            db.getUsuarios().put(usuario4.getCorreo(), usuario4);
            
            //Agregar eventos
            db.getEventos().put(evento1.getTitulo(), evento1);
            db.getEventos().put(evento2.getTitulo(), evento2);
            db.getEventos().put(evento3.getTitulo(), evento3);
            db.getEventos().put(evento4.getTitulo(), evento4);
            db.getEventos().put(evento5.getTitulo(), evento5);
            db.getEventos().put(evento6.getTitulo(), evento6);
            
            //Agregar reservas
            db.getReservas().put(tarjeta1, reserva1);
            db.getReservas().put(tarjeta2, reserva2);
            db.getReservas().put(tarjeta3, reserva3);
            
            db.guardarDatabase();
            
            // Verificar los datos cargados
            System.out.println("Usuarios cargados: " + db.getUsuarios().size());
            System.out.println("Eventos cargados: " + db.getEventos().size());
            System.out.println("Reservas cargadas: " + db.getReservas().size());
            // Obtener todos los usuarios
            
            System.out.println(db.getUsuarios());
            System.out.println(db.getEventos());     
            System.out.println(db.getReservas());
            
        }
    }

            