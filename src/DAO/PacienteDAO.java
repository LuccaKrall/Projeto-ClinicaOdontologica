/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.ResultSet;
import Model.Paciente;
import java.awt.Component;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PacienteDAO {
            public void salvarPaciente(Paciente paciente) throws SQLException {
            String sql = "INSERT INTO `clint`.`paciente`(`nome`,`telefoneContato`,`CPF`,`dataNascimento`,`observacoes`)VALUES(?,?,?,?,?);";

        // Usando try-with-resources para garantir o fechamento da conexão e PreparedStatement
        try (Connection conexao = Conexao.getConexao();
             PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setString(1, paciente.getNome());
            ps.setString(2, paciente.getTelefoneContato());
            ps.setString(3, paciente.getCPF());
            ps.setString(4, paciente.getData());
            ps.setString(5, paciente.getObservacoes());
           
            ps.executeUpdate();
            
            System.out.println("Paciente cadastrado com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao salvar Funcionario: " + e.getMessage());
            throw e;  // Relançar a exceção após logar o erro
        }
    }
      public ArrayList lerLista() throws SQLException{
          ArrayList listaPaciente = new ArrayList();
          String sql = "SELECT *FROM paciente";
          ResultSet rset = null;
        // Usando try-with-resources para garantir o fechamento da conexão e PreparedStatement
        try (Connection conexao = Conexao.getConexao();
             PreparedStatement ps = conexao.prepareStatement(sql)) {
              rset=ps.executeQuery();
              while(rset.next()){
                  Paciente paciente=new Paciente();
                  paciente.setIdPaciente(rset.getInt("IdPaciente"));
                  paciente.setNome(rset.getString("nome"));
                  paciente.setTelefoneContato(rset.getString("telefoneContato"));
                  paciente.setCPF(rset.getString("CPF"));
                  paciente.setData(rset.getString("dataNascimento"));
                  paciente.setObservacoes(rset.getString("observacoes"));
                  listaPaciente.add(paciente.getIdPaciente());
                  listaPaciente.add(paciente.getNome());
                  listaPaciente.add(paciente.getTelefoneContato());
                  listaPaciente.add(paciente.getCPF());      
                  listaPaciente.add(paciente.getData());
              }
            System.out.println("Lista pacientes");

        } catch (SQLException e) {
            System.err.println("Erro ao salvar Funcionario: " + e.getMessage());
            throw e;  // Relançar a exceção após logar o erro
        }
               
        
        
        return listaPaciente;
      }
       public ArrayList buscarPaciente(String Stringsql,String x){    
          ArrayList resultado = new ArrayList();
          String sql=Stringsql;
           
           ResultSet rset = null;
           
          try (Connection conexao = Conexao.getConexao();
          PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1,x );
            rset=ps.executeQuery( );
          if(rset.next()){
              resultado.add("IdPaciente: "+rset.getString(1));
              resultado.add("\nNome: "+rset.getString(2));
              resultado.add("\nContato: "+rset.getString(3));
              resultado.add("\nCPF: "+rset.getString(4));
              resultado.add("\nObservações: "+rset.getString(6));
          }
          Conexao.fecharConexao();
          }     catch (SQLException ex) {
                    Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
                return resultado;
}
       public String DeletarPaciente(String Stringsql,String x){
         
         
          ResultSet rset = null;
          try (Connection conexao = Conexao.getConexao();
          PreparedStatement ps = conexao.prepareStatement(Stringsql)) {
            ps.setString(1,x );
            ps.executeUpdate();
             Conexao.fecharConexao();
          }     catch (SQLException ex) {
                    Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
                return null;
        }
       public String AlterarDadosPaciente(String Stringsql,String x,int y){
          String sql=Stringsql;
          ResultSet rset = null;
          try (Connection conexao = Conexao.getConexao();
          PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1,x );
            ps.setInt(2, y);
            ps.executeUpdate();
             Conexao.fecharConexao();
          }     catch (SQLException ex) {
                    Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
                return null;
        }
           
           
                
       }




