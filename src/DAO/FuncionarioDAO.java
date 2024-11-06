/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Dentista;
import Model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FuncionarioDAO {
        public void salvarFuncionario(Funcionario funcionario) throws SQLException {
        String sql = "INSERT INTO `clint`.`funcionario`(`nome`,`CPF`,`senha`,`NumeroContato`)VALUES(?,?,?,?);";
        try (Connection conexao = Conexao.getConexao();
             PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setString(1, funcionario.getNome());
            ps.setString(2, funcionario.getCPF());
            ps.setString(3, funcionario.getSenha());
            ps.setString(4, funcionario.getNumeroContato());
            // Executando a instrução SQL
            ps.executeUpdate();
            System.out.println("Funcionario cadastrado com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao salvar Funcionario: " + e.getMessage());
            throw e;  
          }
        }
        public boolean existeUsuarioeSenha(Funcionario funcionario) throws SQLException {
        String sql="select *from funcionario where nome='"+funcionario.getNome()+"' and senha='"+funcionario.getSenha()+"'";
             Connection conexao = Conexao.getConexao();
             PreparedStatement ps = conexao.prepareStatement(sql); 
             ps.execute();
             ResultSet resultSet=ps.getResultSet();
             return resultSet.next();
        }    
}
