/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Views.TelaLogin;
import DAO.Conexao;
import DAO.DentistaDAO;
import DAO.FuncionarioDAO;
import Model.Dentista;
import Model.Funcionario;
import Views.MenuDentista;
import Views.MenuFuncionario;
import Views.TelaLogin;
import java.awt.Menu;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class LoginControlador {
    private TelaLogin view;
    
    public LoginControlador(TelaLogin view) {
        this.view = view;
    }
    

    public Boolean verificarLoginDentista() throws SQLException {
        String Usuario=view.getTxtUsuario().getText();
        String Senha=view.getTxtSenha().getText();
        Dentista dentistalogin=new Dentista(Usuario, "", "", Senha, "", "");
        
        Connection conexao=(Connection)  Conexao.getConexao();
        DentistaDAO dentistadao=new DentistaDAO();
        
        boolean existe=dentistadao.existeUsuarioeSenha(dentistalogin,"select *from dentista where nome=? and senha=?",Usuario,Senha);
        
        if(existe){
            JOptionPane.showMessageDialog(view,"Login efetuado");
            MenuDentista menu=new MenuDentista();
            menu.setVisible(true);
           
        }else{
            JOptionPane.showMessageDialog(view, "erro");
        }
        return existe;
        
        
       
    }

    public boolean verificarLoginFuncionario() throws SQLException {
        String Usuario=view.getTxtUsuario().getText();
        String Senha=view.getTxtSenha().getText();
        Funcionario funcionarioLogin=new Funcionario(Usuario, "", Senha, "");
        
        
        Connection conexao=(Connection)  Conexao.getConexao();
        FuncionarioDAO funcionariodao=new FuncionarioDAO();
    
        boolean existe=funcionariodao.existeUsuarioeSenha(funcionarioLogin);
        
        if(existe){
            MenuFuncionario menu=new MenuFuncionario();
            menu.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(view, "erro");
        }
        return existe;
        
}
}