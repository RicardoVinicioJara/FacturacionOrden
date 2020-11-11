/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.print.PageFormat;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.Cliente;
import modelo.Detalle;
import modelo.Factura;
import modelo.Orden;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPageable;

/**
 *
 * @author Vinic
 */
public class ControladorFactura {

    private Connection con;
    private ResultSet seter;
    private ControladorCliente controladorCliente;
    private ControladorDetalle controladorDetalle;
    private ControladorProducto controladorProducto;

    public ControladorFactura() {
        controladorCliente = new ControladorCliente();
        controladorDetalle = new ControladorDetalle();
        controladorProducto = new ControladorProducto();
    }

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

    public boolean crear(Factura f) {
        String sql = "INSERT INTO public.\"Factura\" values("
                + f.getCodigo() + ","
                + f.getCliente().getCodigo() + ","
                + f.getSubtotal() + ","
                + f.getIva() + ","
                + f.getTotal() + ",'"
                + f.getNotas() + "', TO_DATE('"
                + f.getFecha() + "', 'DD/MM/YYYY'))";

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
            String sql = "SELECT MAX(\"faId\") FROM public.\"Factura\";";
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
            Logger.getLogger(ControladorFactura.class.getName()).log(Level.SEVERE, null, ex);
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

    public ArrayList<Factura> listar() {
        conectar();
        String sql = "select * from \"Factura\" ORDER BY 1 DESC ";
        ArrayList<Factura> lista = new ArrayList<>();
        try {
            Statement se = con.createStatement();
            seter = se.executeQuery(sql);
            while (seter.next()) {
                int codigo = seter.getInt(1);
                String cliente = seter.getString(2);
                Cliente c = controladorCliente.buscarID(cliente);

                double subtotal = seter.getDouble(3);
                double iva = seter.getDouble(4);
                double total = seter.getDouble(5);
                String notas = seter.getString(6);
                String fecha = seter.getString(7);

                Factura f = new Factura(codigo, c, subtotal, iva, total, notas, fecha);
                lista.add(f);
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura jaaja :" + ex.getMessage());
        }
        desconectar();
        return lista;

    }

    public Factura buscar(String cod) {

        String busca = "select * from \"Factura\" where \"faId\" =" + "'" + cod + "'";
        try {
            conectar();
            PreparedStatement se = con.prepareCall(busca);
            seter = se.executeQuery();
            while (seter.next()) {
                int codigo = seter.getInt(1);
                String cliente = seter.getString(2);
                Cliente c = controladorCliente.buscarID(cliente);

                double subtotal = seter.getDouble(3);
                double iva = seter.getDouble(4);
                double total = seter.getDouble(5);
                String notas = seter.getString(6);
                String fecha = seter.getString(7);

                Factura f = new Factura(codigo, c, subtotal, iva, total, notas, fecha);
                desconectar();
                return f;
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
        return null;
    }

    public void eliminar(int codigo) {
        String eli = "DELETE FROM public.\"Clientes\" where \"cliId\"=" + codigo;
        try {
            conectar();
            Statement se = (Statement) con.createStatement();
            se.executeUpdate(eli);
            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }

    }

    public void actualizar(Cliente c) {
        try {
            String ac = "UPDATE public.\"Clientes\" SET"
                    + " \"cliCedula\"='" + c.getCedula() + "',"
                    + " \"cliNombre\"='" + c.getNombre() + "',"
                    + " \"cliApellido\"='" + c.getApellido() + "',"
                    + " \"cliTelefono\"='" + c.getTelefono() + "',"
                    + " \"cliDireccion\"='" + c.getDireccion() + "',"
                    + " \"cliCorreo\"='" + c.getCorreo() + "' "
                    + "where \"cliId\"=" + c.getCodigo();
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

    public void impirmir(int cod) {
        try {
            Factura f = buscar(cod + "");
            if (f != null) {
                Document document = new Document(PageSize.A4);
                
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Factura.pdf"));
                  
                writer.setStrictImageSequence(true);
                document.open();
                String fecha[] = f.getFecha().split("-");
                Paragraph p = new Paragraph();
                Chunk incio = new Chunk("asfasfasda \n ", FontFactory.getFont("Arieal", 50, Font.BOLD, BaseColor.WHITE));
                p.add(incio);

                Chunk salto = new Chunk(" \n", FontFactory.getFont("Arieal", 10, Font.BOLD, BaseColor.BLACK));
                p.add(salto);
                p.add(salto);
                document.add(p);
                p.clear();
                p.setSpacingAfter(-10);
                p.setSpacingBefore(41);
                Chunk salto1 = new Chunk("*               *\n", FontFactory.getFont("Arieal", 10, Font.BOLD, BaseColor.BLUE));
                p.add(salto1);

                document.add(p);
                p.clear();
                p.setSpacingAfter(-10);
                p.setSpacingBefore(-20);

                Chunk dia = new Chunk("                                     " 
                        + fecha[2] + " / ", FontFactory.getFont("Arieal", 10, Font.BOLD, BaseColor.BLACK));
                p.add(dia);
                Chunk mes = new Chunk(fecha[1] + " / ", FontFactory.getFont("Arieal", 10, Font.BOLD, BaseColor.BLACK));
                p.add(mes);
                Chunk anio = new Chunk(fecha[0] + "                                                                "
                        , FontFactory.getFont("Arieal", 10, Font.BOLD, BaseColor.BLACK));
                p.add(anio);

                Chunk cedula = new Chunk(f.getCliente().getCedula() + "  \n", FontFactory.getFont("Arieal", 10, Font.BOLD, BaseColor.BLACK));
                p.add(cedula);

                p.add(salto);

                document.add(p);
                p.clear();
                p.setSpacingAfter(-3);
                p.setSpacingBefore(-3);

                Chunk cliente = new Chunk("                                          "
                        + f.getCliente().getNombre() + " " + f.getCliente().getApellido() + " \n ", FontFactory.getFont("Arieal", 10, Font.BOLD, BaseColor.BLACK));
                p.add(cliente);

                Chunk direccion = new Chunk("                                              " 
                        + direccion50(f.getCliente().getDireccion() + " "), FontFactory.getFont("Arieal", 8, Font.BOLD, BaseColor.BLACK));
                p.add(direccion);

                Chunk telefono = new Chunk("                                          "
                        + f.getCliente().getTelefono() + " ", FontFactory.getFont("Arieal", 10, Font.BOLD, BaseColor.BLACK));
                p.add(telefono);
                p.add(salto);
                p.add(salto);

                document.add(p);
                p.clear();
                p.setSpacingAfter(-3);
                p.setSpacingBefore(1);

                ArrayList<Detalle> lista = controladorDetalle.listar(f.getCodigo());
                for (int i = 0; i < 36; i++) {
                    if (i != 0) {
                        p.setSpacingAfter(-4);
                        p.setSpacingBefore(-4);
                    }
                    if (i < lista.size()) {

                        Chunk catidiad = new Chunk("                                     "+
                                cant10(lista.get(i).getCantidad() + "") + " ", FontFactory.getFont("Arieal", 7, Font.BOLD, BaseColor.BLACK));
                        p.add(catidiad);
                        Chunk descrip = new Chunk("              " + pro20(
                                controladorProducto.buscarID(lista.get(i).getProducto() + "").getNombre()), FontFactory.getFont("Arieal", 7, Font.BOLD, BaseColor.BLACK));
                        p.add(descrip);

                        Chunk preu = new Chunk(preUU(
                                controladorProducto.buscarID(lista.get(i).getProducto() + "").getPrecio() + ""), FontFactory.getFont("Arieal", 7, Font.BOLD, BaseColor.BLACK));
                        p.add(preu);
                        double pre = controladorProducto.buscarID(lista.get(i).getProducto() + "").getPrecio();
                        int can = lista.get(i).getCantidad();
                        double res = pre * can;
                        DecimalFormat df = new DecimalFormat("#.00");

                        Chunk total = new Chunk(df.format(res) + " \n", FontFactory.getFont("Arieal", 7, Font.BOLD, BaseColor.BLACK));
                        p.add(total);

                        document.add(p);
                        p.clear();

                    } else {

                        System.out.println("acaaaaa");
                        Chunk rayita = new Chunk("                                     |            ", FontFactory.getFont("Arieal", 7, Font.BOLD, BaseColor.BLACK));
                        p.add(rayita);
                        document.add(p);
                        p.clear();
                    }

                }
                p.setSpacingBefore(-6);
                document.add(salto);
                p.clear();

                Chunk suto = new Chunk("                                     "
                        + "                                     "
                        + "                                     "
                        + "                                "
                        + "" + f.getSubtotal() + "\n", FontFactory.getFont("Arieal", 10, Font.BOLD, BaseColor.BLACK));
                p.add(suto);

                document.add(p);
                p.clear();
                p.setSpacingAfter(5);
                p.setSpacingBefore(5);
                double ivaa = f.getIva();
                DecimalFormat df = new DecimalFormat("#.00");

                Chunk iva = new Chunk("                                     "
                        + "                                     "
                        + "                                     "
                        + "                                "
                        + "" +  df.format(ivaa) + "\n", FontFactory.getFont("Arieal", 10, Font.BOLD, BaseColor.BLACK));

                p.add(iva);
                p.setSpacingAfter(14);
                p.setSpacingBefore(14);
                Chunk total = new Chunk("                                     "
                        + "                                     "
                        + "                                     "
                        + "                                "
                        + "" +  f.getTotal(), FontFactory.getFont("Arieal", 10, Font.BOLD, BaseColor.BLACK));
                p.add(total);

                document.add(p);
                p.clear();
                p.setSpacingBefore(10);

                Chunk notas = new Chunk(f.getNotas() + " ", FontFactory.getFont("Arieal", 8, Font.BOLD, BaseColor.BLACK));
                p.add(notas);

                document.add(p);

                document.close();

                PDDocument doc = PDDocument.load(new File("Factura.pdf"));
                PrinterJob job = PrinterJob.getPrinterJob();

                if (job.printDialog() == true) {
                    job.setPageable(new PDFPageable(doc));

                    job.print();
                }
            }

        } catch (Exception ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public String direccion50(String txt) {
        if (txt.length() < 39) {
            for (int i = txt.length(); i < 39; i++) {
                txt = txt + " ";
            }
        } else {
            txt = txt.substring(0, 39);
        }
        return txt;
    }

    public String pro20(String txt) {
        if (txt.length() < 57) {
            for (int i = txt.length(); i < 57; i++) {
                txt = txt + "  ";
            }
        } else {
            txt = txt.substring(0, 57);
        }
        return txt;
    }

    public String cant10(String txt) {
        for (int i = txt.length(); i < 4; i++) {
            txt = txt + "  ";
        }
        return txt;
    }

    public String preUU(String txt) {
        for (int i = txt.length(); i < 26; i++) {
            txt = txt + " ";
        }
        return txt;
    }

}
