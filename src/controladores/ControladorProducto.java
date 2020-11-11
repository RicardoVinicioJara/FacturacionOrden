/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.Color;
import java.awt.event.KeyEvent;
import modelo.Producto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import modelo.Historial;

/**
 *
 * @author mayra
 */
public final class ControladorProducto {

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

    public boolean crear(Producto p) {
        String sql = "INSERT INTO public.\"Producto\" values("
                + p.getId() + ",'"
                + p.getNombre() + "','"
                + p.getCodigo() + "','"
                + p.getMedida() + "',"
                + p.getStock() + ","
                + p.getPrecio() + ")";

        try {
            conectar();
            Statement sta = (Statement) con.createStatement();
            sta.executeUpdate(sql);
            desconectar();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error de sql : " + ex.getMessage());
        }
        return false;
    }

    public int obtenerCodigo() {
        String sql = "SELECT MAX(\"proId\") FROM \"Producto\";";
        int codigo = 0;
        try {
            conectar();
            Statement sta = con.createStatement();
            ResultSet res = sta.executeQuery(sql);
            res.next();
            codigo = res.getInt(1);
            res.close();
            sta.close();
            desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCliente.class.getName()).log(Level.SEVERE, null, ex);
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

    public ArrayList<Producto> listar() {
        conectar();
        String sql = "select * from \"Producto\" ";
        ArrayList<Producto> lista = new ArrayList<>();
        try {
            Statement se = con.createStatement();
            seter = se.executeQuery(sql);
            Producto p;
            while (seter.next()) {
                int id = seter.getInt(1);
                String nombre = seter.getString(2);
                String codigo = seter.getString(3);
                String medida = seter.getString(4);
                int stock = seter.getInt(5);
                double precio = seter.getDouble(6);
                p = new Producto(id, nombre, codigo, medida, stock, precio);
                lista.add(p);
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura listar :" + ex.getMessage());
        }
        desconectar();
        return lista;

    }

    public ArrayList<Historial> listarHISTO() {
        conectar();
        String sql = "select * from \"BitacoraStock\" ORDER BY 1 DESC ";
        ArrayList<Historial> lista = new ArrayList<>();
        try {
            Statement se = con.createStatement();
            seter = se.executeQuery(sql);
            String p;
            while (seter.next()) {
                int codigo = seter.getInt(1);
                String fecha = seter.getString(2);
                int producto = seter.getInt(3);
                String accion = seter.getString(4);
                int cantidad = seter.getInt(5);
               Historial h = new Historial(codigo, fecha, producto, accion, cantidad);
               lista.add(h);
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura listar :" + ex.getMessage());
        }
        desconectar();
        return lista;

    }
    
    public Producto buscarID(String cod) {

        String busca = "select * from \"Producto\" where \"proId\" =" + "'" + cod + "'";
        try {
            conectar();
            PreparedStatement se = con.prepareCall(busca);
            seter = se.executeQuery();
            Producto p;
            while (seter.next()) {

                int id = seter.getInt(1);
                String nombre = seter.getString(2);
                String codigo = seter.getString(3);
                String medida = seter.getString(4);
                int stock = seter.getInt(5);
                double precio = seter.getDouble(6);
                p = new Producto(id, nombre, codigo, medida, stock, precio);
                desconectar();
                return p;
            }
        } catch (SQLException ex) {
            System.out.println("Error de buscar  :" + ex.getMessage());
        }
        return null;
    }

    public Producto buscar(String cod) {

        String busca = "select * from \"Producto\" where \"proCodigo\" =" + "'" + cod + "'";
        try {
            conectar();
            PreparedStatement se = con.prepareCall(busca);
            seter = se.executeQuery();
            Producto p;
            while (seter.next()) {

                int id = seter.getInt(1);
                String nombre = seter.getString(2);
                String codigo = seter.getString(3);
                String medida = seter.getString(4);
                int stock = seter.getInt(5);
                double precio = seter.getDouble(6);
                p = new Producto(id, nombre, codigo, medida, stock, precio);
                desconectar();
                return p;
            }
        } catch (SQLException ex) {
            System.out.println("Error de buscar  :" + ex.getMessage());
        }
        return null;
    }
    
    

    public boolean eliminar(String codigo) {
        String eli = "DELETE FROM public.\"Producto\" where \"proCodigo\"= '" + codigo + "'";
        try {
            conectar();
            Statement se = (Statement) con.createStatement();
            se.executeUpdate(eli);
            desconectar();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error de eliminar :" + ex.getMessage());
        }
        return false;
    }

    public boolean actualizar(Producto c) {
        try {
            String ac = "UPDATE public.\"Producto\" SET"
                    + " \"proNombre\"='" + c.getNombre() + "',"
                    + " \"proCodigo\"='" + c.getCodigo() + "',"
                    + " \"proMedida\"='" + c.getMedida() + "',"
                    + " \"proStock\"=" + c.getStock() + ","
                    + " \"proPrecio\"=" + c.getPrecio() + ""
                    + "where \"proId\"=" + c.getId();
            conectar();
            Statement se = (Statement) con.createStatement();
            se.executeUpdate(ac);
            desconectar();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error de lectura : " + ex.getMessage());
        }
        return false;
    }

    public boolean ingresaNuevo(String cod, int cantidad) {
        try {
            String ac = " UPDATE public.\"Producto\" SET  \"proStock\" = \"proStock\" + " + cantidad
                    + "where \"proCodigo\" =  '" + cod + "';";
            conectar();
            Statement se = (Statement) con.createStatement();
            se.executeUpdate(ac);
            desconectar();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error de lectura : " + ex.getMessage());
        }
        return false;
    }
    
    public boolean disminuir(String cod, int cantidad) {
        try {
            String ac = " UPDATE public.\"Producto\" SET  \"proStock\" = \"proStock\" - " + cantidad
                    + "where \"proCodigo\" =  '" + cod + "';";
            conectar();
            Statement se = (Statement) con.createStatement();
            se.executeUpdate(ac);
            desconectar();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error de lectura : " + ex.getMessage());
        }
        return false;
    }

    public ArrayList<String> comboProductos() {
        ArrayList<String> li = new ArrayList<>();
        ArrayList<Producto> lista = listar();
        li.add("Selecione");
        for (int i = 0; i < lista.size(); i++) {
            li.add(lista.get(i).getCodigo() + ": " + lista.get(i).getNombre() + " >> " + lista.get(i).getStock());
        }
        return li;
    }

    public void soloNumero(JTextField t, KeyEvent evt) {
        if (evt.getKeyChar() == KeyEvent.VK_ENTER || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE) {

        } else if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
            evt.consume();
            t.setBackground(Color.RED);

        } else {
            t.setBackground(Color.GREEN);
        }

    }

    public void keyTypedNumero(JTextField t, KeyEvent evt) {
        if (evt.getKeyChar() == '.') {

        } else if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
            evt.consume();
            t.setBackground(Color.RED);
        } else {
            t.setBackground(Color.CYAN);
            if (t.getText().length() == 10) {
                evt.consume();
            }
        }
    }

}
