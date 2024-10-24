package vista;
import java.awt.Color;
import javax.swing.JButton;
public class Principal extends javax.swing.JFrame {
    Color btnBgColor = Color.decode("#FAD15E");
    Color btnBgColorFocused = Color.decode("#F14737");
    public Principal() {
        initComponents();
        tbdpnlSistema.setUI(null);
        enfocarBotonNavegacion(btnRegistrarVenta);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlNavBar = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        btnRegistrarVenta = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
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
        pnlVentas = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblVentas = new javax.swing.JTable();
        btnPDFVentas = new javax.swing.JButton();
        seccionBusquedaVentas = new javax.swing.JPanel();
        lblIdVentas = new javax.swing.JLabel();
        lblClienteVentas = new javax.swing.JLabel();
        lblProductoVentas = new javax.swing.JLabel();
        lblFechaVentas = new javax.swing.JLabel();
        lblPrecioVentas = new javax.swing.JLabel();
        lblCantidadVentas = new javax.swing.JLabel();
        lblMontoVentas = new javax.swing.JLabel();
        lblMetodoPagoVentas = new javax.swing.JLabel();
        txtClienteVentas = new javax.swing.JTextField();
        txtIdVentas = new javax.swing.JTextField();
        txtProductoVentas = new javax.swing.JTextField();
        txtPrecioVentas = new javax.swing.JTextField();
        txtCantidadVentas = new javax.swing.JTextField();
        txtMontoVentas = new javax.swing.JTextField();
        cbMetodoPagoVentas = new javax.swing.JComboBox<>();
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
        txtCargoEmpleados = new javax.swing.JTextField();
        lblTotalEmpleados = new javax.swing.JLabel();
        lblCargoEmpleados = new javax.swing.JLabel();
        txtTotalEmpleados = new javax.swing.JTextField();
        lblDniEmpleados = new javax.swing.JLabel();
        txtDniEmpleados = new javax.swing.JTextField();
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
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlNavBar.setBackground(new java.awt.Color(85, 28, 24));
        pnlNavBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/logo.png"))); // NOI18N
        pnlNavBar.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        btnVentas.setBackground(new java.awt.Color(250, 209, 94));
        btnVentas.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(0, 0, 0));
        btnVentas.setText("Ventas");
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        pnlNavBar.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 378, 188, 62));

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
        pnlNavBar.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 458, 188, 62));

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
        pnlNavBar.add(btnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 538, 188, 62));

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

        seccionProductoRegistrarVenta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        btnEliminarRegistrarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/eliminar.png"))); // NOI18N
        btnEliminarRegistrarVenta.setText("Eliminar");

        lblProductoRegistrarVenta.setText("Producto:");

        cbProductoRegistrarVenta.setEditable(true);
        cbProductoRegistrarVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--" }));

        lblCantidadRegistrarVenta.setText("Cantidad:");

        btnAgregarRegistrarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/agregar.png"))); // NOI18N
        btnAgregarRegistrarVenta.setText("Agregar");

        javax.swing.GroupLayout seccionProductoRegistrarVentaLayout = new javax.swing.GroupLayout(seccionProductoRegistrarVenta);
        seccionProductoRegistrarVenta.setLayout(seccionProductoRegistrarVentaLayout);
        seccionProductoRegistrarVentaLayout.setHorizontalGroup(
            seccionProductoRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seccionProductoRegistrarVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(seccionProductoRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProductoRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbProductoRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(seccionProductoRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCantidadRegistrarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(lblCantidadRegistrarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnAgregarRegistrarVenta)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarRegistrarVenta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        seccionProductoRegistrarVentaLayout.setVerticalGroup(
            seccionProductoRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seccionProductoRegistrarVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(seccionProductoRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarRegistrarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(seccionProductoRegistrarVentaLayout.createSequentialGroup()
                        .addGroup(seccionProductoRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(seccionProductoRegistrarVentaLayout.createSequentialGroup()
                                .addComponent(lblProductoRegistrarVenta)
                                .addGap(4, 4, 4)
                                .addComponent(cbProductoRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(seccionProductoRegistrarVentaLayout.createSequentialGroup()
                                .addComponent(lblCantidadRegistrarVenta)
                                .addGap(4, 4, 4)
                                .addComponent(txtCantidadRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnEliminarRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tblRegistrarVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Producto", "Categoría", "Precio Unitario", "Cantidad", "Monto Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRegistrarVenta);
        if (tblRegistrarVenta.getColumnModel().getColumnCount() > 0) {
            tblRegistrarVenta.getColumnModel().getColumn(0).setPreferredWidth(1);
            tblRegistrarVenta.getColumnModel().getColumn(1).setPreferredWidth(300);
            tblRegistrarVenta.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblRegistrarVenta.getColumnModel().getColumn(3).setPreferredWidth(50);
            tblRegistrarVenta.getColumnModel().getColumn(4).setPreferredWidth(1);
            tblRegistrarVenta.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        lblTotalRegistrarVenta.setText("Total a Pagar:");

        seccionClienteRegistrarVenta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        lblNombreRegistrarVenta.setText("Nombre del Cliente:");

        txtNombreRegistrarVenta.setEditable(false);

        lblCorreoRegistrarVenta.setText("Correo:");

        txtCorreoRegistrarVenta.setEditable(false);

        lblTelefonoRegistrarVenta.setText("Telefono");

        txtTelefonoRegistrarVenta.setEditable(false);

        lblMetodoPagoRegistrarVenta.setText("Método de Pago:");

        cbMetodoPagoRegistrarVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Efectivo", "Tarjeta de Débito", "Tarjeta de Crédito", "Transferencia Bancaria" }));

        javax.swing.GroupLayout seccionClienteRegistrarVentaLayout = new javax.swing.GroupLayout(seccionClienteRegistrarVenta);
        seccionClienteRegistrarVenta.setLayout(seccionClienteRegistrarVentaLayout);
        seccionClienteRegistrarVentaLayout.setHorizontalGroup(
            seccionClienteRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seccionClienteRegistrarVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(seccionClienteRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seccionClienteRegistrarVentaLayout.createSequentialGroup()
                        .addComponent(lblTelefonoRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMetodoPagoRegistrarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(seccionClienteRegistrarVentaLayout.createSequentialGroup()
                        .addGroup(seccionClienteRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(seccionClienteRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCorreoRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreoRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(seccionClienteRegistrarVentaLayout.createSequentialGroup()
                        .addComponent(txtTelefonoRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbMetodoPagoRegistrarVenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        seccionClienteRegistrarVentaLayout.setVerticalGroup(
            seccionClienteRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seccionClienteRegistrarVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(seccionClienteRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seccionClienteRegistrarVentaLayout.createSequentialGroup()
                        .addComponent(lblNombreRegistrarVenta)
                        .addGap(6, 6, 6)
                        .addComponent(txtNombreRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(seccionClienteRegistrarVentaLayout.createSequentialGroup()
                        .addComponent(lblCorreoRegistrarVenta)
                        .addGap(6, 6, 6)
                        .addComponent(txtCorreoRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(seccionClienteRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefonoRegistrarVenta)
                    .addComponent(lblMetodoPagoRegistrarVenta))
                .addGap(6, 6, 6)
                .addGroup(seccionClienteRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonoRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMetodoPagoRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnRegistrarRegistrarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/registrar-venta.png"))); // NOI18N
        btnRegistrarRegistrarVenta.setText("Registrar Venta");

        btnImprimirRegistrarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/imprimir.png"))); // NOI18N
        btnImprimirRegistrarVenta.setText("Imprimir");

        javax.swing.GroupLayout pnlRegistrarVentaLayout = new javax.swing.GroupLayout(pnlRegistrarVenta);
        pnlRegistrarVenta.setLayout(pnlRegistrarVentaLayout);
        pnlRegistrarVentaLayout.setHorizontalGroup(
            pnlRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarVentaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistrarVentaLayout.createSequentialGroup()
                        .addComponent(seccionProductoRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistrarVentaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlRegistrarVentaLayout.createSequentialGroup()
                                .addComponent(seccionClienteRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistrarVentaLayout.createSequentialGroup()
                                        .addComponent(lblTotalRegistrarVenta)
                                        .addGap(9, 9, 9)
                                        .addComponent(txtTotalRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistrarVentaLayout.createSequentialGroup()
                                        .addComponent(btnRegistrarRegistrarVenta)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnImprimirRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(32, 32, 32))))
        );
        pnlRegistrarVentaLayout.setVerticalGroup(
            pnlRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarVentaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(seccionProductoRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblTotalRegistrarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTotalRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrarRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnImprimirRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(seccionClienteRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        tbdpnlSistema.addTab("Registrar Venta", pnlRegistrarVenta);

        pnlClientes.setBackground(new java.awt.Color(245, 222, 179));

        lblNombreClientes.setText("Nombre:");

        lblCorreoClientes.setText("Correo:");

        lblTelefonoClientes.setText("Teléfono");

        btnGuardarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/guardar.png"))); // NOI18N
        btnGuardarClientes.setText("Guardar");
        btnGuardarClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);

        btnEditarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/editar.png"))); // NOI18N
        btnEditarClientes.setText("Editar");
        btnEditarClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);

        btnEliminarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/eliminar.png"))); // NOI18N
        btnEliminarClientes.setText("Eliminar");
        btnEliminarClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);

        lblTotalClientes.setText("Total de Clientes:");

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Nombre", "Correo", "Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblClientes);
        if (tblClientes.getColumnModel().getColumnCount() > 0) {
            tblClientes.getColumnModel().getColumn(0).setPreferredWidth(1);
            tblClientes.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblClientes.getColumnModel().getColumn(2).setPreferredWidth(200);
            tblClientes.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        javax.swing.GroupLayout pnlClientesLayout = new javax.swing.GroupLayout(pnlClientes);
        pnlClientes.setLayout(pnlClientesLayout);
        pnlClientesLayout.setHorizontalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlClientesLayout.createSequentialGroup()
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlClientesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTotalClientes)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotalClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlClientesLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlClientesLayout.createSequentialGroup()
                                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblCorreoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefonoClientes)
                                    .addComponent(lblTelefonoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombreClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorreoClientes)
                                    .addComponent(txtNombreClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(pnlClientesLayout.createSequentialGroup()
                                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnEliminarClientes)
                                    .addGroup(pnlClientesLayout.createSequentialGroup()
                                        .addComponent(btnGuardarClientes)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEditarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34)))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        pnlClientesLayout.setVerticalGroup(
            pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClientesLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlClientesLayout.createSequentialGroup()
                        .addComponent(lblNombreClientes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCorreoClientes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTelefonoClientes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefonoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardarClientes)
                            .addComponent(btnEditarClientes))
                        .addGap(52, 52, 52)
                        .addComponent(btnEliminarClientes))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalClientes)
                    .addComponent(txtTotalClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        tbdpnlSistema.addTab("Clientes", pnlClientes);

        pnlVentas.setBackground(new java.awt.Color(245, 222, 179));

        tblVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "ID Venta", "Cliente", "Producto", "Precio Unitario", "Cantidad", "Monto Total", "Fecha", "Metodo de Pago"
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

        btnPDFVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/pdf.png"))); // NOI18N

        seccionBusquedaVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros de Búsqueda"));

        lblIdVentas.setText("ID Venta:");

        lblClienteVentas.setText("Nombre del Cliente:");

        lblProductoVentas.setText("Nombre del Producto:");

        lblFechaVentas.setText("Fecha:");

        lblPrecioVentas.setText("Precio Unitario:");

        lblCantidadVentas.setText("Cantidad:");

        lblMontoVentas.setText("Monto Total:");

        lblMetodoPagoVentas.setText("Metodo de Pago:");

        cbMetodoPagoVentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccionar--", "Efectivo", "Tarjeta de Débito", "Tarjeta de Crédito", "Transferencia Bancaria" }));

        javax.swing.GroupLayout seccionBusquedaVentasLayout = new javax.swing.GroupLayout(seccionBusquedaVentas);
        seccionBusquedaVentas.setLayout(seccionBusquedaVentasLayout);
        seccionBusquedaVentasLayout.setHorizontalGroup(
            seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seccionBusquedaVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seccionBusquedaVentasLayout.createSequentialGroup()
                        .addGroup(seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(lblIdVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtClienteVentas)
                            .addComponent(lblClienteVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                    .addComponent(lblFechaVentas))
                .addGap(18, 18, 18)
                .addGroup(seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seccionBusquedaVentasLayout.createSequentialGroup()
                        .addGroup(seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProductoVentas)
                            .addComponent(lblProductoVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPrecioVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPrecioVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCantidadVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCantidadVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMontoVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMontoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cbMetodoPagoVentas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMetodoPagoVentas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(seccionBusquedaVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaVentas)
                    .addComponent(lblMetodoPagoVentas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbMetodoPagoVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout pnlVentasLayout = new javax.swing.GroupLayout(pnlVentas);
        pnlVentas.setLayout(pnlVentasLayout);
        pnlVentasLayout.setHorizontalGroup(
            pnlVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVentasLayout.createSequentialGroup()
                .addGap(510, 510, 510)
                .addComponent(btnPDFVentas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seccionBusquedaVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlVentasLayout.setVerticalGroup(
            pnlVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(seccionBusquedaVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnPDFVentas)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        tbdpnlSistema.addTab("Ventas", pnlVentas);

        pnlProductos.setBackground(new java.awt.Color(245, 222, 179));

        lblNombreProductos.setText("Nombre del Producto:");

        lblPrecioProductos.setText("Precio Unitario:");

        lblDescripcionProductos.setText("Descripción del Producto:");

        btnGuardarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/guardar.png"))); // NOI18N
        btnGuardarProductos.setText("Guardar");
        btnGuardarProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);

        btnEliminarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/eliminar.png"))); // NOI18N
        btnEliminarProductos.setText("Eliminar");
        btnEliminarProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);

        btnEditarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/editar.png"))); // NOI18N
        btnEditarProductos.setText("Editar");
        btnEditarProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);

        btnExcelProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/excel.png"))); // NOI18N
        btnExcelProductos.setText("Exportar");
        btnExcelProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Producto", "Categoría", "Precio Unitario", "Descripción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblProductos);
        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(0).setPreferredWidth(1);
            tblProductos.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblProductos.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblProductos.getColumnModel().getColumn(3).setPreferredWidth(50);
            tblProductos.getColumnModel().getColumn(4).setPreferredWidth(400);
        }

        lblTotalProductos.setText("Total de Productos:");

        lblCategoriaProductos.setText("Categoría:");

        javax.swing.GroupLayout pnlProductosLayout = new javax.swing.GroupLayout(pnlProductos);
        pnlProductos.setLayout(pnlProductosLayout);
        pnlProductosLayout.setHorizontalGroup(
            pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProductosLayout.createSequentialGroup()
                .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlProductosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTotalProductos)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotalProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlProductosLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlProductosLayout.createSequentialGroup()
                                .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescripcionProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblPrecioProductos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPrecioProductos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblDescripcionProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNombreProductos)
                                        .addComponent(lblNombreProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(231, 231, 231))
                            .addGroup(pnlProductosLayout.createSequentialGroup()
                                .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCategoriaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCategoriaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnGuardarProductos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEditarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcelProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(248, 248, 248)))
                .addGap(24, 24, 24))
        );
        pnlProductosLayout.setVerticalGroup(
            pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProductosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotalProductos)
                            .addComponent(txtTotalProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProductosLayout.createSequentialGroup()
                                .addComponent(lblCategoriaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCategoriaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProductosLayout.createSequentialGroup()
                                .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEditarProductos)
                                    .addComponent(btnGuardarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnExcelProductos)
                                    .addComponent(btnEliminarProductos))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPrecioProductos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(pnlProductosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(lblNombreProductos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDescripcionProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescripcionProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))))
        );

        tbdpnlSistema.addTab("Productos", pnlProductos);

        pnlEmpleados.setBackground(new java.awt.Color(245, 222, 179));

        lblNombreEmpleados.setText("Nombre del Empleado:");

        lblSalarioEmpleados.setText("Salario:");

        btnGuardarEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/guardar.png"))); // NOI18N
        btnGuardarEmpleados.setText("Guardar");
        btnGuardarEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);

        btnEliminarEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/eliminar.png"))); // NOI18N
        btnEliminarEmpleados.setText("Eliminar");
        btnEliminarEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);

        btnEditarEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/editar.png"))); // NOI18N
        btnEditarEmpleados.setText("Editar");
        btnEditarEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);

        btnExcelEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/excel.png"))); // NOI18N
        btnExcelEmpleados.setText("Exportar");
        btnExcelEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);

        tblEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Producto", "Categoría", "Precio Unitario", "Descripción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblEmpleados);
        if (tblEmpleados.getColumnModel().getColumnCount() > 0) {
            tblEmpleados.getColumnModel().getColumn(0).setPreferredWidth(1);
            tblEmpleados.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblEmpleados.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblEmpleados.getColumnModel().getColumn(3).setPreferredWidth(50);
            tblEmpleados.getColumnModel().getColumn(4).setPreferredWidth(400);
        }

        lblTotalEmpleados.setText("Total de Empleados:");

        lblCargoEmpleados.setText("Cargo:");

        lblDniEmpleados.setText("DNI:");

        javax.swing.GroupLayout pnlEmpleadosLayout = new javax.swing.GroupLayout(pnlEmpleados);
        pnlEmpleados.setLayout(pnlEmpleadosLayout);
        pnlEmpleadosLayout.setHorizontalGroup(
            pnlEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmpleadosLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(pnlEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlEmpleadosLayout.createSequentialGroup()
                        .addGroup(pnlEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                            .addComponent(txtNombreEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblDniEmpleados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDniEmpleados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addGroup(pnlEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblSalarioEmpleados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSalarioEmpleados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCargoEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCargoEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnGuardarEmpleados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEditarEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcelEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(244, 244, 244))
                    .addGroup(pnlEmpleadosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTotalEmpleados)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotalEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
            .addGroup(pnlEmpleadosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        pnlEmpleadosLayout.setVerticalGroup(
            pnlEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalEmpleados)
                    .addComponent(txtTotalEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(lblDniEmpleados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtDniEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEmpleadosLayout.createSequentialGroup()
                        .addComponent(lblNombreEmpleados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCargoEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCargoEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEmpleadosLayout.createSequentialGroup()
                        .addGroup(pnlEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditarEmpleados)
                            .addComponent(btnGuardarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExcelEmpleados)
                            .addComponent(btnEliminarEmpleados))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSalarioEmpleados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSalarioEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        tbdpnlSistema.addTab("Proveedores", pnlEmpleados);

        pnlConfiguracion.setBackground(new java.awt.Color(245, 222, 179));

        btnGuardarConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/guardar.png"))); // NOI18N
        btnGuardarConfiguracion.setText("Guardar");
        btnGuardarConfiguracion.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);

        lblRucConfiguracion.setText("RUC:");

        lblRazonSocialConfiguracion.setText("Razón Social:");

        lblNombreConfiguracion.setText("Nombre:");

        lblDireccionConfiguracion.setText("Dirección:");

        lblTelefonoConfiguracion.setText("Teléfono:");

        javax.swing.GroupLayout pnlConfiguracionLayout = new javax.swing.GroupLayout(pnlConfiguracion);
        pnlConfiguracion.setLayout(pnlConfiguracionLayout);
        pnlConfiguracionLayout.setHorizontalGroup(
            pnlConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfiguracionLayout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(btnGuardarConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addGap(518, 518, 518))
            .addGroup(pnlConfiguracionLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(pnlConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRucConfiguracion)
                    .addComponent(lblRucConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTelefonoConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(lblTelefonoConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRazonSocialConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(txtRazonSocialConfiguracion)
                    .addComponent(lblNombreConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombreConfiguracion)
                    .addComponent(lblDireccionConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDireccionConfiguracion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlConfiguracionLayout.setVerticalGroup(
            pnlConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConfiguracionLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(lblRucConfiguracion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRucConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblRazonSocialConfiguracion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRazonSocialConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNombreConfiguracion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDireccionConfiguracion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDireccionConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTelefonoConfiguracion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefonoConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                .addComponent(btnGuardarConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

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

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        tbdpnlSistema.setSelectedIndex(2);
        desenfocarBotonesNavegacion();
        enfocarBotonNavegacion(btnVentas);
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        tbdpnlSistema.setSelectedIndex(3);
        desenfocarBotonesNavegacion();
        enfocarBotonNavegacion(btnProductos);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        tbdpnlSistema.setSelectedIndex(4);
        desenfocarBotonesNavegacion();
        enfocarBotonNavegacion(btnEmpleados);
    }//GEN-LAST:event_btnEmpleadosActionPerformed
    
    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        tbdpnlSistema.setSelectedIndex(5);
        desenfocarBotonesNavegacion();
        enfocarBotonNavegacion(btnConfiguracion);
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    void desenfocarBotonesNavegacion() {
        btnRegistrarVenta.setBackground(btnBgColor);
        btnClientes.setBackground(btnBgColor);
        btnVentas.setBackground(btnBgColor);
        btnProductos.setBackground(btnBgColor);
        btnEmpleados.setBackground(btnBgColor);
        btnConfiguracion.setBackground(btnBgColor);
    }
    
    void enfocarBotonNavegacion(JButton jb){
        jb.setBackground(btnBgColorFocused);
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
    private javax.swing.JButton btnPDFVentas;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnRegistrarRegistrarVenta;
    private javax.swing.JButton btnRegistrarVenta;
    private javax.swing.JButton btnVentas;
    private javax.swing.JComboBox<String> cbMetodoPagoRegistrarVenta;
    private javax.swing.JComboBox<String> cbMetodoPagoVentas;
    private javax.swing.JComboBox<String> cbProductoRegistrarVenta;
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
    private javax.swing.JLabel lblCorreoRegistrarVenta;
    private javax.swing.JLabel lblDescripcionProductos;
    private javax.swing.JLabel lblDireccionConfiguracion;
    private javax.swing.JLabel lblDniEmpleados;
    private javax.swing.JLabel lblFechaVentas;
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
    private javax.swing.JPanel pnlNavBar;
    private javax.swing.JPanel pnlProductos;
    private javax.swing.JPanel pnlRegistrarVenta;
    private javax.swing.JPanel pnlVentas;
    private javax.swing.JPanel seccionBusquedaVentas;
    private javax.swing.JPanel seccionClienteRegistrarVenta;
    private javax.swing.JPanel seccionProductoRegistrarVenta;
    private javax.swing.JTabbedPane tbdpnlSistema;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblEmpleados;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTable tblRegistrarVenta;
    private javax.swing.JTable tblVentas;
    private javax.swing.JTextField txtCantidadRegistrarVenta;
    private javax.swing.JTextField txtCantidadVentas;
    private javax.swing.JTextField txtCargoEmpleados;
    private javax.swing.JTextField txtCategoriaProductos;
    private javax.swing.JTextField txtClienteVentas;
    private javax.swing.JTextField txtCorreoClientes;
    private javax.swing.JTextField txtCorreoRegistrarVenta;
    private javax.swing.JTextField txtDescripcionProductos;
    private javax.swing.JTextField txtDireccionConfiguracion;
    private javax.swing.JTextField txtDniEmpleados;
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
