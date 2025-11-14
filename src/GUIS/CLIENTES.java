package GUIS;

import GUIS.MENU;
import METODOS.METODOS_CLIENTE;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import express_sas.CONEXION_BD;
import javax.swing.JOptionPane;
public class CLIENTES extends javax.swing.JFrame {

    public CLIENTES() {
        initComponents();
    }

    
    public void listar(){
        String sql = "SELECT * FROM CLIENTE ";
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID_CLIENTE");
        model.addColumn("NOMBRE_CLIENTE");
        model.addColumn("TELEFONO");
        model.addColumn("DIRECCION");
        TABLA_CLIENTES.setModel(model);
        
        String[] datos = new String[4];
        try {
            PreparedStatement listar = CONEXION_BD.conectar().prepareStatement(sql);
            ResultSet rs = listar.executeQuery();
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Campo_Id_Cliente = new javax.swing.JTextField();
        Campo_Telefono_Clientes = new javax.swing.JTextField();
        Campo_Nombre_Clientes = new javax.swing.JTextField();
        Campo_Direccion_Clientes = new javax.swing.JTextField();
        BTN_Listar_Clientes = new javax.swing.JButton();
        BTN_Guardar_Clientes = new javax.swing.JButton();
        BTN_Buscar_Clientes = new javax.swing.JButton();
        BTN_Eliminar_Clientes = new javax.swing.JButton();
        BTN_Modificar_Clientes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA_CLIENTES = new javax.swing.JTable();
        BTN_Salir_Clientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 99, 100));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONTROL CLIENTES");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE: ");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TELEFONO:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID CLIENTE:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DIRECCION:");

        Campo_Id_Cliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Campo_Id_Cliente.setForeground(new java.awt.Color(0, 0, 0));
        Campo_Id_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_Id_ClienteActionPerformed(evt);
            }
        });

        Campo_Telefono_Clientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Campo_Telefono_Clientes.setForeground(new java.awt.Color(0, 0, 0));
        Campo_Telefono_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_Telefono_ClientesActionPerformed(evt);
            }
        });

        Campo_Nombre_Clientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Campo_Nombre_Clientes.setForeground(new java.awt.Color(0, 0, 0));
        Campo_Nombre_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_Nombre_ClientesActionPerformed(evt);
            }
        });

        Campo_Direccion_Clientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Campo_Direccion_Clientes.setForeground(new java.awt.Color(0, 0, 0));
        Campo_Direccion_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_Direccion_ClientesActionPerformed(evt);
            }
        });

        BTN_Listar_Clientes.setBackground(new java.awt.Color(0, 0, 225));
        BTN_Listar_Clientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BTN_Listar_Clientes.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Listar_Clientes.setText("LISTAR");
        BTN_Listar_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Listar_ClientesActionPerformed(evt);
            }
        });

        BTN_Guardar_Clientes.setBackground(new java.awt.Color(0, 0, 225));
        BTN_Guardar_Clientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BTN_Guardar_Clientes.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Guardar_Clientes.setText("GUARDAR");
        BTN_Guardar_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Guardar_ClientesActionPerformed(evt);
            }
        });

        BTN_Buscar_Clientes.setBackground(new java.awt.Color(0, 0, 225));
        BTN_Buscar_Clientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BTN_Buscar_Clientes.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Buscar_Clientes.setText("BUSCAR");
        BTN_Buscar_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Buscar_ClientesActionPerformed(evt);
            }
        });

        BTN_Eliminar_Clientes.setBackground(new java.awt.Color(0, 0, 225));
        BTN_Eliminar_Clientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BTN_Eliminar_Clientes.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Eliminar_Clientes.setText("ELIMINAR");
        BTN_Eliminar_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Eliminar_ClientesActionPerformed(evt);
            }
        });

        BTN_Modificar_Clientes.setBackground(new java.awt.Color(0, 0, 225));
        BTN_Modificar_Clientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BTN_Modificar_Clientes.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Modificar_Clientes.setText("MODIFICAR");
        BTN_Modificar_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Modificar_ClientesActionPerformed(evt);
            }
        });

        TABLA_CLIENTES.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TABLA_CLIENTES.setForeground(new java.awt.Color(0, 0, 0));
        TABLA_CLIENTES.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_CLIENTE", "NOMBRE_CLIENTE", "TELEFONO", "DIRECCION"
            }
        ));
        TABLA_CLIENTES.setEnabled(false);
        jScrollPane1.setViewportView(TABLA_CLIENTES);

        BTN_Salir_Clientes.setBackground(new java.awt.Color(204, 0, 0));
        BTN_Salir_Clientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BTN_Salir_Clientes.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Salir_Clientes.setText("SALIR");
        BTN_Salir_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Salir_ClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTN_Guardar_Clientes)
                .addGap(123, 123, 123)
                .addComponent(BTN_Buscar_Clientes)
                .addGap(132, 132, 132)
                .addComponent(BTN_Modificar_Clientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(BTN_Eliminar_Clientes)
                .addGap(26, 26, 26))
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Campo_Id_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(Campo_Nombre_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Campo_Telefono_Clientes, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(Campo_Direccion_Clientes)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BTN_Listar_Clientes))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BTN_Salir_Clientes)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(Campo_Id_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Campo_Telefono_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(Campo_Direccion_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Campo_Nombre_Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTN_Buscar_Clientes)
                            .addComponent(BTN_Modificar_Clientes)
                            .addComponent(BTN_Eliminar_Clientes)
                            .addComponent(BTN_Guardar_Clientes))))
                .addGap(16, 16, 16)
                .addComponent(BTN_Listar_Clientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN_Salir_Clientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void Campo_Id_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_Id_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_Id_ClienteActionPerformed

    private void Campo_Telefono_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_Telefono_ClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_Telefono_ClientesActionPerformed

    private void Campo_Nombre_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_Nombre_ClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_Nombre_ClientesActionPerformed

    private void Campo_Direccion_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_Direccion_ClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_Direccion_ClientesActionPerformed

    private void BTN_Salir_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Salir_ClientesActionPerformed
        MENU mn = new MENU();
        mn.setVisible(true);
        dispose();
    }//GEN-LAST:event_BTN_Salir_ClientesActionPerformed

    private void BTN_Guardar_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Guardar_ClientesActionPerformed
        METODOS_CLIENTE mt = new METODOS_CLIENTE(this);
        mt.guardar();
        listar();
    }//GEN-LAST:event_BTN_Guardar_ClientesActionPerformed

    private void BTN_Buscar_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Buscar_ClientesActionPerformed
        METODOS_CLIENTE mt = new METODOS_CLIENTE(this);
        mt.buscar();
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_Buscar_ClientesActionPerformed

    private void BTN_Modificar_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Modificar_ClientesActionPerformed
        METODOS_CLIENTE mt = new METODOS_CLIENTE(this);
        mt.modificar();
        listar();
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_Modificar_ClientesActionPerformed

    private void BTN_Eliminar_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Eliminar_ClientesActionPerformed
        METODOS_CLIENTE mt = new METODOS_CLIENTE(this);
        mt.eliminar();
        listar();
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_Eliminar_ClientesActionPerformed

    private void BTN_Listar_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Listar_ClientesActionPerformed
        listar();
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_Listar_ClientesActionPerformed

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
            java.util.logging.Logger.getLogger(CLIENTES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CLIENTES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CLIENTES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CLIENTES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CLIENTES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTN_Buscar_Clientes;
    public javax.swing.JButton BTN_Eliminar_Clientes;
    public javax.swing.JButton BTN_Guardar_Clientes;
    public javax.swing.JButton BTN_Listar_Clientes;
    public javax.swing.JButton BTN_Modificar_Clientes;
    public javax.swing.JButton BTN_Salir_Clientes;
    public javax.swing.JTextField Campo_Direccion_Clientes;
    public javax.swing.JTextField Campo_Id_Cliente;
    public javax.swing.JTextField Campo_Nombre_Clientes;
    public javax.swing.JTextField Campo_Telefono_Clientes;
    public javax.swing.JTable TABLA_CLIENTES;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
