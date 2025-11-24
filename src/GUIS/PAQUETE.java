
package GUIS;
import METODOS.Metodos_Paquetes;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import express_sas.CONEXION_BD;
import javax.swing.JOptionPane;
public class PAQUETE extends javax.swing.JFrame {

  
    public PAQUETE() {
        initComponents();
    }

    public void listar(){
        String sql = "SELECT * FROM PAQUETE";
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID_PAQUETE");
        model.addColumn("DESCRIPCION");
        model.addColumn("DESTINATARIO");
        model.addColumn("TELEFONO_DESTINATARIO");
        model.addColumn("FECHA_ENVIO");
        model.addColumn("FECHA_LLEGADA");
        model.addColumn("DIRECCION_ENTREGA");
        TABLA_PAQUETE.setModel(model);
        
        String[] datos = new String[7];
        try {
            PreparedStatement listar = CONEXION_BD.conectar().prepareStatement(sql);
            ResultSet rs = listar.executeQuery();
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                model.addRow(datos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"ERROR AL CONECTAR CON LA BD: " + e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campo_direccionentrega_paquete = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campo_id_paquete = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campo_Destino_paquete = new javax.swing.JTextField();
        campo_Descripcion_paquete = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campo_FechaLlegada_paquete = new javax.swing.JTextField();
        campo_FechaEnvio_paquete = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campo_TelDestinatario_paquete = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_Buscar_clientes = new javax.swing.JButton();
        btn_modificar_clientes = new javax.swing.JButton();
        btn_Eliminar_clientes = new javax.swing.JButton();
        btn_Listar_clientes = new javax.swing.JButton();
        btn_Guardar_clientes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA_PAQUETE = new javax.swing.JTable();
        BTN_Salir_Paquete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 99, 100));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DESTINO:");

        campo_direccionentrega_paquete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID:");

        campo_id_paquete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TEL. DESTINARIO:");

        campo_Destino_paquete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        campo_Descripcion_paquete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FECHA LLEGADA:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DESCRIPCIÓN:");

        campo_FechaLlegada_paquete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        campo_FechaEnvio_paquete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DIRECCION ENTREGA:");

        campo_TelDestinatario_paquete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("FECHA ENVIO:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CONTROL PAQUETES");

        btn_Buscar_clientes.setBackground(new java.awt.Color(0, 0, 225));
        btn_Buscar_clientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Buscar_clientes.setForeground(new java.awt.Color(255, 255, 255));
        btn_Buscar_clientes.setText("BUSCAR");
        btn_Buscar_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Buscar_clientesActionPerformed(evt);
            }
        });

        btn_modificar_clientes.setBackground(new java.awt.Color(0, 0, 225));
        btn_modificar_clientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_modificar_clientes.setForeground(new java.awt.Color(255, 255, 255));
        btn_modificar_clientes.setText("MODIFICAR");
        btn_modificar_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_clientesActionPerformed(evt);
            }
        });

        btn_Eliminar_clientes.setBackground(new java.awt.Color(0, 0, 225));
        btn_Eliminar_clientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Eliminar_clientes.setForeground(new java.awt.Color(255, 255, 255));
        btn_Eliminar_clientes.setText("ELIMINAR");
        btn_Eliminar_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Eliminar_clientesActionPerformed(evt);
            }
        });

        btn_Listar_clientes.setBackground(new java.awt.Color(0, 0, 225));
        btn_Listar_clientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Listar_clientes.setForeground(new java.awt.Color(255, 255, 255));
        btn_Listar_clientes.setText("LISTAR");
        btn_Listar_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Listar_clientesActionPerformed(evt);
            }
        });

        btn_Guardar_clientes.setBackground(new java.awt.Color(0, 0, 225));
        btn_Guardar_clientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Guardar_clientes.setForeground(new java.awt.Color(255, 255, 255));
        btn_Guardar_clientes.setText("GUARDAR");
        btn_Guardar_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Guardar_clientesActionPerformed(evt);
            }
        });

        TABLA_PAQUETE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DESCRIPCION", "DESTINO", "TEL. DESTINATARIO", "FECHA ENVIO", "FECHA LLEGADA", "DIRECCION ENTREGA"
            }
        ));
        TABLA_PAQUETE.setEnabled(false);
        jScrollPane1.setViewportView(TABLA_PAQUETE);

        BTN_Salir_Paquete.setBackground(new java.awt.Color(204, 0, 0));
        BTN_Salir_Paquete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BTN_Salir_Paquete.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Salir_Paquete.setText("SALIR");
        BTN_Salir_Paquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Salir_PaqueteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(428, 428, 428))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(6, 6, 6)
                                .addComponent(campo_TelDestinatario_paquete, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_id_paquete, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_Destino_paquete, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_Descripcion_paquete, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campo_FechaLlegada_paquete))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campo_FechaEnvio_paquete, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_modificar_clientes)
                                    .addComponent(jLabel7))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campo_direccionentrega_paquete, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(184, 184, 184)
                                        .addComponent(btn_Eliminar_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_Guardar_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(142, 142, 142)
                                .addComponent(btn_Buscar_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BTN_Salir_Paquete)
                            .addComponent(btn_Listar_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_id_paquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_Descripcion_paquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_FechaEnvio_paquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_Destino_paquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_FechaLlegada_paquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_TelDestinatario_paquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_direccionentrega_paquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Guardar_clientes)
                    .addComponent(btn_Buscar_clientes)
                    .addComponent(btn_Eliminar_clientes)
                    .addComponent(btn_modificar_clientes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Listar_clientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTN_Salir_Paquete)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Buscar_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Buscar_clientesActionPerformed
        Metodos_Paquetes mp = new Metodos_Paquetes(this);
        mp.buscar();
    }//GEN-LAST:event_btn_Buscar_clientesActionPerformed

    private void btn_Guardar_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Guardar_clientesActionPerformed
        Metodos_Paquetes mp = new Metodos_Paquetes(this);
        mp.guardar();
        listar();
      
    }//GEN-LAST:event_btn_Guardar_clientesActionPerformed

    private void btn_modificar_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_clientesActionPerformed
       Metodos_Paquetes mp = new Metodos_Paquetes(this);
       mp.modificar();
       listar();
    }//GEN-LAST:event_btn_modificar_clientesActionPerformed

    private void BTN_Salir_PaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Salir_PaqueteActionPerformed
        MENU mn =  new MENU();
        mn.setVisible(true);
        dispose();

    }//GEN-LAST:event_BTN_Salir_PaqueteActionPerformed

    private void btn_Listar_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Listar_clientesActionPerformed
        listar();
    }//GEN-LAST:event_btn_Listar_clientesActionPerformed

    private void btn_Eliminar_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Eliminar_clientesActionPerformed
        Metodos_Paquetes mt = new Metodos_Paquetes(this);
        mt.eliminar();
        listar();
    }//GEN-LAST:event_btn_Eliminar_clientesActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PAQUETE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Salir_Paquete;
    public javax.swing.JTable TABLA_PAQUETE;
    public javax.swing.JButton btn_Buscar_clientes;
    public javax.swing.JButton btn_Eliminar_clientes;
    public javax.swing.JButton btn_Guardar_clientes;
    public javax.swing.JButton btn_Listar_clientes;
    public javax.swing.JButton btn_modificar_clientes;
    public javax.swing.JTextField campo_Descripcion_paquete;
    public javax.swing.JTextField campo_Destino_paquete;
    public javax.swing.JTextField campo_FechaEnvio_paquete;
    public javax.swing.JTextField campo_FechaLlegada_paquete;
    public javax.swing.JTextField campo_TelDestinatario_paquete;
    public javax.swing.JTextField campo_direccionentrega_paquete;
    public javax.swing.JTextField campo_id_paquete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
