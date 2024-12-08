package noFuncionales.seguridad;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.dto.EmpleadoDTO;
import vista.Principal;

public class IniciarSesionTest extends javax.swing.JFrame {

    public IniciarSesionTest() {
        initComponents();
        initMethod();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lblMostrar = new javax.swing.JLabel();
        lblOcultar = new javax.swing.JLabel();
        pnlLogin = new javax.swing.JPanel();
        logoIniciarSesion = new javax.swing.JLabel();
        lblIniciarSesion = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        pfPassword = new javax.swing.JPasswordField();
        btnIngresarS = new javax.swing.JButton();
        btnIngresarV = new javax.swing.JButton();
        pnlBackground = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesión");
        setMinimumSize(new java.awt.Dimension(700, 500));
        setName("Iniciar Sesión"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cerrar.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 10, 16, 16));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minimizar.png"))); // NOI18N
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 10, 16, 16));

        lblMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mostrar.png"))); // NOI18N
        lblMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMostrarMouseClicked(evt);
            }
        });
        jLayeredPane1.setLayer(lblMostrar, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(lblMostrar);
        lblMostrar.setBounds(220, 270, 16, 16);

        lblOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ocultar.png"))); // NOI18N
        lblOcultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOcultarMouseClicked(evt);
            }
        });
        jLayeredPane1.setLayer(lblOcultar, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.add(lblOcultar);
        lblOcultar.setBounds(220, 270, 16, 16);

        pnlLogin.setBackground(new java.awt.Color(245, 222, 179));
        pnlLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login-form-logo.png"))); // NOI18N
        pnlLogin.add(logoIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 200, -1));

        lblIniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblIniciarSesion.setForeground(new java.awt.Color(85, 28, 24));
        lblIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIniciarSesion.setText("Iniciar Sesión");
        pnlLogin.add(lblIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 115, 200, -1));

        txtCorreo.setBackground(new java.awt.Color(245, 222, 179));
        txtCorreo.setForeground(new java.awt.Color(199, 166, 75));
        txtCorreo.setText("Ingrese su correo");
        txtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Correo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(85, 28, 24))); // NOI18N
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCorreoKeyPressed(evt);
            }
        });
        pnlLogin.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 200, -1));

        pfPassword.setBackground(new java.awt.Color(245, 222, 179));
        pfPassword.setForeground(new java.awt.Color(199, 166, 75));
        pfPassword.setText("Ingrese su contraseña");
        pfPassword.setToolTipText("");
        pfPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(85, 28, 24))); // NOI18N
        pfPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pfPasswordMousePressed(evt);
            }
        });
        pnlLogin.add(pfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 200, -1));

        btnIngresarS.setBackground(new java.awt.Color(139, 0, 0));
        btnIngresarS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIngresarS.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarS.setText("Ingresar(S)");
        btnIngresarS.setMaximumSize(new java.awt.Dimension(209, 51));
        btnIngresarS.setMinimumSize(new java.awt.Dimension(209, 51));
        btnIngresarS.setPreferredSize(new java.awt.Dimension(209, 51));
        btnIngresarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarSActionPerformed(evt);
            }
        });
        pnlLogin.add(btnIngresarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 110, 40));

        btnIngresarV.setBackground(new java.awt.Color(139, 0, 0));
        btnIngresarV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIngresarV.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarV.setText("Ingresar(V)");
        btnIngresarV.setMaximumSize(new java.awt.Dimension(209, 51));
        btnIngresarV.setMinimumSize(new java.awt.Dimension(209, 51));
        btnIngresarV.setPreferredSize(new java.awt.Dimension(209, 51));
        btnIngresarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarVActionPerformed(evt);
            }
        });
        pnlLogin.add(btnIngresarV, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 110, 40));

        jLayeredPane1.add(pnlLogin);
        pnlLogin.setBounds(0, 0, 300, 400);

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 300, 400));

        pnlBackground.setBackground(new java.awt.Color(85, 28, 24));
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login-logo.png"))); // NOI18N
        pnlBackground.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        getContentPane().add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 500));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login-bg.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 290, 500));

        setSize(new java.awt.Dimension(700, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarSActionPerformed
        EmpleadoDTO eDTO = controlador.ControladorSesion.autenticarUsuario(txtCorreo.getText(), new String(pfPassword.getPassword()));
        if(eDTO != null) {
            new Principal(eDTO).setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Correo o contraseña incorrectos.", "Error de autenticación", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIngresarSActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int opcionSeleccionada = JOptionPane.showOptionDialog(this, "¿Estas seguro de salir?",
                "Mensaje de Confirmación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, null, null);
        if (opcionSeleccionada == 0) System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            pfPassword.setText("");
            pfPassword.setForeground(Color.BLACK);
            pfPassword.requestFocus();
        }
    }//GEN-LAST:event_txtCorreoKeyPressed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void pfPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pfPasswordMousePressed
        if (String.valueOf(pfPassword.getPassword()).equals("Ingrese su contraseña")) {
            pfPassword.setText("");
            pfPassword.setForeground(Color.BLACK);
        }
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Ingrese su correo");
            txtCorreo.setForeground(new Color(199, 166, 75));
        }
        this.lblMostrar.setVisible(true);
    }//GEN-LAST:event_pfPasswordMousePressed

    private void lblOcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOcultarMouseClicked
        lblOcultar.setVisible(false);
        lblMostrar.setVisible(true);
    }//GEN-LAST:event_lblOcultarMouseClicked

    private void lblMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMostrarMouseClicked
        lblMostrar.setVisible(false);
        lblOcultar.setVisible(true);
        pfPassword.setEchoChar((char)0);
    }//GEN-LAST:event_lblMostrarMouseClicked

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed
        if (txtCorreo.getText().equals("Ingrese su correo")) {
            txtCorreo.setText("");
            txtCorreo.setForeground(Color.BLACK);
        }
        if (new String(pfPassword.getPassword()).isEmpty()) {
            pfPassword.setText("Ingrese su contraseña");
            pfPassword.setForeground(new Color(199, 166, 75));
        }
    }//GEN-LAST:event_txtCorreoMousePressed

    private void btnIngresarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarVActionPerformed
        Connection conexion = null;
        Statement statement = null;

        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemaventas?allowMultiQueries=true", "root", "admin");

            statement = conexion.createStatement();
            
            //' OR 1=1; INSERT INTO empleados (dni, nombre, correo, rol, salario) VALUES ('00000000', 'Hacker', 'hacker@exploit.com', 'Administrador', 0); --
            String sql = "SELECT * FROM empleados WHERE correo = '" + txtCorreo.getText() + "' AND dni = '" + new String(pfPassword.getPassword()) + "'";

            System.out.println("Consulta SQL generada: " + sql);

            ResultSet resultado = statement.executeQuery(sql);

            if (resultado.next()) {
                EmpleadoDTO empleado = new EmpleadoDTO(
                    resultado.getLong("id_empleado"),
                    "","","",
                    resultado.getString("rol"),
                    0
                );
                new Principal(empleado).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos.");
        } finally {
            try {
                if (statement != null) statement.close();
                if (conexion != null) conexion.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnIngresarVActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new IniciarSesionTest().setVisible(true);
        });
    }
    
    private void initMethod() {
        try {
            for (var info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesionTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        lblOcultar.setVisible(false);
        lblMostrar.setVisible(false);
        pfPassword.setEchoChar((char)0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnIngresarS;
    private javax.swing.JButton btnIngresarV;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lblIniciarSesion;
    private javax.swing.JLabel lblMostrar;
    private javax.swing.JLabel lblOcultar;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoIniciarSesion;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
