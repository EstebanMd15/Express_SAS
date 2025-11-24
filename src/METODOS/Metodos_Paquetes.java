package METODOS;

import java.sql.*;
import GUIS.PAQUETE;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import express_sas.CONEXION_BD;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class Metodos_Paquetes implements ActionListener {

    private PAQUETE pq;
    private JButton btnBuscar1;
    private JButton btnEliminar1;
    private JButton btnGuardar1;
    private JButton btnModificar1;

    public Metodos_Paquetes(PAQUETE pq) {
        this.pq = pq;
        this.btnBuscar1 = pq.btn_Buscar_clientes;
        this.btnEliminar1 = pq.btn_Eliminar_clientes;
        this.btnGuardar1 = pq.btn_Guardar_clientes;
        this.btnModificar1 = pq.btn_modificar_clientes;
    }

    public void guardar() {
        String idf = pq.campo_id_paquete.getText().trim();
        String descripcion = pq.campo_Descripcion_paquete.getText().trim();
        String telefonof = pq.campo_TelDestinatario_paquete.getText().trim();
        String destinario = pq.campo_Destino_paquete.getText().trim();
        String fechaenv = pq.campo_FechaEnvio_paquete.getText().trim();
        String fechalle = pq.campo_FechaLlegada_paquete.getText().trim();
        String direccion = pq.campo_direccionentrega_paquete.getText().trim();
        String query = "INSERT INTO PAQUETE(ID_PAQUETE, DESCRIPCION, DESTINATARIO, TELEFONO_DESTINATARIO, FECHA_ENVIO, FECHA_LLEGADA, DIRECCION_ENTREGA)VALUES (?,?,?,?,?,?,?)";
        try {
            int id = Integer.parseInt(idf);
            int telefono = Integer.parseInt(telefonof);
            PreparedStatement guardar = CONEXION_BD.conectar().prepareStatement(query);
            guardar.setInt(1, id);
            guardar.setString(2, descripcion);
            guardar.setString(3, destinario);
            guardar.setInt(4, telefono);
            guardar.setString(5, fechaenv);
            guardar.setString(6, fechalle);
            guardar.setString(7, direccion);

            pq.campo_Descripcion_paquete.setText("");
            pq.campo_Destino_paquete.setText("");
            pq.campo_FechaEnvio_paquete.setText("");
            pq.campo_FechaLlegada_paquete.setText("");
            pq.campo_TelDestinatario_paquete.setText("");
            pq.campo_direccionentrega_paquete.setText("");
            pq.campo_id_paquete.setText("");
            guardar.executeUpdate();
            JOptionPane.showMessageDialog(null, "PAQUETE REGISTRADO");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "[ERROR AL CONECTAR CON LA BD]: " + e.getMessage());
        }
    }

    public void buscar() {
        String idf = pq.campo_id_paquete.getText().trim();
        String query = "SELECT * FROM PAQUETE WHERE ID_PAQUETE=?";

        try {
            int id = Integer.parseInt(idf);
            PreparedStatement buscar = CONEXION_BD.conectar().prepareStatement(query);
            buscar.setInt(1, id);
            ResultSet rs = buscar.executeQuery();
            if (rs.next()) {
                pq.campo_Descripcion_paquete.setText(rs.getString("DESCRIPCION"));
                pq.campo_Destino_paquete.setText(rs.getString("DESTINATARIO"));
                pq.campo_FechaEnvio_paquete.setText(rs.getString("FECHA_ENVIO"));
                pq.campo_FechaLlegada_paquete.setText(rs.getString("FECHA_LLEGADA"));
                pq.campo_TelDestinatario_paquete.setText(rs.getString("TELEFONO_DESTINATARIO"));
                pq.campo_direccionentrega_paquete.setText(rs.getString("DIRECCION_ENTREGA"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "[ERROR AL CONECTAR ALA BD]: " + e.getMessage());
        }

    }

    public void modificar() {
        String descripcion = pq.campo_Descripcion_paquete.getText().trim();
        String destino = pq.campo_Destino_paquete.getText().trim();
        String fechaEnv = pq.campo_FechaEnvio_paquete.getText().trim();
        String fechaLle = pq.campo_FechaLlegada_paquete.getText().trim();
        String telefonof = pq.campo_TelDestinatario_paquete.getText().trim();
        String direccion = pq.campo_direccionentrega_paquete.getText().trim();
        String idf = pq.campo_id_paquete.getText().trim();
        String query = "UPDATE PAQUETE SET DESCRIPCION=?, DESTINATARIO=?, FECHA_ENVIO=?, FECHA_LLEGADA=?, TELEFONO_DESTINATARIO=?, DIRECCION_ENTREGA=? WHERE ID_PAQUETE=?";

        try {
            int id = Integer.parseInt(idf);
            int telefono = Integer.parseInt(telefonof);

            PreparedStatement modificar = CONEXION_BD.conectar().prepareStatement(query);
            modificar.setString(1, descripcion);
            modificar.setString(2, destino);
            modificar.setString(3, fechaEnv);
            modificar.setString(4, fechaLle);
            modificar.setInt(5, telefono);
            modificar.setString(6, direccion);
            modificar.setInt(7, id);

            int confirmacion = JOptionPane.showConfirmDialog(null, "DESEA MODIFICAR LOS DATOS DEL PAQUETE ?");
            if (confirmacion == 0) {
                int campos = modificar.executeUpdate();
                if (campos != 0) {
                    pq.campo_Descripcion_paquete.setText("");
                    pq.campo_Destino_paquete.setText("");
                    pq.campo_FechaEnvio_paquete.setText("");
                    pq.campo_FechaLlegada_paquete.setText("");
                    pq.campo_TelDestinatario_paquete.setText("");
                    pq.campo_direccionentrega_paquete.setText("");
                    pq.campo_direccionentrega_paquete.setText("");
                    pq.campo_id_paquete.setText("");
                }
                JOptionPane.showMessageDialog(null, "PAQUETE ACTUALIZADO CON EXITO");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "[ERROR AL CONECTAR CON LA BD]: " + e.getMessage());
        }

    }

    public void eliminar() {
        String idf = pq.campo_id_paquete.getText().trim();
        String query = "DELETE FROM PAQUETE WHERE ID_PAQUETE =?";

        try {
            int id = Integer.parseInt(idf);
            PreparedStatement eliminar = CONEXION_BD.conectar().prepareStatement(query);
            eliminar.setInt(1, id);
            int confirmacion = JOptionPane.showConfirmDialog(null, "DESEA ELIMINAR EL PAQUETE " + id);
            if (confirmacion == 0) {
                int campos = eliminar.executeUpdate();
                if (campos != 0) {
                    pq.campo_Descripcion_paquete.setText("");
                    pq.campo_Destino_paquete.setText("");
                    pq.campo_FechaEnvio_paquete.setText("");
                    pq.campo_FechaLlegada_paquete.setText("");
                    pq.campo_TelDestinatario_paquete.setText("");
                    pq.campo_direccionentrega_paquete.setText("");
                    pq.campo_direccionentrega_paquete.setText("");
                    pq.campo_id_paquete.setText("");
                }
                JOptionPane.showMessageDialog(null, "PAQUETE ELIMINADO");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"[ERROR AL CONECTAR CON LA BD]: " + e.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnGuardar1) {
            guardar();
        }
        if (e.getSource() == btnModificar1) {
            modificar();
        }
        if(e.getSource() == btnEliminar1){
            eliminar();
        }
        if(e.getSource() == btnBuscar1){
            buscar();
        }
    }

}
