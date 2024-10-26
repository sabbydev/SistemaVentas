package vista;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class IniciarSesion extends javax.swing.JFrame {

    public IniciarSesion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogin = new javax.swing.JPanel();
        logoIniciarSesion = new javax.swing.JLabel();
        lblIniciarSesion = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        pfPassword = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
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

        pnlLogin.setBackground(new java.awt.Color(245, 222, 179));
        pnlLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iniciar-sesion-logo.png"))); // NOI18N
        pnlLogin.add(logoIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 20, 209, -1));

        lblIniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblIniciarSesion.setForeground(new java.awt.Color(85, 28, 24));
        lblIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIniciarSesion.setText("Iniciar Sesión");
        pnlLogin.add(lblIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 106, 209, -1));

        txtCorreo.setBackground(new java.awt.Color(245, 222, 179));
        txtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Correo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(85, 28, 24))); // NOI18N
        txtCorreo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCorreoKeyPressed(evt);
            }
        });
        pnlLogin.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 156, 209, -1));

        pfPassword.setBackground(new java.awt.Color(245, 222, 179));
        pfPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(85, 28, 24))); // NOI18N
        pfPassword.setMargin(new java.awt.Insets(0, 0, 0, 0));
        pfPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pfPasswordKeyPressed(evt);
            }
        });
        pnlLogin.add(pfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 217, 209, -1));

        btnIngresar.setBackground(new java.awt.Color(85, 28, 24));
        btnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        pnlLogin.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 310, 90, 40));

        btnSalir.setBackground(new java.awt.Color(255, 51, 51));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        pnlLogin.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 310, 90, 40));

        getContentPane().add(pnlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 280, 390));

        pnlBackground.setBackground(new java.awt.Color(85, 28, 24));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login-logo.png"))); // NOI18N

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 180, Short.MAX_VALUE))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );

        getContentPane().add(pnlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 500));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login-back.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 340, 500));

        setSize(new java.awt.Dimension(700, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        if(txtCorreo.getText().equals("admin@email.com") && pfPassword.getText().equals("admin")) new Principal().setVisible(true); 
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int opcionSeleccionada = JOptionPane.showOptionDialog(this, "¿Estas seguro de salir?",
                "Mensaje de Confirmación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, null, null);
        if (opcionSeleccionada == 0) System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtCorreoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pfPassword.requestFocus();
        }
    }//GEN-LAST:event_txtCorreoKeyPressed

    private void pfPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnIngresarActionPerformed(null);
        }
    }//GEN-LAST:event_pfPasswordKeyPressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblIniciarSesion;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logoIniciarSesion;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
