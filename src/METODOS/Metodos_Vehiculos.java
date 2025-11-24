package METODOS;

import GUIS.VEHICULOS;
import express_sas.CONEXION_BD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Metodos_Vehiculos implements ActionListener {

    private VEHICULOS vh;
    private JButton btnBuscar;
    private JButton btnGuardar;
    private JButton btnEliminar;
    private JButton btnModificar;

    public Metodos_Vehiculos(VEHICULOS vh) {
        this.vh = vh;
        this.btnBuscar = vh.Btn_Buscar_Vehiculo;
        this.btnEliminar = vh.Btn_Eliminar_Vehiculo;
        this.btnGuardar = vh.Btn_Guardar_Vehiculo;
        this.btnModificar = vh.Btn_Modificar_Vehiculo;
    }

    public void guardar() {
        String placa = vh.Campo_Placa_Vehiculo.getText().trim();
        String marca = vh.Campo_Marca_Vehiculo.getText().trim();
        String capacidadF = vh.Campo_Capacidad_Vehiculo.getText().trim();
        String modeloF = vh.Campo_Modelo_Vehiculo.getText().trim();
        String tipoVehiculo = vh.Campo_TipoVehiculo_Vehiculo.getText().trim();
        String query = "INSERT INTO VEHICULO (PLACA, CAPACIDAD, MARCA, TIPO_VEHICULO, MODELO) VALUES (?,?,?,?,?)";

        try {
            int capacidad = Integer.parseInt(capacidadF);
            int modelo = Integer.parseInt(modeloF);

            PreparedStatement guardar = CONEXION_BD.conectar().prepareStatement(query);
            guardar.setString(1, placa);
            guardar.setInt(2, capacidad);
            guardar.setString(3, marca);
            guardar.setString(4, tipoVehiculo);
            guardar.setInt(5, modelo);

            vh.Campo_Capacidad_Vehiculo.setText("");
            vh.Campo_Marca_Vehiculo.setText("");
            vh.Campo_Modelo_Vehiculo.setText("");
            vh.Campo_Placa_Vehiculo.setText("");
            vh.Campo_TipoVehiculo_Vehiculo.setText("");
            guardar.executeUpdate();
            JOptionPane.showMessageDialog(null, "VEHICULO DE PLACAS: " + placa + " TIPO " + tipoVehiculo + " REGISTRADO");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "[ERROR AL CONECTAR CON LA BD]: " + e.getMessage());
        }
    }

    public void buscar() {
        String placa = vh.Campo_Placa_Vehiculo.getText().trim();
        String query = "SELECT * FROM VEHICULO WHERE PLACA =?";

        try {
            PreparedStatement buscar = CONEXION_BD.conectar().prepareStatement(query);
            buscar.setString(1, placa);
            ResultSet rs = buscar.executeQuery();
            if (rs.next()) {
                vh.Campo_Capacidad_Vehiculo.setText(rs.getString("CAPACIDAD"));
                vh.Campo_Marca_Vehiculo.setText(rs.getString("MARCA"));
                vh.Campo_Modelo_Vehiculo.setText(rs.getString("MODELO"));
                vh.Campo_Placa_Vehiculo.setText(rs.getString("PLACA"));
                vh.Campo_TipoVehiculo_Vehiculo.setText(rs.getString("TIPO_VEHICULO"));

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "[ERROR AL CONECTAR CON LA BD]: " + e.getMessage());
        }

    }
    
    public void buscar2(){
                 String query = "SELECT * FROM VEHICULO WHERE PLACA =?";
                 String placa = vh.Campo_Placa_Vehiculo.getText().trim();
            DefaultTableModel model = new DefaultTableModel();
            
            model.addColumn("PLACA");
            model.addColumn("MARCA");
            model.addColumn("TIPO_VEHICULO");
            model.addColumn("MODELO");
            model.addColumn("CAPACIDAD");
            vh.TABLA_VEHICULOS.setModel(model);
            
            String[] datos = new String [5];
            try {
                PreparedStatement listar = CONEXION_BD.conectar().prepareStatement(query);
                listar.setString(1, placa);
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

    public void eliminar() {
        String placa = vh.Campo_Placa_Vehiculo.getText().trim();
        String query = "DELETE FROM PAQUETE WHERE PLACA =?";
        try {
            PreparedStatement eliminar = CONEXION_BD.conectar().prepareStatement(query);
            eliminar.setString(1, placa);
            int confirmacion = JOptionPane.showConfirmDialog(null, "DESEA ELIMINAR EL VEHICULO " + placa + " ?");
            if (confirmacion == 0) {
                int campos = eliminar.executeUpdate();
                if (campos != 0) {
                    vh.Campo_Capacidad_Vehiculo.setText("");
                    vh.Campo_Marca_Vehiculo.setText("");
                    vh.Campo_Modelo_Vehiculo.setText("");
                    vh.Campo_Placa_Vehiculo.setText("");
                    vh.Campo_TipoVehiculo_Vehiculo.setText("");
                }
                JOptionPane.showMessageDialog(null, "VEHICULO ELIMINADO EXITOSAMENTE");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "[ERROR AL CONECTAR CON LA BD]: " + e.getMessage());
        }
    }

    public void modificar() {
        String placa = vh.Campo_Placa_Vehiculo.getText().trim();
        String modeloF = vh.Campo_Modelo_Vehiculo.getText().trim();
        String capacidadF = vh.Campo_Capacidad_Vehiculo.getText().trim();
        String marca = vh.Campo_Marca_Vehiculo.getText().trim();
        String tipoVehiculo = vh.Campo_TipoVehiculo_Vehiculo.getText().trim();
        String query = "UPDATE VEHICULO SET CAPACIDAD=?, MARCA=?, TIPO_VEHICULO=?,MODELO=? WHERE PLACA =?";
        try {
            int modelo = Integer.parseInt(modeloF);
            int capacidad = Integer.parseInt(capacidadF);
            PreparedStatement modificar = CONEXION_BD.conectar().prepareStatement(query);
            modificar.setString(5, placa);
            modificar.setInt(1, capacidad);
            modificar.setString(2, marca);
            modificar.setString(3, tipoVehiculo);
            modificar.setInt(4, modelo);
            int confirmacion = JOptionPane.showConfirmDialog(null, "DESEA MODIFICAR EL VEHICULO DE MARCA " + marca + " ,PLACAS " + placa);
            if (confirmacion == 0) {
                int campos = modificar.executeUpdate();
                if (campos != 0) {
                    vh.Campo_Capacidad_Vehiculo.setText("");
                    vh.Campo_Marca_Vehiculo.setText("");
                    vh.Campo_Modelo_Vehiculo.setText("");
                    vh.Campo_Placa_Vehiculo.setText("");
                    vh.Campo_TipoVehiculo_Vehiculo.setText("");
                }
                JOptionPane.showMessageDialog(null, "VEHICULO MODIFICADO CON EXITO");
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
