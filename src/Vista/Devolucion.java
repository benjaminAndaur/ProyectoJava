
package Vista;

import Controlador.PrestamoControlador;
import Controlador.DevolucionControlador;
import javax.swing.JOptionPane;

/**
 *
 * @author benja
 */
public class Devolucion extends javax.swing.JPanel {

    /**
     * Creates new form Principal
     */
    public Devolucion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        folioUsuariolbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        foliotxt = new javax.swing.JTextField();
        librotxt = new javax.swing.JTextField();
        librolbl = new javax.swing.JLabel();
        devolverbtn = new javax.swing.JToggleButton();
        icono = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(750, 430));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 905));

        Titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Devolucion de Libro");

        folioUsuariolbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        folioUsuariolbl.setForeground(new java.awt.Color(0, 0, 0));
        folioUsuariolbl.setText("Folio usuario");

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        foliotxt.setBackground(new java.awt.Color(255, 255, 255));
        foliotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foliotxtActionPerformed(evt);
            }
        });

        librotxt.setBackground(new java.awt.Color(255, 255, 255));
        librotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                librotxtActionPerformed(evt);
            }
        });

        librolbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        librolbl.setForeground(new java.awt.Color(0, 0, 0));
        librolbl.setText("Libro ID");

        devolverbtn.setBackground(new java.awt.Color(51, 51, 255));
        devolverbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        devolverbtn.setForeground(new java.awt.Color(255, 255, 255));
        devolverbtn.setText("Devolver");
        devolverbtn.setBorderPainted(false);
        devolverbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        devolverbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolverbtnActionPerformed(evt);
            }
        });

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iStock.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(folioUsuariolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(librolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(devolverbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foliotxt, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                    .addComponent(librotxt)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(Titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(folioUsuariolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(foliotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(librolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(librotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(devolverbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(372, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(74, 74, 74))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void librotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_librotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_librotxtActionPerformed

    private void devolverbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolverbtnActionPerformed
        String folioUsuario = foliotxt.getText();
        String idLibro = librotxt.getText();

        if (folioUsuario.isEmpty() || idLibro.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
    }

        try {
            int idUsuario = Integer.parseInt(folioUsuario);
            int idLibroInt = Integer.parseInt(idLibro);

        
        PrestamoControlador controlador = new PrestamoControlador();
        boolean resultado = controlador.devolverPrestamo(idUsuario, idLibroInt);

        // Mostrar el resultado de la operación
        if (resultado) {
            JOptionPane.showMessageDialog(this, "Préstamo devuelto exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Error al devolver el préstamo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Los campos de usuario y libro deben ser numéricos.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_devolverbtnActionPerformed

    private void foliotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foliotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foliotxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JToggleButton devolverbtn;
    private javax.swing.JLabel folioUsuariolbl;
    private javax.swing.JTextField foliotxt;
    private javax.swing.JLabel icono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel librolbl;
    private javax.swing.JTextField librotxt;
    // End of variables declaration//GEN-END:variables
}
