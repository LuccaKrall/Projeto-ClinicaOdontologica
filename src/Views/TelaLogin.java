/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controlador.LoginControlador;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.postgresql.shaded.com.ongres.scram.common.util.TlsServerEndpoint;

public class TelaLogin extends javax.swing.JFrame {

    private final LoginControlador Controlador;

    public TelaLogin() {
        initComponents();
        Controlador=new LoginControlador(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbFuncionario = new javax.swing.JCheckBox();
        cbDentista = new javax.swing.JCheckBox();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Usuario  ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 60, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 204, 255));
        jLabel3.setText("Login");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Senha");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        cbFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbFuncionario.setText("Funcionario");
        cbFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(cbFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        cbDentista.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbDentista.setText("Dentista");
        cbDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDentistaActionPerformed(evt);
            }
        });
        getContentPane().add(cbDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 130, -1));

        txtSenha.setText("jPasswordField1");
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 130, -1));

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/view/dental-checkup.png"))); // NOI18N
        btnLogin.setText("Efetuar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 110, -1));

        btnCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/view/dental-care (1).png"))); // NOI18N
        btnCadastro.setText("Cadastrar");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 110, -1));

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGround/view/freepik-export-20241017150440FluA.jpeg"))); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDentistaActionPerformed
        if(cbDentista.isSelected()){
            cbFuncionario.setSelected(false);
        }    
    }//GEN-LAST:event_cbDentistaActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
       CadastroFuncionarios cadastrar=new CadastroFuncionarios();
       cadastrar.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if(cbDentista.isSelected()){
            try {
            
            if(Controlador.verificarLoginDentista()==true){
                dispose();
            }
            
            } catch (SQLException ex) {
                 Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
            if(cbFuncionario.isSelected()){
                try {
                if( Controlador.verificarLoginFuncionario()==true){
                    dispose();
                }
                
                } catch (SQLException ex) {
                     Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void cbFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFuncionarioActionPerformed
            if(cbFuncionario.isSelected()){
            cbDentista.setSelected(false);
            }  
    }//GEN-LAST:event_cbFuncionarioActionPerformed
   
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox cbDentista;
    private javax.swing.JCheckBox cbFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    public JPasswordField getTxtSenha() {
        return txtSenha;
    }

    public void setTxtSenha(JPasswordField txtSenha) {
        this.txtSenha = txtSenha;
    }

    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(JTextField txtUsuario) {
        this.txtUsuario = txtUsuario;
    }



}
