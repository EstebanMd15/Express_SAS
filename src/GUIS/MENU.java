package GUIS;

import GUIS.CIUDADES;
import GUIS.CLIENTES;
import GUIS.CONDUCTORES;
import GUIS.PAQUETE;
import GUIS.VEHICULOS;

public class MENU extends javax.swing.JFrame {

    public MENU() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Item_Ciudades = new javax.swing.JMenuItem();
        Item_Clientes = new javax.swing.JMenuItem();
        Item_Conductores = new javax.swing.JMenuItem();
        Item_Paquetes = new javax.swing.JMenuItem();
        Item_Vehiculos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 99, 100));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EMPRESA DE TRANSPORTE EXPRESS SAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(129, 129, 129))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel1)
                .addContainerGap(329, Short.MAX_VALUE))
        );

        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setText("MODULOS");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        Item_Ciudades.setBackground(new java.awt.Color(0, 0, 0));
        Item_Ciudades.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item_Ciudades.setForeground(new java.awt.Color(0, 0, 0));
        Item_Ciudades.setText("CIUDADES");
        Item_Ciudades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_CiudadesActionPerformed(evt);
            }
        });
        jMenu1.add(Item_Ciudades);

        Item_Clientes.setBackground(new java.awt.Color(0, 0, 0));
        Item_Clientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item_Clientes.setForeground(new java.awt.Color(0, 0, 0));
        Item_Clientes.setText("CLIENTES");
        Item_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_ClientesActionPerformed(evt);
            }
        });
        jMenu1.add(Item_Clientes);

        Item_Conductores.setBackground(new java.awt.Color(0, 0, 0));
        Item_Conductores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item_Conductores.setForeground(new java.awt.Color(0, 0, 0));
        Item_Conductores.setText("CONDUCTORES");
        Item_Conductores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_ConductoresActionPerformed(evt);
            }
        });
        jMenu1.add(Item_Conductores);

        Item_Paquetes.setBackground(new java.awt.Color(0, 0, 0));
        Item_Paquetes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item_Paquetes.setForeground(new java.awt.Color(0, 0, 0));
        Item_Paquetes.setText("PAQUETE");
        Item_Paquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_PaquetesActionPerformed(evt);
            }
        });
        jMenu1.add(Item_Paquetes);

        Item_Vehiculos.setBackground(new java.awt.Color(0, 0, 0));
        Item_Vehiculos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Item_Vehiculos.setForeground(new java.awt.Color(0, 0, 0));
        Item_Vehiculos.setText("VEHICULOS");
        Item_Vehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_VehiculosActionPerformed(evt);
            }
        });
        jMenu1.add(Item_Vehiculos);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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

    private void Item_CiudadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_CiudadesActionPerformed
        CIUDADES ci = new CIUDADES();
        ci.setVisible(true);
        dispose();

    }//GEN-LAST:event_Item_CiudadesActionPerformed

    private void Item_VehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_VehiculosActionPerformed
        VEHICULOS vh = new VEHICULOS();
        vh.setVisible(true);
        dispose();
    }//GEN-LAST:event_Item_VehiculosActionPerformed

    private void Item_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_ClientesActionPerformed
        CLIENTES cl = new CLIENTES();
        cl.setVisible(true);
        dispose();
    }//GEN-LAST:event_Item_ClientesActionPerformed

    private void Item_ConductoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_ConductoresActionPerformed
        CONDUCTORES cd = new CONDUCTORES();
        cd.setVisible(true);
        dispose();
    }//GEN-LAST:event_Item_ConductoresActionPerformed

    private void Item_PaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_PaquetesActionPerformed
        PAQUETE pq = new PAQUETE();
        pq.setVisible(true);
        dispose();
    }//GEN-LAST:event_Item_PaquetesActionPerformed

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
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Item_Ciudades;
    private javax.swing.JMenuItem Item_Clientes;
    private javax.swing.JMenuItem Item_Conductores;
    private javax.swing.JMenuItem Item_Paquetes;
    private javax.swing.JMenuItem Item_Vehiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
