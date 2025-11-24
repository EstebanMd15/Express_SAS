package GUIS;
import GUIS.MENU;
import METODOS.Metodos_Conductores;
import express_sas.CONEXION_BD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class CONDUCTORES extends javax.swing.JFrame {
Metodos_Conductores mt = new Metodos_Conductores(this);
        
  
    public CONDUCTORES() {
        initComponents();
    }
    
       public void listar() {
        String sql = "SELECT * FROM CONDUCTOR";

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID_CONDUCTOR");
        model.addColumn("NOMBRE");
        model.addColumn("TELEFONO");
        model.addColumn("DIRECCION");
        model.addColumn("SALARIO");
        TABLA_CONDUCTORES.setModel(model);

        String[] datos = new String[5];
        try {
            PreparedStatement listar = CONEXION_BD.conectar().prepareStatement(sql);
            ResultSet rs = listar.executeQuery();
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Campo_Id_Conductor = new javax.swing.JTextField();
        Campo_Nombre_Conductor = new javax.swing.JTextField();
        Campo_Salario_Conductor = new javax.swing.JTextField();
        Campo_Telefono_Conductor = new javax.swing.JTextField();
        Campo_Direccion_Conductor = new javax.swing.JTextField();
        BTN_Guardar_Conductor = new javax.swing.JButton();
        BTN_Buscar_Conductor = new javax.swing.JButton();
        BTN_Modificar_Conductor = new javax.swing.JButton();
        BTN_Eliminar_Conductor = new javax.swing.JButton();
        BTN_Salir_Conductor = new javax.swing.JButton();
        BTN_Listar_Conductor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLA_CONDUCTORES = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 99, 100));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONTROL CONDUCTORES");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NOMBRES:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID CONDUCTOR:");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DIRECCION:");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TELEFONO:");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SALARIO:");

        Campo_Id_Conductor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Campo_Id_Conductor.setForeground(new java.awt.Color(0, 0, 0));

        Campo_Nombre_Conductor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Campo_Nombre_Conductor.setForeground(new java.awt.Color(0, 0, 0));

        Campo_Salario_Conductor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Campo_Salario_Conductor.setForeground(new java.awt.Color(0, 0, 0));

        Campo_Telefono_Conductor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Campo_Telefono_Conductor.setForeground(new java.awt.Color(0, 0, 0));

        Campo_Direccion_Conductor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Campo_Direccion_Conductor.setForeground(new java.awt.Color(0, 0, 0));

        BTN_Guardar_Conductor.setBackground(new java.awt.Color(0, 0, 225));
        BTN_Guardar_Conductor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BTN_Guardar_Conductor.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Guardar_Conductor.setText("GUARDAR");
        BTN_Guardar_Conductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Guardar_ConductorActionPerformed(evt);
            }
        });

        BTN_Buscar_Conductor.setBackground(new java.awt.Color(0, 0, 225));
        BTN_Buscar_Conductor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BTN_Buscar_Conductor.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Buscar_Conductor.setText("BUSCAR");
        BTN_Buscar_Conductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Buscar_ConductorActionPerformed(evt);
            }
        });

        BTN_Modificar_Conductor.setBackground(new java.awt.Color(0, 0, 225));
        BTN_Modificar_Conductor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BTN_Modificar_Conductor.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Modificar_Conductor.setText("MODIFICAR");
        BTN_Modificar_Conductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Modificar_ConductorActionPerformed(evt);
            }
        });

        BTN_Eliminar_Conductor.setBackground(new java.awt.Color(0, 0, 225));
        BTN_Eliminar_Conductor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BTN_Eliminar_Conductor.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Eliminar_Conductor.setText("ELIMINAR");
        BTN_Eliminar_Conductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Eliminar_ConductorActionPerformed(evt);
            }
        });

        BTN_Salir_Conductor.setBackground(new java.awt.Color(204, 0, 0));
        BTN_Salir_Conductor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BTN_Salir_Conductor.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Salir_Conductor.setText("SALIR");
        BTN_Salir_Conductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Salir_ConductorActionPerformed(evt);
            }
        });

        BTN_Listar_Conductor.setBackground(new java.awt.Color(0, 0, 225));
        BTN_Listar_Conductor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BTN_Listar_Conductor.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Listar_Conductor.setText("LISTAR");
        BTN_Listar_Conductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Listar_ConductorActionPerformed(evt);
            }
        });

        TABLA_CONDUCTORES.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TABLA_CONDUCTORES.setForeground(new java.awt.Color(0, 0, 0));
        TABLA_CONDUCTORES.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID_CONDUCTOR", "NOMBRE", "TELEFONO", "DIRECCION", "SALARIO"
            }
        ));
        TABLA_CONDUCTORES.setEnabled(false);
        jScrollPane1.setViewportView(TABLA_CONDUCTORES);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 331, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Campo_Telefono_Conductor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(Campo_Direccion_Conductor)))
                                .addGap(383, 383, 383))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(321, 321, 321))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTN_Salir_Conductor)
                            .addComponent(Campo_Nombre_Conductor, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_Listar_Conductor))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BTN_Guardar_Conductor)
                                .addGap(166, 166, 166)
                                .addComponent(BTN_Buscar_Conductor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTN_Modificar_Conductor)
                                .addGap(107, 107, 107)
                                .addComponent(BTN_Eliminar_Conductor))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(Campo_Id_Conductor, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 577, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(Campo_Salario_Conductor, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(61, 61, 61))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Campo_Id_Conductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Campo_Salario_Conductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Campo_Telefono_Conductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Campo_Nombre_Conductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Campo_Direccion_Conductor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_Guardar_Conductor)
                    .addComponent(BTN_Buscar_Conductor)
                    .addComponent(BTN_Modificar_Conductor)
                    .addComponent(BTN_Eliminar_Conductor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTN_Listar_Conductor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN_Salir_Conductor)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_Salir_ConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Salir_ConductorActionPerformed
            MENU mn = new MENU();
            mn.setVisible(true);
            dispose();
    }//GEN-LAST:event_BTN_Salir_ConductorActionPerformed

    private void BTN_Guardar_ConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Guardar_ConductorActionPerformed
        mt.guardar();
    }//GEN-LAST:event_BTN_Guardar_ConductorActionPerformed

    private void BTN_Buscar_ConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Buscar_ConductorActionPerformed
        mt.buscar();
    }//GEN-LAST:event_BTN_Buscar_ConductorActionPerformed

    private void BTN_Modificar_ConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Modificar_ConductorActionPerformed
        mt.modificar();
    }//GEN-LAST:event_BTN_Modificar_ConductorActionPerformed

    private void BTN_Eliminar_ConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Eliminar_ConductorActionPerformed
        mt.eliminar();
    }//GEN-LAST:event_BTN_Eliminar_ConductorActionPerformed

    private void BTN_Listar_ConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Listar_ConductorActionPerformed
        listar();
        
    }//GEN-LAST:event_BTN_Listar_ConductorActionPerformed

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
            java.util.logging.Logger.getLogger(CONDUCTORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CONDUCTORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CONDUCTORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CONDUCTORES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CONDUCTORES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTN_Buscar_Conductor;
    public javax.swing.JButton BTN_Eliminar_Conductor;
    public javax.swing.JButton BTN_Guardar_Conductor;
    public javax.swing.JButton BTN_Listar_Conductor;
    public javax.swing.JButton BTN_Modificar_Conductor;
    public javax.swing.JButton BTN_Salir_Conductor;
    public javax.swing.JTextField Campo_Direccion_Conductor;
    public javax.swing.JTextField Campo_Id_Conductor;
    public javax.swing.JTextField Campo_Nombre_Conductor;
    public javax.swing.JTextField Campo_Salario_Conductor;
    public javax.swing.JTextField Campo_Telefono_Conductor;
    public javax.swing.JTable TABLA_CONDUCTORES;
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
