/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

/**
 *
 * @author 23.01425-3
 */
public class TelaAdministradorQuestoes extends javax.swing.JFrame {

    /**
     * Creates new form telaAdministradorInicial
     */
    public TelaAdministradorQuestoes() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        excluirQuestoesButton = new javax.swing.JButton();
        cadastrarQuestoesButton1 = new javax.swing.JButton();
        atualizarQuestoesButton1 = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();
        telaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        excluirQuestoesButton.setBackground(new java.awt.Color(0, 23, 103));
        excluirQuestoesButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        excluirQuestoesButton.setForeground(new java.awt.Color(255, 255, 255));
        excluirQuestoesButton.setText("excluir questões");
        excluirQuestoesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        excluirQuestoesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirQuestoesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(excluirQuestoesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 210, 60));

        cadastrarQuestoesButton1.setBackground(new java.awt.Color(0, 23, 103));
        cadastrarQuestoesButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cadastrarQuestoesButton1.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarQuestoesButton1.setText("cadastrar questões");
        cadastrarQuestoesButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrarQuestoesButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarQuestoesButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrarQuestoesButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 210, 60));

        atualizarQuestoesButton1.setBackground(new java.awt.Color(0, 23, 103));
        atualizarQuestoesButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        atualizarQuestoesButton1.setForeground(new java.awt.Color(255, 255, 255));
        atualizarQuestoesButton1.setText("atualizar questões");
        atualizarQuestoesButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atualizarQuestoesButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarQuestoesButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(atualizarQuestoesButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 210, 60));

        voltarButton.setBackground(new java.awt.Color(0, 23, 103));
        voltarButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        voltarButton.setForeground(new java.awt.Color(255, 255, 255));
        voltarButton.setText("voltar");
        voltarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(voltarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 500, 110, 40));

        telaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/telaInicialAdministradorImage.png"))); // NOI18N
        getContentPane().add(telaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void excluirQuestoesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirQuestoesButtonActionPerformed
        var telaAdministradorExcQuestao = new TelaAdministradorExcQuestao();
        telaAdministradorExcQuestao.setVisible(true);
        dispose();
    }//GEN-LAST:event_excluirQuestoesButtonActionPerformed

    private void cadastrarQuestoesButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarQuestoesButton1ActionPerformed
        var telaAdministradorCadQuest = new TelaAdministradorCadQuest();
        telaAdministradorCadQuest.setVisible(true);
        dispose();
    }//GEN-LAST:event_cadastrarQuestoesButton1ActionPerformed

    private void atualizarQuestoesButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarQuestoesButton1ActionPerformed
        var telaAdministradorAtuQuest = new TelaAdministradorAtuQuest();
        telaAdministradorAtuQuest.setVisible(true);
        dispose();
    }//GEN-LAST:event_atualizarQuestoesButton1ActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        var telaAdminInicial = new TelaAdministradorInicial();
        telaAdminInicial.setVisible(true);
        dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdministradorQuestoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdministradorQuestoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdministradorQuestoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdministradorQuestoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdministradorQuestoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarQuestoesButton1;
    private javax.swing.JButton cadastrarQuestoesButton1;
    private javax.swing.JButton excluirQuestoesButton;
    private javax.swing.JLabel telaLabel;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}