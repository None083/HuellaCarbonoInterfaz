/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package huellacarbono;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

public class HuellaCarbono extends javax.swing.JFrame {
    
    int xMouse;
    int yMouse;
    
    public HuellaCarbono() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Url = new javax.swing.JTextField();
        Calcular = new javax.swing.JButton();
        Bosque = new javax.swing.JLabel();
        BarraSuperior = new javax.swing.JPanel();
        Cerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(77, 143, 141));
        Fondo.setMaximumSize(new java.awt.Dimension(800, 550));
        Fondo.setMinimumSize(new java.awt.Dimension(800, 550));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Url.setBackground(new java.awt.Color(239, 238, 240));
        Url.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Url.setForeground(new java.awt.Color(153, 153, 153));
        Url.setText("Ingresa una dirección web");
        Url.setToolTipText("");
        Url.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        Url.setOpaque(true);
        Url.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UrlMousePressed(evt);
            }
        });
        Url.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UrlActionPerformed(evt);
            }
        });
        Fondo.add(Url, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 360, 40));

        Calcular.setBackground(new java.awt.Color(97, 113, 108));
        Calcular.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Calcular.setForeground(new java.awt.Color(239, 238, 240));
        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });
        Fondo.add(Calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, 40));

        Bosque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/output-onlinepngtools.png"))); // NOI18N
        Bosque.setText("jLabel1");
        Fondo.add(Bosque, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 800, 340));

        BarraSuperior.setBackground(new java.awt.Color(77, 143, 141));
        BarraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraSuperiorMouseDragged(evt);
            }
        });
        BarraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraSuperiorMousePressed(evt);
            }
        });

        Cerrar.setBackground(new java.awt.Color(51, 51, 51));
        Cerrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(239, 238, 240));
        Cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cerrar.setText("x");
        Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BarraSuperiorLayout = new javax.swing.GroupLayout(BarraSuperior);
        BarraSuperior.setLayout(BarraSuperiorLayout);
        BarraSuperiorLayout.setHorizontalGroup(
            BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarraSuperiorLayout.createSequentialGroup()
                .addGap(0, 765, Short.MAX_VALUE)
                .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BarraSuperiorLayout.setVerticalGroup(
            BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraSuperiorLayout.createSequentialGroup()
                .addComponent(Cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        Fondo.add(BarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void UrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UrlActionPerformed
        Url.setMargin(new Insets(10, 10, 10, 10));
    }//GEN-LAST:event_UrlActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CalcularActionPerformed

    private void BarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BarraSuperiorMousePressed

    private void BarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_BarraSuperiorMouseDragged

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarMouseClicked

    private void CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseEntered
        Cerrar.setOpaque(true);
        Cerrar.setBackground(new Color(239, 238, 240));
        Cerrar.setForeground(new Color(77, 143, 141));
    }//GEN-LAST:event_CerrarMouseEntered

    private void CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseExited
        Cerrar.setBackground(new Color(77, 143, 141));
        Cerrar.setForeground(new Color(239, 238, 240));
    }//GEN-LAST:event_CerrarMouseExited

    private void UrlMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UrlMousePressed
        if (Url.getText().equalsIgnoreCase("Ingresa una dirección web")) {
            Url.setText("");
            Url.setForeground(Color.black);
            Url.getInsets().left = 10;
        }

    }//GEN-LAST:event_UrlMousePressed

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
            java.util.logging.Logger.getLogger(HuellaCarbono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HuellaCarbono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HuellaCarbono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HuellaCarbono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HuellaCarbono().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraSuperior;
    private javax.swing.JLabel Bosque;
    private javax.swing.JButton Calcular;
    private javax.swing.JLabel Cerrar;
    private javax.swing.JPanel Fondo;
    private javax.swing.JTextField Url;
    // End of variables declaration//GEN-END:variables
}
