/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Connection_MySQL_QuestoesDAO.QuestoesDAO;
import Connection_Questoes.Questoes;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Douglas
 */
public class TelaAdministradorExcQuestao extends javax.swing.JFrame {

    /**
     * Creates new form TelaAdministradorExcQuestao
     */
    public TelaAdministradorExcQuestao() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        excluirQuestaoTextField = new javax.swing.JTextField();
        excluirQuestaoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        excluirQuestaoTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("id da questão a ser excluída"));
        excluirQuestaoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirQuestaoTextFieldActionPerformed(evt);
            }
        });

        excluirQuestaoButton.setText("excluir questão");
        excluirQuestaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirQuestaoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(280, Short.MAX_VALUE)
                .addComponent(excluirQuestaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273))
            .addGroup(layout.createSequentialGroup()
                .addGap(417, 417, 417)
                .addComponent(excluirQuestaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(excluirQuestaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(excluirQuestaoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void excluirQuestaoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirQuestaoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_excluirQuestaoTextFieldActionPerformed

    private void excluirQuestaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirQuestaoButtonActionPerformed
        String id = excluirQuestaoTextField.getText();
        Questoes q = new Questoes(id);
        QuestoesDAO dao = new QuestoesDAO();
        try{
            dao.remover(q);
            if(dao.verificacao(q)){
                 showMessageDialog(null, "Questão removida com sucesso");
            }
            else{
                var administradorQuestoes = new TelaAdministradorQuestoes();
                administradorQuestoes.setVisible(true);
                dispose();
            }
            dao.atualizar(q);
        } 
        catch(Exception e){ 
                showMessageDialog(null, "Tente novamente mais tarde"); 

                System.out.println(e.getMessage()); 

            } 
    }//GEN-LAST:event_excluirQuestaoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdministradorExcQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdministradorExcQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdministradorExcQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdministradorExcQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdministradorExcQuestao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton excluirQuestaoButton;
    private javax.swing.JTextField excluirQuestaoTextField;
    // End of variables declaration//GEN-END:variables
}
