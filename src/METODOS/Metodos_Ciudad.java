package METODOS;

import GUIS.CIUDADES;
import express_sas.CONEXION_BD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.sql.*;
import javax.swing.JOptionPane;

public class Metodos_Ciudad implements ActionListener {

    private CIUDADES cu;
    private JButton btnGuardar;
    private JButton btnModificar;
    private JButton btnEliminar;
    private JButton btnBuscar;

    public Metodos_Ciudad(CIUDADES cu) {
        this.cu = cu;
        this.btnGuardar = cu.btn_Guardar_Ciudad;
        this.btnModificar = cu.Btn_Modificar_Ciudad;
        this.btnEliminar = cu.BTN_Eliminar_Ciudad;
        this.btnBuscar = cu.BTN_Buscar_Ciudad;
    }

    public void guardar() {
        String idf = cu.Campo_Id_Ciudad.getText().trim();
        String nombre = cu.Campo_Nombre_Ciudad.getText().trim();
        String query = "INSERT INTO CIUDAD (ID_CIUDAD, NOMBRE_CIUDAD) VALUES (?,?)";
        
        try {
            int id = Integer.parseInt(idf);
            PreparedStatement guardar = CONEXION_BD.conectar().prepareStatement(query);
            guardar.setInt(1, id);
            guardar.setString(2, nombre);

            cu.Campo_Id_Ciudad.setText("");
            cu.Campo_Nombre_Ciudad.setText("");
            guardar.executeUpdate();
            JOptionPane.showMessageDialog(null, "CIUDAD: " + nombre + " REGISTRADA CON EXITO");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "[ERROR AL CONECTAR CON LA BD]: " + e.getMessage());
        }
    }

    public void modificar() {
        String idf = cu.Campo_Id_Ciudad.getText().trim();
        String nombre = cu.Campo_Nombre_Ciudad.getText().trim();
        String query = "UPDATE CIUDAD SET NOMBRE_CIUDAD=? WHERE ID_CIUDAD =?";
        try {
            int id = Integer.parseInt(idf);
            PreparedStatement modificar = CONEXION_BD.conectar().prepareStatement(query);
            modificar.setString(1, nombre);
            modificar.setInt(2, id);

            int confirmacion = JOptionPane.showConfirmDialog(null, "DESEA MODIFICAR LA CIUDAD ? " + nombre);
            if (confirmacion == 0) {
                int campos = modificar.executeUpdate();
                if (campos != 0) {
                    cu.Campo_Id_Ciudad.setText("");
                    cu.Campo_Nombre_Ciudad.setText("");
                }
                JOptionPane.showMessageDialog(null, "CIUDAD ACTUALIZADA CON EXITO");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "[ERROR AL CONECTAR CON LA BD]: " + e.getMessage());
        }

    }

    public void eliminar() {
        String idf = cu.Campo_Id_Ciudad.getText().trim();
        String query = "DELETE FROM CIUDAD WHERE ID_CIUDAD =?";
        String nombre = cu.Campo_Nombre_Ciudad.getText().trim();
        try {
            int id = Integer.parseInt(idf);
            PreparedStatement eliminar = CONEXION_BD.conectar().prepareStatement(query);
            eliminar.setInt(1, id);
            int confirmacion = JOptionPane.showConfirmDialog(null, "DESEA ELIMINAR LA CIUDAD " + nombre);
            if (confirmacion == 0) {
                int campos = eliminar.executeUpdate();
                if (campos != 0) {
                    cu.Campo_Id_Ciudad.setText("");
                    cu.Campo_Nombre_Ciudad.setText("");
                }
                JOptionPane.showMessageDialog(null, "CIUDAD ELIMINADA");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "[ERROR AL CONECTAR CON LA BD]: " + e.getMessage());
        }
    }

    public void buscar() {
        String idf = cu.Campo_Id_Ciudad.getText().trim();
        String query = "SELECT * FROM CIUDAD WHERE ID_CIUDAD =?";
        try {
            int id = Integer.parseInt(idf);
            PreparedStatement buscar = CONEXION_BD.conectar().prepareStatement(query);
            buscar.setInt(1, id);
            ResultSet rs = buscar.executeQuery();
            if (rs.next()) {
                cu.Campo_Nombre_Ciudad.setText(rs.getString("NOMBRE_CIUDAD"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "[ERROR AL CONECTAR CON LA BD]: " + e.getMessage());

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnGuardar) {
            guardar();
        }

        if (e.getSource() == btnModificar) {
            modificar();
        }

        if (e.getSource() == btnEliminar) {
            eliminar();
        }
        if(e.getSource() == btnBuscar){
            buscar();
        }
    }
}
