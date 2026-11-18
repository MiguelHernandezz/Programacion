package interfaz;

import conexion.EstructuraDeDatos;
import conexion.Eventos;
import conexion.MantenerUsuario;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import conexion.ReservarEvento;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class BuscarEvento extends javax.swing.JFrame {

    public BuscarEvento() {
        initComponents();
        this.setLocationRelativeTo(null);
        URL url = getClass().getResource("/imagenes/java.png");
        jLabelFoto.setIcon(new ImageIcon(url));
        try {
            cargarEventosDesdeBaseDeDatos();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEventos = new javax.swing.JTable();
        jButtonComprar = new javax.swing.JButton();
        jLabelFoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("BÚSQUEDA DE EVENTOS");

        jButtonVolver.setText("VOLVER");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jTableEventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Título", "Tipo", "Dirección", "Fecha", "Precio", "Calificación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableEventos);

        jButtonComprar.setText("COMPRAR ENTRADA");
        jButtonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(79, 79, 79)
                .addComponent(jButtonVolver)
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jButtonComprar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButtonVolver)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonComprar)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private ArrayList<Eventos> listaEventos = new ArrayList<>();
    
    private void cargarEventosDesdeBaseDeDatos() throws IOException, ClassNotFoundException {
        EstructuraDeDatos db = EstructuraDeDatos.getInstance();
        listaEventos = new ArrayList<>(db.getEventos().values());
        actualizarTablaEventos();
        }
    
    private void actualizarTablaEventos() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Título");
        model.addColumn("Tipo");
        model.addColumn("Dirección");
        model.addColumn("Fecha");
        model.addColumn("Precio (€)");
        model.addColumn("Calificación");
        // Llenar filas con datos de los eventos
        for (Eventos evento : listaEventos) {
            model.addRow(new Object[]{
                evento.getTitulo(),
                evento.getTipo(),
                evento.getDireccionEvento(),
                evento.getFecha(),
                evento.getPrecio(),
                evento.getCalificacion()
            });
        }
        jTableEventos.setModel(model);
    }
    
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        GestionParaCliente gesCl = new GestionParaCliente();
        gesCl.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonVolverActionPerformed
    
    private void jButtonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprarActionPerformed
        int fila = jTableEventos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "No hay ningún evento seleccionado.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Date fechaActual = new Date();
            Eventos evento = listaEventos.get(fila);
            
            ReservarEvento NuevaReserva = new ReservarEvento();
            
            try {
                boolean reservaCreada = NuevaReserva.ObtenerReserva(
                        evento,
                        MantenerUsuario.obtenerUsuario().getTarjetaCredito(),
                        fechaActual);
            } catch (IOException ex) {
                Logger.getLogger(BuscarEvento.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BuscarEvento.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            LocalDate fechaLocal = evento.getFecha().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String fechaFormateada = fechaLocal.format(formatoCorto);
            //logica para reserva
            JOptionPane.showMessageDialog(this, "Se ha comprado/reservado la entrada "+evento.getTitulo()+" el día "+fechaFormateada+" por "+evento.getPrecio()+" €.", "Operación competada.", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonComprarActionPerformed
    
   /*public void rellenaTabla(String criterio) {
        limpiaTabla();
        if (criterio.equals("Ciudad")) {
            eventos = getEventosPorCiudad();
        } else if (criterio.equals("Tipo")) {
            eventos = getEventosPorTipo();
        }
        for (Eventos evto : eventos) {
            dtm.addRow(new Object[]{evto.getTitulo(), evto.getTipo(), evto.getDireccionEvento(), evto.getFecha(), evto.getPrecio(), evto.getCalificacion()});
        }
    }
    
    public void limpiaTabla() {
        int filas = dtm.getRowCount();
        for (int i = 0; i < filas; i++) {
            dtm.removeRow(0);
        }
    }
    
    public static void setEventos(ArrayList<Eventos> p) {
        eventos = p;
    }

    public static ArrayList<Eventos> getEventosPorCiudad() {
        //Comparador para ordenar los Productos por su nombre
        Comparator EvtPorNombre = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Eventos e1 = (Eventos) o1;
                Eventos e2 = (Eventos) o2;
                return e1.getDireccionEvento().getCuidadEvento().compareTo(e2.getDireccionEvento().getCuidadEvento());
            }
        };
        //Ordenamos el array
        Collections.sort(eventos, EvtPorNombre);
        return eventos;
    }
    
    public static ArrayList<Eventos> getEventosPorTipo() {
        //Comparador para ordenar los Productos por su nombre
        Comparator EvtPorTipo = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Eventos e1 = (Eventos) o1;
                Eventos e2 = (Eventos) o2;
                return e1.getTipo().compareTo(e2.getTipo());
            }
        };
        //Ordenamos el array
        Collections.sort(eventos, EvtPorTipo);
        return eventos;
    }*/
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BuscarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonComprar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEventos;
    // End of variables declaration//GEN-END:variables
}
