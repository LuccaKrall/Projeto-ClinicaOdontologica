/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.Conexao;
import DAO.DentistaDAO;
import DAO.FuncionarioDAO;
import Model.Dentista;
import Views.CadastroFuncionarios;
import java.sql.Connection;
import java.sql.SQLException;
import Model.Funcionario;
/**
 *
 * @author pc
 */
public class FormularioCadastroControlador {
   private CadastroFuncionarios view;

    public FormularioCadastroControlador(CadastroFuncionarios view) {
        this.view = view;
    }
    
    

   

 
    

   public void salvarCadastroDentista(){
        String nome=view.getTxtNome().getText();
        String cpf =view.getTxtCPF().getText();
        String CRO=view.getTxtCRO().getText();
        String Contato=view.getTxtContato().getText();
        String Senha=view.getTxtSenha().getText();
        String ConfirmaSenha=view.getTxtConfirmaSenha().getText();
        String Especializacao=view.getTxtEspecializacao().getText();
        Dentista dentista=new Dentista(nome, cpf, CRO, Senha, Especializacao, Contato);
        Connection conexao=(Connection)  Conexao.getConexao();
        DentistaDAO dentistadao=new DentistaDAO();
        
        try {
            dentistadao.salvarDentista(dentista);

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
}
       public void salvarCadastroFuncionario(){
        String nome=view.getTxtNome().getText();
        String cpf =view.getTxtCPF().getText();
        String Contato=view.getTxtContato().getText();
        String Senha=view.getTxtSenha().getText();
        String ConfirmaSenha=view.getTxtConfirmaSenha().getText();
        Funcionario funcionario=new Funcionario(nome, cpf, Senha, Contato);
        Connection conexao=(Connection)  Conexao.getConexao();
        FuncionarioDAO funcionariodao=new FuncionarioDAO();
      
        try {
            funcionariodao.salvarFuncionario(funcionario);
            System.out.println(nome+cpf+Contato+Senha+ConfirmaSenha);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
}
}
