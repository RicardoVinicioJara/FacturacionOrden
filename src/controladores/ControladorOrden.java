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
import com.itextpdf.text.pdf.PdfWriter;
import modelo.Cliente;
import modelo.Empleado;
import modelo.Orden;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPageable;

/**
 *
 * @author Vinic
 */
public class ControladorOrden {

    private Connection con;
    private ResultSet seter;
    private final ControladorCliente cliente;
    private final ControladorEmpleados empleados;
    public static final String IMG = "Maquinas.jpg";

    public ControladorOrden() {
        cliente = new ControladorCliente();
        empleados = new ControladorEmpleados();
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

    public void crear(Orden o) {
        String sql = "INSERT INTO public.\"OrdenTrabajo\" values("
                + o.getCodigo() + ", TO_DATE('"
                + o.getFechaini() + "', 'DD/MM/YYYY'),"
                + o.getCliente().getCodigo() + ","
                + o.getEmpleado().getCodigo() + ","
                + o.getTotal() + ","
                + o.getAbono() + ","
                + o.getSaldo() + ",'"
                + o.getObcervaciones() + "','"
                + o.getCatacteristicas() + "','"
                + o.getNumeroSerie() + "','"
                + o.getDescripocion() + "',TO_DATE('"
                + o.getFechafin() + "', 'DD/MM/YYYY'),'"
                + o.getNotas() + "')";

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
        String sql = "SELECT MAX(\"otId\") FROM \"OrdenTrabajo\";";
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
            Logger.getLogger(ControladorOrden.class.getName()).log(Level.SEVERE, null, ex);
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

    public ArrayList<Orden> listar() {
        conectar();
        String sql = "SELECT \"otId\", \"otFechaIni\", (select \"cliCedula\" \n"
                + "							 from  \"Clientes\"\n"
                + "							 where \"cliId\" = \"otCliente\"), (select \"emCedula\" \n"
                + "							 				    from  \"Empleados\"\n"
                + "							 				    where \"emId\" = \"otEmpleado\"), \"otTotal\", \"otAbono\", \"otSaldo\", \"otObservaciones\", \"otCaracteristicas\", \"otNumeroSerie\", \"otDesTrabajo\", \"otFechaFin\", \"otNotas\"\n"
                + "	FROM public.\"OrdenTrabajo\" ";
        ArrayList<Orden> lista = new ArrayList<>();
        Cliente c = new Cliente();
        Empleado e = new Empleado();
        try {
            Statement se = con.createStatement();
            seter = se.executeQuery(sql);
            while (seter.next()) {
                Orden o = new Orden();

                o.setCodigo(seter.getInt(1));
                o.setFechaini(seter.getString(2));
                String cdc = seter.getString(3);
                String cde = seter.getString(4);
                o.setTotal(seter.getDouble(5));
                o.setAbono(seter.getDouble(6));
                o.setSaldo(seter.getDouble(7));

                o.setObcervaciones(seter.getString(8));
                o.setCatacteristicas(seter.getString(9));
                o.setNumeroSerie(seter.getString(10));
                o.setDescripocion(seter.getString(11));
                o.setFechafin(seter.getString(12));
                o.setNotas(seter.getString(13));

                c = new Cliente();
                c = cliente.buscar(cdc);
                o.setCliente(c);

                e = new Empleado();
                e = empleados.buscar(cde);
                o.setEmpleado(e);

                lista.add(o);
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura jaaja :" + ex.getMessage());
        }
        desconectar();
        return lista;

    }

    public Orden buscar(int cod) {

        String busca = "SELECT \"otId\", \"otFechaIni\", (select \"cliCedula\" \n"
                + "							 from  \"Clientes\"\n"
                + "							 where \"cliId\" = \"otCliente\"), (select \"emCedula\" \n"
                + "							 				    from  \"Empleados\"\n"
                + "							 				    where \"emId\" = \"otEmpleado\"), \"otTotal\", \"otAbono\", \"otSaldo\", \"otObservaciones\", \"otCaracteristicas\", \"otNumeroSerie\", \"otDesTrabajo\", \"otFechaFin\", \"otNotas\"\n"
                + "	FROM public.\"OrdenTrabajo\"\n"
                + "	where \"otId\" =" + cod;
        try {
            conectar();
            PreparedStatement se = con.prepareCall(busca);
            seter = se.executeQuery();
            while (seter.next()) {
                Orden o = new Orden();

                o.setCodigo(seter.getInt(1));
                o.setFechaini(seter.getString(2));
                String cdc = seter.getString(3);
                String cde = seter.getString(4);
                o.setTotal(seter.getDouble(5));
                o.setAbono(seter.getDouble(6));
                o.setSaldo(seter.getDouble(7));

                o.setObcervaciones(seter.getString(8));
                o.setCatacteristicas(seter.getString(9));
                o.setNumeroSerie(seter.getString(10));
                o.setDescripocion(seter.getString(11));
                o.setFechafin(seter.getString(12));
                o.setNotas(seter.getString(13));
                desconectar();

                Cliente c = new Cliente();
                c = cliente.buscar(cdc);
                o.setCliente(c);

                Empleado e = new Empleado();
                e = empleados.buscar(cde);
                o.setEmpleado(e);
                return o;
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

    public boolean actualizar(Orden o) {
        try {
            String ac = "UPDATE public.\"OrdenTrabajo\" SET"
                    + " \"otFechaIni\"='" + o.getFechaini() + "',"
                    + " \"otCliente\"= " + o.getCliente().getCodigo() + ","
                    + " \"otEmpleado\"= " + o.getEmpleado().getCodigo() + ","
                    + " \"otTotal\"= " + o.getTotal() + ","
                    + " \"otAbono\"= " + o.getAbono() + ","
                    + " \"otSaldo\"= " + o.getSaldo() + ","
                    + " \"otObservaciones\"='" + o.getObcervaciones() + "',"
                    + " \"otCaracteristicas\"='" + o.getCatacteristicas()+ "',"
                    + " \"otNumeroSerie\"='" + o.getNumeroSerie()+ "',"
                    + " \"otDesTrabajo\"='" + o.getDescripocion() + "',"
                    + " \"otFechaFin\"='" + o.getFechafin() + "', "
                    + " \"otNotas\"='" + o.getFechafin()+ "'"
                    + "where \"otId\"=" + o.getCodigo();
            conectar();
            Statement se = (Statement) con.createStatement();
            se.executeUpdate(ac);
            desconectar();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error de Actualizar : " + ex.getMessage());
        }
        return false;
    }

    public String mayusculas(JTextField txt) {
        String text = txt.getText();
        return text.toUpperCase();
    }

    public boolean IdentificadorCedula(String ced) {
        boolean verdadera = false;
        int num = 0;
        int ope;
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

    public void keyPressCedula(JTextField t) {

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

    public void keyTypedCedula(JTextField t, KeyEvent evt) {
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {

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
            Orden o = buscar(cod);
            if (o != null) {
                Document document = new Document(PageSize.LETTER);
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("OrdenTrabajo.pdf"));

                writer.setStrictImageSequence(true);
                document.open();

                Image image = Image.getInstance("Maquinas.jpg");
                image.scaleToFit(234, 235);
                image.setAlignment(Element.ALIGN_TOP);
                document.add(image);

                Paragraph p = new Paragraph("ING: Saguay Villalta Freddy Gustavo ", FontFactory.getFont("Arieal", 17, Font.BOLD, BaseColor.BLACK));
                p.setAlignment(Element.ALIGN_CENTER);
                document.add(p);

                p = new Paragraph("Dir: Pío Bravo 3-62 y Vargas Machuca ", FontFactory.getFont("Calibri", 14, Font.ROMAN_BASELINE, BaseColor.BLACK));
                p.setAlignment(Element.ALIGN_CENTER);
                document.add(p);

                p = new Paragraph("Cel: 0990583422  / 0985390780", FontFactory.getFont("Calibri", 14, Font.ROMAN_BASELINE, BaseColor.BLACK));
                p.setAlignment(Element.ALIGN_CENTER);
                document.add(p);

                p = new Paragraph("Rebobinado Industrial \n Reparación de Máquinas Eléctricas \n"
                        + "Construcción de Máquinas Industriales ", FontFactory.getFont("Calibri", 11, Font.ROMAN_BASELINE, BaseColor.BLACK));
                p.setAlignment(Element.ALIGN_RIGHT);
                document.add(p);

                p = new Paragraph("\n ", FontFactory.getFont("Calibri", 3, Font.ROMAN_BASELINE, BaseColor.BLACK));
                p.setAlignment(Element.ALIGN_RIGHT);
                document.add(p);

                Chunk a = new Chunk("\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\""
                        + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\""
                        + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\""
                        + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\""
                        + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\""
                        + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\" \n \n", FontFactory.getFont("Calibri", 8, Font.ROMAN_BASELINE, BaseColor.BLACK));
                p.setAlignment(0);
                document.add(a);

                a = new Chunk("ORDEN DE TRABAJO: 00" + String.valueOf(o.getCodigo()), FontFactory.getFont("Calibri", 14, Font.ROMAN_BASELINE, BaseColor.RED));
                p.clear();
                p.add(a);
                p.setAlignment(Element.ALIGN_CENTER);
                document.add(p);

                Paragraph pp = new Paragraph();
                pp.setAlignment(0);
                a = new Chunk("CLIENTE:               ", FontFactory.getFont("Arieal", 9, Font.BOLD, BaseColor.BLACK));
                pp.add(a);

                a = new Chunk(letras(o.getCliente().getNombre() + " " + o.getCliente().getApellido()), FontFactory.getFont("Arieal", 9, Font.ROMAN_BASELINE, BaseColor.BLACK));
                pp.add(a);

                a = new Chunk("TOTAL:     ", FontFactory.getFont("Arieal", 9, Font.BOLD, BaseColor.BLACK));
                pp.add(a);
                a = new Chunk(String.valueOf(o.getTotal()), FontFactory.getFont("Arieal", 9, Font.ROMAN_BASELINE, BaseColor.BLACK));
                pp.add(a);

                pp.setAlignment(Element.ALIGN_JUSTIFIED_ALL);
                pp.setSpacingAfter(-3);
                pp.setSpacingBefore(-3);
                document.add(pp);
                pp.clear();

                a = new Chunk("CEDULA:                ", FontFactory.getFont("Arieal", 9, Font.BOLD, BaseColor.BLACK));
                pp.add(a);

                a = new Chunk(letras(o.getCliente().getCedula()) + "     ", FontFactory.getFont("Arieal", 9, Font.ROMAN_BASELINE, BaseColor.BLACK));
                pp.add(a);

                a = new Chunk("ABONO:    ", FontFactory.getFont("Arieal", 9, Font.BOLD, BaseColor.BLACK));
                pp.add(a);
                a = new Chunk(String.valueOf(o.getAbono()), FontFactory.getFont("Arieal", 9, Font.ROMAN_BASELINE, BaseColor.BLACK));
                pp.add(a);

                pp.setAlignment(Element.ALIGN_JUSTIFIED_ALL);
                pp.setSpacingAfter(-3);
                pp.setSpacingBefore(-3);
                document.add(pp);
                pp.clear();

                a = new Chunk("DIRECCION:             ", FontFactory.getFont("Arieal", 9, Font.BOLD, BaseColor.BLACK));
                pp.add(a);

                a = new Chunk(letras(o.getCliente().getDireccion()) + "     ", FontFactory.getFont("Arieal", 9, Font.ROMAN_BASELINE, BaseColor.BLACK));
                pp.add(a);

                a = new Chunk("SALDO:     ", FontFactory.getFont("Arieal", 9, Font.BOLD, BaseColor.BLACK));
                pp.add(a);

                a = new Chunk(String.valueOf(o.getSaldo()), FontFactory.getFont("Arieal", 9, Font.ROMAN_BASELINE, BaseColor.BLACK));
                pp.add(a);

                pp.setAlignment(Element.ALIGN_JUSTIFIED_ALL);
                pp.setSpacingAfter(-3);
                pp.setSpacingBefore(-3);
                document.add(pp);
                pp.clear();

                a = new Chunk("Observaciones del Pago: ", FontFactory.getFont("Arieal", 9, Font.BOLD, BaseColor.BLACK));
                pp.add(a);

                a = new Chunk(String.valueOf(o.getObcervaciones()), FontFactory.getFont("Arieal", 9, Font.ROMAN_BASELINE, BaseColor.BLACK));
                pp.add(a);

                pp.setAlignment(Element.ALIGN_RIGHT);
                pp.setSpacingAfter(-3);
                pp.setSpacingBefore(-3);
                document.add(pp);
                pp.clear();

                a = new Chunk("Características del Equipo: ", FontFactory.getFont("Arieal", 9, Font.BOLD, BaseColor.BLACK));
                pp.add(a);

                a = new Chunk(o.getCatacteristicas(), FontFactory.getFont("Arieal", 9, Font.ROMAN_BASELINE, BaseColor.BLACK));
                pp.add(a);

                pp.setAlignment(Element.ALIGN_LEFT);
                pp.setSpacingAfter(-3);
                pp.setSpacingBefore(-3);
                document.add(pp);
                pp.clear();

                a = new Chunk("Número de Serie: ", FontFactory.getFont("Arieal", 9, Font.BOLD, BaseColor.BLACK));
                pp.add(a);

                a = new Chunk(o.getNumeroSerie(), FontFactory.getFont("Arieal", 9, Font.ROMAN_BASELINE, BaseColor.BLACK));
                pp.add(a);

                pp.setAlignment(Element.ALIGN_LEFT);
                pp.setSpacingAfter(-3);
                pp.setSpacingBefore(-3);
                document.add(pp);
                pp.clear();

                a = new Chunk("Trabajo Solicitado: ", FontFactory.getFont("Arieal", 9, Font.BOLD, BaseColor.BLACK));
                pp.add(a);

                a = new Chunk(o.getDescripocion(), FontFactory.getFont("Arieal", 9, Font.ROMAN_BASELINE, BaseColor.BLACK));
                pp.add(a);

                pp.setAlignment(Element.ALIGN_LEFT);
                pp.setSpacingAfter(-3);
                pp.setSpacingBefore(-3);
                document.add(pp);
                pp.clear();

                a = new Chunk("Notas: ", FontFactory.getFont("Arieal", 9, Font.BOLD, BaseColor.BLACK));
                pp.add(a);

                a = new Chunk(o.getNotas(), FontFactory.getFont("Arieal", 9, Font.ROMAN_BASELINE, BaseColor.BLACK));
                pp.add(a);

                pp.setAlignment(Element.ALIGN_LEFT);
                pp.setSpacingAfter(-3);
                pp.setSpacingBefore(-3);
                document.add(pp);
                pp.clear();

                a = new Chunk("\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\""
                        + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\""
                        + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\""
                        + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\""
                        + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\""
                        + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\" ", FontFactory.getFont("Calibri", 8, Font.ROMAN_BASELINE, BaseColor.BLACK));

                document.add(a);

                Paragraph p1 = new Paragraph();
                a = new Chunk("Observación: ", FontFactory.getFont("Arieal", 8, Font.BOLD, BaseColor.BLACK));
                p1.add(a);

                a = new Chunk("Autorizo a \'MAQUINAS ELECTRICAS\' en caso de no ser retirado en el lapso de 90 días "
                        + "disponer del mismo sin reclamo absoluto en lo posterior  ", FontFactory.getFont("Arieal", 7, Font.ROMAN_BASELINE, BaseColor.BLACK));
                p1.add(a);

                p1.setAlignment(Element.ALIGN_LEFT);
                p1.setSpacingAfter(3);
                p1.setSpacingBefore(-20);
                document.add(p1);
                p1.clear();

                a = new Chunk("                             "
                        + "_________________________________"
                        + "                                 "
                        + "_________________________________", FontFactory.getFont("Arieal", 9, Font.BOLD, BaseColor.BLACK));
                document.add(a);

                a = new Chunk("                                                "
                        + "                   FIRMA CLIENTE                    "
                        + "                                     "
                        + "                   FIRMA EMPLEADO                   ",
                        FontFactory.getFont("Arieal", 9, Font.BOLD, BaseColor.BLACK));
                document.add(a);

                a = new Chunk(" " + o.getEmpleado().getCedula() + "                                                       ",
                        FontFactory.getFont("Arieal", 8, Font.ROMAN_BASELINE, BaseColor.BLACK));
                pp.add(a);

                pp.setAlignment(Element.ALIGN_CENTER);
                //document.add(pp);
                pp.clear();

                a = new Chunk(o.getEmpleado().getCedula() + "                                                      \n ", FontFactory.getFont("Arieal", 8, Font.ROMAN_BASELINE, BaseColor.BLACK));
                pp.add(a);

                a = new Chunk(o.getEmpleado().getNombre() + " " + o.getEmpleado().getApellido()
                        + "                            ", FontFactory.getFont("Arieal", 8, Font.ROMAN_BASELINE, BaseColor.BLACK));
                pp.add(a);

                pp.setAlignment(Element.ALIGN_RIGHT);
                document.add(pp);
                pp.clear();

                a = new Chunk(" \n \"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\""
                        + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\""
                        + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\""
                        + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\""
                        + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\""
                        + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\" ", FontFactory.getFont("Calibri", 8, Font.ROMAN_BASELINE, BaseColor.RED));

                document.add(a);
                pp.clear();

                image.scaleToFit(234, 235);
                image.setAlignment(Element.ALIGN_TOP);
                document.add(image);

                a = new Chunk(" \n  ", FontFactory.getFont("Calibri", 3, Font.ROMAN_BASELINE, BaseColor.RED));
                document.add(a);

                p = new Paragraph("ING: Saguay Villalta Freddy Gustavo ", FontFactory.getFont("Arieal", 17, Font.BOLD, BaseColor.BLACK));
                p.setAlignment(Element.ALIGN_CENTER);
                document.add(p);

                p = new Paragraph("Dir: Pío Bravo 3-62 y Vargas Machuca ", FontFactory.getFont("Calibri", 14, Font.ROMAN_BASELINE, BaseColor.BLACK));
                p.setAlignment(Element.ALIGN_CENTER);
                document.add(p);

                p = new Paragraph("Cel: 0990583422  / 0985390780", FontFactory.getFont("Calibri", 14, Font.ROMAN_BASELINE, BaseColor.BLACK));
                p.setAlignment(Element.ALIGN_CENTER);
                document.add(p);

                p = new Paragraph("Rebobinado Industrial \n Reparación de Máquinas Eléctricas \n"
                        + "Construcción de Máquinas Industriales ", FontFactory.getFont("Calibri", 11, Font.ROMAN_BASELINE, BaseColor.BLACK));
                p.setAlignment(Element.ALIGN_RIGHT);
                document.add(p);

                p = new Paragraph("\n ", FontFactory.getFont("Calibri", 3, Font.ROMAN_BASELINE, BaseColor.BLACK));
                p.setAlignment(Element.ALIGN_RIGHT);
                document.add(p);

                a = new Chunk("\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\""
                        + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\""
                        + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\""
                        + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\""
                        + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\""
                        + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\" \n \n", FontFactory.getFont("Calibri", 8, Font.ROMAN_BASELINE, BaseColor.BLACK));
                p.setAlignment(0);
                document.add(a);

                a = new Chunk("ORDEN DE TRABAJO: 00" + String.valueOf(o.getCodigo()), FontFactory.getFont("Calibri", 14, Font.ROMAN_BASELINE, BaseColor.RED));
                p.clear();
                p.add(a);
                p.setAlignment(Element.ALIGN_CENTER);
                document.add(p);

                pp = new Paragraph();
                pp.setAlignment(0);
                a = new Chunk("CLIENTE:               ", FontFactory.getFont("Arieal", 9, Font.BOLD, BaseColor.BLACK));
                pp.add(a);

                a = new Chunk(letras(o.getCliente().getNombre() + " " + o.getCliente().getApellido()), FontFactory.getFont("Arieal", 9, Font.ROMAN_BASELINE, BaseColor.BLACK));
                pp.add(a);

                a = new Chunk("TOTAL:     ", FontFactory.getFont("Arieal", 9, Font.BOLD, BaseColor.BLACK));
                pp.add(a);
                a = new Chunk(String.valueOf(o.getTotal()), FontFactory.getFont("Arieal", 9, Font.ROMAN_BASELINE, BaseColor.BLACK));
                pp.add(a);

                pp.setAlignment(Element.ALIGN_JUSTIFIED_ALL);
                pp.setSpacingAfter(-3);
                pp.setSpacingBefore(-3);
                document.add(pp);
                pp.clear();

                a = new Chunk("CEDULA:                ", FontFactory.getFont("Arieal", 9, Font.BOLD, BaseColor.BLACK));
                pp.add(a);

                a = new Chunk(letras(o.getCliente().getCedula()) + "     ", FontFactory.getFont("Arieal", 9, Font.ROMAN_BASELINE, BaseColor.BLACK));
                pp.add(a);

                a = new Chunk("ABONO:    ", FontFactory.getFont("Arieal", 9, Font.BOLD, BaseColor.BLACK));
                pp.add(a);
                a = new Chunk(String.valueOf(o.getAbono()), FontFactory.getFont("Arieal", 9, Font.ROMAN_BASELINE, BaseColor.BLACK));
                pp.add(a);

                pp.setAlignment(Element.ALIGN_JUSTIFIED_ALL);
                pp.setSpacingAfter(-3);
                pp.setSpacingBefore(-3);
                document.add(pp);
                pp.clear();

                a = new Chunk("DIRECCION:             ", FontFactory.getFont("Arieal", 9, Font.BOLD, BaseColor.BLACK));
                pp.add(a);

                a = new Chunk(letras(o.getCliente().getDireccion()) + "     ", FontFactory.getFont("Arieal", 9, Font.ROMAN_BASELINE, BaseColor.BLACK));
                pp.add(a);

                a = new Chunk("SALDO:     ", FontFactory.getFont("Arieal", 9, Font.BOLD, BaseColor.BLACK));
                pp.add(a);

                a = new Chunk(String.valueOf(o.getSaldo()), FontFactory.getFont("Arieal", 9, Font.ROMAN_BASELINE, BaseColor.BLACK));
                pp.add(a);

                pp.setAlignment(Element.ALIGN_JUSTIFIED_ALL);
                pp.setSpacingAfter(-3);
                pp.setSpacingBefore(-3);
                document.add(pp);
                pp.clear();

                a = new Chunk("Observaciones del Pago: ", FontFactory.getFont("Arieal", 9, Font.BOLD, BaseColor.BLACK));
                pp.add(a);

                a = new Chunk(String.valueOf(o.getObcervaciones()), FontFactory.getFont("Arieal", 9, Font.ROMAN_BASELINE, BaseColor.BLACK));
                pp.add(a);

                pp.setAlignment(Element.ALIGN_RIGHT);
                pp.setSpacingAfter(-3);
                pp.setSpacingBefore(-3);
                document.add(pp);
                pp.clear();

                a = new Chunk("Características del Equipo: ", FontFactory.getFont("Arieal", 9, Font.BOLD, BaseColor.BLACK));
                pp.add(a);

                a = new Chunk(o.getCatacteristicas(), FontFactory.getFont("Arieal", 9, Font.ROMAN_BASELINE, BaseColor.BLACK));
                pp.add(a);

                pp.setAlignment(Element.ALIGN_LEFT);
                pp.setSpacingAfter(-3);
                pp.setSpacingBefore(-3);
                document.add(pp);
                pp.clear();

                a = new Chunk("Número de Serie: ", FontFactory.getFont("Arieal", 9, Font.BOLD, BaseColor.BLACK));
                pp.add(a);

                a = new Chunk(o.getNumeroSerie(), FontFactory.getFont("Arieal", 9, Font.ROMAN_BASELINE, BaseColor.BLACK));
                pp.add(a);

                pp.setAlignment(Element.ALIGN_LEFT);
                pp.setSpacingAfter(-3);
                pp.setSpacingBefore(-3);
                document.add(pp);
                pp.clear();

                a = new Chunk("Trabajo Solicitado: ", FontFactory.getFont("Arieal", 9, Font.BOLD, BaseColor.BLACK));
                pp.add(a);

                a = new Chunk(o.getDescripocion(), FontFactory.getFont("Arieal", 9, Font.ROMAN_BASELINE, BaseColor.BLACK));
                pp.add(a);

                pp.setAlignment(Element.ALIGN_LEFT);
                pp.setSpacingAfter(-3);
                pp.setSpacingBefore(-3);
                document.add(pp);
                pp.clear();

                a = new Chunk("Notas: ", FontFactory.getFont("Arieal", 9, Font.BOLD, BaseColor.BLACK));
                pp.add(a);

                a = new Chunk(o.getNotas(), FontFactory.getFont("Arieal", 9, Font.ROMAN_BASELINE, BaseColor.BLACK));
                pp.add(a);

                pp.setAlignment(Element.ALIGN_LEFT);
                pp.setSpacingAfter(-3);
                pp.setSpacingBefore(-3);
                document.add(pp);
                pp.clear();

                a = new Chunk("\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\""
                        + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\""
                        + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\""
                        + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\""
                        + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\""
                        + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\" ", FontFactory.getFont("Calibri", 8, Font.ROMAN_BASELINE, BaseColor.BLACK));

                document.add(a);
                pp.clear();

                p1 = new Paragraph();
                a = new Chunk("Observación: ", FontFactory.getFont("Arieal", 8, Font.BOLD, BaseColor.BLACK));
                p1.add(a);

                a = new Chunk("Autorizo a \'MAQUINAS ELECTRICAS\' en caso de no ser retirado en el lapso de 90 días "
                        + "disponer del mismo sin reclamo absoluto en lo posterior ", FontFactory.getFont("Arieal", 7, Font.ROMAN_BASELINE, BaseColor.BLACK));
                p1.add(a);

                p1.setAlignment(Element.ALIGN_LEFT);
                p1.setSpacingAfter(3);
                p1.setSpacingBefore(-20);
                document.add(p1);
                p1.clear();

                a = new Chunk("                             "
                        + "_________________________________"
                        + "                                 "
                        + "_________________________________", FontFactory.getFont("Arieal", 9, Font.BOLD, BaseColor.BLACK));
                document.add(a);

                a = new Chunk("                                                "
                        + "                   FIRMA CLIENTE                    "
                        + "                                     "
                        + "                   FIRMA EMPLEADO                   ",
                        FontFactory.getFont("Arieal", 9, Font.BOLD, BaseColor.BLACK));
                document.add(a);

                pp.setAlignment(Element.ALIGN_CENTER);
                //document.add(pp);
                pp.clear();

                a = new Chunk(o.getEmpleado().getCedula() + "                                                      \n ", FontFactory.getFont("Arieal", 8, Font.ROMAN_BASELINE, BaseColor.BLACK));
                pp.add(a);

                a = new Chunk(o.getEmpleado().getNombre() + " " + o.getEmpleado().getApellido()
                        + "                            ", FontFactory.getFont("Arieal", 8, Font.ROMAN_BASELINE, BaseColor.BLACK));
                pp.add(a);

                pp.setAlignment(Element.ALIGN_RIGHT);
                document.add(pp);
                pp.clear();

                document.close();

                PDDocument doc = PDDocument.load(new File("OrdenTrabajo.pdf"));

                PrinterJob job = PrinterJob.getPrinterJob();

                if (job.printDialog() == true) {
                    job.setPageable(new PDFPageable(doc));

                    job.print();
                }
            }

        } catch (Exception ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
            JOptionPane.showConfirmDialog(null, ex.getMessage());
        }

    }

    public String letras(String txt) {
        if (txt.length() < 60) {
            for (int i = txt.length(); i < 50; i++) {
                txt = txt + " ";
            }
        }
        return txt;
    }

}
