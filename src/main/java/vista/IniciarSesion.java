package vista;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import modelo.dto.EmpleadoDTO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IniciarSesion extends javax.swing.JFrame {
    private static final Logger logger = LogManager.getLogger(IniciarSesion.class);
     
    public IniciarSesion() {
        initComponents();
        initMethod();
        logger.info("Interfaz gráfica cargada y lista.");
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
        btnIngresar = new javax.swing.JButton();
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
        pfPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pfPasswordKeyPressed(evt);
            }
        });
        pnlLogin.add(pfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 200, -1));

        btnIngresar.setBackground(new java.awt.Color(139, 0, 0));
        btnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setMaximumSize(new java.awt.Dimension(209, 51));
        btnIngresar.setMinimumSize(new java.awt.Dimension(209, 51));
        btnIngresar.setPreferredSize(new java.awt.Dimension(209, 51));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        pnlLogin.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 320, 150, 40));

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

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String correo = txtCorreo.getText();
        String password = new String(pfPassword.getPassword());
        logger.info("Intentando iniciar sesión con correo: {}", correo);

        EmpleadoDTO eDTO = controlador.ControladorSesion.autenticarUsuario(correo, password);
        if (eDTO != null) {
            logger.info("Autenticación exitosa para el correo: {}", correo);
            new Principal(eDTO).setVisible(true);
            this.dispose();
        } else {
            logger.error("Error de autenticación: correo o contraseña incorrectos para el correo: {}", correo);
            JOptionPane.showMessageDialog(null, "Correo o contraseña incorrectos.", "Error de autenticación", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int opcionSeleccionada = JOptionPane.showOptionDialog(this, "¿Estas seguro de salir?",
                "Mensaje de Confirmación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.OK_CANCEL_OPTION,
                null, null, null);
        if (opcionSeleccionada == 0) {
            logger.info("El usuario ha cerrado la sesión.");
            System.exit(0);
        } else {
            logger.info("El usuario ha cancelado la salida.");
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            logger.debug("Usuario presionó ENTER o TAB en el campo correo.");
            pfPassword.setText("");
            pfPassword.setForeground(Color.BLACK);
            pfPassword.requestFocus();
        }
    }//GEN-LAST:event_txtCorreoKeyPressed

    private void pfPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {
            logger.debug("Usuario presionó ENTER o TAB en el campo contraseña.");
            btnIngresarActionPerformed(null);
        }
    }//GEN-LAST:event_pfPasswordKeyPressed

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
        logger.debug("Ocultando la contraseña.");
        lblOcultar.setVisible(false);
        lblMostrar.setVisible(true);
    }//GEN-LAST:event_lblOcultarMouseClicked

    private void lblMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMostrarMouseClicked
        logger.debug("Mostrando la contraseña.");
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

    public static void main(String args[]) {
        logger.info("Iniciando la aplicación de inicio de sesión.");
        java.awt.EventQueue.invokeLater(() -> {
            new IniciarSesion().setVisible(true);
        });
    }
    
    private void initMethod() {
        try {
            logger.info("Configurando Look and Feel.");
            for (var info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.error("Error al configurar Look and Feel: ", ex);
        }

        lblOcultar.setVisible(false);
        lblMostrar.setVisible(false);
        pfPassword.setEchoChar((char) 0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnIngresar;
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
