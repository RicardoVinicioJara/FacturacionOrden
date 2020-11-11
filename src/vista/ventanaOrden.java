/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controladores.ControladorCliente;
import controladores.ControladorEmpleados;
import controladores.ControladorOrden;
import controladores.ControladorTrabajos;
import modelo.Cliente;
import modelo.Empleado;
import modelo.Orden;
import modelo.Trabajos;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Jose Pandiguana
 */
public class ventanaOrden extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaKardex
     */
    private final JButton b;
    private final ControladorCliente controladorCliente;
    private final ControladorEmpleados controladorEmpleados;
    private final ControladorOrden controladorOrden;
    private final ControladorTrabajos controladorTrabajos;

    private DefaultTableModel modelo;

    public ventanaOrden(JButton b) {
        initComponents();
        this.b = b;

        controladorCliente = new ControladorCliente();
        controladorEmpleados = new ControladorEmpleados();
        controladorOrden = new ControladorOrden();
        controladorTrabajos = new ControladorTrabajos();

        comEmpleados.setModel(new DefaultComboBoxModel(controladorEmpleados.comboEmpleados().toArray()));
        comTrabajos.setModel(new DefaultComboBoxModel(controladorTrabajos.comboTrabajos().toArray()));
        comEmpleadosM.setModel(new DefaultComboBoxModel(controladorEmpleados.comboEmpleados().toArray()));
        comTrabajosM.setModel(new DefaultComboBoxModel(controladorTrabajos.comboTrabajos().toArray()));

        txtNumero.setText("000" + String.valueOf(controladorOrden.obtenerCodigo()));

        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        txtFechaIni.setText(dateFormat.format(date));

        txtNumero.setEditable(false);

        modelo = new DefaultTableModel();
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        nombre4 = new javax.swing.JLabel();
        comEmpleados = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtAbono = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtObcervaciones = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNumSerie = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCaractesiticas = new javax.swing.JTextField();
        comTrabajos = new javax.swing.JComboBox<>();
        txtDescripcion = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtNotas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFechaIni = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFechaFin = new com.toedter.calendar.JDateChooser();
        btnGuardar = new javax.swing.JButton();
        nombre5 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        ingreseCedula = new javax.swing.JLabel();
        txtOrdenB = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        nombre6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtTotalB = new javax.swing.JTextField();
        txtAbonoB = new javax.swing.JTextField();
        txtSaldoB = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtObcervacionesB = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtNumSerieB = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtCaractesiticasB = new javax.swing.JTextField();
        txtDescripcionB = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtNotasB = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txtClienteB = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtDireccionB = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtTelefonoB = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtCedulaB = new javax.swing.JTextField();
        txtCorreoB = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtFechaIniB = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtFechaFinB = new javax.swing.JTextField();
        txtEmpleadoB = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        ingreseCedula1 = new javax.swing.JLabel();
        txtNumeroM = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        nombre7 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtTotalM = new javax.swing.JTextField();
        txtAbonoM = new javax.swing.JTextField();
        txtSaldoM = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtObcervacionesM = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        txtClienteM = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtDireccionM = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtTelefonoM = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txtCedulaM = new javax.swing.JTextField();
        txtCorreoM = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtFechaIniM = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        txtFechaFinM = new com.toedter.calendar.JDateChooser();
        actulizarM = new javax.swing.JButton();
        comEmpleadosM = new javax.swing.JComboBox<>();
        jPanel15 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtNumSerieM = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtCaractesiticasM = new javax.swing.JTextField();
        txtDescripcionM = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtNotasM = new javax.swing.JTextField();
        comTrabajosM = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                cerrado(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(153, 255, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/orden.png"))); // NOI18N
        jLabel1.setText("ORDEN DE TRABAJO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(303, 303, 303))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, Short.MAX_VALUE)
        );

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 204)));
        jTabbedPane2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane2StateChanged(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        jPanel5.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N

        nombre4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre4.setText("Recibido por: ");

        comEmpleados.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        comEmpleados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("TOTAL $: ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Abono $: ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Saldo   $: ");

        txtTotal.setText("0");
        txtTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTotalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalKeyTyped(evt);
            }
        });

        txtAbono.setText("0");
        txtAbono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAbonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAbonoKeyTyped(evt);
            }
        });

        txtSaldo.setText("0");
        txtSaldo.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Observaciones del Pago:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txtAbono, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12))
                        .addGap(0, 91, Short.MAX_VALUE))
                    .addComponent(txtObcervaciones, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtAbono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObcervaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Características del Equipo / Maquina / Otros: ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Numero de Serie:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Descrípcion del Trabajo Solicitado:");

        comTrabajos.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        comTrabajos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comTrabajos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comTrabajosActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Notas del Equipo:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comTrabajos, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCaractesiticas, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 73, Short.MAX_VALUE))
                    .addComponent(txtNotas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(365, 365, 365)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtCaractesiticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(comTrabajos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("C.I:");

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("DIRECCION: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("TELEFONO:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("CLIENTE: ");

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("CORREO:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("FECHA INICIO:");

        txtFechaIni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFechaIniKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFechaIniKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaIniKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("FECHA ENTREGA:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtFechaIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addContainerGap())
        );

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresor.jpg"))); // NOI18N
        btnGuardar.setText("GUARDAR & IMPRIMIR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        nombre5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre5.setText("Orden Numero:");

        txtNumero.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumeroKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumeroKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnGuardar))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(nombre5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(nombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre5)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnGuardar)))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("CREAR", jPanel5);

        tabla.setBackground(new java.awt.Color(204, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NombreyApellido", "Direccion", "Telefono", "Codigo", "Cedula", "aaaaaaaaaa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 936, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 936, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("LISTAR", jPanel6);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ingreseCedula.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        ingreseCedula.setText("INGRESE NUMERO DE ORDEN: ");

        txtOrdenB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOrdenBKeyPressed(evt);
            }
        });

        jPanel8.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel8.setEnabled(false);
        jPanel8.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N

        nombre6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre6.setText("Recibido por: ");

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("TOTAL $: ");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Abono $: ");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Saldo   $: ");

        txtTotalB.setEditable(false);
        txtTotalB.setText("0");
        txtTotalB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTotalBKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalBKeyTyped(evt);
            }
        });

        txtAbonoB.setEditable(false);
        txtAbonoB.setText("0");
        txtAbonoB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAbonoBKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAbonoBKeyTyped(evt);
            }
        });

        txtSaldoB.setEditable(false);
        txtSaldoB.setText("0");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Observaciones del Pago:");

        txtObcervacionesB.setEditable(false);
        txtObcervacionesB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObcervacionesBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(txtTotalB, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(txtAbonoB, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(txtSaldoB, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel20))
                        .addGap(0, 91, Short.MAX_VALUE))
                    .addComponent(txtObcervacionesB, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtTotalB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtAbonoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtSaldoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObcervacionesB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Características del Equipo / Maquina / Otros: ");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Numero de Serie:");

        txtNumSerieB.setEditable(false);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Descrípcion del Trabajo Solicitado:");

        txtCaractesiticasB.setEditable(false);
        txtCaractesiticasB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCaractesiticasBActionPerformed(evt);
            }
        });

        txtDescripcionB.setEditable(false);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Notas del Equipo:");

        txtNotasB.setEditable(false);
        txtNotasB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNotasBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescripcionB, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumSerieB, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCaractesiticasB, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 81, Short.MAX_VALUE))
                    .addComponent(txtNotasB, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(365, 365, 365)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtCaractesiticasB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtNumSerieB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addGap(14, 14, 14)
                .addComponent(txtDescripcionB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNotasB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("C.I:");

        txtClienteB.setEditable(false);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("DIRECCION: ");

        txtDireccionB.setEditable(false);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("TELEFONO:");

        txtTelefonoB.setEditable(false);
        txtTelefonoB.setAutoscrolls(false);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("CLIENTE: ");

        txtCedulaB.setEditable(false);

        txtCorreoB.setEditable(false);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("CORREO:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("FECHA INICIO:");

        txtFechaIniB.setEditable(false);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("FECHA ENTREGA:");

        txtFechaFinB.setEditable(false);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefonoB, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29)
                        .addGap(18, 18, 18)
                        .addComponent(txtCorreoB, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtClienteB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccionB, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCedulaB, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaFinB, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel30)
                                .addGap(18, 18, 18)
                                .addComponent(txtFechaIniB, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30)
                        .addComponent(txtFechaIniB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(txtCedulaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClienteB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel31)
                    .addComponent(txtFechaFinB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccionB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCorreoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel29))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTelefonoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel27)))
                .addContainerGap())
        );

        txtEmpleadoB.setEditable(false);
        txtEmpleadoB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmpleadoBKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmpleadoBKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmpleadoBKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nombre6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEmpleadoB, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre6)
                    .addComponent(txtEmpleadoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(ingreseCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOrdenB, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingreseCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOrdenB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 70, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("BUSCAR", jPanel7);

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ingreseCedula1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        ingreseCedula1.setText("INGRESE NUMERO DE ORDEN: ");

        txtNumeroM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumeroMKeyPressed(evt);
            }
        });

        jPanel13.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel13.setEnabled(false);
        jPanel13.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N

        nombre7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre7.setText("Recibido por: ");

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("TOTAL $: ");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setText("Abono $: ");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setText("Saldo   $: ");

        txtTotalM.setText("0");
        txtTotalM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTotalMKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalMKeyTyped(evt);
            }
        });

        txtAbonoM.setText("0");
        txtAbonoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAbonoMKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAbonoMKeyTyped(evt);
            }
        });

        txtSaldoM.setText("0");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setText("Observaciones del Pago:");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addGap(18, 18, 18)
                                .addComponent(txtTotalM, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addGap(18, 18, 18)
                                .addComponent(txtAbonoM, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addGap(18, 18, 18)
                                .addComponent(txtSaldoM, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel35))
                        .addGap(0, 91, Short.MAX_VALUE))
                    .addComponent(txtObcervacionesM, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtTotalM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtAbonoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(txtSaldoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObcervacionesM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setText("C.I:");

        txtClienteM.setEditable(false);

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setText("DIRECCION: ");

        txtDireccionM.setEditable(false);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel42.setText("TELEFONO:");

        txtTelefonoM.setEditable(false);
        txtTelefonoM.setAutoscrolls(false);

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel43.setText("CLIENTE: ");

        txtCedulaM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaMKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaMKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaMKeyTyped(evt);
            }
        });

        txtCorreoM.setEditable(false);

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel44.setText("CORREO:");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel45.setText("FECHA INICIO:");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel46.setText("FECHA ENTREGA:");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefonoM, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel44)
                        .addGap(18, 18, 18)
                        .addComponent(txtCorreoM, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtClienteM, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccionM, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCedulaM, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaFinM, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel45)
                                .addGap(18, 18, 18)
                                .addComponent(txtFechaIniM, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel45)
                        .addComponent(txtFechaIniM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel40)
                        .addComponent(txtCedulaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtClienteM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43)
                            .addComponent(jLabel46))
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireccionM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(txtFechaFinM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCorreoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel44))
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTelefonoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel42)))
                .addContainerGap())
        );

        actulizarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        actulizarM.setText("ACTUALIZAR");
        actulizarM.setEnabled(false);
        actulizarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actulizarMActionPerformed(evt);
            }
        });

        comEmpleadosM.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        comEmpleadosM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setText("Características del Equipo / Maquina / Otros: ");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setText("Numero de Serie:");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setText("Descrípcion del Trabajo Solicitado:");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setText("Notas del Equipo:");

        comTrabajosM.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        comTrabajosM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comTrabajosM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comTrabajosMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescripcionM, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumSerieM, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCaractesiticasM, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comTrabajosM, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 73, Short.MAX_VALUE))
                    .addComponent(txtNotasM, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(365, 365, 365)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txtCaractesiticasM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txtNumSerieM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(comTrabajosM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(txtDescripcionM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNotasM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(actulizarM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nombre7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comEmpleadosM, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre7)
                    .addComponent(comEmpleadosM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(actulizarM))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(ingreseCedula1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroM, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingreseCedula1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 67, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("MODIFICAR", jPanel12);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(305, 305, 305))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrado(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_cerrado
        b.setEnabled(true);
    }//GEN-LAST:event_cerrado

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtCedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtCedula.getText().equals("")) {
                Cliente c = controladorCliente.buscar(txtCedula.getText());
                if (c != null) {
                    txtCliente.setText(c.getNombre() + " " + c.getApellido());
                    txtTelefono.setText(c.getTelefono());
                    txtDireccion.setText(c.getDireccion());
                    txtCorreo.setText(c.getCorreo());
                } else {
                    JOptionPane.showMessageDialog(this, "CLIENTE NO ENCONTRADO", "CLIENTE", JOptionPane.INFORMATION_MESSAGE);
                    txtCedula.setText("");
                    txtCliente.setText("");
                    txtTelefono.setText("");
                    txtDireccion.setText("");
                    txtCorreo.setText("");

                    txtCliente.setEditable(false);
                    txtTelefono.setEditable(false);
                    txtDireccion.setEditable(false);
                    txtCorreo.setEditable(false);

                    txtCedula.setBackground(Color.WHITE);
                    txtCliente.setBackground(Color.WHITE);
                    txtTelefono.setBackground(Color.WHITE);
                    txtDireccion.setBackground(Color.WHITE);
                    txtCorreo.setBackground(Color.WHITE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "DATOS INGRESADOS INCORRECTOS", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtCedula.setText("");
                txtCliente.setText("");
                txtTelefono.setText("");
                txtDireccion.setText("");
                txtCorreo.setText("");

                txtCliente.setEditable(false);
                txtTelefono.setEditable(false);
                txtDireccion.setEditable(false);
                txtCorreo.setEditable(false);

                txtCedula.setBackground(Color.WHITE);
                txtCliente.setBackground(Color.WHITE);
                txtTelefono.setBackground(Color.WHITE);
                txtDireccion.setBackground(Color.WHITE);
                txtCorreo.setBackground(Color.WHITE);
            }
        }
    }//GEN-LAST:event_txtCedulaKeyPressed

    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased
        if (txtCedula.getText().length() == 10) {
            if (controladorCliente.IdentificadorCedula(txtCedula.getText()) == true) {
                txtCedula.setBackground(Color.GREEN);
            } else {
                txtCedula.setBackground(Color.red);
            }
            evt.consume();
        }
    }//GEN-LAST:event_txtCedulaKeyReleased

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
        } else if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
            evt.consume();
            txtCedula.setBackground(Color.RED);
        } else {
            txtCedula.setBackground(Color.CYAN);
            if (txtCedula.getText().length() == 13) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtTotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalKeyReleased
        double total = 0, abono = 0;
        if (!txtTotal.getText().equals("")) {
            total = Double.parseDouble(txtTotal.getText());
        }

        if (!txtAbono.getText().equals("")) {
            abono = Double.parseDouble(txtAbono.getText());
        }
        DecimalFormat df = new DecimalFormat("#.00");
        double saldo = total - abono;

        txtSaldo.setText(String.valueOf(df.format(saldo)));
        txtSaldo.setText(txtSaldo.getText().replace(",", "."));
    }//GEN-LAST:event_txtTotalKeyReleased

    private void txtAbonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAbonoKeyReleased
        double total = 0, abono = 0;
        if (!txtTotal.getText().equals("")) {
            total = Double.parseDouble(txtTotal.getText());
        }

        if (!txtAbono.getText().equals("")) {
            abono = Double.parseDouble(txtAbono.getText());
        }
        DecimalFormat df = new DecimalFormat("#.00");
        double saldo = total - abono;

        txtSaldo.setText(String.valueOf(df.format(saldo)));
        txtSaldo.setText(txtSaldo.getText().replace(",", "."));
    }//GEN-LAST:event_txtAbonoKeyReleased

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int cont = 0;
        String mensaje = "";
        Cliente c = new Cliente();
        Empleado e = new Empleado();
        if (!txtCedula.getText().equals("")) {
            cont++;
            c = controladorCliente.buscar(txtCedula.getText());
        } else {
            mensaje = "Falta Cliente";
        }
        if (txtFechaFin.getDate() != null) {
            cont++;
        } else {
            mensaje = "Falta Fecha Fin";
        }
        if (!txtTotal.getText().equals("")) {
            cont++;
        } else {
            mensaje = "Falta  Total";
        }
        if (!txtAbono.getText().equals("")) {
            cont++;
        } else {
            mensaje = "Falta  Abono";
        }
        if (!txtCaractesiticas.getText().equals("")) {
            cont++;
        } else {
            mensaje = "Falta  Caracteristicas";
        }
        if (!txtDescripcion.getText().equals("")) {
            cont++;
        } else {
            mensaje = "Falta  Descripcion";
        }
        if (comEmpleados.getSelectedIndex() != 0) {
            cont++;
            String txt = comEmpleados.getSelectedItem().toString();
            String cor[] = txt.split(":");
            e = controladorEmpleados.buscarCodigo(cor[0]);
        } else {
            mensaje = "Falta  Selecionar empleado";
        }
        if (cont == 7) {
            Orden o = new Orden();

            o.setCliente(c); //1
            o.setEmpleado(e); //2

            o.setCodigo(controladorOrden.obtenerCodigo()); //3

            o.setFechaini(txtFechaIni.getText());  //4

            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            o.setFechafin(dateFormat.format(txtFechaFin.getDate()));  //5

            o.setTotal(Double.parseDouble(txtTotal.getText())); //6
            o.setAbono(Double.parseDouble(txtAbono.getText())); //7
            o.setSaldo(Double.parseDouble(txtSaldo.getText())); //8

            o.setObcervaciones(txtObcervaciones.getText() + " "); //9
            o.setCatacteristicas(txtCaractesiticas.getText() + " "); //10
            o.setNumeroSerie(txtNumSerie.getText() + " "); //11
            o.setDescripocion(txtDescripcion.getText() + " "); //12
            o.setNotas(txtNotas.getText() + " ");//13

            controladorOrden.crear(o);

            int yes = JOptionPane.showConfirmDialog(this, "Desea Imprimir la Orden ");
            if (yes == JFileChooser.APPROVE_OPTION) {
                controladorOrden.impirmir(o.getCodigo());
            }

            txtNumero.setText(""+controladorOrden.obtenerCodigo());

            txtCedula.setText("");
            txtCliente.setText("");
            txtTelefono.setText("");
            txtCorreo.setText("");
            txtDireccion.setText("");
            txtFechaFin.setCalendar(null);

            txtAbono.setText("");
            txtSaldo.setText("");
            txtTotal.setText("");

            txtObcervaciones.setText("");
            txtCaractesiticas.setText("");
            txtNumSerie.setText("");
            txtCaractesiticas.setText("");
            txtDescripcion.setText("");
            txtNotas.setText("");

            comEmpleados.setSelectedIndex(0);

            
        } else {
            JOptionPane.showMessageDialog(this, "Datos vacíos: " + mensaje, "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNumeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroKeyPressed

    private void txtNumeroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroKeyReleased

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void txtFechaIniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaIniKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaIniKeyPressed

    private void txtFechaIniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaIniKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaIniKeyReleased

    private void txtFechaIniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaIniKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaIniKeyTyped

    private void txtTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalKeyTyped
        controladorOrden.keyTypedNumero(txtTotal, evt);
    }//GEN-LAST:event_txtTotalKeyTyped

    private void txtAbonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAbonoKeyTyped
        controladorOrden.keyTypedNumero(txtAbono, evt);
    }//GEN-LAST:event_txtAbonoKeyTyped

    private void comTrabajosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comTrabajosActionPerformed
        if (comTrabajos.getSelectedIndex() > 0) {
            String txt = comTrabajos.getSelectedItem().toString();
            String a[] = txt.split(":");

            Trabajos t = controladorTrabajos.buscar(a[0]);

            txtDescripcion.setText(txtDescripcion.getText() + ", " + t.getNombre());

            double total = 0, abono = 0;

            if (!txtTotal.getText().equals("")) {
                total = Double.parseDouble(txtTotal.getText());
            }
            total = total + t.getPrecio();

            txtTotal.setText(String.valueOf(total));

            if (!txtAbono.getText().equals("")) {
                abono = Double.parseDouble(txtAbono.getText());
            }
            DecimalFormat df = new DecimalFormat("#.00");
            double saldo = total - abono;

            txtSaldo.setText(String.valueOf(df.format(saldo)));
            String r = txtSaldo.getText();
            r = r.replace(",", ".");
            txtSaldo.setText(r);

        }
    }//GEN-LAST:event_comTrabajosActionPerformed

    private void jTabbedPane2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane2StateChanged
        int x = jTabbedPane2.getSelectedIndex();
        if (x == 1) {
            ArrayList<Orden> lista = controladorOrden.listar();
            if (lista.isEmpty()) {
                modelo.setRowCount(0);
                JOptionPane.showMessageDialog(null, "Lista de ordenes vacia");

            } else {
                modelo = new DefaultTableModel();
                Object[] datosempleado;
                modelo.addColumn("ID");
                modelo.addColumn("CLIENTE");
                modelo.addColumn("EMPLEADO");
                modelo.addColumn("CARACTERISTICAS");
                modelo.addColumn("NUMERO SERIE");
                modelo.addColumn("DESCRIPCION");
                modelo.addColumn("NOTAS");
                modelo.addColumn("TOTAL");
                modelo.addColumn("ABONO");
                modelo.addColumn("SALDO");
                modelo.addColumn("OBCERVACIONES");
                modelo.addColumn("FECHA INICIO");
                modelo.addColumn("FECHA FIN");
                tabla.setModel(modelo);

                for (int i = 0; i < lista.size(); i++) {
                    datosempleado = new Object[13];
                    Orden o = lista.get(i);
                    datosempleado[0] = o.getCodigo();
                    datosempleado[1] = o.getCliente().getNombre() + " " + o.getCliente().getApellido();
                    datosempleado[2] = o.getEmpleado().getNombre() + " " + o.getEmpleado().getApellido();
                    datosempleado[3] = o.getCatacteristicas();
                    datosempleado[4] = o.getNumeroSerie();
                    datosempleado[5] = o.getDescripocion();
                    datosempleado[6] = o.getNotas();
                    datosempleado[7] = o.getTotal();
                    datosempleado[8] = o.getAbono();
                    datosempleado[9] = o.getSaldo();
                    datosempleado[10] = o.getObcervaciones();
                    datosempleado[11] = o.getFechaini();
                    datosempleado[12] = o.getFechafin();

                    modelo.addRow(datosempleado);

                }
                tabla.setModel(modelo);
                TableColumnModel columnModel = tabla.getColumnModel();
                columnModel.getColumn(0).setPreferredWidth(25);
            }
        }
    }//GEN-LAST:event_jTabbedPane2StateChanged

    private void txtTotalBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalBKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalBKeyReleased

    private void txtTotalBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalBKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalBKeyTyped

    private void txtAbonoBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAbonoBKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAbonoBKeyReleased

    private void txtAbonoBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAbonoBKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAbonoBKeyTyped

    private void txtObcervacionesBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObcervacionesBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObcervacionesBActionPerformed

    private void txtCaractesiticasBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaractesiticasBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaractesiticasBActionPerformed

    private void txtNotasBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNotasBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNotasBActionPerformed

    private void txtEmpleadoBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpleadoBKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpleadoBKeyPressed

    private void txtEmpleadoBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpleadoBKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpleadoBKeyReleased

    private void txtEmpleadoBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpleadoBKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpleadoBKeyTyped

    private void txtOrdenBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrdenBKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtOrdenB.getText().equals("")) {
                Orden o = controladorOrden.buscar(Integer.parseInt(txtOrdenB.getText()));
                if (o != null) {
                    Cliente c = o.getCliente();
                    txtClienteB.setText(c.getNombre() + " " + c.getApellido());
                    txtCedulaB.setText(c.getCedula());
                    txtDireccionB.setText(c.getDireccion());
                    txtCorreoB.setText(c.getCorreo());
                    txtTelefonoB.setText(c.getTelefono());
                    txtFechaIniB.setText(o.getFechaini());
                    txtFechaFinB.setText(o.getFechafin());
                    txtAbonoB.setText(String.valueOf(o.getAbono()));
                    txtSaldoB.setText(String.valueOf(o.getSaldo()));
                    txtTotalB.setText(String.valueOf(o.getTotal()));
                    txtObcervacionesB.setText(o.getObcervaciones());
                    txtCaractesiticasB.setText(o.getCatacteristicas());
                    txtNumSerieB.setText(o.getNumeroSerie());
                    txtDescripcionB.setText(o.getDescripocion());
                    txtNotasB.setText(o.getNotas());
                    txtEmpleadoB.setText(o.getEmpleado().getNombre() + " " + o.getEmpleado().getApellido());
                } else {
                    JOptionPane.showMessageDialog(this, "No se a encontrado la Orde de Trabajo", "ORDEN DE TRABAJO", JOptionPane.ERROR_MESSAGE);
                    txtClienteB.setText("");
                    txtCedulaB.setText("");
                    txtDireccionB.setText("");
                    txtCorreoB.setText("");
                    txtTelefonoB.setText("");
                    txtFechaIniB.setText("");
                    txtFechaFinB.setText("");
                    txtAbonoB.setText("");
                    txtSaldoB.setText("");
                    txtTotalB.setText("");
                    txtObcervacionesB.setText("");
                    txtCaractesiticasB.setText("");
                    txtNumSerieB.setText("");
                    txtDescripcionB.setText("");
                    txtNotasB.setText("");
                    txtEmpleadoB.setText("");
                }
            }
        }
    }//GEN-LAST:event_txtOrdenBKeyPressed

    private void txtNumeroMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroMKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtNumeroM.getText().equals("")) {
                Orden o = controladorOrden.buscar(Integer.parseInt(txtNumeroM.getText()));
                if (o != null) {
                    Cliente c = o.getCliente();
                    txtClienteM.setText(c.getNombre() + " " + c.getApellido());
                    txtCedulaM.setText(c.getCedula());
                    txtDireccionM.setText(c.getDireccion());
                    txtCorreoM.setText(c.getCorreo());
                    txtTelefonoM.setText(c.getTelefono());
                    txtFechaIniM.setText(o.getFechaini());
                    try {
                        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(o.getFechafin());
                        txtFechaFinM.setDate(date);
                    } catch (Exception e) {
                    }

                    txtAbonoM.setText(String.valueOf(o.getAbono()));
                    txtSaldoM.setText(String.valueOf(o.getSaldo()));
                    txtTotalM.setText(String.valueOf(o.getTotal()));
                    txtObcervacionesM.setText(o.getObcervaciones());
                    txtCaractesiticasM.setText(o.getCatacteristicas());
                    txtNumSerieM.setText(o.getNumeroSerie());
                    txtDescripcionM.setText(o.getDescripocion());
                    txtNotasM.setText(o.getNotas());
                    Empleado e = o.getEmpleado();
                    comEmpleadosM.setSelectedItem(e.getCodigo() + ": " + e.getNombre() + " " + e.getApellido());

                    actulizarM.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(this, "No se a encontrado la Orde de Trabajo", "ORDEN DE TRABAJO", JOptionPane.ERROR_MESSAGE);
                    txtClienteM.setText("");
                    txtCedulaM.setText("");
                    txtDireccionM.setText("");
                    txtCorreoM.setText("");
                    txtTelefonoM.setText("");
                    txtFechaIniM.setText("");
                    txtFechaFinM.setCalendar(null);
                    txtAbonoM.setText("");
                    txtSaldoM.setText("");
                    txtTotalM.setText("");
                    txtObcervacionesM.setText("");
                    txtCaractesiticasM.setText("");
                    txtNumSerieM.setText("");
                    txtDescripcionM.setText("");
                    txtNotasM.setText("");
                    comEmpleadosM.setSelectedIndex(0);

                    actulizarM.setEnabled(false);
                }
            }
        }
    }//GEN-LAST:event_txtNumeroMKeyPressed

    private void txtTotalMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalMKeyReleased
        double total = 0, abono = 0;
        if (!txtTotalM.getText().equals("")) {
            total = Double.parseDouble(txtTotalM.getText());
        }

        if (!txtAbonoM.getText().equals("")) {
            abono = Double.parseDouble(txtAbonoM.getText());
        }
        DecimalFormat df = new DecimalFormat("#.00");
        double saldo = total - abono;

        txtSaldoM.setText(String.valueOf(df.format(saldo)));
        txtSaldoM.setText(txtSaldoM.getText().replace(",", "."));
    }//GEN-LAST:event_txtTotalMKeyReleased

    private void txtTotalMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalMKeyTyped
        controladorOrden.keyTypedNumero(txtTotalM, evt);
    }//GEN-LAST:event_txtTotalMKeyTyped

    private void txtAbonoMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAbonoMKeyReleased
        double total = 0, abono = 0;
        if (!txtTotalM.getText().equals("")) {
            total = Double.parseDouble(txtTotalM.getText());
        }

        if (!txtAbonoM.getText().equals("")) {
            abono = Double.parseDouble(txtAbonoM.getText());
        }
        DecimalFormat df = new DecimalFormat("#.00");
        double saldo = total - abono;

        txtSaldoM.setText(String.valueOf(df.format(saldo)));
        txtSaldoM.setText(txtSaldoM.getText().replace(",", "."));
    }//GEN-LAST:event_txtAbonoMKeyReleased

    private void txtAbonoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAbonoMKeyTyped
        controladorOrden.keyTypedNumero(txtAbonoM, evt);
    }//GEN-LAST:event_txtAbonoMKeyTyped

    private void actulizarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actulizarMActionPerformed

        int cont = 0;
        String mensaje = "";
        Cliente c = new Cliente();
        Empleado e = new Empleado();
        if (!txtCedulaM.getText().equals("")) {
            cont++;
            c = controladorCliente.buscar(txtCedulaM.getText());
        } else {
            mensaje = "Falta Cliente";
        }
        if (txtFechaFinM.getDate() != null) {
            cont++;
        } else {
            mensaje = "Falta Fecha Fin";
        }
        if (!txtTotalM.getText().equals("")) {
            cont++;
        } else {
            mensaje = "Falta  Total";
        }
        if (!txtAbonoM.getText().equals("")) {
            cont++;
        } else {
            mensaje = "Falta  Abono";
        }
        if (!txtCaractesiticasM.getText().equals("")) {
            cont++;
        } else {
            mensaje = "Falta  Caracteristicas";
        }
        if (!txtDescripcionM.getText().equals("")) {
            cont++;
        } else {
            mensaje = "Falta  Descripcion";
        }
        if (comEmpleadosM.getSelectedIndex() != 0) {
            cont++;
            String txt = comEmpleadosM.getSelectedItem().toString();
            String cor[] = txt.split(":");
            e = controladorEmpleados.buscarCodigo(cor[0]);
        } else {
            mensaje = "Falta  Selecionar empleado";
        }
        if (cont == 7) {
            Orden o = new Orden();

            o.setCliente(c); //1
            o.setEmpleado(e); //2

            o.setCodigo(Integer.valueOf(txtNumeroM.getText())); //3

            o.setFechaini(txtFechaIniM.getText());  //4

            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            o.setFechafin(dateFormat.format(txtFechaFinM.getDate()));  //5

            o.setTotal(Double.parseDouble(txtTotalM.getText())); //6
            o.setAbono(Double.parseDouble(txtAbonoM.getText())); //7
            o.setSaldo(Double.parseDouble(txtSaldoM.getText())); //8

            o.setObcervaciones(txtObcervacionesM.getText() + " "); //9
            o.setCatacteristicas(txtCaractesiticasM.getText() + " "); //10
            o.setNumeroSerie(txtNumSerieM.getText() + " "); //11
            o.setDescripocion(txtDescripcionM.getText() + " "); //12
            o.setNotas(txtNotasM.getText() + " ");//13

            boolean op = controladorOrden.actualizar(o);

            if (op) {
                int yes = JOptionPane.showConfirmDialog(this, "Desea Imprimir la Orden ");
                if (yes == JFileChooser.APPROVE_OPTION) {
                    controladorOrden.impirmir(o.getCodigo());
                }

                txtNumeroM.setText("");

                txtCedulaM.setText("");
                txtClienteM.setText("");
                txtTelefonoM.setText("");
                txtCorreoM.setText("");
                txtDireccionM.setText("");
                txtFechaFinM.setCalendar(null);

                txtAbonoM.setText("");
                txtSaldoM.setText("");
                txtTotalM.setText("");

                txtObcervacionesM.setText("");
                txtCaractesiticasM.setText("");
                txtNumSerieM.setText("");
                txtCaractesiticasM.setText("");
                txtDescripcionM.setText("");
                txtNotasM.setText("");

                comEmpleadosM.setSelectedIndex(0);

            } else {
                JOptionPane.showMessageDialog(this, "Erro al altualizar la Orden");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Datos vacíos: " + mensaje, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_actulizarMActionPerformed

    private void comTrabajosMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comTrabajosMActionPerformed
        if (comTrabajosM.getSelectedIndex() != 1) {
            String txt = comTrabajosM.getSelectedItem().toString();
            String a[] = txt.split(":");

            Trabajos t = controladorTrabajos.buscar(a[0]);

            txtDescripcionM.setText(txtDescripcionM.getText() + ", " + t.getNombre());

            double total = 0, abono = 0;

            if (!txtTotalM.getText().equals("")) {
                total = Double.parseDouble(txtTotalM.getText());
            }
            total = total + t.getPrecio();

            txtTotalM.setText(String.valueOf(total));

            if (!txtAbonoM.getText().equals("")) {
                abono = Double.parseDouble(txtAbonoM.getText());
            }
            DecimalFormat df = new DecimalFormat("#.00");
            double saldo = total - abono;

            txtSaldoM.setText(String.valueOf(df.format(saldo)));
            String r = txtSaldoM.getText();
            r = r.replace(",", ".");
            txtSaldoM.setText(r);

        }
    }//GEN-LAST:event_comTrabajosMActionPerformed

    private void txtCedulaMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaMKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtCedulaM.getText().equals("")) {
                Cliente c = controladorCliente.buscar(txtCedulaM.getText());
                if (c != null) {
                    txtClienteM.setText(c.getNombre() + " " + c.getApellido());
                    txtTelefonoM.setText(c.getTelefono());
                    txtDireccionM.setText(c.getDireccion());
                    txtCorreoM.setText(c.getCorreo());
                } else {
                    JOptionPane.showMessageDialog(this, "CLIENTE NO ENCONTRADO", "CLIENTE", JOptionPane.INFORMATION_MESSAGE);
                    txtCedulaM.setText("");
                    txtClienteM.setText("");
                    txtTelefonoM.setText("");
                    txtDireccionM.setText("");
                    txtCorreoM.setText("");

                    txtClienteM.setEditable(false);
                    txtTelefonoM.setEditable(false);
                    txtDireccionM.setEditable(false);
                    txtCorreoM.setEditable(false);
                }
            } else {
                JOptionPane.showMessageDialog(this, "DATOS INGRESADOS INCORRECTOS", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtCedulaM.setText("");
                txtClienteM.setText("");
                txtTelefonoM.setText("");
                txtDireccionM.setText("");
                txtCorreoM.setText("");

                txtClienteM.setEditable(false);
                txtTelefonoM.setEditable(false);
                txtDireccionM.setEditable(false);
                txtCorreoM.setEditable(false);
            }
        }
    }//GEN-LAST:event_txtCedulaMKeyPressed

    private void txtCedulaMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaMKeyReleased
        if (txtCedulaM.getText().length() == 10) {
            if (controladorCliente.IdentificadorCedula(txtCedulaM.getText()) == true) {
                txtCedula.setBackground(Color.GREEN);
            } else {
                txtCedula.setBackground(Color.red);
            }
            evt.consume();
        }
    }//GEN-LAST:event_txtCedulaMKeyReleased

    private void txtCedulaMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaMKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
        } else if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
            evt.consume();
            txtCedulaM.setBackground(Color.RED);
        } else {
            txtCedulaM.setBackground(Color.CYAN);
            if (txtCedulaM.getText().length() == 13) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtCedulaMKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actulizarM;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> comEmpleados;
    private javax.swing.JComboBox<String> comEmpleadosM;
    private javax.swing.JComboBox<String> comTrabajos;
    private javax.swing.JComboBox<String> comTrabajosM;
    private javax.swing.JLabel ingreseCedula;
    private javax.swing.JLabel ingreseCedula1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel nombre4;
    private javax.swing.JLabel nombre5;
    private javax.swing.JLabel nombre6;
    private javax.swing.JLabel nombre7;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtAbono;
    private javax.swing.JTextField txtAbonoB;
    private javax.swing.JTextField txtAbonoM;
    private javax.swing.JTextField txtCaractesiticas;
    private javax.swing.JTextField txtCaractesiticasB;
    private javax.swing.JTextField txtCaractesiticasM;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCedulaB;
    private javax.swing.JTextField txtCedulaM;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtClienteB;
    private javax.swing.JTextField txtClienteM;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorreoB;
    private javax.swing.JTextField txtCorreoM;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDescripcionB;
    private javax.swing.JTextField txtDescripcionM;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccionB;
    private javax.swing.JTextField txtDireccionM;
    private javax.swing.JTextField txtEmpleadoB;
    private com.toedter.calendar.JDateChooser txtFechaFin;
    private javax.swing.JTextField txtFechaFinB;
    private com.toedter.calendar.JDateChooser txtFechaFinM;
    private javax.swing.JTextField txtFechaIni;
    private javax.swing.JTextField txtFechaIniB;
    private javax.swing.JTextField txtFechaIniM;
    private javax.swing.JTextField txtNotas;
    private javax.swing.JTextField txtNotasB;
    private javax.swing.JTextField txtNotasM;
    private javax.swing.JTextField txtNumSerie;
    private javax.swing.JTextField txtNumSerieB;
    private javax.swing.JTextField txtNumSerieM;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtNumeroM;
    private javax.swing.JTextField txtObcervaciones;
    private javax.swing.JTextField txtObcervacionesB;
    private javax.swing.JTextField txtObcervacionesM;
    private javax.swing.JTextField txtOrdenB;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtSaldoB;
    private javax.swing.JTextField txtSaldoM;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoB;
    private javax.swing.JTextField txtTelefonoM;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalB;
    private javax.swing.JTextField txtTotalM;
    // End of variables declaration//GEN-END:variables
}
