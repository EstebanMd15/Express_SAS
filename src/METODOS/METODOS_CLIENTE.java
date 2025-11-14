package METODOS;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import GUIS.CLIENTES;
import javax.swing.JButton;
import express_sas.CONEXION_BD;
import javax.swing.JOptionPane;

public class METODOS_CLIENTE implements ActionListener {

    private CLIENTES cl;
    private JButton btnGuardar;
    private JButton btnBuscar;
    private JButton btnModificar;
    private JButton btnEliminar;

    public METODOS_CLIENTE(CLIENTES cl) {
        this.cl = cl;
        this.btnBuscar = cl.BTN_Buscar_Clientes;
        this.btnEliminar = cl.BTN_Eliminar_Clientes;
        this.btnGuardar = cl.BTN_Guardar_Clientes;
        this.btnModificar = cl.BTN_Modificar_Clientes;
    }

    public void guardar() {
        String idf = cl.Campo_Id_Cliente.getText().trim();
        String nombre = cl.Campo_Nombre_Clientes.getText().trim();
        String telefonof = cl.Campo_Telefono_Clientes.getText().trim();
        String direccion = cl.Campo_Direccion_Clientes.getText().trim();
        String query = "INSERT INTO CLIENTE (ID_CLIENTE, NOMBRE_CLIENTE, TELEFONO, DIRECCION) VALUES(?,?,?,?)";
        try {
            int id = Integer.parseInt(idf);
            int telefono = Integer.parseUnsignedInt(telefonof);
            PreparedStatement guardar = CONEXION_BD.conectar().prepareStatement(query);
            guardar.setInt(1, id);
            guardar.setString(2, nombre);
            guardar.setInt(3, telefono);
            guardar.setString(4, direccion);

            cl.Campo_Direccion_Clientes.setText("");
            cl.Campo_Id_Cliente.setText("");
            cl.Campo_Nombre_Clientes.setText("");
            cl.Campo_Telefono_Clientes.setText("");
            guardar.executeUpdate();
            JOptionPane.showMessageDialog(null, "CLIENTE " + nombre + " REGISTRADO CON EXITO");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "[ERROR AL CONECTAR CON LA BD]: " + e.getMessage());
        }
    }

    public void modificar() {
        String idf = cl.Campo_Id_Cliente.getText().trim();
        String nombre = cl.Campo_Nombre_Clientes.getText().trim();
        String telefonof = cl.Campo_Telefono_Clientes.getText().trim();
        String direccion = cl.Campo_Direccion_Clientes.getText().trim();
        String query = "UPDATE CLIENTE SET NOMBRE_CLIENTE =?, TELEFONO =?, DIRECCION=? WHERE ID_CLIENTE=?";

        try {
            int id = Integer.parseInt(idf);
            int telefono = Integer.parseInt(telefonof);

            PreparedStatement modificar = CONEXION_BD.conectar().prepareStatement(query);
            modificar.setInt(4, id);
            modificar.setString(1, nombre);
            modificar.setInt(2, telefono);
            modificar.setString(3, direccion);

            int confirmacion = JOptionPane.showConfirmDialog(null, "DESEA MODIFICAR LOS DATOS DEL CLIENTE?");
            if (confirmacion == 0) {
                int campos = modificar.executeUpdate();
                if (campos != 0) {
                    cl.Campo_Direccion_Clientes.setText("");
                    cl.Campo_Id_Cliente.setText("");
                    cl.Campo_Nombre_Clientes.setText("");
                    cl.Campo_Telefono_Clientes.setText("");
                }
                JOptionPane.showMessageDialog(null, "CLIENTE ACTUALIZADO CON EXITO");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "[ERROR AL CONECTAR CON LA BD]: " + e.getMessage());

        }
    }

    public void eliminar() {
        String idf = cl.Campo_Id_Cliente.getText().trim();
        String nombre = cl.Campo_Nombre_Clientes.getText().trim();
        String query = "DELETE FROM CLIENTE WHERE ID_CLIENTE =?";
        try {
            int id = Integer.parseInt(idf);
            PreparedStatement eliminar = CONEXION_BD.conectar().prepareStatement(query);
            eliminar.setInt(1, id);
            int confirmacion = JOptionPane.showConfirmDialog(null, "DESEA ELIMINAR EL CLIENTE " + nombre);
            if (confirmacion == 0) {
                int campos = eliminar.executeUpdate();
                if (campos != 0) {
                    cl.Campo_Direccion_Clientes.setText("");
                    cl.Campo_Id_Cliente.setText("");
                    cl.Campo_Nombre_Clientes.setText("");
                    cl.Campo_Telefono_Clientes.setText("");
                }
                JOptionPane.showMessageDialog(null, "CLIENTE "+ nombre +"  ELIMINADO CON EXITO");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "[ERROR AL CONECTAR CON LA BD]: " + e.getMessage());
        }
    }

    public void buscar() {
        String idf = cl.Campo_Id_Cliente.getText().trim();
        String sql = "SELECT * FROM CLIENTE WHERE ID_CLIENTE=?";
        try {
            int id = Integer.parseInt(idf);
            PreparedStatement buscar = CONEXION_BD.conectar().prepareStatement(sql);
            buscar.setInt(1, id);
            ResultSet rs = buscar.executeQuery();
            if (rs.next()) {
                cl.Campo_Direccion_Clientes.setText(rs.getString("DIRECCION"));
                cl.Campo_Id_Cliente.setText(rs.getString("ID_CLIENTE"));
                cl.Campo_Nombre_Clientes.setText(rs.getString("NOMBRE_CLIENTE"));
                cl.Campo_Telefono_Clientes.setText(rs.getString("TELEFONO"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"[ERROR AL CONECTAR CON LA BD]: " + e.getMessage());
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
