/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;
import Jogo.Jogo;

/**
 *
 * @author 23.01425-3
 */
public class TelaJogo17 extends javax.swing.JFrame {

    /**
     * Creates new form TelaJogo
     */
    Jogo jogo = new Jogo();
    String ra;
    
    
    
    public TelaJogo17(){}
    public TelaJogo17(String ra,Jogo jogo) {
        initComponents();
        setLocationRelativeTo(null);
        this.ra = ra;
        this.jogo = jogo;
    }
        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sairButton = new javax.swing.JButton();
        nomeUsuarioLabel = new javax.swing.JLabel();
        aparecidoIconLabel = new javax.swing.JLabel();
        jogarButton = new javax.swing.JButton();
        telaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sairButton.setBackground(new java.awt.Color(16, 31, 53));
        sairButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sairButton.setForeground(new java.awt.Color(255, 255, 255));
        sairButton.setText("sair");
        sairButton.setBorderPainted(false);
        sairButton.setContentAreaFilled(false);
        sairButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });
        getContentPane().add(sairButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1162, 60, 70, 20));

        nomeUsuarioLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nomeUsuarioLabel.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(nomeUsuarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 20, 80, 30));

        aparecidoIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pixil-frame-0__1__Easy-Resize.com-removebg-preview.png"))); // NOI18N
        aparecidoIconLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aparecidoIconLabelMouseClicked(evt);
            }
        });
        getContentPane().add(aparecidoIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 80, -1, -1));

        jogarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jogarButtonImage.png"))); // NOI18N
        jogarButton.setContentAreaFilled(false);
        jogarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jogarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jogarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, 120, 40));

        telaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doska appeared.png"))); // NOI18N
        telaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telaLabelMouseClicked(evt);
            }
        });
        getContentPane().add(telaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        String ra = jogo.getRa();
        var telaGameOver = new TelaGameOver(jogo);
        telaGameOver.setVisible(true);
        dispose();
    }//GEN-LAST:event_sairButtonActionPerformed

    private void jogarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogarButtonActionPerformed
     
        int casaInicial = Integer.parseInt(jogo.getCasaFinal());
        //int posX = jogo.posicaoX(casaInicial);
        //int posY = jogo.posicaoY(casaInicial);
        //aparecidoIconLabel.setLocation(posX, posY);
        int vidas = Integer.parseInt(jogo.getVidas());
            
        var telaQuestao = new TelaQuestao(jogo);
        telaQuestao.setVisible(true);
        dispose();
            
    }//GEN-LAST:event_jogarButtonActionPerformed

    private void telaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telaLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_telaLabelMouseClicked

    private void aparecidoIconLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aparecidoIconLabelMouseClicked

    }//GEN-LAST:event_aparecidoIconLabelMouseClicked

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
            java.util.logging.Logger.getLogger(TelaJogo17.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogo17.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogo17.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogo17.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogo17().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aparecidoIconLabel;
    private javax.swing.JButton jogarButton;
    private javax.swing.JLabel nomeUsuarioLabel;
    private javax.swing.JButton sairButton;
    private javax.swing.JLabel telaLabel;
    // End of variables declaration//GEN-END:variables

}
