/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controlador.AgendaDiariaControlador;
import DAO.AgendamentoDAO;
import Model.Agendamento;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AgendaDiaria extends javax.swing.JFrame {

    private final AgendaDiariaControlador Controlador;
  

                
       
    public AgendaDiaria() throws SQLException {
        initComponents();
        Controlador=new Controlador.AgendaDiariaControlador(this);
        LocalDate data = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy", new Locale("pt", "BR"));
        String dataPorExtenso = data.format(formatter);
        lblData.setText(dataPorExtenso);
        Controlador.AgendaGeral();
        }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cbDia = new javax.swing.JCheckBox();
        cbDiaSeguinte = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ClintOdontologia");
        setMaximumSize(new java.awt.Dimension(735, 512));
        setMinimumSize(new java.awt.Dimension(735, 512));
        setPreferredSize(new java.awt.Dimension(735, 512));
        setResizable(false);
        setSize(new java.awt.Dimension(735, 512));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Agendamentos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 260, 40));

        lblData.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblData.setText("Data Local");
        getContentPane().add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 360, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/view/tooth.png"))); // NOI18N
        jButton1.setText("Voltar Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, -1, -1));

        cbDia.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        cbDia.setText("Agenda do dia");
        cbDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDiaActionPerformed(evt);
            }
        });
        getContentPane().add(cbDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 120, 40));

        cbDiaSeguinte.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        cbDiaSeguinte.setText("Agenda Amanha");
        cbDiaSeguinte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDiaSeguinteActionPerformed(evt);
            }
        });
        getContentPane().add(cbDiaSeguinte, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, 40));

        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTabela.setAutoCreateRowSorter(true);
        jTabela.setBackground(new java.awt.Color(0, 204, 255));
        jTabela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabela.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTabela);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 360, 260));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BackGround/view/fundoPrancheta.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 735, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuDentista menu=new MenuDentista();
        menu.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDiaActionPerformed
        if(cbDia.isSelected()){
           cbDiaSeguinte.setSelected(false);
           Controlador.DiaAtual();
        }else if(!cbDia.isSelected() && !cbDiaSeguinte.isSelected()){
           Controlador.AgendaGeral();
        }
    }//GEN-LAST:event_cbDiaActionPerformed
       
        
    
    
    private void cbDiaSeguinteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDiaSeguinteActionPerformed
        if(cbDiaSeguinte.isSelected()){
            cbDia.setSelected(false);
            Controlador.DiaSeguinte();
        }else if(!cbDia.isSelected() && !cbDiaSeguinte.isSelected()){
            Controlador.AgendaGeral();
        }
        
    }//GEN-LAST:event_cbDiaSeguinteActionPerformed

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
            java.util.logging.Logger.getLogger(AgendaDiaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendaDiaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendaDiaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendaDiaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AgendaDiaria().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AgendaDiaria.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbDia;
    private javax.swing.JCheckBox cbDiaSeguinte;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabela;
    private javax.swing.JLabel lblData;
    // End of variables declaration//GEN-END:variables

    public JCheckBox getCbDia() {
        return cbDia;
    }

    public void setCbDia(JCheckBox cbDia) {
        this.cbDia = cbDia;
    }

    public JCheckBox getCbDiaSeguinte() {
        return cbDiaSeguinte;
    }

    public void setCbDiaSeguinte(JCheckBox cbDiaSeguinte) {
        this.cbDiaSeguinte = cbDiaSeguinte;
    }

    public JTable getjTabela() {
        return jTabela;
    }

    public void setjTabela(JTable jTabela) {
        this.jTabela = jTabela;
    }

    public JLabel getLblData() {
        return lblData;
    }

    public void setLblData(JLabel lblData) {
        this.lblData = lblData;
    }
  public boolean isCbDiaSelected() {
        return cbDia.isSelected();
    }
  public boolean isCbDiaSeguinteSelected() {
        return cbDiaSeguinte.isSelected();
    }

}
