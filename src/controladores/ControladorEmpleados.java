/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import modelo.Empleado;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import modelo.Trabajos;

/**
 *
 * @author Vinic
 */
public class ControladorEmpleados {

    private Connection con;
    private ResultSet seter;

    public void conectar() {
        con = null;
        seter = null;
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BaseMaquinasElectricas", "postgres", "root");
        } catch (SQLException ex) {
            System.out.println("Error de conexion : " + ex.getMessage());
        }

        if (con != null) {
        }
    }

    public void crear(Empleado p) {
        String sql = "INSERT INTO public.\"Empleados\" values("
                + p.getCodigo() + ",'"
                + p.getNombre() + "','"
                + p.getApellido() + "','"
                + p.getCedula() + "','"
                + p.getTelefono() + "','"
                + p.getDireccion() + "','"
                + p.getCorreo() + "')";

        try {
            conectar();
            Statement sta = (Statement) con.createStatement();
            sta.executeUpdate(sql);
            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error de sql : " + ex.getMessage());
        }
    }

    public int obtenerCodigo() {
        String sql = "SELECT MAX(\"emId\") FROM \"Empleados\";";
        int codigo = 0;
        try {
            conectar();
            Statement sta = con.createStatement();
            ResultSet res = sta.executeQuery(sql);
//           res.first();
            res.next();
            codigo = res.getInt(1);
            res.close();
            sta.close();
            desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return codigo + 1;
    }

    public void desconectar() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Erro al desconctar " + ex.getMessage());
            }
        }
    }

    public ArrayList<Empleado> listar() {
        conectar();
        String sql = "select * from \"Empleados\" ";
        ArrayList<Empleado> lista = new ArrayList<>();
        try {
            Statement se = con.createStatement();
            seter = se.executeQuery(sql);
            while (seter.next()) {
                int codigo = seter.getInt(1);
                String nombre = seter.getString(2);
                String apellido = seter.getString(3);
                String cedula = seter.getString(4);
                String telefono = seter.getString(5);
                String direccion = seter.getString(6);
                String correo = seter.getString(7);
                Empleado c = new Empleado(codigo, nombre, apellido, cedula, telefono, direccion, correo);
                lista.add(c);
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
        desconectar();
        return lista;

    }

    public Empleado buscar(String cod) {

        String busca = "select * from \"Empleados\" where \"emCedula\" =" + "'" + cod + "'";
        try {
            conectar();
            PreparedStatement se = con.prepareCall(busca);
            seter = se.executeQuery();
            while (seter.next()) {

                int codigo = seter.getInt(1);
                String nombre = seter.getString(2);
                String apellido = seter.getString(3);
                String cedula = seter.getString(4);
                String telefono = seter.getString(5);
                String direccion = seter.getString(6);
                String correo = seter.getString(7);
                Empleado c = new Empleado(codigo, nombre, apellido, cedula, telefono, direccion, correo);
                desconectar();
                return c;
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
        return null;
    }

    public Empleado buscarCodigo(String cod) {

        String busca = "select * from \"Empleados\" where \"emId\" =" + "'" + cod + "'";
        try {
            conectar();
            PreparedStatement se = con.prepareCall(busca);
            seter = se.executeQuery();
            while (seter.next()) {

                int codigo = seter.getInt(1);
                String nombre = seter.getString(2);
                String apellido = seter.getString(3);
                String cedula = seter.getString(4);
                String telefono = seter.getString(5);
                String direccion = seter.getString(6);
                String correo = seter.getString(7);
                Empleado c = new Empleado(codigo, nombre, apellido, cedula, telefono, direccion, correo);
                desconectar();
                return c;
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
        return null;
    }

    public void eliminar(int codigo) {
        String eli = "DELETE FROM public.\"Empleados\" where \"emId\"=" + codigo;
        try {
            conectar();
            Statement se = (Statement) con.createStatement();
            se.executeUpdate(eli);
            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }

    }

    public void actualizar(Empleado c) {
        try {
            String ac = "UPDATE public.\"Empleados\" SET"
                    + " \"emCedula\"='" + c.getCedula() + "',"
                    + " \"emNombre\"='" + c.getNombre() + "',"
                    + " \"emApellido\"='" + c.getApellido() + "',"
                    + " \"emTelefono\"='" + c.getTelefono() + "',"
                    + " \"emDireccion\"='" + c.getDireccion() + "',"
                    + " \"emCorreo\"='" + c.getCorreo() + "' "
                    + "where \"emId\"=" + c.getCodigo();
            conectar();
            Statement se = (Statement) con.createStatement();
            se.executeUpdate(ac);
            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error de lectura : " + ex.getMessage());
        }
    }

    public void soloTelefono(JTextField t, KeyEvent evt) {
        if (evt.getKeyChar() == KeyEvent.VK_ENTER || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE) {

        } else if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
            evt.consume();
            t.setBackground(Color.RED);
        } else {
            t.setBackground(Color.CYAN);
            if (t.getText().length() == 10) {
                evt.consume();
                t.setBackground(Color.GREEN);
            }
        }

    }

    public void soloNumero(JTextField t, KeyEvent evt) {
        if (evt.getKeyChar() == KeyEvent.VK_ENTER || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE || evt.getKeyChar() > '.') {

        } else if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
            evt.consume();
            t.setBackground(Color.RED);
        } else {
            t.setBackground(Color.GREEN);
        }
    }

    public void mayusculas(JTextField txt) {
        String text = txt.getText();
        txt.setText(text.toUpperCase());
        txt.setBackground(Color.GREEN);
    }

    public void correo(JTextField txt) {
        String text = txt.getText();
        txt.setBackground(Color.GREEN);
    }

    public boolean IdentificadorCedula(String ced) {
        boolean verdadera = false;
        int num = 0;
        int ope = 0;
        int suma = 0;
        for (int cont = 0; cont < ced.length(); cont++) {
            num = Integer.valueOf(ced.substring(cont, cont + 1));
            if (cont == ced.length() - 1) {
                break;
            }
            if (cont % 2 != 0 && cont > 0) {
                suma = suma + num;
            } else {
                ope = num * 2;
                if (ope > 9) {
                    ope = ope - 9;
                }
                suma = suma + ope;
            }

        }
        suma = suma % 10;
        if (suma == 0) {
            if (suma == num) {
                verdadera = true;
            }
        } else {
            ope = 10 - suma;
            if (ope == num) {
                verdadera = true;
            }
        }
        return verdadera;
    }

    public ArrayList<String> comboEmpleados(){
        ArrayList<String> li = new ArrayList<>();
        ArrayList<Empleado> lista = listar();
        li.add("Selecione");
        for (int i = 0; i < lista.size(); i++) {
            li.add(lista.get(i).getCodigo() +": "+lista.get(i).getNombre() + " " + lista.get(i).getApellido());
        }
        return li;
    }

    public void keyReleesCedula(JTextField t, KeyEvent evt) {
        if (t.getText().length() == 10) {
            if (IdentificadorCedula(t.getText()) == true) {
                t.setBackground(Color.GREEN);
            } else {
                t.setBackground(Color.red);
            }
            evt.consume();
        }
    }

    public void keyTypedCedula(JTextField t, KeyEvent evt) {
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {

        } else if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
            evt.consume();
            t.setBackground(Color.RED);
        } else {
            t.setBackground(Color.CYAN);
            if (t.getText().length() == 13) {
                evt.consume();
            }
        }
    }

    public void keyTypedMayusculas(JTextField t, KeyEvent evt) {
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            t.getToolkit().beep();
            t.setBackground(Color.red);
            evt.consume();
        } else {
            t.setBackground(Color.green);
            if (t.getText().length() == 20) {
                t.setBackground(Color.green);
                evt.consume();
            }
        }
    }

    public void keyRealseTelefono(JTextField t) {
        if (t.getText().length() == 10) {
            t.setBackground(Color.green);
        }
    }

    public void keyTypedTelefono(JTextField t, KeyEvent evt) {
        if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
            evt.consume();
            t.setBackground(Color.red);
        } else {
            t.setBackground(Color.CYAN);
            if (t.getText().length() == 10) {
                t.setBackground(Color.green);
                evt.consume();
            }
        }
    }

}
