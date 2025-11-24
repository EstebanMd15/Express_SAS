
package GUIS;
import GUIS.MENU;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import express_sas.CONEXION_BD;
import javax.swing.JOptionPane;
import METODOS.Metodos_Vehiculos;

public class VEHICULOS extends javax.swing.JFrame {

  
    public VEHICULOS() {
        initComponents();
    }

        public void listar(){
            String query = "SELECT * FROM VEHICULO";
            DefaultTableModel model = new DefaultTableModel();
            
            model.addColumn("PLACA");
            model.addColumn("MARCA");
            model.addColumn("TIPO_VEHICULO");
            model.addColumn("MODELO");
            model.addColumn("CAPACIDAD");
            TABLA_VEHICULOS.setModel(model);
            
            String[] datos = new String [5];
            try {
                PreparedStatement listar = CONEXION_BD.conectar().prepareStatement(query);
                ResultSet rs = listar.executeQuery();
                while(rs.next()){
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(3);
                    datos[2] = rs.getString(4);
                    datos[3] = rs.getString(5);
                    datos[4] = rs.getString(2);
                    model.addRow(datos);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"[ERROR AL CONECTAR CON LA BD]: " + e.getMessage());
            }
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Campo_Placa_Vehiculo = new javax.swing.JTextField();
        Campo_TipoVehiculo_Vehiculo = new javax.swing.JTextField();
        Campo_Capacidad_Vehiculo = new javax.swing.JTextField();
        Campo_Modelo_Vehiculo = new javax.swing.JTextField();
        Campo_Marca_Vehiculo = new javax.swing.JTextField();
        Btn_Guardar_Vehiculo = new javax.swing.JButton();
        Btn_Listar_Vehiculo = new javax.swing.JButton();
        Btn_Buscar_Vehiculo = new javax.swing.JButton();
        Btn_Modificar_Vehiculo = new javax.swing.JButton();
        Btn_Eliminar_Vehiculo = new javax.swing.JButton();
        BTN_Salir_Vehiculos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA_VEHICULOS = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 99, 100));
        jPanel1.setEnabled(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONTROL VEHICULOS");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PLACA:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MODELO:");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TIPO DE VEHICULO:");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CAPACIDAD:");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("MARCA:");

        Campo_Placa_Vehiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        Campo_TipoVehiculo_Vehiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        Campo_Capacidad_Vehiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        Campo_Modelo_Vehiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        Campo_Marca_Vehiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        Btn_Guardar_Vehiculo.setBackground(new java.awt.Color(0, 0, 255));
        Btn_Guardar_Vehiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Btn_Guardar_Vehiculo.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Guardar_Vehiculo.setText("GUARDAR");
        Btn_Guardar_Vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Guardar_VehiculoActionPerformed(evt);
            }
        });

        Btn_Listar_Vehiculo.setBackground(new java.awt.Color(0, 0, 255));
        Btn_Listar_Vehiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Btn_Listar_Vehiculo.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Listar_Vehiculo.setText("LISTAR");
        Btn_Listar_Vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Listar_VehiculoActionPerformed(evt);
            }
        });

        Btn_Buscar_Vehiculo.setBackground(new java.awt.Color(0, 0, 255));
        Btn_Buscar_Vehiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Btn_Buscar_Vehiculo.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Buscar_Vehiculo.setText("BUSCAR");
        Btn_Buscar_Vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Buscar_VehiculoActionPerformed(evt);
            }
        });

        Btn_Modificar_Vehiculo.setBackground(new java.awt.Color(0, 0, 255));
        Btn_Modificar_Vehiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Btn_Modificar_Vehiculo.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Modificar_Vehiculo.setText("MODIFICAR");
        Btn_Modificar_Vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Modificar_VehiculoActionPerformed(evt);
            }
        });

        Btn_Eliminar_Vehiculo.setBackground(new java.awt.Color(0, 0, 255));
        Btn_Eliminar_Vehiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Btn_Eliminar_Vehiculo.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Eliminar_Vehiculo.setText("ELIMINAR");
        Btn_Eliminar_Vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Eliminar_VehiculoActionPerformed(evt);
            }
        });

        BTN_Salir_Vehiculos.setBackground(new java.awt.Color(204, 0, 0));
        BTN_Salir_Vehiculos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BTN_Salir_Vehiculos.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Salir_Vehiculos.setText("SALIR");
        BTN_Salir_Vehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Salir_VehiculosActionPerformed(evt);
            }
        });

        TABLA_VEHICULOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PLACA", "MARCA", "TIPO_ VEHICULO", "MODELO", "CAPACIDAD"
            }
        ));
        jScrollPane1.setViewportView(TABLA_VEHICULOS);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Campo_Placa_Vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Campo_Capacidad_Vehiculo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Campo_Modelo_Vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(Campo_Marca_Vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(144, 144, 144))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn_Guardar_Vehiculo)
                        .addGap(114, 114, 114)
                        .addComponent(Btn_Buscar_Vehiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_Modificar_Vehiculo)
                        .addGap(120, 120, 120)
                        .addComponent(Btn_Eliminar_Vehiculo)
                        .addGap(96, 96, 96))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Campo_TipoVehiculo_Vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Btn_Listar_Vehiculo))
                        .addGap(0, 21, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BTN_Salir_Vehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(Campo_Placa_Vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Campo_Marca_Vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(Campo_Capacidad_Vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Campo_Modelo_Vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Campo_TipoVehiculo_Vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Guardar_Vehiculo)
                    .addComponent(Btn_Buscar_Vehiculo)
                    .addComponent(Btn_Modificar_Vehiculo)
                    .addComponent(Btn_Eliminar_Vehiculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_Listar_Vehiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN_Salir_Vehiculos)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_Salir_VehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Salir_VehiculosActionPerformed
        MENU mn = new MENU();
        mn.setVisible(true);
        dispose();
    }//GEN-LAST:event_BTN_Salir_VehiculosActionPerformed

    private void Btn_Guardar_VehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Guardar_VehiculoActionPerformed
       Metodos_Vehiculos mt = new Metodos_Vehiculos(this);
       mt.guardar();
    }//GEN-LAST:event_Btn_Guardar_VehiculoActionPerformed

    private void Btn_Buscar_VehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Buscar_VehiculoActionPerformed
        Metodos_Vehiculos mt = new Metodos_Vehiculos(this);
        mt.buscar();
        mt.buscar2();
    }//GEN-LAST:event_Btn_Buscar_VehiculoActionPerformed

    private void Btn_Modificar_VehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Modificar_VehiculoActionPerformed
        Metodos_Vehiculos mt = new Metodos_Vehiculos(this);
        mt.modificar();
        listar();
    }//GEN-LAST:event_Btn_Modificar_VehiculoActionPerformed

    private void Btn_Eliminar_VehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Eliminar_VehiculoActionPerformed
        Metodos_Vehiculos mt = new Metodos_Vehiculos(this);
        mt.eliminar();
        
    }//GEN-LAST:event_Btn_Eliminar_VehiculoActionPerformed

    private void Btn_Listar_VehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Listar_VehiculoActionPerformed
        listar();
    }//GEN-LAST:event_Btn_Listar_VehiculoActionPerformed

 
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
            java.util.logging.Logger.getLogger(VEHICULOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VEHICULOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VEHICULOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VEHICULOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VEHICULOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTN_Salir_Vehiculos;
    public javax.swing.JButton Btn_Buscar_Vehiculo;
    public javax.swing.JButton Btn_Eliminar_Vehiculo;
    public javax.swing.JButton Btn_Guardar_Vehiculo;
    public javax.swing.JButton Btn_Listar_Vehiculo;
    public javax.swing.JButton Btn_Modificar_Vehiculo;
    public javax.swing.JTextField Campo_Capacidad_Vehiculo;
    public javax.swing.JTextField Campo_Marca_Vehiculo;
    public javax.swing.JTextField Campo_Modelo_Vehiculo;
    public javax.swing.JTextField Campo_Placa_Vehiculo;
    public javax.swing.JTextField Campo_TipoVehiculo_Vehiculo;
    public javax.swing.JTable TABLA_VEHICULOS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
