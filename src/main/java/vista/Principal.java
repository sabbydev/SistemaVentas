package vista;

import java.awt.Color;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {
    private final Color btnBgColor = Color.decode("#FAD15E");
    private final Color btnBgColorFocused = Color.decode("#F14737");
    public Principal(String sesion) {
        initComponents();
        initMethods();
        initSession(sesion);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        pnlNavBar = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        btnRegistrarVenta = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnInformacion = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        tbdpnlSistema = new javax.swing.JTabbedPane();
        pnlRegistrarVenta = new javax.swing.JPanel();
        seccionProductoRegistrarVenta = new javax.swing.JPanel();
        btnEliminarRegistrarVenta = new javax.swing.JButton();
        lblProductoRegistrarVenta = new javax.swing.JLabel();
        cbProductoRegistrarVenta = new javax.swing.JComboBox<>();
        lblCantidadRegistrarVenta = new javax.swing.JLabel();
        txtCantidadRegistrarVenta = new javax.swing.JTextField();
        btnAgregarRegistrarVenta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistrarVenta = new javax.swing.JTable();
        lblTotalRegistrarVenta = new javax.swing.JLabel();
        txtTotalRegistrarVenta = new javax.swing.JTextField();
        seccionClienteRegistrarVenta = new javax.swing.JPanel();
        lblNombreRegistrarVenta = new javax.swing.JLabel();
        txtNombreRegistrarVenta = new javax.swing.JTextField();
        lblCorreoRegistrarVenta = new javax.swing.JLabel();
        txtCorreoRegistrarVenta = new javax.swing.JTextField();
        lblTelefonoRegistrarVenta = new javax.swing.JLabel();
        txtTelefonoRegistrarVenta = new javax.swing.JTextField();
        lblMetodoPagoRegistrarVenta = new javax.swing.JLabel();
        cbMetodoPagoRegistrarVenta = new javax.swing.JComboBox<>();
        txtIdDocRegistrarVenta = new javax.swing.JTextField();
        lblIdDocRegistrarVenta = new javax.swing.JLabel();
        btnRegistrarRegistrarVenta = new javax.swing.JButton();
        btnImprimirRegistrarVenta = new javax.swing.JButton();
        pnlClientes = new javax.swing.JPanel();
        lblNombreClientes = new javax.swing.JLabel();
        txtNombreClientes = new javax.swing.JTextField();
        lblCorreoClientes = new javax.swing.JLabel();
        txtCorreoClientes = new javax.swing.JTextField();
        lblTelefonoClientes = new javax.swing.JLabel();
        txtTelefonoClientes = new javax.swing.JTextField();
        btnGuardarClientes = new javax.swing.JButton();
        btnEditarClientes = new javax.swing.JButton();
        btnEliminarClientes = new javax.swing.JButton();
        lblTotalClientes = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        txtTotalClientes = new javax.swing.JTextField();
        txtDocumentoClientes = new javax.swing.JTextField();
        lblDocumentoClientes = new javax.swing.JLabel();
        pnlProductos = new javax.swing.JPanel();
        lblNombreProductos = new javax.swing.JLabel();
        txtNombreProductos = new javax.swing.JTextField();
        lblPrecioProductos = new javax.swing.JLabel();
        txtPrecioProductos = new javax.swing.JTextField();
        lblDescripcionProductos = new javax.swing.JLabel();
        txtDescripcionProductos = new javax.swing.JTextField();
        btnGuardarProductos = new javax.swing.JButton();
        btnEliminarProductos = new javax.swing.JButton();
        btnEditarProductos = new javax.swing.JButton();
        btnExcelProductos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        txtCategoriaProductos = new javax.swing.JTextField();
        lblTotalProductos = new javax.swing.JLabel();
        lblCategoriaProductos = new javax.swing.JLabel();
        txtTotalProductos = new javax.swing.JTextField();
        pnlEmpleados = new javax.swing.JPanel();
        lblNombreEmpleados = new javax.swing.JLabel();
        txtNombreEmpleados = new javax.swing.JTextField();
        lblSalarioEmpleados = new javax.swing.JLabel();
        txtSalarioEmpleados = new javax.swing.JTextField();
        btnGuardarEmpleados = new javax.swing.JButton();
        btnEliminarEmpleados = new javax.swing.JButton();
        btnEditarEmpleados = new javax.swing.JButton();
        btnExcelEmpleados = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        lblTotalEmpleados = new javax.swing.JLabel();
        lblCargoEmpleados = new javax.swing.JLabel();
        txtTotalEmpleados = new javax.swing.JTextField();
        lblDniEmpleados = new javax.swing.JLabel();
        txtDniEmpleados = new javax.swing.JTextField();
        txtCorreoEmpleados = new javax.swing.JTextField();
        lblCorreoEmpleados = new javax.swing.JLabel();
        cbCargoEmpleados = new javax.swing.JComboBox<>();
        pnlInformacion = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblVentas = new javax.swing.JTable();
        seccionBusquedaVentas = new javax.swing.JPanel();
        lblIdVentas = new javax.swing.JLabel();
        lblClienteVentas = new javax.swing.JLabel();
        lblProductoVentas = new javax.swing.JLabel();
        lblPrecioVentas = new javax.swing.JLabel();
        lblCantidadVentas = new javax.swing.JLabel();
        lblMontoVentas = new javax.swing.JLabel();
        lblMetodoPagoVentas = new javax.swing.JLabel();
        lblFechaVentas = new javax.swing.JLabel();
        lblHoraVentas = new javax.swing.JLabel();
        txtClienteVentas = new javax.swing.JTextField();
        txtIdVentas = new javax.swing.JTextField();
        txtProductoVentas = new javax.swing.JTextField();
        txtPrecioVentas = new javax.swing.JTextField();
        txtCantidadVentas = new javax.swing.JTextField();
        txtMontoVentas = new javax.swing.JTextField();
        cbMetodoPagoVentas = new javax.swing.JComboBox<>();
        jDateChooserVentas = new com.toedter.calendar.JDateChooser();
        spnHoraVentas = new javax.swing.JSpinner();
        btnPDFVentas = new javax.swing.JButton();
        pnlConfiguracion = new javax.swing.JPanel();
        btnGuardarConfiguracion = new javax.swing.JButton();
        lblRucConfiguracion = new javax.swing.JLabel();
        lblRazonSocialConfiguracion = new javax.swing.JLabel();
        lblNombreConfiguracion = new javax.swing.JLabel();
        lblDireccionConfiguracion = new javax.swing.JLabel();
        lblTelefonoConfiguracion = new javax.swing.JLabel();
        txtRucConfiguracion = new javax.swing.JTextField();
        txtRazonSocialConfiguracion = new javax.swing.JTextField();
        txtNombreConfiguracion = new javax.swing.JTextField();
        txtDireccionConfiguracion = new javax.swing.JTextField();
        txtTelefonoConfiguracion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cerrar.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, 20, 20));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minimizar.png"))); // NOI18N
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1225, 10, 20, 20));

        pnlNavBar.setBackground(new java.awt.Color(85, 28, 24));
        pnlNavBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/main-view-logo.png"))); // NOI18N
        pnlNavBar.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        btnRegistrarVenta.setBackground(new java.awt.Color(250, 209, 94));
        btnRegistrarVenta.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnRegistrarVenta.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarVenta.setText("Registrar Venta");
        btnRegistrarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVentaActionPerformed(evt);
            }
        });
        pnlNavBar.add(btnRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 218, 188, 62));

        btnClientes.setBackground(new java.awt.Color(250, 209, 94));
        btnClientes.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(0, 0, 0));
        btnClientes.setText("Clientes");
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        pnlNavBar.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 298, 188, 62));

        btnProductos.setBackground(new java.awt.Color(250, 209, 94));
        btnProductos.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(0, 0, 0));
        btnProductos.setText("Productos");
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        pnlNavBar.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 378, 188, 62));

        btnEmpleados.setBackground(new java.awt.Color(250, 209, 94));
        btnEmpleados.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnEmpleados.setForeground(new java.awt.Color(0, 0, 0));
        btnEmpleados.setText("Empleados");
        btnEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        pnlNavBar.add(btnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 458, 188, 62));

        btnInformacion.setBackground(new java.awt.Color(250, 209, 94));
        btnInformacion.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnInformacion.setForeground(new java.awt.Color(0, 0, 0));
        btnInformacion.setText("Información");
        btnInformacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionActionPerformed(evt);
            }
        });
        pnlNavBar.add(btnInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 538, 188, 62));

        btnConfiguracion.setBackground(new java.awt.Color(250, 209, 94));
        btnConfiguracion.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnConfiguracion.setForeground(new java.awt.Color(0, 0, 0));
        btnConfiguracion.setText("Configuración");
        btnConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });
        pnlNavBar.add(btnConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 618, 188, 62));

        getContentPane().add(pnlNavBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 720));

        tbdpnlSistema.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        pnlRegistrarVenta.setBackground(new java.awt.Color(245, 222, 179));
        pnlRegistrarVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        seccionProductoRegistrarVenta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        seccionProductoRegistrarVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminarRegistrarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eliminar.png"))); // NOI18N
        btnEliminarRegistrarVenta.setText("Eliminar");
        seccionProductoRegistrarVenta.add(btnEliminarRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 24, -1, 44));

        lblProductoRegistrarVenta.setText("Producto:");
        seccionProductoRegistrarVenta.add(lblProductoRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 24, 214, -1));

        cbProductoRegistrarVenta.setEditable(true);
        seccionProductoRegistrarVenta.add(cbProductoRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 44, 214, -1));

        lblCantidadRegistrarVenta.setText("Cantidad:");
        seccionProductoRegistrarVenta.add(lblCantidadRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 24, 82, -1));
        seccionProductoRegistrarVenta.add(txtCantidadRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 44, 82, -1));

        btnAgregarRegistrarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/agregar.png"))); // NOI18N
        btnAgregarRegistrarVenta.setText("Agregar");
        seccionProductoRegistrarVenta.add(btnAgregarRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 24, -1, 44));

        pnlRegistrarVenta.add(seccionProductoRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 600, 90));

        tblRegistrarVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "ID_Producto", "Nombre del Producto", "Categoría", "Precio Unitario", "Cantidad", "Monto Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRegistrarVenta);
        if (tblRegistrarVenta.getColumnModel().getColumnCount() > 0) {
            tblRegistrarVenta.getColumnModel().getColumn(0).setPreferredWidth(1);
            tblRegistrarVenta.getColumnModel().getColumn(1).setPreferredWidth(2);
            tblRegistrarVenta.getColumnModel().getColumn(2).setPreferredWidth(300);
            tblRegistrarVenta.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblRegistrarVenta.getColumnModel().getColumn(4).setPreferredWidth(50);
            tblRegistrarVenta.getColumnModel().getColumn(5).setPreferredWidth(1);
            tblRegistrarVenta.getColumnModel().getColumn(6).setPreferredWidth(50);
        }

        pnlRegistrarVenta.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 1020, 300));

        lblTotalRegistrarVenta.setText("Total a Pagar:");
        pnlRegistrarVenta.add(lblTotalRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 480, -1, 22));
        pnlRegistrarVenta.add(txtTotalRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 480, 114, -1));

        seccionClienteRegistrarVenta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        seccionClienteRegistrarVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreRegistrarVenta.setText("Nombre del Cliente:");
        seccionClienteRegistrarVenta.add(lblNombreRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 250, -1));

        txtNombreRegistrarVenta.setEditable(false);
        seccionClienteRegistrarVenta.add(txtNombreRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 250, -1));

        lblCorreoRegistrarVenta.setText("Correo:");
        seccionClienteRegistrarVenta.add(lblCorreoRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 24, 250, -1));

        txtCorreoRegistrarVenta.setEditable(false);
        seccionClienteRegistrarVenta.add(txtCorreoRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 46, 250, -1));

        lblTelefonoRegistrarVenta.setText("Telefono");
        seccionClienteRegistrarVenta.add(lblTelefonoRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 250, -1));

        txtTelefonoRegistrarVenta.setEditable(false);
        seccionClienteRegistrarVenta.add(txtTelefonoRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 250, -1));

        lblMetodoPagoRegistrarVenta.setText("Método de Pago:");
        seccionClienteRegistrarVenta.add(lblMetodoPagoRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 250, -1));
        seccionClienteRegistrarVenta.add(cbMetodoPagoRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 250, -1));

        txtIdDocRegistrarVenta.setEditable(false);
        seccionClienteRegistrarVenta.add(txtIdDocRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 250, -1));

        lblIdDocRegistrarVenta.setText("DNI/RUC:");
        seccionClienteRegistrarVenta.add(lblIdDocRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 250, -1));

        pnlRegistrarVenta.add(seccionClienteRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 540, 190));

        btnRegistrarRegistrarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/registrar-venta.png"))); // NOI18N
        btnRegistrarRegistrarVenta.setText("Registrar Venta");
        pnlRegistrarVenta.add(btnRegistrarRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 580, -1, 44));

        btnImprimirRegistrarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/imprimir.png"))); // NOI18N
        btnImprimirRegistrarVenta.setText("Imprimir");
        pnlRegistrarVenta.add(btnImprimirRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 580, 145, 44));

        tbdpnlSistema.addTab("Registrar Venta", pnlRegistrarVenta);

        pnlClientes.setBackground(new java.awt.Color(245, 222, 179));
        pnlClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreClientes.setText("Nombre:");
        pnlClientes.add(lblNombreClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 100, -1));
        pnlClientes.add(txtNombreClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 250, -1));

        lblCorreoClientes.setText("Correo:");
        pnlClientes.add(lblCorreoClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 100, -1));
        pnlClientes.add(txtCorreoClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 250, -1));

        lblTelefonoClientes.setText("Teléfono");
        pnlClientes.add(lblTelefonoClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 100, -1));
        pnlClientes.add(txtTelefonoClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, 250, -1));

        btnGuardarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/agregar.png"))); // NOI18N
        btnGuardarClientes.setText("Guardar");
        btnGuardarClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        pnlClientes.add(btnGuardarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 590, -1, -1));

        btnEditarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editar.png"))); // NOI18N
        btnEditarClientes.setText("Editar");
        btnEditarClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        pnlClientes.add(btnEditarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 590, 108, -1));

        btnEliminarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eliminar.png"))); // NOI18N
        btnEliminarClientes.setText("Eliminar");
        btnEliminarClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        pnlClientes.add(btnEliminarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 590, -1, -1));

        lblTotalClientes.setText("Total de Clientes:");
        pnlClientes.add(lblTotalClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 500, -1, 20));

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "ID_Cliente", "DNI", "Nombre del Cliente", "Correo", "Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblClientes);
        if (tblClientes.getColumnModel().getColumnCount() > 0) {
            tblClientes.getColumnModel().getColumn(0).setPreferredWidth(1);
            tblClientes.getColumnModel().getColumn(1).setPreferredWidth(10);
            tblClientes.getColumnModel().getColumn(2).setPreferredWidth(20);
            tblClientes.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblClientes.getColumnModel().getColumn(4).setPreferredWidth(150);
            tblClientes.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        pnlClientes.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 1050, 406));
        pnlClientes.add(txtTotalClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 500, 100, -1));
        pnlClientes.add(txtDocumentoClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 250, -1));

        lblDocumentoClientes.setText("DNI/RUC");
        pnlClientes.add(lblDocumentoClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 100, -1));

        tbdpnlSistema.addTab("Clientes", pnlClientes);

        pnlProductos.setBackground(new java.awt.Color(245, 222, 179));
        pnlProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreProductos.setText("Nombre del Producto:");
        pnlProductos.add(lblNombreProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 424, 250, -1));
        pnlProductos.add(txtNombreProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 446, 250, -1));

        lblPrecioProductos.setText("Precio Unitario:");
        pnlProductos.add(lblPrecioProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 576, 100, -1));
        pnlProductos.add(txtPrecioProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 598, 100, -1));

        lblDescripcionProductos.setText("Descripción del Producto:");
        pnlProductos.add(lblDescripcionProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 474, 250, -1));
        pnlProductos.add(txtDescripcionProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 496, 250, -1));

        btnGuardarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/agregar.png"))); // NOI18N
        btnGuardarProductos.setText("Agregar");
        btnGuardarProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        pnlProductos.add(btnGuardarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 474, 114, -1));

        btnEliminarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eliminar.png"))); // NOI18N
        btnEliminarProductos.setText("Eliminar");
        btnEliminarProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        pnlProductos.add(btnEliminarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 531, 114, -1));

        btnEditarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editar.png"))); // NOI18N
        btnEditarProductos.setText("Editar");
        btnEditarProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        pnlProductos.add(btnEditarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 474, 118, -1));

        btnExcelProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/excel.png"))); // NOI18N
        btnExcelProductos.setText("Exportar");
        btnExcelProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        pnlProductos.add(btnExcelProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 531, 118, -1));

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "ID_Producto", "Nombre del Producto", "Categoría", "Precio Unitario", "Descripción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblProductos);
        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(0).setPreferredWidth(1);
            tblProductos.getColumnModel().getColumn(1).setPreferredWidth(5);
            tblProductos.getColumnModel().getColumn(2).setPreferredWidth(200);
            tblProductos.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblProductos.getColumnModel().getColumn(4).setPreferredWidth(50);
            tblProductos.getColumnModel().getColumn(5).setPreferredWidth(300);
        }

        pnlProductos.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 6, 1061, 344));
        pnlProductos.add(txtCategoriaProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 548, 250, -1));

        lblTotalProductos.setText("Total de Productos:");
        pnlProductos.add(lblTotalProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 371, -1, -1));

        lblCategoriaProductos.setText("Categoría:");
        pnlProductos.add(lblCategoriaProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 526, 250, -1));
        pnlProductos.add(txtTotalProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 368, 100, -1));

        tbdpnlSistema.addTab("Productos", pnlProductos);

        pnlEmpleados.setBackground(new java.awt.Color(245, 222, 179));
        pnlEmpleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreEmpleados.setText("Nombre del Empleado:");
        pnlEmpleados.add(lblNombreEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 250, -1));
        pnlEmpleados.add(txtNombreEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 250, -1));

        lblSalarioEmpleados.setText("Salario:");
        pnlEmpleados.add(lblSalarioEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 100, -1));
        pnlEmpleados.add(txtSalarioEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 100, -1));

        btnGuardarEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/agregar.png"))); // NOI18N
        btnGuardarEmpleados.setText("Agregar");
        btnGuardarEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        pnlEmpleados.add(btnGuardarEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, 114, -1));

        btnEliminarEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eliminar.png"))); // NOI18N
        btnEliminarEmpleados.setText("Eliminar");
        btnEliminarEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        pnlEmpleados.add(btnEliminarEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 480, 114, -1));

        btnEditarEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/editar-persona.png"))); // NOI18N
        btnEditarEmpleados.setText("Editar");
        btnEditarEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        pnlEmpleados.add(btnEditarEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, 118, -1));

        btnExcelEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/excel.png"))); // NOI18N
        btnExcelEmpleados.setText("Exportar");
        btnExcelEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        pnlEmpleados.add(btnExcelEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 480, 118, -1));

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "ID_Cliente", "DNI", "Nombre", "Correo", "Cargo", "Salario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblEmpleados);
        if (tblEmpleados.getColumnModel().getColumnCount() > 0) {
            tblEmpleados.getColumnModel().getColumn(0).setPreferredWidth(1);
            tblEmpleados.getColumnModel().getColumn(1).setPreferredWidth(2);
            tblEmpleados.getColumnModel().getColumn(2).setPreferredWidth(10);
            tblEmpleados.getColumnModel().getColumn(3).setPreferredWidth(200);
            tblEmpleados.getColumnModel().getColumn(4).setPreferredWidth(200);
            tblEmpleados.getColumnModel().getColumn(5).setPreferredWidth(50);
            tblEmpleados.getColumnModel().getColumn(6).setPreferredWidth(10);
        }

        pnlEmpleados.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1070, 344));

        lblTotalEmpleados.setText("Total de Empleados:");
        pnlEmpleados.add(lblTotalEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 371, -1, -1));

        lblCargoEmpleados.setText("Cargo:");
        pnlEmpleados.add(lblCargoEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 140, -1));
        pnlEmpleados.add(txtTotalEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 368, 100, -1));

        lblDniEmpleados.setText("DNI:");
        pnlEmpleados.add(lblDniEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 100, -1));
        pnlEmpleados.add(txtDniEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 100, -1));
        pnlEmpleados.add(txtCorreoEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 250, -1));

        lblCorreoEmpleados.setText("Correo:");
        pnlEmpleados.add(lblCorreoEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 250, -1));

        cbCargoEmpleados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--" }));
        pnlEmpleados.add(cbCargoEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 140, -1));

        tbdpnlSistema.addTab("Proveedores", pnlEmpleados);

        pnlInformacion.setBackground(new java.awt.Color(245, 222, 179));
        pnlInformacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "ID_Venta", "ID_Cliente", "ID_Producto", "Precio Unitario", "Cantidad", "Monto Total", "Fecha", "Metodo de Pago"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblVentas);
        if (tblVentas.getColumnModel().getColumnCount() > 0) {
            tblVentas.getColumnModel().getColumn(0).setPreferredWidth(1);
            tblVentas.getColumnModel().getColumn(1).setPreferredWidth(2);
            tblVentas.getColumnModel().getColumn(2).setPreferredWidth(2);
            tblVentas.getColumnModel().getColumn(3).setPreferredWidth(2);
            tblVentas.getColumnModel().getColumn(4).setPreferredWidth(10);
            tblVentas.getColumnModel().getColumn(5).setPreferredWidth(2);
            tblVentas.getColumnModel().getColumn(6).setPreferredWidth(10);
            tblVentas.getColumnModel().getColumn(7).setPreferredWidth(100);
            tblVentas.getColumnModel().getColumn(8).setPreferredWidth(100);
        }

        pnlInformacion.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 1070, -1));

        seccionBusquedaVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros de Búsqueda"));

        lblIdVentas.setText("ID_Venta:");

        lblClienteVentas.setText("Nombre del Cliente:");

        lblProductoVentas.setText("Nombre del Producto:");

        lblPrecioVentas.setText("Precio Unitario:");

        lblCantidadVentas.setText("Cantidad:");

        lblMontoVentas.setText("Monto Total:");

        lblMetodoPagoVentas.setText("Metodo de Pago:");

        lblFechaVentas.setText("Fecha:");

        lblHoraVentas.setText("Hora:");

        cbMetodoPagoVentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Efectivo", "Tarjeta de Débito", "Tarjeta de Crédito", "Transferencia Bancaria" }));

        jDateChooserVentas.setDateFormatString("yyyy-MM-dd");

        spnHoraVentas.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1729746000000L), null, null, java.util.Calendar.DAY_OF_MONTH));
        spnHoraVentas.setEditor(new javax.swing.JSpinner.DateEditor(spnHoraVentas, "HH:mm:ss"));

        btnPDFVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pdf.png"))); // NOI18N

        javax.swing.GroupLayout seccionBusquedaVentasLayout = new javax.swing.GroupLayout(seccionBusquedaVentas);
        seccionBusquedaVentas.setLayout(seccionBusquedaVentasLayout);
        seccionBusquedaVentasLayout.setHorizontalGroup(
            seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seccionBusquedaVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtIdVentas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(lblIdVentas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtClienteVentas)
                        .addComponent(lblClienteVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                    .addGroup(seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblMetodoPagoVentas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbMetodoPagoVentas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProductoVentas)
                    .addComponent(lblProductoVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jDateChooserVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFechaVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(spnHoraVentas, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrecioVentas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPrecioVentas, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHoraVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seccionBusquedaVentasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCantidadVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCantidadVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMontoVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMontoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(seccionBusquedaVentasLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnPDFVentas)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        seccionBusquedaVentasLayout.setVerticalGroup(
            seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seccionBusquedaVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(seccionBusquedaVentasLayout.createSequentialGroup()
                        .addGroup(seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrecioVentas)
                            .addComponent(lblCantidadVentas)
                            .addComponent(lblMontoVentas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidadVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMontoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(seccionBusquedaVentasLayout.createSequentialGroup()
                        .addGroup(seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdVentas)
                            .addComponent(lblClienteVentas)
                            .addComponent(lblProductoVentas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtClienteVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProductoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seccionBusquedaVentasLayout.createSequentialGroup()
                        .addComponent(lblFechaVentas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooserVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seccionBusquedaVentasLayout.createSequentialGroup()
                            .addComponent(lblMetodoPagoVentas)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbMetodoPagoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(seccionBusquedaVentasLayout.createSequentialGroup()
                            .addComponent(lblHoraVentas)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(spnHoraVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnPDFVentas, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(34, 34, 34))
        );

        pnlInformacion.add(seccionBusquedaVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1070, -1));

        tbdpnlSistema.addTab("Ventas", pnlInformacion);

        pnlConfiguracion.setBackground(new java.awt.Color(245, 222, 179));
        pnlConfiguracion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardarConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/guardar.png"))); // NOI18N
        btnGuardarConfiguracion.setText("Guardar");
        btnGuardarConfiguracion.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        pnlConfiguracion.add(btnGuardarConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 612, 114, -1));

        lblRucConfiguracion.setText("RUC:");
        pnlConfiguracion.add(lblRucConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 84, 250, -1));

        lblRazonSocialConfiguracion.setText("Razón Social:");
        pnlConfiguracion.add(lblRazonSocialConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 146, 250, -1));

        lblNombreConfiguracion.setText("Nombre:");
        pnlConfiguracion.add(lblNombreConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 208, 250, -1));

        lblDireccionConfiguracion.setText("Dirección:");
        pnlConfiguracion.add(lblDireccionConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 270, 250, -1));

        lblTelefonoConfiguracion.setText("Teléfono:");
        pnlConfiguracion.add(lblTelefonoConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 332, 250, -1));
        pnlConfiguracion.add(txtRucConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 106, 250, -1));
        pnlConfiguracion.add(txtRazonSocialConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 168, 250, -1));
        pnlConfiguracion.add(txtNombreConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 230, 250, -1));
        pnlConfiguracion.add(txtDireccionConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 292, 250, -1));
        pnlConfiguracion.add(txtTelefonoConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 354, 250, -1));

        tbdpnlSistema.addTab("Configuración", pnlConfiguracion);

        getContentPane().add(tbdpnlSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 1190, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVentaActionPerformed
        tbdpnlSistema.setSelectedIndex(0);
        desenfocarBotonesNavegacion();
        enfocarBotonNavegacion(btnRegistrarVenta);
    }//GEN-LAST:event_btnRegistrarVentaActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        tbdpnlSistema.setSelectedIndex(1);
        desenfocarBotonesNavegacion();
        enfocarBotonNavegacion(btnClientes);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        tbdpnlSistema.setSelectedIndex(2);
        desenfocarBotonesNavegacion();
        enfocarBotonNavegacion(btnProductos);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        tbdpnlSistema.setSelectedIndex(3);
        desenfocarBotonesNavegacion();
        enfocarBotonNavegacion(btnEmpleados);
    }//GEN-LAST:event_btnEmpleadosActionPerformed

     private void btnInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionActionPerformed
        tbdpnlSistema.setSelectedIndex(4);
        desenfocarBotonesNavegacion();
        enfocarBotonNavegacion(btnInformacion);
    }//GEN-LAST:event_btnInformacionActionPerformed
    
    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        tbdpnlSistema.setSelectedIndex(5);
        desenfocarBotonesNavegacion();
        enfocarBotonNavegacion(btnConfiguracion);
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int opcionSeleccionada = JOptionPane.showOptionDialog(this, "¿Estas seguro de salir?",
            "Mensaje de Confirmación",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null, null, null);
        if (opcionSeleccionada == 0) System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void initMethods() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        tbdpnlSistema.setUI(null);
        enfocarBotonNavegacion(btnRegistrarVenta);
    }
    
    private void desenfocarBotonesNavegacion() {
        btnRegistrarVenta.setBackground(btnBgColor);
        btnClientes.setBackground(btnBgColor);
        btnInformacion.setBackground(btnBgColor);
        btnProductos.setBackground(btnBgColor);
        btnEmpleados.setBackground(btnBgColor);
        btnConfiguracion.setBackground(btnBgColor);
    }
    
    private void enfocarBotonNavegacion(javax.swing.JButton jb){
        jb.setBackground(btnBgColorFocused);
    }
    
    private void initSession(String sesion) {
        switch (sesion) {
            case "Administración" -> {
                initAdmin();
            }
            case "Vendedor" -> {
                initVendedor();
            }
            default -> throw new AssertionError();
        }
    }
    
    private void initAdmin() {
        cargarProductos(cbProductoRegistrarVenta);
        cargarMetodosPago(cbMetodoPagoRegistrarVenta);
    }
    
    private void initVendedor() {
        btnClientes.setVisible(false);
        btnInformacion.setVisible(false);
        btnProductos.setVisible(false);
        btnEmpleados.setVisible(false);
        btnConfiguracion.setVisible(false);
        
        cargarProductos(cbProductoRegistrarVenta);
        cargarMetodosPago(cbMetodoPagoRegistrarVenta);
    }
    
    private void cargarProductos(javax.swing.JComboBox<String> cb) {
        javax.swing.DefaultComboBoxModel<String> modelo = new javax.swing.DefaultComboBoxModel<>();
        modelo.addElement("--Seleccionar--");
        
        var productos = controlador.ControladorProducto.obtenerNombres();
        Collections.sort(productos);
        
        for (String e : productos) {
            modelo.addElement(e);
        }
        cb.setModel(modelo);
    }
    
    private void cargarMetodosPago(javax.swing.JComboBox<String> cb) {
        javax.swing.DefaultComboBoxModel<String> modelo = new javax.swing.DefaultComboBoxModel<>();
        modelo.addElement("--Seleccionar--");
        
        var metodosPago = controlador.ControladorMetodoPago.obtenerNombres();
        Collections.sort(metodosPago);
        
        for (String e : metodosPago) {
            modelo.addElement(e);
        }
        cb.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarRegistrarVenta;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnEditarClientes;
    private javax.swing.JButton btnEditarEmpleados;
    private javax.swing.JButton btnEditarProductos;
    private javax.swing.JButton btnEliminarClientes;
    private javax.swing.JButton btnEliminarEmpleados;
    private javax.swing.JButton btnEliminarProductos;
    private javax.swing.JButton btnEliminarRegistrarVenta;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnExcelEmpleados;
    private javax.swing.JButton btnExcelProductos;
    private javax.swing.JButton btnGuardarClientes;
    private javax.swing.JButton btnGuardarConfiguracion;
    private javax.swing.JButton btnGuardarEmpleados;
    private javax.swing.JButton btnGuardarProductos;
    private javax.swing.JButton btnImprimirRegistrarVenta;
    private javax.swing.JButton btnInformacion;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnPDFVentas;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnRegistrarRegistrarVenta;
    private javax.swing.JButton btnRegistrarVenta;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbCargoEmpleados;
    private javax.swing.JComboBox<String> cbMetodoPagoRegistrarVenta;
    private javax.swing.JComboBox<String> cbMetodoPagoVentas;
    private javax.swing.JComboBox<String> cbProductoRegistrarVenta;
    private com.toedter.calendar.JDateChooser jDateChooserVentas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblCantidadRegistrarVenta;
    private javax.swing.JLabel lblCantidadVentas;
    private javax.swing.JLabel lblCargoEmpleados;
    private javax.swing.JLabel lblCategoriaProductos;
    private javax.swing.JLabel lblClienteVentas;
    private javax.swing.JLabel lblCorreoClientes;
    private javax.swing.JLabel lblCorreoEmpleados;
    private javax.swing.JLabel lblCorreoRegistrarVenta;
    private javax.swing.JLabel lblDescripcionProductos;
    private javax.swing.JLabel lblDireccionConfiguracion;
    private javax.swing.JLabel lblDniEmpleados;
    private javax.swing.JLabel lblDocumentoClientes;
    private javax.swing.JLabel lblFechaVentas;
    private javax.swing.JLabel lblHoraVentas;
    private javax.swing.JLabel lblIdDocRegistrarVenta;
    private javax.swing.JLabel lblIdVentas;
    private javax.swing.JLabel lblMetodoPagoRegistrarVenta;
    private javax.swing.JLabel lblMetodoPagoVentas;
    private javax.swing.JLabel lblMontoVentas;
    private javax.swing.JLabel lblNombreClientes;
    private javax.swing.JLabel lblNombreConfiguracion;
    private javax.swing.JLabel lblNombreEmpleados;
    private javax.swing.JLabel lblNombreProductos;
    private javax.swing.JLabel lblNombreRegistrarVenta;
    private javax.swing.JLabel lblPrecioProductos;
    private javax.swing.JLabel lblPrecioVentas;
    private javax.swing.JLabel lblProductoRegistrarVenta;
    private javax.swing.JLabel lblProductoVentas;
    private javax.swing.JLabel lblRazonSocialConfiguracion;
    private javax.swing.JLabel lblRucConfiguracion;
    private javax.swing.JLabel lblSalarioEmpleados;
    private javax.swing.JLabel lblTelefonoClientes;
    private javax.swing.JLabel lblTelefonoConfiguracion;
    private javax.swing.JLabel lblTelefonoRegistrarVenta;
    private javax.swing.JLabel lblTotalClientes;
    private javax.swing.JLabel lblTotalEmpleados;
    private javax.swing.JLabel lblTotalProductos;
    private javax.swing.JLabel lblTotalRegistrarVenta;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel pnlClientes;
    private javax.swing.JPanel pnlConfiguracion;
    private javax.swing.JPanel pnlEmpleados;
    private javax.swing.JPanel pnlInformacion;
    private javax.swing.JPanel pnlNavBar;
    private javax.swing.JPanel pnlProductos;
    private javax.swing.JPanel pnlRegistrarVenta;
    private javax.swing.JPanel seccionBusquedaVentas;
    private javax.swing.JPanel seccionClienteRegistrarVenta;
    private javax.swing.JPanel seccionProductoRegistrarVenta;
    private javax.swing.JSpinner spnHoraVentas;
    private javax.swing.JTabbedPane tbdpnlSistema;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTable tblRegistrarVenta;
    private javax.swing.JTable tblVentas;
    private javax.swing.JTextField txtCantidadRegistrarVenta;
    private javax.swing.JTextField txtCantidadVentas;
    private javax.swing.JTextField txtCategoriaProductos;
    private javax.swing.JTextField txtClienteVentas;
    private javax.swing.JTextField txtCorreoClientes;
    private javax.swing.JTextField txtCorreoEmpleados;
    private javax.swing.JTextField txtCorreoRegistrarVenta;
    private javax.swing.JTextField txtDescripcionProductos;
    private javax.swing.JTextField txtDireccionConfiguracion;
    private javax.swing.JTextField txtDniEmpleados;
    private javax.swing.JTextField txtDocumentoClientes;
    private javax.swing.JTextField txtIdDocRegistrarVenta;
    private javax.swing.JTextField txtIdVentas;
    private javax.swing.JTextField txtMontoVentas;
    private javax.swing.JTextField txtNombreClientes;
    private javax.swing.JTextField txtNombreConfiguracion;
    private javax.swing.JTextField txtNombreEmpleados;
    private javax.swing.JTextField txtNombreProductos;
    private javax.swing.JTextField txtNombreRegistrarVenta;
    private javax.swing.JTextField txtPrecioProductos;
    private javax.swing.JTextField txtPrecioVentas;
    private javax.swing.JTextField txtProductoVentas;
    private javax.swing.JTextField txtRazonSocialConfiguracion;
    private javax.swing.JTextField txtRucConfiguracion;
    private javax.swing.JTextField txtSalarioEmpleados;
    private javax.swing.JTextField txtTelefonoClientes;
    private javax.swing.JTextField txtTelefonoConfiguracion;
    private javax.swing.JTextField txtTelefonoRegistrarVenta;
    private javax.swing.JTextField txtTotalClientes;
    private javax.swing.JTextField txtTotalEmpleados;
    private javax.swing.JTextField txtTotalProductos;
    private javax.swing.JTextField txtTotalRegistrarVenta;
    // End of variables declaration//GEN-END:variables
}
