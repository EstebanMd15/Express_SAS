package GUIS;

import GUIS.MENU;
import METODOS.Metodos_Ciudad;
import java.beans.Statement;
import javax.swing.table.DefaultTableModel;
import express_sas.CONEXION_BD;
import java.sql.*;
import javax.swing.JOptionPane;

public class CIUDADES extends javax.swing.JFrame {

    public CIUDADES() {
        initComponents();
    }

    public void listar(String tabla) {
        String sql = "SELECT * FROM CIUDAD " + tabla;

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID_CIUDAD");
        model.addColumn("NOMBRE_CIUDAD");
        TABLA_CIUDADES.setModel(model);

        String[] datos = new String[2];
        try {
            PreparedStatement listar = CONEXION_BD.conectar().prepareStatement(sql);
            ResultSet rs = listar.executeQuery();
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                model.addRow(datos);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "[ERROR AL CONECTAR CON LA BD]: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA_CIUDADES = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Campo_Id_Ciudad = new javax.swing.JTextField();
        Campo_Nombre_Ciudad = new javax.swing.JTextField();
        btn_Guardar_Ciudad = new javax.swing.JButton();
        Btn_Listar_Ciudad = new javax.swing.JButton();
        Btn_Modificar_Ciudad = new javax.swing.JButton();
        Btn_Salir_Ciudad = new javax.swing.JButton();
        BTN_Eliminar_Ciudad = new javax.swing.JButton();
        BTN_Buscar_Ciudad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 99, 100));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONTROL CIUDADES");

        TABLA_CIUDADES.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TABLA_CIUDADES.setForeground(new java.awt.Color(0, 0, 0));
        TABLA_CIUDADES.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_CIUDAD", "NOMBRE_CIUDAD"
            }
        ));
        TABLA_CIUDADES.setEnabled(false);
        jScrollPane1.setViewportView(TABLA_CIUDADES);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID CIUDAD:");

        Campo_Id_Ciudad.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Campo_Id_Ciudad.setForeground(new java.awt.Color(0, 0, 0));

        Campo_Nombre_Ciudad.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Campo_Nombre_Ciudad.setForeground(new java.awt.Color(0, 0, 0));

        btn_Guardar_Ciudad.setBackground(new java.awt.Color(0, 0, 255));
        btn_Guardar_Ciudad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Guardar_Ciudad.setForeground(new java.awt.Color(255, 255, 255));
        btn_Guardar_Ciudad.setText("GUARDAR");
        btn_Guardar_Ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Guardar_CiudadActionPerformed(evt);
            }
        });

        Btn_Listar_Ciudad.setBackground(new java.awt.Color(0, 0, 255));
        Btn_Listar_Ciudad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Btn_Listar_Ciudad.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Listar_Ciudad.setText("LISTAR");
        Btn_Listar_Ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Listar_CiudadActionPerformed(evt);
            }
        });

        Btn_Modificar_Ciudad.setBackground(new java.awt.Color(0, 0, 255));
        Btn_Modificar_Ciudad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Btn_Modificar_Ciudad.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Modificar_Ciudad.setText("MODIFICAR");
        Btn_Modificar_Ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Modificar_CiudadActionPerformed(evt);
            }
        });

        Btn_Salir_Ciudad.setBackground(new java.awt.Color(204, 0, 0));
        Btn_Salir_Ciudad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Btn_Salir_Ciudad.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Salir_Ciudad.setText("SALIR");
        Btn_Salir_Ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Salir_CiudadActionPerformed(evt);
            }
        });

        BTN_Eliminar_Ciudad.setBackground(new java.awt.Color(0, 0, 255));
        BTN_Eliminar_Ciudad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BTN_Eliminar_Ciudad.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Eliminar_Ciudad.setText("ELIMINAR");
        BTN_Eliminar_Ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Eliminar_CiudadActionPerformed(evt);
            }
        });

        BTN_Buscar_Ciudad.setBackground(new java.awt.Color(0, 0, 225));
        BTN_Buscar_Ciudad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BTN_Buscar_Ciudad.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Buscar_Ciudad.setText("BUSCAR");
        BTN_Buscar_Ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Buscar_CiudadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Btn_Salir_Ciudad)
                                    .addComponent(Btn_Listar_Ciudad)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Campo_Nombre_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Campo_Id_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addComponent(btn_Guardar_Ciudad)
                                                .addGap(91, 91, 91)
                                                .addComponent(Btn_Modificar_Ciudad)))
                                        .addGap(102, 102, 102)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(BTN_Eliminar_Ciudad)
                                            .addComponent(BTN_Buscar_Ciudad))))
                                .addGap(0, 61, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Campo_Id_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Buscar_Ciudad))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Guardar_Ciudad)
                            .addComponent(Btn_Modificar_Ciudad)
                            .addComponent(BTN_Eliminar_Ciudad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_Listar_Ciudad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btn_Salir_Ciudad)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Campo_Nombre_Ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_Listar_CiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Listar_CiudadActionPerformed
        listar("CIUDAD");
    }//GEN-LAST:event_Btn_Listar_CiudadActionPerformed

    private void Btn_Modificar_CiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Modificar_CiudadActionPerformed
        Metodos_Ciudad mt = new Metodos_Ciudad(this);
        mt.modificar();
        listar("CIUDAD");

    }//GEN-LAST:event_Btn_Modificar_CiudadActionPerformed

    private void btn_Guardar_CiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Guardar_CiudadActionPerformed
        Metodos_Ciudad mt = new Metodos_Ciudad(this);
        mt.guardar();
        listar("CIUDAD");

    }//GEN-LAST:event_btn_Guardar_CiudadActionPerformed

    private void Btn_Salir_CiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Salir_CiudadActionPerformed
        MENU mn = new MENU();
        mn.setVisible(true);
        dispose();
    }//GEN-LAST:event_Btn_Salir_CiudadActionPerformed

    private void BTN_Eliminar_CiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Eliminar_CiudadActionPerformed
        Metodos_Ciudad mt = new Metodos_Ciudad(this);
        mt.eliminar();
        listar("CIUDAD");

    }//GEN-LAST:event_BTN_Eliminar_CiudadActionPerformed

    private void BTN_Buscar_CiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Buscar_CiudadActionPerformed
        Metodos_Ciudad mt = new Metodos_Ciudad(this);
        mt.buscar();
    }//GEN-LAST:event_BTN_Buscar_CiudadActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CIUDADES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CIUDADES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CIUDADES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CIUDADES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CIUDADES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTN_Buscar_Ciudad;
    public javax.swing.JButton BTN_Eliminar_Ciudad;
    public javax.swing.JButton Btn_Listar_Ciudad;
    public javax.swing.JButton Btn_Modificar_Ciudad;
    public javax.swing.JButton Btn_Salir_Ciudad;
    public javax.swing.JTextField Campo_Id_Ciudad;
    public javax.swing.JTextField Campo_Nombre_Ciudad;
    public javax.swing.JTable TABLA_CIUDADES;
    public javax.swing.JButton btn_Guardar_Ciudad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
