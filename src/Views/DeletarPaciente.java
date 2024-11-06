/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controlador.PacienteCrud;
import javax.swing.JTextField;

/**
 *
 * @author pc
 */
public class DeletarPaciente extends javax.swing.JFrame {

    private final PacienteCrud Controlador;
    private ConsultarPaciente view;

    /**
     * Creates new form DeletarPaciente
     */
    public DeletarPaciente() {
        initComponents();
        Controlador=new Controlador.PacienteCrud(view);
        btnCancela.setVisible(false);
        btnConfirmar.setVisible(false);
        txtResumoPaciente.setVisible(false);
        jScrollPane1.setVisible(false);
        lblInfo.setVisible(false);
        lblSucesso.setVisible(false);
        btnMenu.setVisible(false);
        btnNovoDelete.setVisible(false);
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCPF = new javax.swing.JTextField();
        btnDeletar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        btnCancela = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResumoPaciente = new javax.swing.JTextArea();
        lblInfo = new javax.swing.JLabel();
        lblSucesso = new javax.swing.JLabel();
        btnNovoDelete = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnMenuPrincipal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 230, 30));

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 160, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Deletar Paciente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 20));

        lblCPF.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(255, 255, 255));
        lblCPF.setText("CPF Paciente");
        getContentPane().add(lblCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 30));

        btnCancela.setText("Cancelar");
        btnCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancela, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 100, 30));

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 100, 30));

        txtResumoPaciente.setColumns(20);
        txtResumoPaciente.setRows(5);
        txtResumoPaciente.setBorder(null);
        txtResumoPaciente.setDoubleBuffered(true);
        txtResumoPaciente.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(txtResumoPaciente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 230, 170));

        lblInfo.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblInfo.setText("Informações");
        getContentPane().add(lblInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 30));

        lblSucesso.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblSucesso.setForeground(new java.awt.Color(255, 255, 255));
        lblSucesso.setText("Paciente Deletado com Sucesso");
        getContentPane().add(lblSucesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        btnNovoDelete.setText("Novo Delete");
        btnNovoDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovoDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 100, 30));

        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 100, 30));

        btnMenuPrincipal.setText("Menu");
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGround/view/delete.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        btnDeletar.setVisible(false);
        btnCancela.setVisible(true);
        btnConfirmar.setVisible(true);
        txtCPF.setVisible(false);
        jScrollPane1.setVisible(true);
        txtResumoPaciente.setVisible(true);
        lblCPF.setVisible(false);
        String campoBusca=getTxtCPF().getText();
        String resumo= Controlador.BuscarPaciente("SELECT *FROM paciente WHERE idPaciente=?", campoBusca);
        lblInfo.setVisible(true);
        txtResumoPaciente.setText(resumo);
        btnMenuPrincipal.setVisible(false);
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaActionPerformed
        btnCancela.setVisible(false);
        btnConfirmar.setVisible(false);
        btnDeletar.setVisible(true);
        lblCPF.setVisible(true);
        txtCPF.setVisible(true);
        lblInfo.setVisible(false);
        jScrollPane1.setVisible(false);
        txtResumoPaciente.setVisible(false);
        btnMenuPrincipal.setVisible(false);
    }//GEN-LAST:event_btnCancelaActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        lblSucesso.setVisible(true);
        btnMenu.setVisible(true);
        btnNovoDelete.setVisible(true);
        btnCancela.setVisible(false);
        btnConfirmar.setVisible(false);
        lblInfo.setVisible(false);
        txtResumoPaciente.setVisible(false);
        jScrollPane1.setVisible(false);
        String campoBusca=getTxtCPF().getText();
        String x = null;
        String nome=Controlador.DeletarPaciente("DELETE FROM paciente WHERE idPaciente = ?", campoBusca);
        btnMenuPrincipal.setVisible(false);
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnNovoDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoDeleteActionPerformed
        btnCancela.setVisible(false);
        btnConfirmar.setVisible(false);
        btnMenu.setVisible(false);
        btnNovoDelete.setVisible(false);
        btnDeletar.setVisible(true);
        lblSucesso.setVisible(false);
        lblCPF.setVisible(true);
        txtCPF.setVisible(true);
        lblInfo.setVisible(false);
        jScrollPane1.setVisible(false);
        txtResumoPaciente.setVisible(false);
        btnMenuPrincipal.setVisible(false);
    }//GEN-LAST:event_btnNovoDeleteActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        TelaCrudsPacienteAcoes menu=new TelaCrudsPacienteAcoes();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        TelaCrudsPacienteAcoes menu=new TelaCrudsPacienteAcoes();
        menu.setVisible(true);
        dispose();
               
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

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
            java.util.logging.Logger.getLogger(DeletarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeletarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeletarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeletarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeletarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancela;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnNovoDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblSucesso;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextArea txtResumoPaciente;
    // End of variables declaration//GEN-END:variables

    public JTextField getTxtCPF() {
        return txtCPF;
    }

    public void setTxtCPF(JTextField txtCPF) {
        this.txtCPF = txtCPF;
    }

}
