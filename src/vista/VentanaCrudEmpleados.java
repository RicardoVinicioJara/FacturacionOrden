package vista;

import controladores.ControladorCliente;
import controladores.ControladorEmpleados;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import modelo.Cliente;
import modelo.Empleado;

/**
 * VentanaCrudClientes
 *
 * @author Fanny
 */
public class VentanaCrudEmpleados extends javax.swing.JInternalFrame {

    private JButton b;
    private Locale local;
    private DefaultTableModel modelo;
    private String cabecera[];
    private ControladorEmpleados controlador;
    private DefaultTableModel modelotabla;
    private String tCodigo;
    private String tCedula;
    private String tNombre;
    private String tApellido;
    private String tTelefono;
    private String tDireccion;
    private String tCorreo;

    public VentanaCrudEmpleados(JButton b) {
        initComponents();
        this.b = b;
        cabecera = null;
        modelo = new DefaultTableModel();

        controlador = new ControladorEmpleados();
        modelotabla = new DefaultTableModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        panelesCrudCliente = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        cedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        direccion = new javax.swing.JLabel();
        txtDirecion = new javax.swing.JTextField();
        telefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        correo = new javax.swing.JLabel();
        agregarClientes = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        listadeClientes = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        buscarclientes = new javax.swing.JLabel();
        txtCedulaB = new javax.swing.JTextField();
        ingreseCedula = new javax.swing.JLabel();
        panelBuscarCliente = new javax.swing.JPanel();
        nombre2 = new javax.swing.JLabel();
        apillido2 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtApellidoB = new javax.swing.JTextField();
        txtNombreB = new javax.swing.JTextField();
        txtTelefonoB = new javax.swing.JTextField();
        telefono2 = new javax.swing.JLabel();
        direcion2 = new javax.swing.JLabel();
        txtDirecionB = new javax.swing.JTextField();
        direcion3 = new javax.swing.JLabel();
        txtCorreoB = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        eliminarcliente = new javax.swing.JLabel();
        cedula4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        nombre4 = new javax.swing.JLabel();
        apellido4 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtApellidoE = new javax.swing.JTextField();
        txtNombreE = new javax.swing.JTextField();
        txtTelefonoE = new javax.swing.JTextField();
        telefono4 = new javax.swing.JLabel();
        direccion4 = new javax.swing.JLabel();
        txtDirecionE = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        direccion6 = new javax.swing.JLabel();
        txtCorreoE = new javax.swing.JTextField();
        txtCedulaE = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        cedula3 = new javax.swing.JLabel();
        txtCedulaM = new javax.swing.JTextField();
        modificarcliente = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        nombre3 = new javax.swing.JLabel();
        apellido3 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        telefono3 = new javax.swing.JLabel();
        direccion3 = new javax.swing.JLabel();
        actulizarM = new javax.swing.JButton();
        txtCedulaMM = new javax.swing.JTextField();
        txtNombreM = new javax.swing.JTextField();
        txtApellidoM = new javax.swing.JTextField();
        txtTelefonoM = new javax.swing.JTextField();
        txtDirecionM = new javax.swing.JTextField();
        nombre5 = new javax.swing.JLabel();
        txtCorreoM = new javax.swing.JTextField();
        direccion5 = new javax.swing.JLabel();
        controladorCliente = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setClosable(true);
        setIconifiable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                cerrando(evt);
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

        panelesCrudCliente.setBackground(new java.awt.Color(0, 204, 102));
        panelesCrudCliente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                panelesCrudClienteStateChanged(evt);
            }
        });

        nombre.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre.setText("NOMBRE:   ");

        apellido.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        apellido.setText("APELLIDOS:   ");

        cedula.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cedula.setText("CEDULA:   ");

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoKeyReleased(evt);
            }
        });

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        direccion.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direccion.setText("DIRECCION : ");

        txtDirecion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDirecionKeyReleased(evt);
            }
        });

        telefono.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        telefono.setText("TELEFONO:");

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoKeyReleased(evt);
            }
        });

        correo.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        correo.setText("CORREO : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnGuardar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCedula))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre)
                                    .addComponent(txtApellido)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCorreo)
                                    .addComponent(txtDirecion)
                                    .addComponent(txtTelefono))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cedula))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(direccion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDirecion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(correo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(btnGuardar))
        );

        agregarClientes.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        agregarClientes.setText("Agregar Empleado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(agregarClientes)
                .addContainerGap(379, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(agregarClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        panelesCrudCliente.addTab("CREAR", jPanel2);

        tabla.setBackground(new java.awt.Color(204, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NombreyApellido", "Direccion", "Telefono", "Codigo", "Cedula"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(4).setResizable(false);
        }

        listadeClientes.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        listadeClientes.setText("LISTA DE EMPLEADOS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(listadeClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(listadeClientes)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        panelesCrudCliente.addTab("LISTAR ", jPanel3);

        buscarclientes.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        buscarclientes.setText("BUSCAR EMPLEADOS");

        txtCedulaB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaBKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaBKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaBKeyTyped(evt);
            }
        });

        ingreseCedula.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        ingreseCedula.setText("INGRESE CEDULA: ");

        nombre2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre2.setText("NOMBRE: ");

        apillido2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        apillido2.setText("APELLIDOS: ");

        jLabel30.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        txtApellidoB.setEditable(false);
        txtApellidoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoBActionPerformed(evt);
            }
        });
        txtApellidoB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoBKeyTyped(evt);
            }
        });

        txtNombreB.setEditable(false);

        txtTelefonoB.setEditable(false);
        txtTelefonoB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoBKeyTyped(evt);
            }
        });

        telefono2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        telefono2.setText("TELEFONO:");

        direcion2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion2.setText("DIRECCION");

        txtDirecionB.setEditable(false);

        direcion3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direcion3.setText("CORREO");

        txtCorreoB.setEditable(false);

        javax.swing.GroupLayout panelBuscarClienteLayout = new javax.swing.GroupLayout(panelBuscarCliente);
        panelBuscarCliente.setLayout(panelBuscarClienteLayout);
        panelBuscarClienteLayout.setHorizontalGroup(
            panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(telefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apillido2, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(nombre2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(62, 62, 62)
                        .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTelefonoB)
                            .addComponent(txtNombreB)
                            .addComponent(txtApellidoB, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBuscarClienteLayout.createSequentialGroup()
                        .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(direcion2, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(direcion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDirecionB, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                            .addComponent(txtCorreoB))))
                .addContainerGap())
        );
        panelBuscarClienteLayout.setVerticalGroup(
            panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre2)
                    .addComponent(txtNombreB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apillido2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtApellidoB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefono2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTelefonoB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(direcion2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDirecionB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(direcion3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCorreoB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(buscarclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(ingreseCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtCedulaB, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(162, 213, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(panelBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(buscarclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ingreseCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtCedulaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(panelBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelesCrudCliente.addTab("BUSCAR", jPanel6);

        eliminarcliente.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        eliminarcliente.setText("Eliminar EMPLEADO");

        cedula4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cedula4.setText("CEDULA: ");

        nombre4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre4.setText("NOMBRE: ");

        apellido4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        apellido4.setText("APELLIDOS: ");

        jLabel22.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        txtApellidoE.setEditable(false);
        txtApellidoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoEActionPerformed(evt);
            }
        });
        txtApellidoE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoEKeyTyped(evt);
            }
        });

        txtNombreE.setEditable(false);
        txtNombreE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEKeyTyped(evt);
            }
        });

        txtTelefonoE.setEditable(false);
        txtTelefonoE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoEKeyTyped(evt);
            }
        });

        telefono4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        telefono4.setText("TELEFONO:");

        direccion4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direccion4.setText("DIRECCION");

        txtDirecionE.setEditable(false);
        txtDirecionE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirecionEActionPerformed(evt);
            }
        });
        txtDirecionE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDirecionEKeyTyped(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/garbage.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        direccion6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direccion6.setText("CORREO");

        txtCorreoE.setEditable(false);
        txtCorreoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoEActionPerformed(evt);
            }
        });
        txtCorreoE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoEKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(direccion6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                        .addComponent(txtCorreoE, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(nombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                                                .addComponent(jLabel22)
                                                .addGap(198, 198, 198))
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtNombreE)
                                                    .addComponent(txtApellidoE)))))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(telefono4, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                        .addGap(204, 204, 204))
                                    .addComponent(apellido4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(direccion4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDirecionE, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTelefonoE)))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(btnEliminar)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel22)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre4)
                            .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apellido4)
                            .addComponent(txtApellidoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefono4)
                            .addComponent(txtTelefonoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(direccion4)
                            .addComponent(txtDirecionE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccion6)
                    .addComponent(txtCorreoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        txtCedulaE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaEKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaEKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaEKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eliminarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cedula4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCedulaE, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(eliminarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cedula4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCedulaE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        panelesCrudCliente.addTab("ELIMINAR", jPanel4);

        cedula3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cedula3.setText("CEDULA: ");

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

        modificarcliente.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        modificarcliente.setText("MODIFICAR EMPLEADO");

        jPanel11.setEnabled(false);

        nombre3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre3.setText("CEDULA:");

        apellido3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        apellido3.setText("APELLIDOS: ");

        jLabel36.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        telefono3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        telefono3.setText("TELEFONO:");

        direccion3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direccion3.setText("DIRECCION:");

        actulizarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        actulizarM.setText("ACTUALIZAR");
        actulizarM.setEnabled(false);
        actulizarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actulizarMActionPerformed(evt);
            }
        });

        txtCedulaMM.setEditable(false);
        txtCedulaMM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaMMKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaMMKeyTyped(evt);
            }
        });

        txtNombreM.setEditable(false);
        txtNombreM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreMKeyReleased(evt);
            }
        });

        txtApellidoM.setEditable(false);
        txtApellidoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoMKeyReleased(evt);
            }
        });

        txtTelefonoM.setEditable(false);
        txtTelefonoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoMKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoMKeyTyped(evt);
            }
        });

        txtDirecionM.setEditable(false);
        txtDirecionM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDirecionMKeyReleased(evt);
            }
        });

        nombre5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre5.setText("NOMBRE: ");

        txtCorreoM.setEditable(false);
        txtCorreoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCorreoMKeyReleased(evt);
            }
        });

        direccion5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        direccion5.setText("CORREO:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addGap(58, 58, 58))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(direccion5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(telefono3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(apellido3, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(nombre3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombre5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(direccion3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreM, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtApellidoM, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTelefonoM, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDirecionM, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCedulaMM)
                    .addComponent(txtCorreoM))
                .addGap(19, 19, 19))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(actulizarM)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre3)
                    .addComponent(txtCedulaMM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre5)
                    .addComponent(txtNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(apellido3)
                    .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefono3)
                    .addComponent(txtTelefonoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccion3)
                    .addComponent(txtDirecionM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccion5)
                    .addComponent(txtCorreoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addGap(8, 8, 8)
                .addComponent(actulizarM)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modificarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(cedula3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(txtCedulaM, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(175, 175, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(modificarcliente)
                .addGap(8, 8, 8)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cedula3)
                    .addComponent(txtCedulaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        panelesCrudCliente.addTab("MODIFICAR", jPanel8);

        controladorCliente.setFont(new java.awt.Font("Sitka Heading", 2, 24)); // NOI18N
        controladorCliente.setText("CONTROLADOR EMPLEADOS");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empleadosP.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(controladorCliente))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(350, 350, 350)
                                .addComponent(jLabel17)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelesCrudCliente, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(controladorCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelesCrudCliente)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Empleado e = controlador.buscar(txtCedulaE.getText());
        if (e != null) {
            int resp = JOptionPane.showConfirmDialog(this, "SEGUR DECESAS ELMINAR AL EMPLEADO \n "
                    + e.getNombre() + "  " + e.getApellido());
            if (JOptionPane.OK_OPTION == resp) {
                controlador.eliminar(e.getCodigo());
                JOptionPane.showMessageDialog(this, "EMPLEADO ELMINADO", "EMPLEADO", JOptionPane.INFORMATION_MESSAGE);
                txtCedulaE.setText("");
                txtNombreE.setText("");
                txtApellidoE.setText("");
                txtTelefonoE.setText("");
                txtDirecionE.setText("");
                txtCorreoE.setText("");
                btnEliminar.setEnabled(false);
                txtCedulaE.setBackground(Color.WHITE);
            } else {
                txtCedulaE.setText("");
                txtNombreE.setText("");
                txtApellidoE.setText("");
                txtTelefonoE.setText("");
                txtDirecionE.setText("");
                txtCorreoE.setText("");
                btnEliminar.setEnabled(false);
                txtCedulaE.setBackground(Color.WHITE);
            
            }
        } else {
            JOptionPane.showMessageDialog(this, "REVISE EL NUMERO DE CEDULA", "EMPLEADO", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnEliminarActionPerformed


    private void txtDirecionEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirecionEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirecionEKeyTyped

    private void txtDirecionEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirecionEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirecionEActionPerformed

    private void txtTelefonoEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoEKeyTyped

    private void txtNombreEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEKeyTyped

    private void txtApellidoEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoEKeyTyped

    private void txtApellidoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoEActionPerformed


    private void actulizarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actulizarMActionPerformed
        int cont = 0;
        if (!txtCedulaMM.getText().equals("")) {
            cont++;
        }
        if (!txtNombreM.getText().equals("")) {
            cont++;
        }
        if (!txtApellidoM.getText().equals("")) {
            cont++;
        }
        if (!txtTelefonoM.getText().equals("")) {
            cont++;
        }
        if (!txtDirecionM.getText().equals("")) {
            cont++;
        }
        if (cont == 5) {
            Empleado x = controlador.buscar(txtCedulaM.getText());

            Empleado c = new Empleado();

            c.setCodigo(x.getCodigo());
            c.setCedula(txtCedulaMM.getText());
            c.setNombre(txtNombreM.getText());
            c.setApellido(txtApellidoM.getText());
            c.setTelefono(txtTelefonoM.getText());
            c.setDireccion(txtDirecionM.getText());
            c.setCorreo(txtCorreoM.getText());

            controlador.actualizar(c);

            txtCedulaM.setText("");
            txtCedulaMM.setText("");
            txtNombreM.setText("");
            txtApellidoM.setText("");
            txtTelefonoM.setText("");
            txtDirecionM.setText("");
            txtCorreoM.setText("");

            txtCedulaMM.setBackground(Color.WHITE);
            txtCedulaM.setBackground(Color.WHITE);
            txtNombreM.setBackground(Color.WHITE);
            txtApellidoM.setBackground(Color.white);
            txtTelefonoM.setBackground(Color.WHITE);
            txtDirecionM.setBackground(Color.WHITE);
            txtCorreoM.setBackground(Color.WHITE);
        } else {
            JOptionPane.showMessageDialog(this, "Exiten errores en los campos!! \nVerfique los datos ingresados", "EMPLEADO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_actulizarMActionPerformed

    private void txtCedulaMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaMKeyTyped
        char c = evt.getKeyChar();
        if (Character.isAlphabetic(c) || c == '.') {
            getToolkit().beep();
            txtCedulaM.setBackground(Color.red);
            evt.consume();
        } else {
            txtCedulaM.setBackground(Color.CYAN);
            if (txtCedulaM.getText().length() == 13) {
                evt.consume();
                txtCedulaM.setBackground(Color.GREEN);
            }
        }
    }//GEN-LAST:event_txtCedulaMKeyTyped

    private void txtTelefonoBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoBKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoBKeyTyped

    private void txtApellidoBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoBKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoBKeyTyped

    private void txtApellidoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoBActionPerformed

    private void txtCedulaBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaBKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
        } else if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
            evt.consume();
            txtCedulaB.setBackground(Color.RED);
        } else {
            txtCedulaB.setBackground(Color.CYAN);
            if (txtCedulaB.getText().length() == 13) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtCedulaBKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int cont = 0;
        if (!txtCedula.getText().equals("")) {
            cont++;
        }
        if (!txtNombre.getText().equals("")) {
            cont++;
        }
        if (!txtApellido.getText().equals("")) {
            cont++;
        }
        if (!txtTelefono.getText().equals("")) {
            cont++;
        }
        if (!txtDirecion.getText().equals("")) {
            cont++;
        }
        if (cont == 5) {
            Empleado x = controlador.buscar(txtCedula.getText());
            if (x == null) {

                Empleado c = new Empleado();

                c.setCodigo(controlador.obtenerCodigo());
                c.setCedula(txtCedula.getText());
                c.setNombre(txtNombre.getText());
                c.setApellido(txtApellido.getText());
                c.setTelefono(txtTelefono.getText());
                c.setDireccion(txtDirecion.getText());
                c.setCorreo(txtCorreo.getText());

                controlador.crear(c);

                txtCedula.setText("");
                txtNombre.setText("");
                txtApellido.setText("");
                txtTelefono.setText("");
                txtDirecion.setText("");
                txtCorreo.setText("");

                txtCedula.setBackground(Color.WHITE);
                txtNombre.setBackground(Color.WHITE);
                txtApellido.setBackground(Color.white);
                txtTelefono.setBackground(Color.WHITE);
                txtDirecion.setBackground(Color.WHITE);
                txtCorreo.setBackground(Color.WHITE);

            } else {
                JOptionPane.showMessageDialog(this, "YA EXISTE UN USUARIO CREADO \n CON ESTE NUMERO DE CEDULA", "EMPLEADO", JOptionPane.INFORMATION_MESSAGE);
                txtCedula.setText("");
                txtCedula.setBackground(Color.WHITE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Exiten errores en los campos!! \nVerfique los datos ingresados", "EMPLEADO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
   
    private void cerrando(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_cerrando
        // System.out.println("se a cerrado");
        b.setEnabled(true);
    }//GEN-LAST:event_cerrando

    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased
        controlador.keyReleesCedula(txtCedula, evt);
    }//GEN-LAST:event_txtCedulaKeyReleased

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        controlador.keyTypedCedula(txtCedula, evt);
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void panelesCrudClienteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_panelesCrudClienteStateChanged
        int x = panelesCrudCliente.getSelectedIndex();
        if (x == 1) {
            if (controlador.listar().isEmpty()) {
                modelotabla.setRowCount(0);
                JOptionPane.showMessageDialog(null, "Lista de clientes vacia");

            } else {
                modelotabla = new DefaultTableModel();
                Object[] datoscliente;
                modelotabla.addColumn("Codigo");
                modelotabla.addColumn("Cedula");
                modelotabla.addColumn("Nombre y Apellido");
                modelotabla.addColumn("Telefono");
                modelotabla.addColumn("Direccion");
                modelotabla.addColumn("Correo");
                
               
                tabla.setModel(modelotabla);
                
                
                ArrayList<Empleado> lista = controlador.listar();
                for (int i = 0; i < lista.size(); i++) {
                    datoscliente = new Object[6];
                    Empleado cliente = lista.get(i);
                    datoscliente[0] = cliente.getCodigo();
                    datoscliente[1] = cliente.getCedula();
                    datoscliente[2] = cliente.getNombre() + " " + cliente.getApellido();
                    datoscliente[3] = cliente.getTelefono();
                    datoscliente[4] = cliente.getDireccion();
                    datoscliente[5] = cliente.getCorreo();
                    modelotabla.addRow(datoscliente);
                    
                }
                tabla.setModel(modelotabla);
                TableColumnModel columnModel = tabla.getColumnModel();
                columnModel.getColumn(0).setPreferredWidth(3);
            }
        }
    }//GEN-LAST:event_panelesCrudClienteStateChanged

    private void txtCedulaBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaBKeyReleased
        if (txtCedulaB.getText().length() == 10) {
            if (controlador.IdentificadorCedula(txtCedulaB.getText()) == true) {
                txtCedulaB.setBackground(Color.GREEN);
            } else {
                txtCedulaB.setBackground(Color.red);
            }
            evt.consume();
        }
    }//GEN-LAST:event_txtCedulaBKeyReleased

    private void txtCedulaBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaBKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtCedulaB.getText().equals("")) {
                Empleado c = controlador.buscar(txtCedulaB.getText());
                if (c != null) {
                    txtNombreB.setText(c.getNombre());
                    txtApellidoB.setText(c.getApellido());
                    txtTelefonoB.setText(c.getTelefono());
                    txtDirecionB.setText(c.getDireccion());
                    txtCorreoB.setText(c.getCorreo());
                } else {
                    JOptionPane.showMessageDialog(this, "EMPLEADO NO ENCONTRADO", "EMPLEADO", JOptionPane.INFORMATION_MESSAGE);
                    txtCedulaB.setText("");
                    txtNombreB.setText("");
                    txtApellidoB.setText("");
                    txtTelefonoB.setText("");
                    txtDirecionB.setText("");
                    txtCorreoB.setText("");

                    txtNombreB.setEditable(false);
                    txtApellidoB.setEditable(false);
                    txtTelefonoB.setEditable(false);
                    txtDirecionB.setEditable(false);
                    txtCorreoB.setEditable(false);

                    txtCedulaB.setBackground(Color.WHITE);
                    txtNombreB.setBackground(Color.WHITE);
                    txtApellidoB.setBackground(Color.WHITE);
                    txtTelefonoB.setBackground(Color.WHITE);
                    txtDirecionB.setBackground(Color.WHITE);
                    txtCorreoB.setBackground(Color.WHITE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "DATOS INGRESADOS INCORRECTOS", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtCedulaB.setText("");
                txtNombreB.setText("");
                txtApellidoB.setText("");
                txtTelefonoB.setText("");
                txtDirecionB.setText("");
                txtCorreoB.setText("");

                txtNombreB.setEditable(false);
                txtApellidoB.setEditable(false);
                txtTelefonoB.setEditable(false);
                txtDirecionB.setEditable(false);
                txtCorreoB.setEditable(false);

                txtCedulaB.setBackground(Color.WHITE);
                txtNombreB.setBackground(Color.WHITE);
                txtApellidoB.setBackground(Color.WHITE);
                txtTelefonoB.setBackground(Color.WHITE);
                txtDirecionB.setBackground(Color.WHITE);
                txtCorreoB.setBackground(Color.WHITE);
            }
        }
    }//GEN-LAST:event_txtCedulaBKeyPressed

    private void txtCedulaMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaMKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtCedulaM.getText().equals("")) {
                Empleado c = controlador.buscar(txtCedulaM.getText());
                if (c != null) {

                    txtCedulaMM.setText(c.getCedula());
                    txtNombreM.setText(c.getNombre());
                    txtApellidoM.setText(c.getApellido());
                    txtTelefonoM.setText(c.getTelefono());
                    txtDirecionM.setText(c.getDireccion());
                    txtCorreoM.setText(c.getCorreo());

                    txtCedulaMM.setEditable(true);
                    txtNombreM.setEditable(true);
                    txtApellidoM.setEditable(true);
                    txtTelefonoM.setEditable(true);
                    txtDirecionM.setEditable(true);
                    txtCorreoM.setEditable(true);

                    txtCedulaMM.setBackground(Color.GREEN);
                    txtNombreM.setBackground(Color.GREEN);
                    txtApellidoM.setBackground(Color.GREEN);
                    txtTelefonoM.setBackground(Color.GREEN);
                    txtDirecionM.setBackground(Color.GREEN);
                    txtCorreoM.setBackground(Color.GREEN);

                    actulizarM.setEnabled(true);

                } else {
                    JOptionPane.showMessageDialog(this, "EMPLEADO NO ENCONTRADO", "EMPLEADO", JOptionPane.INFORMATION_MESSAGE);
                    txtCedulaMM.setText("");
                    txtNombreM.setText("");
                    txtApellidoM.setText("");
                    txtTelefonoM.setText("");
                    txtDirecionM.setText("");
                    txtCedulaMM.setEditable(false);
                    txtNombreM.setEditable(false);
                    txtApellidoM.setEditable(false);
                    txtTelefonoM.setEditable(false);
                    txtDirecionM.setEditable(false);
                    txtCedulaMM.setBackground(Color.WHITE);
                    txtNombreM.setBackground(Color.WHITE);
                    txtApellidoM.setBackground(Color.WHITE);
                    txtTelefonoM.setBackground(Color.WHITE);
                    txtDirecionM.setBackground(Color.WHITE);
                    actulizarM.setEnabled(false);
                }
            } else {
                JOptionPane.showMessageDialog(this, "DATOS INGRESADOS INCORRECTOS", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtCedulaMM.setText("");
                txtNombreM.setText("");
                txtApellidoM.setText("");
                txtTelefonoM.setText("");
                txtDirecionM.setText("");
                txtCedulaMM.setEditable(false);
                txtNombreM.setEditable(false);
                txtApellidoM.setEditable(false);
                txtTelefonoM.setEditable(false);
                txtDirecionM.setEditable(false);

                actulizarM.setEnabled(false);

                txtCedulaMM.setBackground(Color.WHITE);
                txtNombreM.setBackground(Color.WHITE);
                txtApellidoM.setBackground(Color.WHITE);
                txtTelefonoM.setBackground(Color.WHITE);
                txtDirecionM.setBackground(Color.WHITE);
            }
        }
    }//GEN-LAST:event_txtCedulaMKeyPressed

    private void txtCedulaMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaMKeyReleased
        controlador.keyReleesCedula(txtCedulaM, evt);
    }//GEN-LAST:event_txtCedulaMKeyReleased

    private void txtCedulaMMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaMMKeyReleased
        controlador.keyReleesCedula(txtCedulaMM, evt);
    }//GEN-LAST:event_txtCedulaMMKeyReleased

    private void txtCedulaMMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaMMKeyTyped
        controlador.keyTypedCedula(txtCedulaMM, evt);
    }//GEN-LAST:event_txtCedulaMMKeyTyped

    private void txtCedulaEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaEKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtCedulaE.getText().equals("")) {
                Empleado c = controlador.buscar(txtCedulaE.getText());
                if (c != null) {
                    txtNombreE.setText(c.getNombre());
                    txtApellidoE.setText(c.getApellido());
                    txtTelefonoE.setText(c.getTelefono());
                    txtDirecionE.setText(c.getDireccion());
                    txtCorreoE.setText(c.getCorreo());
                    btnEliminar.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(this, "EMPLEADO NO ENCONTRADO", "EMPLEADO", JOptionPane.INFORMATION_MESSAGE);
                    txtNombreE.setText("");
                    txtApellidoE.setText("");
                    txtTelefonoE.setText("");
                    txtDirecionE.setText("");
                    txtCorreoE.setText("");
                    btnEliminar.setEnabled(false);
                }
            } else {
                JOptionPane.showMessageDialog(this, "DATOS INGRESADOS INCORRECTOS", "ERROR", JOptionPane.ERROR_MESSAGE);

                txtNombreE.setText("");
                txtApellidoE.setText("");
                txtTelefonoE.setText("");
                txtDirecionE.setText("");
                txtCorreoE.setText("");
                
                txtNombreE.setEditable(false);
                txtApellidoE.setEditable(false);
                txtTelefonoE.setEditable(false);
                txtDirecionE.setEditable(false);
                txtCorreoE.setEditable(false);
                
                txtCedulaE.setBackground(Color.WHITE);
                txtNombreE.setBackground(Color.WHITE);
                txtApellidoE.setBackground(Color.WHITE);
                txtTelefonoE.setBackground(Color.WHITE);
                txtDirecionE.setBackground(Color.WHITE);
                txtCorreoE.setBackground(Color.WHITE);
                
                btnEliminar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_txtCedulaEKeyPressed

    private void txtCedulaEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaEKeyReleased
        controlador.keyReleesCedula(txtCedulaE, evt);
    }//GEN-LAST:event_txtCedulaEKeyReleased

    private void txtCedulaEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaEKeyTyped
        controlador.keyTypedCedula(txtCedulaE, evt);
    }//GEN-LAST:event_txtCedulaEKeyTyped

    private void txtCorreoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoEActionPerformed

    private void txtCorreoEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoEKeyTyped

    private void txtDirecionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirecionKeyReleased
        controlador.mayusculas(txtDirecion);
    }//GEN-LAST:event_txtDirecionKeyReleased

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        controlador.mayusculas(txtNombre);
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyReleased
        controlador.mayusculas(txtApellido);
    }//GEN-LAST:event_txtApellidoKeyReleased

    private void txtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyReleased
        controlador.correo(txtCorreo);
    }//GEN-LAST:event_txtCorreoKeyReleased

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
       controlador.soloTelefono(txtTelefono, evt);
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        controlador.soloTelefono(txtTelefono, evt);
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtNombreMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreMKeyReleased
        controlador.mayusculas(txtNombreM);
    }//GEN-LAST:event_txtNombreMKeyReleased

    private void txtApellidoMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMKeyReleased
        controlador.mayusculas(txtApellidoM);
    }//GEN-LAST:event_txtApellidoMKeyReleased

    private void txtDirecionMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirecionMKeyReleased
        controlador.mayusculas(txtDirecionM);
    }//GEN-LAST:event_txtDirecionMKeyReleased

    private void txtCorreoMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoMKeyReleased
        controlador.correo(txtCorreoM);
    }//GEN-LAST:event_txtCorreoMKeyReleased

    private void txtTelefonoMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoMKeyReleased
        controlador.soloTelefono(txtTelefonoM, evt);
    }//GEN-LAST:event_txtTelefonoMKeyReleased

    private void txtTelefonoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoMKeyTyped
        controlador.soloTelefono(txtTelefonoM, evt);
    }//GEN-LAST:event_txtTelefonoMKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actulizarM;
    private javax.swing.JLabel agregarClientes;
    private javax.swing.JLabel apellido;
    private javax.swing.JLabel apellido3;
    private javax.swing.JLabel apellido4;
    private javax.swing.JLabel apillido2;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel buscarclientes;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel cedula3;
    private javax.swing.JLabel cedula4;
    private javax.swing.JLabel controladorCliente;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel direccion3;
    private javax.swing.JLabel direccion4;
    private javax.swing.JLabel direccion5;
    private javax.swing.JLabel direccion6;
    private javax.swing.JLabel direcion2;
    private javax.swing.JLabel direcion3;
    private javax.swing.JLabel eliminarcliente;
    private javax.swing.JLabel ingreseCedula;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel listadeClientes;
    private javax.swing.JLabel modificarcliente;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre2;
    private javax.swing.JLabel nombre3;
    private javax.swing.JLabel nombre4;
    private javax.swing.JLabel nombre5;
    private javax.swing.JPanel panelBuscarCliente;
    private javax.swing.JTabbedPane panelesCrudCliente;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel telefono2;
    private javax.swing.JLabel telefono3;
    private javax.swing.JLabel telefono4;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellidoB;
    private javax.swing.JTextField txtApellidoE;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCedulaB;
    private javax.swing.JTextField txtCedulaE;
    private javax.swing.JTextField txtCedulaM;
    private javax.swing.JTextField txtCedulaMM;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorreoB;
    private javax.swing.JTextField txtCorreoE;
    private javax.swing.JTextField txtCorreoM;
    private javax.swing.JTextField txtDirecion;
    private javax.swing.JTextField txtDirecionB;
    private javax.swing.JTextField txtDirecionE;
    private javax.swing.JTextField txtDirecionM;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreB;
    private javax.swing.JTextField txtNombreE;
    private javax.swing.JTextField txtNombreM;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoB;
    private javax.swing.JTextField txtTelefonoE;
    private javax.swing.JTextField txtTelefonoM;
    // End of variables declaration//GEN-END:variables
}
