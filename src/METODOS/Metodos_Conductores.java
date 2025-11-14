package METODOS;

import java.sql.*;
import GUIS.CONDUCTORES;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import express_sas.CONEXION_BD;
import javax.swing.JOptionPane;

public class Metodos_Conductores implements ActionListener {

    private CONDUCTORES ct;
    private JButton btnGuardar;
    private JButton btnBuscar;
    private JButton btnModificar;
    private JButton btnEliminar;

    public Metodos_Conductores(CONDUCTORES ct) {
        this.ct = ct;
        this.btnBuscar = ct.BTN_Buscar_Conductor;
        this.btnEliminar = ct.BTN_Eliminar_Conductor;
        this.btnGuardar = ct.BTN_Guardar_Conductor;
        this.btnModificar = ct.BTN_Modificar_Conductor;
    }

    public void guardar() {
        String idf = ct.Campo_Id_Conductor.getText().trim();
        String nombre = ct.Campo_Nombre_Conductor.getText().trim();
        String telefonoF = ct.Campo_Telefono_Conductor.getText().trim();
        String salarioF = ct.Campo_Salario_Conductor.getText().trim();
        String direccion = ct.Campo_Direccion_Conductor.getText().trim();
        String query = "INSERT INTO CONDUCTOR(ID_CONDUCTOR, NOMBRE, TELEFONO, DIRECCION, SALARIO) VALUES (?,?,?,?,?)";
        try {
            int id = Integer.parseInt(idf);
            int telefono = Integer.parseInt(telefonoF);
            double salario = Double.parseDouble(salarioF);
            PreparedStatement guardar = CONEXION_BD.conectar().prepareStatement(query);
            guardar.setInt(1, id);
            guardar.setString(2, nombre);
            guardar.setInt(3, telefono);
            guardar.setString(4, direccion);
            guardar.setDouble(5, salario);

            ct.Campo_Direccion_Conductor.setText("");
            ct.Campo_Id_Conductor.setText("");
            ct.Campo_Nombre_Conductor.setText("");
            ct.Campo_Salario_Conductor.setText("");
            ct.Campo_Telefono_Conductor.setText("");
            guardar.executeUpdate();

            JOptionPane.showMessageDialog(null, "CONDUCTOR " + nombre + " REGISTRADO CON EXITO");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "[ERROR AL CONECTAR CON LA BD]:" + e.getMessage());
        }
    }

    public void modificar() {
        String idf = ct.Campo_Id_Conductor.getText().trim();
        String nombre = ct.Campo_Nombre_Conductor.getText().trim();
        String telefonoF = ct.Campo_Telefono_Conductor.getText().trim();
        String salarioF = ct.Campo_Salario_Conductor.getText().trim();
        String direccion = ct.Campo_Direccion_Conductor.getText().trim();
        String query = "UPDATE CONDUCTOR SET NOMBRE=?, TELEFONO=?, DIRECCION=?, SALARIO=? WHERE ID_CONDUCTOR=?";

        try {
            int id = Integer.parseInt(idf);
            int telefono = Integer.parseInt(telefonoF);
            double salario = Double.parseDouble(salarioF);

            PreparedStatement modificar = CONEXION_BD.conectar().prepareStatement(query);
            modificar.setString(1, nombre);
            modificar.setInt(2, telefono);
            modificar.setString(3, direccion);
            modificar.setDouble(4, salario);
            modificar.setInt(5, id);

            int confirmacion = JOptionPane.showConfirmDialog(null, "DESEA MODIFICAR LOS DATOS DEL CONDUCTOR ?");
            if (confirmacion == 0) {
                int campos = modificar.executeUpdate();
                if (campos != 0) {
                    ct.Campo_Direccion_Conductor.setText("");
                    ct.Campo_Id_Conductor.setText("");
                    ct.Campo_Nombre_Conductor.setText("");
                    ct.Campo_Salario_Conductor.setText("");
                    ct.Campo_Telefono_Conductor.setText("");
                }
                JOptionPane.showMessageDialog(null, "CLIENTE ACTUALIZADO CON EXITO");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "[ERROR AL CONECTAR CON LA BD]: " + e.getMessage());

        }
    }

    public void eliminar() {
        String idf = ct.Campo_Id_Conductor.getText().trim();
        String nombre = ct.Campo_Nombre_Conductor.getText().trim();
        String query = "DELETE FROM CONDUCTOR WHERE ID_CONDUCTOR =?";

        try {
            int id = Integer.parseInt(idf);
            PreparedStatement eliminar = CONEXION_BD.conectar().prepareStatement(query);
            eliminar.setInt(1, id);
            int confirmacion = JOptionPane.showConfirmDialog(null, "DESEA ELIMINAR AL CONDUCTOR " + nombre);
            if (confirmacion == 0) {
                int campos = eliminar.executeUpdate();
                if (campos != 0) {
                    ct.Campo_Direccion_Conductor.setText("");
                    ct.Campo_Id_Conductor.setText("");
                    ct.Campo_Nombre_Conductor.setText("");
                    ct.Campo_Salario_Conductor.setText("");
                    ct.Campo_Telefono_Conductor.setText("");
                }
                JOptionPane.showMessageDialog(null, "CONDUCTOR " + nombre + " ELIMINADO CON EXITO");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "[ERROR AL CONECTAR CON LA BD]: " + e.getMessage());
        }
    }

    public void buscar() {
        String idf = ct.Campo_Id_Conductor.getText().trim();
        String query = "SELECT * FROM CONDUCTOR WHERE ID_CONDUCTOR=?";

        try {
            int id = Integer.parseInt(idf);
            PreparedStatement buscar = CONEXION_BD.conectar().prepareStatement(idf);
            buscar.setInt(1, id);
            ResultSet rs = buscar.executeQuery();
            if (rs.next()) {
                ct.Campo_Direccion_Conductor.setText(rs.getString("DIRECCION"));
                ct.Campo_Nombre_Conductor.setText(rs.getString("NOMBRE"));
                ct.Campo_Telefono_Conductor.setText(rs.getString("TELEFONO"));
                ct.Campo_Salario_Conductor.setText(rs.getString("SALARIO"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "[ERROR AL CONECTAR CON LA BD]: " + e.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnBuscar) {
            buscar();
        }
        if (e.getSource() == btnEliminar) {
            eliminar();
        }
        if (e.getSource() == btnGuardar) {
            guardar();
        }
        if (e.getSource() == btnModificar) {
            modificar();
        }
    }

}
