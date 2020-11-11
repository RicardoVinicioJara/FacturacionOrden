package vista;

import controladores.ControladorTrabajos;
import modelo.Trabajos;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * VentanaCrudClientes
 *
 * @author Fanny
 */
public class VentanaTiposTrabajos extends javax.swing.JInternalFrame {

    private JButton b;
    private ControladorTrabajos controladorTrabajos;
    private DefaultTableModel modelotabla;

    public VentanaTiposTrabajos(JButton b) {
        initComponents();
        this.b = b;

        modelotabla = new DefaultTableModel();

        controladorTrabajos = new ControladorTrabajos();

        txtCodigo.setFocusable(false);
        txtCodigo.setText(String.valueOf(controladorTrabajos.obtenerCodigo()));

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
        txtPrecio = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        nombre1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        agregarClientes = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        listadeClientes = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        buscarclientes = new javax.swing.JLabel();
        txtCodigoB = new javax.swing.JTextField();
        ingreseCedula = new javax.swing.JLabel();
        panelBuscarCliente = new javax.swing.JPanel();
        nombre2 = new javax.swing.JLabel();
        COSTO = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtPrecioB = new javax.swing.JTextField();
        txtNombreB = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        cedula3 = new javax.swing.JLabel();
        txtCodigoM = new javax.swing.JTextField();
        modificarcliente = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        nombre3 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        actulizarM = new javax.swing.JButton();
        txtNombreM = new javax.swing.JTextField();
        txtPrecioM = new javax.swing.JTextField();
        PRECIO = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        eliminarcliente = new javax.swing.JLabel();
        cedula4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        nombre4 = new javax.swing.JLabel();
        apellido4 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtPrecioE = new javax.swing.JTextField();
        txtNombreE = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        txtCodigoE = new javax.swing.JTextField();
        texto = new javax.swing.JLabel();
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

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre.setText("NOMBRE:   ");
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 37, 150, -1));

        apellido.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        apellido.setText("PRECIO:   ");
        jPanel1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 67, 140, -1));

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 67, 146, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 37, 146, -1));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        nombre1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre1.setText("CODIGO:   ");
        jPanel1.add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 150, -1));

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 146, -1));

        agregarClientes.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        agregarClientes.setText("Agregar Trabajo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarClientes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(agregarClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelesCrudCliente.addTab("CREAR", jPanel2);

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
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(4).setResizable(false);
            tabla.getColumnModel().getColumn(5).setResizable(false);
        }

        listadeClientes.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        listadeClientes.setText("LISTA DE TRABAJOS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(listadeClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(listadeClientes)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        panelesCrudCliente.addTab("LISTAR ", jPanel3);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscarclientes.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        buscarclientes.setText("BUSCAR Trabajo");
        jPanel6.add(buscarclientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 298, 37));

        txtCodigoB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoBKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoBKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoBKeyTyped(evt);
            }
        });
        jPanel6.add(txtCodigoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 64, 153, -1));

        ingreseCedula.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        ingreseCedula.setText("INGRESE CODIGO: ");
        jPanel6.add(ingreseCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 62, 164, 20));

        nombre2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre2.setText("NOMBRE: ");

        COSTO.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        COSTO.setText("PRECIO:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        txtPrecioB.setEditable(false);
        txtPrecioB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioBActionPerformed(evt);
            }
        });
        txtPrecioB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioBKeyTyped(evt);
            }
        });

        txtNombreB.setEditable(false);

        javax.swing.GroupLayout panelBuscarClienteLayout = new javax.swing.GroupLayout(panelBuscarCliente);
        panelBuscarCliente.setLayout(panelBuscarClienteLayout);
        panelBuscarClienteLayout.setHorizontalGroup(
            panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBuscarClienteLayout.createSequentialGroup()
                        .addComponent(nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(txtNombreB))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBuscarClienteLayout.createSequentialGroup()
                        .addComponent(COSTO, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addGap(62, 62, 62)
                        .addComponent(txtPrecioB, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(COSTO, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPrecioB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLabel30)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(panelBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 99, -1, 100));

        panelesCrudCliente.addTab("BUSCAR", jPanel6);

        cedula3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cedula3.setText("CEDULA: ");

        txtCodigoM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoMKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoMKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoMKeyTyped(evt);
            }
        });

        modificarcliente.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        modificarcliente.setText("MODIFICAR TRABAJO");

        jPanel11.setEnabled(false);

        nombre3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre3.setText("NOMBRE:");

        jLabel36.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        actulizarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        actulizarM.setText("ACTUALIZAR");
        actulizarM.setEnabled(false);
        actulizarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actulizarMActionPerformed(evt);
            }
        });

        txtNombreM.setEditable(false);

        txtPrecioM.setEditable(false);
        txtPrecioM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioMKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioMKeyTyped(evt);
            }
        });

        PRECIO.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        PRECIO.setText("PRECIO:");

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
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtNombreM)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtPrecioM)
                        .addContainerGap())))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(actulizarM)
                .addGap(0, 136, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre3)
                    .addComponent(txtNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PRECIO)
                    .addComponent(txtPrecioM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(actulizarM)
                .addGap(46, 46, 46)
                .addComponent(jLabel36)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modificarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(cedula3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(txtCodigoM, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(modificarcliente)
                .addGap(8, 8, 8)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cedula3)
                    .addComponent(txtCodigoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        panelesCrudCliente.addTab("MODIFICAR", jPanel8);

        eliminarcliente.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        eliminarcliente.setText("Eliminar Trabajo");

        cedula4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cedula4.setText("CEDULA: ");

        nombre4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombre4.setText("NOMBRE: ");

        apellido4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        apellido4.setText("PRECIO:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        txtPrecioE.setEditable(false);
        txtPrecioE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioEActionPerformed(evt);
            }
        });
        txtPrecioE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioEKeyTyped(evt);
            }
        });

        txtNombreE.setEditable(false);
        txtNombreE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEKeyTyped(evt);
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
                                .addComponent(nombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel22)
                                        .addGap(198, 198, 198))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPrecioE, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(apellido4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btnEliminar)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel22))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre4)
                            .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apellido4)
                            .addComponent(txtPrecioE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtCodigoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoEActionPerformed(evt);
            }
        });
        txtCodigoE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoEKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoEKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoEKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cedula4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoE, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(eliminarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cedula4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtCodigoE)
                        .addGap(1, 1, 1)))
                .addGap(27, 27, 27)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelesCrudCliente.addTab("ELIMINAR", jPanel4);

        texto.setFont(new java.awt.Font("Sitka Heading", 2, 24)); // NOI18N
        texto.setText("CONTROLADOR TIPOS TRABAJO");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tipTE.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(texto)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelesCrudCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texto)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelesCrudCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        controladorTrabajos.eliminar(Integer.parseInt(txtCodigoE.getText()));
        btnEliminar.setEnabled(false);
        txtCodigoE.setText("");
        txtNombreE.setText("");
        txtPrecioE.setText("");


    }//GEN-LAST:event_btnEliminarActionPerformed


    private void txtNombreEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEKeyTyped

    private void txtPrecioEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioEKeyTyped

    private void txtPrecioEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioEActionPerformed


    private void actulizarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actulizarMActionPerformed
        int cont = 0;
        if (!txtNombreM.getText().equals("")) {
            cont++;
        }
        if (!txtPrecioM.getText().equals("")) {
            cont++;
        }

        if (cont == 2) {
            Trabajos t = new Trabajos();
            t.setCodigo(Integer.parseInt(txtCodigoM.getText()));
            t.setNombre(txtNombreM.getText());
            t.setPrecio(Double.parseDouble(txtPrecioM.getText()));

            controladorTrabajos.actualizar(t);

            actulizarM.setEnabled(false);
            txtCodigoM.setText("");
            txtNombreM.setText("");
            txtPrecioM.setText("");

        } else {
            JOptionPane.showMessageDialog(this, "Exiten errores en los campos!! \nVerfique los datos ingresados", "CLIENTE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_actulizarMActionPerformed

    private void txtCodigoMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoMKeyTyped

    }//GEN-LAST:event_txtCodigoMKeyTyped

    private void txtPrecioBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioBKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioBKeyTyped

    private void txtPrecioBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioBActionPerformed

    private void txtCodigoBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoBKeyTyped

    }//GEN-LAST:event_txtCodigoBKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int cont = 0;
        if (!txtNombre.getText().equals("")) {
            cont++;
        }
        if (!txtPrecio.getText().equals("")) {
            cont++;
        }

        if (cont == 2) {
            Trabajos t = new Trabajos();
            t.setCodigo(controladorTrabajos.obtenerCodigo());
            t.setNombre(txtNombre.getText());
            t.setPrecio(Double.parseDouble(txtPrecio.getText()));

            controladorTrabajos.crear(t);

            txtCodigo.setText(String.valueOf(controladorTrabajos.obtenerCodigo()));
            txtNombre.setText("");
            txtPrecio.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Exiten errores en los campos!! \nVerfique los datos ingresados", "CLUETE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    private void cerrando(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_cerrando
        b.setEnabled(true);
    }//GEN-LAST:event_cerrando

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased

    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyReleased

    }//GEN-LAST:event_txtPrecioKeyReleased

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped

    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped

    }//GEN-LAST:event_txtPrecioKeyTyped

    private void panelesCrudClienteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_panelesCrudClienteStateChanged
        int x = panelesCrudCliente.getSelectedIndex();
        if (x == 1) {
            if (controladorTrabajos.listar().isEmpty()) {
                modelotabla.setRowCount(0);
                JOptionPane.showMessageDialog(this, "Lista de clientes vacia");

            } else {
                modelotabla = new DefaultTableModel();
                Object[] datoscliente;
                modelotabla.addColumn("Codigo");
                modelotabla.addColumn("Nombre");
                modelotabla.addColumn("Precio");
                tabla.setModel(modelotabla);
                ArrayList<Trabajos> lista = controladorTrabajos.listar();
                for (int i = 0; i < lista.size(); i++) {
                    datoscliente = new Object[3];
                    Trabajos cliente = lista.get(i);
                    datoscliente[0] = cliente.getCodigo();
                    datoscliente[1] = cliente.getNombre();
                    datoscliente[2] = cliente.getPrecio();
                    modelotabla.addRow(datoscliente);
                    tabla.setModel(modelotabla);
                }
            }
        }
    }//GEN-LAST:event_panelesCrudClienteStateChanged

    private void txtCodigoBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoBKeyReleased

    }//GEN-LAST:event_txtCodigoBKeyReleased

    private void txtCodigoBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoBKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtCodigoB.getText() != "") {
                Trabajos t = controladorTrabajos.buscar(txtCodigoB.getText());
                if (t != null) {
                    txtNombreB.setText(t.getNombre());
                    txtPrecioB.setText(String.valueOf(t.getPrecio()));
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese codigo", "CLUETE", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtCodigoBKeyPressed

    private void txtCodigoMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoMKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtCodigoM.getText() != "") {
                Trabajos t = controladorTrabajos.buscar(txtCodigoM.getText());
                if (t != null) {
                    txtNombreM.setText(t.getNombre());
                    txtPrecioM.setText(String.valueOf(t.getPrecio()));

                    actulizarM.setEnabled(true);
                    txtNombreM.setEditable(true);
                    txtPrecioM.setEditable(true);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese codigo", "CLUETE", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtCodigoMKeyPressed

    private void txtCodigoMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoMKeyReleased

    }//GEN-LAST:event_txtCodigoMKeyReleased

    private void txtPrecioMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioMKeyReleased

    }//GEN-LAST:event_txtPrecioMKeyReleased

    private void txtPrecioMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioMKeyTyped

    }//GEN-LAST:event_txtPrecioMKeyTyped

    private void txtCodigoEKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoEKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtPrecioE.getText() != "") {
                Trabajos t = controladorTrabajos.buscar(txtCodigoE.getText());
                if (t != null) {
                    txtNombreE.setText(t.getNombre());
                    txtPrecioE.setText(String.valueOf(t.getPrecio()));
                    btnEliminar.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(this, "No existe Trabajo", "CLUETE", JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }//GEN-LAST:event_txtCodigoEKeyPressed

    private void txtCodigoEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoEKeyReleased

    }//GEN-LAST:event_txtCodigoEKeyReleased

    private void txtCodigoEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoEKeyTyped

    }//GEN-LAST:event_txtCodigoEKeyTyped

    private void txtCodigoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoEActionPerformed

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel COSTO;
    private javax.swing.JLabel PRECIO;
    private javax.swing.JButton actulizarM;
    private javax.swing.JLabel agregarClientes;
    private javax.swing.JLabel apellido;
    private javax.swing.JLabel apellido4;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel buscarclientes;
    private javax.swing.JLabel cedula3;
    private javax.swing.JLabel cedula4;
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
    private javax.swing.JLabel nombre1;
    private javax.swing.JLabel nombre2;
    private javax.swing.JLabel nombre3;
    private javax.swing.JLabel nombre4;
    private javax.swing.JPanel panelBuscarCliente;
    private javax.swing.JTabbedPane panelesCrudCliente;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel texto;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoB;
    private javax.swing.JTextField txtCodigoE;
    private javax.swing.JTextField txtCodigoM;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreB;
    private javax.swing.JTextField txtNombreE;
    private javax.swing.JTextField txtNombreM;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioB;
    private javax.swing.JTextField txtPrecioE;
    private javax.swing.JTextField txtPrecioM;
    // End of variables declaration//GEN-END:variables
}
