package vista;

import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Empleado;
import modelo.Producto;
import modelo.dto.ClienteDTO;
import modelo.dto.DetalleVentaDTO;
import modelo.dto.EmpleadoDTO;
import modelo.dto.ProductoDTO;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Principal extends javax.swing.JFrame {
    private final Color btnBgColor = Color.decode("#FAD15E");
    private final Color btnBgColorFocused = Color.decode("#F14737");
    DecimalFormat df = new DecimalFormat("#,###.00");
    private final long idEmpleadoSesion;
    private final String rolSesion;
    private static final Logger logger = LogManager.getLogger(Principal.class);
    
    public Principal(EmpleadoDTO eDTO) {
        this.idEmpleadoSesion = eDTO.getId();
        this.rolSesion = eDTO.getRol();
        initComponents();
        initMethods();
        initSession(rolSesion);
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
        btnVerVentas = new javax.swing.JButton();
        btnVerLogs = new javax.swing.JButton();
        lblIDSesion = new javax.swing.JLabel();
        tbdpnlSistema = new javax.swing.JTabbedPane();
        pnlRegistrarVenta = new javax.swing.JPanel();
        seccionProductoRegistrarVenta = new javax.swing.JPanel();
        lblProductoRegistrarVenta = new javax.swing.JLabel();
        cbProductoRegistrarVenta = new javax.swing.JComboBox<>();
        lblCantidadRegistrarVenta = new javax.swing.JLabel();
        txtCantidadRegistrarVenta = new javax.swing.JTextField();
        btnAgregarRegistrarVenta = new javax.swing.JButton();
        btnEliminarTodoRegistrarVenta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistrarVenta = new javax.swing.JTable();
        lblTotalRegistrarVenta = new javax.swing.JLabel();
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
        jScrollPane4 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
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
        lblCategoriaProductos = new javax.swing.JLabel();
        pnlEmpleados = new javax.swing.JPanel();
        lblNombreEmpleados = new javax.swing.JLabel();
        txtNombreEmpleados = new javax.swing.JTextField();
        lblSalarioEmpleados = new javax.swing.JLabel();
        txtSalarioEmpleados = new javax.swing.JTextField();
        btnAgregarEmpleados = new javax.swing.JButton();
        btnEliminarEmpleados = new javax.swing.JButton();
        btnEditarEmpleados = new javax.swing.JButton();
        btnExcelEmpleados = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblEmpleados = new javax.swing.JTable();
        lblCargoEmpleados = new javax.swing.JLabel();
        lblDniEmpleados = new javax.swing.JLabel();
        txtDniEmpleados = new javax.swing.JTextField();
        txtCorreoEmpleados = new javax.swing.JTextField();
        lblCorreoEmpleados = new javax.swing.JLabel();
        cbCargoEmpleados = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cerrar.png"))); // NOI18N
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, 20, 20));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minimizar.png"))); // NOI18N
        btnMinimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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

        btnVerVentas.setBackground(new java.awt.Color(0, 204, 0));
        btnVerVentas.setForeground(new java.awt.Color(0, 0, 0));
        btnVerVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/excel.png"))); // NOI18N
        btnVerVentas.setText("VENTAS");
        btnVerVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerVentasActionPerformed(evt);
            }
        });
        pnlNavBar.add(btnVerVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 180, 60));

        btnVerLogs.setBackground(new java.awt.Color(153, 153, 153));
        btnVerLogs.setForeground(new java.awt.Color(0, 0, 0));
        btnVerLogs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logs.png"))); // NOI18N
        btnVerLogs.setText("LOGS");
        pnlNavBar.add(btnVerLogs, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 180, 60));

        lblIDSesion.setText("ID Sesión:");
        pnlNavBar.add(lblIDSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 690, -1, -1));

        getContentPane().add(pnlNavBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 720));

        tbdpnlSistema.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        pnlRegistrarVenta.setBackground(new java.awt.Color(245, 222, 179));
        pnlRegistrarVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        seccionProductoRegistrarVenta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        seccionProductoRegistrarVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProductoRegistrarVenta.setText("Producto:");
        seccionProductoRegistrarVenta.add(lblProductoRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 24, 214, -1));
        seccionProductoRegistrarVenta.add(cbProductoRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 44, 214, -1));

        lblCantidadRegistrarVenta.setText("Cantidad:");
        seccionProductoRegistrarVenta.add(lblCantidadRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 24, 82, -1));
        seccionProductoRegistrarVenta.add(txtCantidadRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 44, 82, -1));

        btnAgregarRegistrarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/agregar.png"))); // NOI18N
        btnAgregarRegistrarVenta.setText("Agregar");
        btnAgregarRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarRegistrarVentaActionPerformed(evt);
            }
        });
        seccionProductoRegistrarVenta.add(btnAgregarRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 30, -1, 45));

        btnEliminarTodoRegistrarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eliminar.png"))); // NOI18N
        btnEliminarTodoRegistrarVenta.setText("EliminarTodo");
        btnEliminarTodoRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTodoRegistrarVentaActionPerformed(evt);
            }
        });
        seccionProductoRegistrarVenta.add(btnEliminarTodoRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, 45));

        pnlRegistrarVenta.add(seccionProductoRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 620, 90));

        tblRegistrarVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "ID_Producto", "Nombre del Producto", "Categoría", "Precio Unitario", "Cantidad", "Monto Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblRegistrarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegistrarVentaMouseClicked(evt);
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
        pnlRegistrarVenta.add(lblTotalRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 480, 190, 22));

        seccionClienteRegistrarVenta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        seccionClienteRegistrarVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreRegistrarVenta.setText("Nombre del Cliente:");
        seccionClienteRegistrarVenta.add(lblNombreRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 250, -1));
        seccionClienteRegistrarVenta.add(txtNombreRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 250, -1));

        lblCorreoRegistrarVenta.setText("Correo:");
        seccionClienteRegistrarVenta.add(lblCorreoRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 250, -1));
        seccionClienteRegistrarVenta.add(txtCorreoRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 250, -1));

        lblTelefonoRegistrarVenta.setText("Telefono");
        seccionClienteRegistrarVenta.add(lblTelefonoRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 250, -1));
        seccionClienteRegistrarVenta.add(txtTelefonoRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 250, -1));

        lblMetodoPagoRegistrarVenta.setText("Método de Pago:");
        seccionClienteRegistrarVenta.add(lblMetodoPagoRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 250, -1));
        seccionClienteRegistrarVenta.add(cbMetodoPagoRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 250, -1));
        seccionClienteRegistrarVenta.add(txtIdDocRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 250, -1));

        lblIdDocRegistrarVenta.setText("DNI/RUC:");
        seccionClienteRegistrarVenta.add(lblIdDocRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 250, -1));

        pnlRegistrarVenta.add(seccionClienteRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 540, 190));

        btnRegistrarRegistrarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/registrar-venta.png"))); // NOI18N
        btnRegistrarRegistrarVenta.setText("Registrar Venta");
        btnRegistrarRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarRegistrarVentaActionPerformed(evt);
            }
        });
        pnlRegistrarVenta.add(btnRegistrarRegistrarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 580, -1, 44));

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

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "ID_Cliente", "DNI", "Nombre del Cliente", "Correo", "Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblClientes);
        if (tblClientes.getColumnModel().getColumnCount() > 0) {
            tblClientes.getColumnModel().getColumn(0).setPreferredWidth(1);
            tblClientes.getColumnModel().getColumn(1).setPreferredWidth(10);
            tblClientes.getColumnModel().getColumn(2).setPreferredWidth(50);
            tblClientes.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblClientes.getColumnModel().getColumn(4).setPreferredWidth(150);
            tblClientes.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        pnlClientes.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 1050, 406));
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
                java.lang.Integer.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
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
            tblProductos.getColumnModel().getColumn(3).setPreferredWidth(70);
            tblProductos.getColumnModel().getColumn(4).setPreferredWidth(40);
            tblProductos.getColumnModel().getColumn(5).setPreferredWidth(350);
        }

        pnlProductos.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1061, 344));
        pnlProductos.add(txtCategoriaProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 548, 250, -1));

        lblCategoriaProductos.setText("Categoría:");
        pnlProductos.add(lblCategoriaProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 526, 250, -1));

        tbdpnlSistema.addTab("Productos", pnlProductos);

        pnlEmpleados.setBackground(new java.awt.Color(245, 222, 179));
        pnlEmpleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreEmpleados.setText("Nombre del Empleado:");
        pnlEmpleados.add(lblNombreEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 250, -1));
        pnlEmpleados.add(txtNombreEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 250, -1));

        lblSalarioEmpleados.setText("Salario:");
        pnlEmpleados.add(lblSalarioEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 100, -1));
        pnlEmpleados.add(txtSalarioEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 100, -1));

        btnAgregarEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/agregar.png"))); // NOI18N
        btnAgregarEmpleados.setText("Agregar");
        btnAgregarEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnAgregarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpleadosActionPerformed(evt);
            }
        });
        pnlEmpleados.add(btnAgregarEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 630, 114, -1));

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
                "N°", "ID_Empleado", "DNI", "Nombre", "Correo", "Cargo", "Salario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
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

        pnlEmpleados.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1070, 344));

        lblCargoEmpleados.setText("Cargo:");
        pnlEmpleados.add(lblCargoEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 140, -1));

        lblDniEmpleados.setText("DNI:");
        pnlEmpleados.add(lblDniEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 100, -1));
        pnlEmpleados.add(txtDniEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 100, -1));
        pnlEmpleados.add(txtCorreoEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 250, -1));

        lblCorreoEmpleados.setText("Correo:");
        pnlEmpleados.add(lblCorreoEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 250, -1));

        cbCargoEmpleados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--" }));
        pnlEmpleados.add(cbCargoEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 140, -1));

        tbdpnlSistema.addTab("Proveedores", pnlEmpleados);

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

    private void btnAgregarRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarRegistrarVentaActionPerformed
        if(datosProductoRegistrarVentaValidos()) {
            ProductoDTO pDTO = controlador.ControladorProducto.buscarPorNombre(cbProductoRegistrarVenta.getSelectedItem().toString());
            
            double precio = pDTO.getPrecio();
            Integer cantidad = Integer.valueOf(txtCantidadRegistrarVenta.getText());
            
            vista.utilidadesVista.GestorTablas.insertarFila(tblRegistrarVenta, new Object[]{
                tblRegistrarVenta.getRowCount() + 1,
                pDTO.getId(),
                pDTO.getNombre(),
                pDTO.getCategoria(),
                precio,
                cantidad,
                precio * cantidad
            });
            
            vista.utilidadesVista.GestorEntradasUsuario.limpiarCampos(txtCantidadRegistrarVenta);
            lblTotalRegistrarVenta.setText("Total a Pagar: " + df.format(vista.utilidadesVista.GestorTablas.calcularSumaColumna(tblRegistrarVenta, 6)));
        }
    }//GEN-LAST:event_btnAgregarRegistrarVentaActionPerformed

    private void tblRegistrarVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistrarVentaMouseClicked
        if (evt.getClickCount() == 2) {
            vista.utilidadesVista.GestorTablas.eliminarFilaConConfirmacion(tblRegistrarVenta);
        }
    }//GEN-LAST:event_tblRegistrarVentaMouseClicked

    private void btnEliminarTodoRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTodoRegistrarVentaActionPerformed
        vista.utilidadesVista.GestorTablas.vaciarTabla(tblRegistrarVenta);
    }//GEN-LAST:event_btnEliminarTodoRegistrarVentaActionPerformed

    private void btnRegistrarRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarRegistrarVentaActionPerformed
        if (!datosClienteRegistrarVentaValidos()) {
            mostrarAdvertencia("Los datos del cliente no son válidos.");
            logger.warn("Intento de registrar una venta con datos de cliente inválidos.");
            return;
        }

        try {
            logger.info("Iniciando registro de venta para el cliente...");

            // Obtener o insertar cliente
            long idCliente = controlador.ControladorCliente.obtenerOInsertarClienteId(
                new ClienteDTO(
                        txtIdDocRegistrarVenta.getText(),
                        txtNombreRegistrarVenta.getText(),
                        txtCorreoRegistrarVenta.getText(),
                        txtTelefonoRegistrarVenta.getText()
                )
            );

            logger.info("Cliente registrado o encontrado con éxito. ID Cliente: " + idCliente);

            // Obtener productos seleccionados
            List<Long> listaIdProducto = vista.utilidadesVista.GestorTablas.obtenerColumnaLong(tblRegistrarVenta, 1);
            logger.info("Productos seleccionados para la venta: " + listaIdProducto);

            // Registrar las ventas
            boolean errorEnVenta = registrarVentas(listaIdProducto, idCliente);

            if (errorEnVenta) {
                mostrarAdvertencia("Algunas ventas no se pudieron registrar. Verifique los errores en la consola.");
                logger.error("Error al registrar algunas ventas para el cliente ID: " + idCliente);
            } else {
                mostrarExito("Todas las ventas se han registrado con éxito para el cliente ID: " + idCliente);
                logger.info("Todas las ventas registradas con éxito para el cliente ID: " + idCliente);
            }

            // Limpiar datos de la interfaz
            vista.utilidadesVista.GestorTablas.vaciarTabla(tblRegistrarVenta);
            vista.utilidadesVista.GestorEntradasUsuario.limpiarCampos(
                    txtCantidadRegistrarVenta,
                    txtIdDocRegistrarVenta,
                    txtNombreRegistrarVenta,
                    txtCorreoRegistrarVenta,
                    txtTelefonoRegistrarVenta
            );
            vista.utilidadesVista.GestorEntradasUsuario.reiniciarSeleccion(cbProductoRegistrarVenta, cbMetodoPagoRegistrarVenta);

        } catch (Exception ex) {
            mostrarError("Error al registrar la venta: " + ex.getMessage());
            logger.error("Error al registrar la venta: ", ex);  // Registrar el error con el stack trace
        }

        lblTotalRegistrarVenta.setText("Total a Pagar: ");
    }//GEN-LAST:event_btnRegistrarRegistrarVentaActionPerformed

    private void btnVerVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerVentasActionPerformed
        try {
            logger.info("Generando el reporte de ventas...");

            List<Object[]> data = controlador.ControladorVenta.obtenerVentasConDetalles();
            if (data.isEmpty()) {
                logger.warn("No se encontraron ventas para exportar.");
            }

            String[] headers = {
                "id_venta", "id_cliente", "nombre_cliente", "id_empleado", "nombre_empleado",
                "id_producto", "nombre_producto", "precio_unitario", "cantidad", "monto_total", 
                "fecha_hora", "id_metodo_pago"
            };

            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Ventas");

            // Crear fila de encabezados
            Row headerRow = sheet.createRow(0);
            for (int i = 0; i < headers.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(headers[i]);

                CellStyle style = workbook.createCellStyle();
                Font font = workbook.createFont();
                font.setBold(true);
                style.setFont(font);
                cell.setCellStyle(style);
            }

            // Escribe los datos
            for (int i = 0; i < data.size(); i++) {
                Row row = sheet.createRow(i + 1); // Las filas de datos comienzan en la fila 1
                Object[] rowData = data.get(i);
                for (int j = 0; j < rowData.length; j++) {
                    Cell cell = row.createCell(j);
                    if (rowData[j] != null) {
                        if (rowData[j] instanceof Number) {
                            cell.setCellValue(((Number) rowData[j]).doubleValue());
                        } else {
                            cell.setCellValue(rowData[j].toString());
                        }
                    }
                }
            }

            // Autoajusta el tamaño de las columnas
            for (int i = 0; i < headers.length; i++) {
                sheet.autoSizeColumn(i);
            }

            // Crea un archivo temporal para guardar el Excel
            File tempFile = File.createTempFile("ventas", ".xlsx");
            try (FileOutputStream fileOut = new FileOutputStream(tempFile)) {
                workbook.write(fileOut);
            }
            workbook.close();

            // Registrar éxito al generar el archivo
            logger.info("Reporte de ventas generado exitosamente.");

            // Abre el archivo con la aplicación predeterminada del sistema
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(tempFile);
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "No se puede abrir el archivo automáticamente. Archivo temporal: " + tempFile.getAbsolutePath());
            }

            // Elimina el archivo temporal al cerrar la aplicación
            tempFile.deleteOnExit();

        } catch (Exception e) {
            // Registrar el error
            logger.error("Error al generar el archivo Excel.", e);
            // Manejo de excepciones
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error al generar el archivo Excel: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVerVentasActionPerformed

    private void btnAgregarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadosActionPerformed
        if (datosEmpleadoValidos()) {
            Empleado e = new Empleado(0, txtDniEmpleados.getText(), txtNombreEmpleados.getText(), 
                                      txtCorreoEmpleados.getText(), cbCargoEmpleados.getSelectedItem().toString(), 
                                      Double.parseDouble(txtSalarioEmpleados.getText()));
            try {
                controlador.ControladorEmpleado.agregarEmpleado(e);
                cargarEmpleados();
                // Registrar evento exitoso
                logger.info("Empleado agregado exitosamente: {}", e.getNombre());
            } catch (Exception ex) {
                // Registrar error
                logger.error("Error al agregar el empleado: {}", e.getNombre(), ex);
            }
        } else {
            // Registrar cuando los datos del empleado no son válidos
            logger.warn("Intento de agregar un empleado con datos inválidos.");
        }
    }//GEN-LAST:event_btnAgregarEmpleadosActionPerformed

    private void initMethods() {
        // Registrar la ejecución del método
        logger.info("Inicializando el sistema...");

        try {
            // Configuración del Look and Feel
            for (var info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            // Registrar error en caso de excepción
            logger.error("Error al configurar el Look and Feel Nimbus.", ex);
        }

        // Deshabilitar edición en la tabla y otras configuraciones
        try {
            tbdpnlSistema.setUI(null);
            enfocarBotonNavegacion(btnRegistrarVenta);
            vista.utilidadesVista.GestorTablas.deshabilitarEdicion(tblRegistrarVenta);
            lblIDSesion.setText("ID Sesión: " + idEmpleadoSesion);
            
            // Registrar los eventos de carga de datos
            cargarProductos(cbProductoRegistrarVenta);
            cargarMetodosPago(cbMetodoPagoRegistrarVenta);
            cargarClientes();
            cargarEmpleados();
            cargarCargos();
            
            // Registrar éxito en la inicialización
            logger.info("Sistema inicializado exitosamente.");
        } catch (Exception ex) {
            // Registrar error en caso de excepción
            logger.error("Error al inicializar algunos datos en el sistema.", ex);
        }
    }
    
    private void desenfocarBotonesNavegacion() {
        btnRegistrarVenta.setBackground(btnBgColor);
        btnClientes.setBackground(btnBgColor);
        btnProductos.setBackground(btnBgColor);
        btnEmpleados.setBackground(btnBgColor);
    }
    
    private void enfocarBotonNavegacion(javax.swing.JButton jb){
        jb.setBackground(btnBgColorFocused);
    }
    
    private void initSession(String rol) {
        switch (rol) {
            case "Administrador" -> {
                initAdmin();
            }
            case "Vendedor" -> {
                initVendedor();
            }
            default -> {
                System.out.println("Rol no reconocido: " + rol);
            }
        }
    }
    
    private void initAdmin() {
    }
    
    private void initVendedor() {
        btnClientes.setVisible(false);
        btnProductos.setVisible(false);
        btnEmpleados.setVisible(false);
    }
    
    private void mostrarAdvertencia(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
    }

    private void mostrarExito(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }

    private void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    private void cargarProductos(javax.swing.JComboBox<String> cb) {
        javax.swing.DefaultComboBoxModel<String> modelo = new javax.swing.DefaultComboBoxModel<>();
        modelo.addElement("--Seleccionar--");
        
        List<String> productos = controlador.ControladorProducto.obtenerNombresProductosOrdenados();
        
        for (String e : productos) {
            modelo.addElement(e);
        }
        
        cb.setModel(modelo);
        
        List<Producto> l = controlador.ControladorProducto.obtenerProductos();
        
        List<Object[]> datosTabla = new ArrayList<>();
        int i = 1;
        for (Producto p : l) {
            Object[] fila = {
                i++,
                p.getId(),
                p.getNombre(),
                p.getCategoria(),
                p.getPrecio(),
                p.getDescripcion()
            };
            datosTabla.add(fila);
        }
        
        vista.utilidadesVista.GestorTablas.actualizarTabla(tblProductos, datosTabla);
    }
    
    private void cargarMetodosPago(javax.swing.JComboBox<String> cb) {
        javax.swing.DefaultComboBoxModel<String> modelo = new javax.swing.DefaultComboBoxModel<>();
        modelo.addElement("--Seleccionar--");
        
        List<String> metodosPago = controlador.ControladorMetodoPago.obtenerNombresMetodosPago();

        for (String e : metodosPago) {
            modelo.addElement(e);
        }
        
        cb.setModel(modelo);
    }
    
    private boolean registrarVentas(List<Long> listaIdProducto, long idCliente) {
        boolean errorEnVenta = false;

        for (int i = 0; i < listaIdProducto.size(); i++) {
            long idProducto = listaIdProducto.get(i);
            try {
                long idVenta = controlador.ControladorVenta.agregarVenta(idCliente, idEmpleadoSesion, idProducto);
                int idMetodoPago = controlador.ControladorMetodoPago.obtenerIdPorNombre(cbMetodoPagoRegistrarVenta.getSelectedItem().toString());
                double precio = controlador.ControladorProducto.obtenerPrecioPorId(idProducto);
                int cantidad = (int) tblRegistrarVenta.getValueAt(i, 5);

                controlador.ControladorDetalleVenta.agregarDetalleVenta(new DetalleVentaDTO(idVenta, idMetodoPago, precio, cantidad));
            } catch (Exception ventaEx) {
                errorEnVenta = true;
                System.err.println("Error al registrar la venta del producto ID: " + idProducto + " - " + ventaEx.getMessage());
            }
        }
        return errorEnVenta;
    }
    
    private boolean datosProductoRegistrarVentaValidos() {
        return vista.utilidadesVista.ValidadorEntradasUsuario.seleccionCbEsValida(cbProductoRegistrarVenta,"Producto") &&
               vista.utilidadesVista.ValidadorEntradasUsuario.campoCantidadEsValido(txtCantidadRegistrarVenta, "Cantidad");
    }
    
    private boolean datosClienteRegistrarVentaValidos() {
        return vista.utilidadesVista.ValidadorEntradasUsuario.campoDniRucEsValido(txtIdDocRegistrarVenta, "DNI/RUC") &&
               vista.utilidadesVista.ValidadorEntradasUsuario.campoNombrePersonaEsValida(txtNombreRegistrarVenta, "Nombre del Cliente") &&
               vista.utilidadesVista.ValidadorEntradasUsuario.campoCorreoEsValido(txtCorreoRegistrarVenta, "Correo") &&
               vista.utilidadesVista.ValidadorEntradasUsuario.campoTelefonoEsValido(txtTelefonoRegistrarVenta, "Teléfono") &&
               vista.utilidadesVista.ValidadorEntradasUsuario.seleccionCbEsValida(cbMetodoPagoRegistrarVenta, "Método de Pago");
    }
    
    private boolean datosEmpleadoValidos() {
        return vista.utilidadesVista.ValidadorEntradasUsuario.campoDniRucEsValido(txtDniEmpleados, "DNI") &&
               vista.utilidadesVista.ValidadorEntradasUsuario.campoNombrePersonaEsValida(txtNombreEmpleados, "Nombre del Empleado") &&
               vista.utilidadesVista.ValidadorEntradasUsuario.campoCorreoEsValido(txtCorreoEmpleados, "Correo") &&
               vista.utilidadesVista.ValidadorEntradasUsuario.seleccionCbEsValida(cbCargoEmpleados, "Cargo") &&
               vista.utilidadesVista.ValidadorEntradasUsuario.campoCantidadEsValido(txtSalarioEmpleados, "Salario");
    }
    
    private void cargarClientes() {
        List<Cliente> l = controlador.ControladorCliente.obtenerClientes();
        
        List<Object[]> datosTabla = new ArrayList<>();
        int i = 1;
        for (Cliente c : l) {
            Object[] fila = {
                i++,
                c.getId(),
                c.getIdDoc(),
                c.getNombre(),
                c.getCorreo(),
                c.getTelefono()
            };
            datosTabla.add(fila);
        }
        
        vista.utilidadesVista.GestorTablas.actualizarTabla(tblClientes, datosTabla);
    }
    
    private void cargarEmpleados() {
        List<Empleado> l = controlador.ControladorEmpleado.obtenerEmpleados();
        
        List<Object[]> datosTabla = new ArrayList<>();
        int i = 1;
        for (Empleado e : l) {
            Object[] fila = {
                i++,
                e.getId(),
                e.getDni(),
                e.getNombre(),
                e.getCorreo(),
                e.getRol(),
                e.getSalario()
            };
            datosTabla.add(fila);
        }
        
        vista.utilidadesVista.GestorTablas.actualizarTabla(tblEmpleados, datosTabla);
    }
    
    private void cargarCargos() {
        javax.swing.DefaultComboBoxModel<String> modelo = (javax.swing.DefaultComboBoxModel<String>) cbCargoEmpleados.getModel();
        modelo.addElement("Vendedor");
        modelo.addElement("Administrador");    
    }
    
    private void cargarEmpresaDatos() {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEmpleados;
    private javax.swing.JButton btnAgregarRegistrarVenta;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEditarClientes;
    private javax.swing.JButton btnEditarEmpleados;
    private javax.swing.JButton btnEditarProductos;
    private javax.swing.JButton btnEliminarClientes;
    private javax.swing.JButton btnEliminarEmpleados;
    private javax.swing.JButton btnEliminarProductos;
    private javax.swing.JButton btnEliminarTodoRegistrarVenta;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnExcelEmpleados;
    private javax.swing.JButton btnExcelProductos;
    private javax.swing.JButton btnGuardarClientes;
    private javax.swing.JButton btnGuardarProductos;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnRegistrarRegistrarVenta;
    private javax.swing.JButton btnRegistrarVenta;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerLogs;
    private javax.swing.JButton btnVerVentas;
    private javax.swing.JComboBox<String> cbCargoEmpleados;
    private javax.swing.JComboBox<String> cbMetodoPagoRegistrarVenta;
    private javax.swing.JComboBox<String> cbProductoRegistrarVenta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblCantidadRegistrarVenta;
    private javax.swing.JLabel lblCargoEmpleados;
    private javax.swing.JLabel lblCategoriaProductos;
    private javax.swing.JLabel lblCorreoClientes;
    private javax.swing.JLabel lblCorreoEmpleados;
    private javax.swing.JLabel lblCorreoRegistrarVenta;
    private javax.swing.JLabel lblDescripcionProductos;
    private javax.swing.JLabel lblDniEmpleados;
    private javax.swing.JLabel lblDocumentoClientes;
    private javax.swing.JLabel lblIDSesion;
    private javax.swing.JLabel lblIdDocRegistrarVenta;
    private javax.swing.JLabel lblMetodoPagoRegistrarVenta;
    private javax.swing.JLabel lblNombreClientes;
    private javax.swing.JLabel lblNombreEmpleados;
    private javax.swing.JLabel lblNombreProductos;
    private javax.swing.JLabel lblNombreRegistrarVenta;
    private javax.swing.JLabel lblPrecioProductos;
    private javax.swing.JLabel lblProductoRegistrarVenta;
    private javax.swing.JLabel lblSalarioEmpleados;
    private javax.swing.JLabel lblTelefonoClientes;
    private javax.swing.JLabel lblTelefonoRegistrarVenta;
    private javax.swing.JLabel lblTotalRegistrarVenta;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel pnlClientes;
    private javax.swing.JPanel pnlEmpleados;
    private javax.swing.JPanel pnlNavBar;
    private javax.swing.JPanel pnlProductos;
    private javax.swing.JPanel pnlRegistrarVenta;
    private javax.swing.JPanel seccionClienteRegistrarVenta;
    private javax.swing.JPanel seccionProductoRegistrarVenta;
    private javax.swing.JTabbedPane tbdpnlSistema;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTable tblRegistrarVenta;
    private javax.swing.JTextField txtCantidadRegistrarVenta;
    private javax.swing.JTextField txtCategoriaProductos;
    private javax.swing.JTextField txtCorreoClientes;
    private javax.swing.JTextField txtCorreoEmpleados;
    private javax.swing.JTextField txtCorreoRegistrarVenta;
    private javax.swing.JTextField txtDescripcionProductos;
    private javax.swing.JTextField txtDniEmpleados;
    private javax.swing.JTextField txtDocumentoClientes;
    private javax.swing.JTextField txtIdDocRegistrarVenta;
    private javax.swing.JTextField txtNombreClientes;
    private javax.swing.JTextField txtNombreEmpleados;
    private javax.swing.JTextField txtNombreProductos;
    private javax.swing.JTextField txtNombreRegistrarVenta;
    private javax.swing.JTextField txtPrecioProductos;
    private javax.swing.JTextField txtSalarioEmpleados;
    private javax.swing.JTextField txtTelefonoClientes;
    private javax.swing.JTextField txtTelefonoRegistrarVenta;
    // End of variables declaration//GEN-END:variables
}
