
package Views;



import Controlador.FormularioCadastroControlador;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CadastroFuncionarios extends javax.swing.JFrame {

    private final FormularioCadastroControlador Controlador;

    public CadastroFuncionarios() {
        initComponents();
        Controlador=new Controlador.FormularioCadastroControlador(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCRO = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblEspe = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCRO = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtConfirmaSenha = new javax.swing.JPasswordField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        cbFuncionario = new javax.swing.JCheckBox();
        cbDentista = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        Menu = new javax.swing.JToggleButton();
        txtCPF = new javax.swing.JFormattedTextField();
        txtEspecializacao = new javax.swing.JTextField();
        txtContato = new javax.swing.JFormattedTextField();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("CPF");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        lblCRO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCRO.setText("CRO");
        getContentPane().add(lblCRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Telefone Contato");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        lblEspe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEspe.setText("Especialização");
        getContentPane().add(lblEspe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Nome Completo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Confirmar Senha");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));
        getContentPane().add(txtCRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 180, -1));

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 180, -1));

        txtConfirmaSenha.setText("jPasswordField1");
        txtConfirmaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmaSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtConfirmaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 180, -1));

        txtSenha.setText("jPasswordField1");
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 180, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Senha");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        cbFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbFuncionario.setText("Funcionario");
        cbFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(cbFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        cbDentista.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbDentista.setText("Dentista");
        cbDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDentistaActionPerformed(evt);
            }
        });
        getContentPane().add(cbDentista, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/view/tooth.png"))); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 140, 40));

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/view/tooth.png"))); // NOI18N
        Menu.setText("Menu");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, 110, 30));

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 180, -1));
        getContentPane().add(txtEspecializacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 180, -1));

        try {
            txtContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 180, -1));

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGround/view/freepik-export-20241017140703CtGb.jpeg"))); // NOI18N
        Fundo.setMaximumSize(new java.awt.Dimension(732, 520));
        Fundo.setMinimumSize(new java.awt.Dimension(732, 520));
        Fundo.setPreferredSize(new java.awt.Dimension(732, 520));
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-230, 0, 960, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtConfirmaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmaSenhaActionPerformed
        
    }//GEN-LAST:event_txtConfirmaSenhaActionPerformed

    private void cbDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDentistaActionPerformed
        if(cbDentista.isSelected()){
           cbFuncionario.setSelected(false);
           txtCRO.setVisible(true);
           txtEspecializacao.setVisible(true);
       }
    
    }//GEN-LAST:event_cbDentistaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(cbDentista.isSelected()){
            Controlador.salvarCadastroDentista();
            
            JOptionPane.showMessageDialog(rootPane, "Cadastro Efetuado com Sucesso");
        }
        if(cbFuncionario.isSelected()){
            Controlador.salvarCadastroFuncionario();
           
        String nome=getTxtNome().getText();
        String cpf =getTxtCPF().getText();
        String Contato=getTxtContato().getText();
        String Senha=getTxtSenha().getText();
        String ConfirmaSenha=getTxtConfirmaSenha().getText();
        System.out.println(nome+cpf+Contato+Senha+ConfirmaSenha);
            JOptionPane.showMessageDialog(rootPane, "Cadastrado com Sucesso");
        }
       
        TelaLogin login=new TelaLogin();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFuncionarioActionPerformed
             if(cbFuncionario.isSelected()){
                cbDentista.setSelected(false);
                txtCRO.setVisible(false);
                txtEspecializacao.setVisible(false);
             }
    }//GEN-LAST:event_cbFuncionarioActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
       TelaLogin menu=new TelaLogin();
       menu.setVisible(true);
       dispose();
    }//GEN-LAST:event_MenuActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JToggleButton Menu;
    private javax.swing.JCheckBox cbDentista;
    private javax.swing.JCheckBox cbFuncionario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCRO;
    private javax.swing.JLabel lblEspe;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCRO;
    private javax.swing.JPasswordField txtConfirmaSenha;
    private javax.swing.JFormattedTextField txtContato;
    private javax.swing.JTextField txtEspecializacao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    public JCheckBox getCbDentista() {
        return cbDentista;
    }

    public void setCbDentista(JCheckBox cbDentista) {
        this.cbDentista = cbDentista;
    }

    public JCheckBox getCbFuncionario() {
        return cbFuncionario;
    }

    public void setCbFuncionario(JCheckBox cbFuncionario) {
        this.cbFuncionario = cbFuncionario;
    }

    public JFormattedTextField getTxtCPF() {
        return txtCPF;
    }

    public void setTxtCPF(JFormattedTextField txtCPF) {
        this.txtCPF = txtCPF;
    }

    public JTextField getTxtCRO() {
        return txtCRO;
    }

    public void setTxtCRO(JTextField txtCRO) {
        this.txtCRO = txtCRO;
    }

    public JPasswordField getTxtConfirmaSenha() {
        return txtConfirmaSenha;
    }

    public void setTxtConfirmaSenha(JPasswordField txtConfirmaSenha) {
        this.txtConfirmaSenha = txtConfirmaSenha;
    }

    public JFormattedTextField getTxtContato() {
        return txtContato;
    }

    public void setTxtContato(JFormattedTextField txtContato) {
        this.txtContato = txtContato;
    }

    public JTextField getTxtEspecializacao() {
        return txtEspecializacao;
    }

    public void setTxtEspecializacao(JTextField txtEspecializacao) {
        this.txtEspecializacao = txtEspecializacao;
    }

    public JTextField getTxtNome() {
        return txtNome;
    }

    public void setTxtNome(JTextField txtNome) {
        this.txtNome = txtNome;
    }

    public JPasswordField getTxtSenha() {
        return txtSenha;
    }

    public void setTxtSenha(JPasswordField txtSenha) {
        this.txtSenha = txtSenha;
    }

}
