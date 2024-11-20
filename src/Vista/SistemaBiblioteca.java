/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.Prestamo;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author benja
 */
public class SistemaBiblioteca extends javax.swing.JFrame {

    /**
     * Creates new form SistemaBiblioteca
     */
    public SistemaBiblioteca() {
        initComponents();
        InitContent();
    }
    
    private void InitContent(){
        ShowJPanel (new Principal());
}
    private void ShowJPanel(JPanel p){ 
        
        p.setSize(750,430);
        p.setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(p, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        nombreSistema = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jbtn_principal = new javax.swing.JButton();
        jbtn_devoluciones = new javax.swing.JButton();
        jbtn_prestamos = new javax.swing.JButton();
        jbtn_usuarios = new javax.swing.JButton();
        jbtn_libros = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1156, 704));

        background.setBackground(new java.awt.Color(255, 255, 255));

        menu.setBackground(new java.awt.Color(13, 71, 161));
        menu.setPreferredSize(new java.awt.Dimension(270, 431));

        nombreSistema.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nombreSistema.setForeground(new java.awt.Color(255, 255, 255));
        nombreSistema.setText("Sistema Biblioteca");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jbtn_principal.setBackground(new java.awt.Color(21, 101, 192));
        jbtn_principal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn_principal.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_principal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home-outline.png"))); // NOI18N
        jbtn_principal.setText("Principal");
        jbtn_principal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(0, 0, 0)));
        jbtn_principal.setBorderPainted(false);
        jbtn_principal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_principal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtn_principal.setIconTextGap(10);
        jbtn_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_principalActionPerformed(evt);
            }
        });

        jbtn_devoluciones.setBackground(new java.awt.Color(21, 101, 192));
        jbtn_devoluciones.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn_devoluciones.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_devoluciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendar-multiple-check.png"))); // NOI18N
        jbtn_devoluciones.setText("Devoluciones");
        jbtn_devoluciones.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(0, 0, 0)));
        jbtn_devoluciones.setBorderPainted(false);
        jbtn_devoluciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_devoluciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtn_devoluciones.setIconTextGap(10);
        jbtn_devoluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_devolucionesActionPerformed(evt);
            }
        });

        jbtn_prestamos.setBackground(new java.awt.Color(21, 101, 192));
        jbtn_prestamos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn_prestamos.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_prestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendar-plus.png"))); // NOI18N
        jbtn_prestamos.setText("Préstamos");
        jbtn_prestamos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(0, 0, 0)));
        jbtn_prestamos.setBorderPainted(false);
        jbtn_prestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_prestamos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtn_prestamos.setIconTextGap(10);
        jbtn_prestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_prestamosActionPerformed(evt);
            }
        });

        jbtn_usuarios.setBackground(new java.awt.Color(21, 101, 192));
        jbtn_usuarios.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn_usuarios.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/account-multiple.png"))); // NOI18N
        jbtn_usuarios.setText("Usuarios");
        jbtn_usuarios.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(0, 0, 0)));
        jbtn_usuarios.setBorderPainted(false);
        jbtn_usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_usuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtn_usuarios.setIconTextGap(10);
        jbtn_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_usuariosActionPerformed(evt);
            }
        });

        jbtn_libros.setBackground(new java.awt.Color(21, 101, 192));
        jbtn_libros.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtn_libros.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_libros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/book-open-page-variant.png"))); // NOI18N
        jbtn_libros.setText("Libros");
        jbtn_libros.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 15, 1, 1, new java.awt.Color(0, 0, 0)));
        jbtn_libros.setBorderPainted(false);
        jbtn_libros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtn_libros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtn_libros.setIconTextGap(10);
        jbtn_libros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_librosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(nombreSistema))
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jbtn_libros, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jbtn_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jbtn_devoluciones, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jbtn_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jbtn_prestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(nombreSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jbtn_libros, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jbtn_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jbtn_devoluciones, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtn_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jbtn_prestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85))
        );

        header.setBackground(new java.awt.Color(25, 118, 210));
        header.setPreferredSize(new java.awt.Dimension(750, 150));

        Titulo.setBackground(new java.awt.Color(255, 255, 255));
        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Administración/Control/Biblioteca");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        contenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 874, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_principalActionPerformed
        ShowJPanel (new Principal());
    }//GEN-LAST:event_jbtn_principalActionPerformed

    private void jbtn_prestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_prestamosActionPerformed
        ShowJPanel (new Prestamos());
    }//GEN-LAST:event_jbtn_prestamosActionPerformed

    private void jbtn_devolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_devolucionesActionPerformed
        ShowJPanel (new Devolucion());
    }//GEN-LAST:event_jbtn_devolucionesActionPerformed

    private void jbtn_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_usuariosActionPerformed
        ShowJPanel (new Usuarios());
    }//GEN-LAST:event_jbtn_usuariosActionPerformed

    private void jbtn_librosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_librosActionPerformed
       ShowJPanel (new Libros());
    }//GEN-LAST:event_jbtn_librosActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(SistemaBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaBiblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel background;
    private javax.swing.JPanel contenido;
    private javax.swing.JPanel header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtn_devoluciones;
    private javax.swing.JButton jbtn_libros;
    private javax.swing.JButton jbtn_prestamos;
    private javax.swing.JButton jbtn_principal;
    private javax.swing.JButton jbtn_usuarios;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel nombreSistema;
    // End of variables declaration//GEN-END:variables
}
