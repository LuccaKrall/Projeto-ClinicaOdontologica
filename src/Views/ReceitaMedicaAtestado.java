/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

/**
 *
 * @author si
 */
public class ReceitaMedicaAtestado extends javax.swing.JFrame {

    /**
     * Creates new form ReceitaMedicaAtestado
     */
    public ReceitaMedicaAtestado() {
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

        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        Enviar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        cbAtestado = new javax.swing.JCheckBox();
        cbReceita = new javax.swing.JCheckBox();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("lblFundo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 166, -1, -1));

        Enviar.setText("Enviar");
        getContentPane().add(Enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, -1, -1));

        btnMenu.setText("Menu");
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, -1, -1));

        cbAtestado.setText("Atestado");
        getContentPane().add(cbAtestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        cbReceita.setText("Receita Medica");
        getContentPane().add(cbReceita, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        lblTitulo.setText("jLabel2");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ReceitaMedicaAtestado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceitaMedicaAtestado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceitaMedicaAtestado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceitaMedicaAtestado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceitaMedicaAtestado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enviar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JCheckBox cbAtestado;
    private javax.swing.JCheckBox cbReceita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
