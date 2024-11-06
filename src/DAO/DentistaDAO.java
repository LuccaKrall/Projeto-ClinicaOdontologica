/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.ResultSet;
import Model.Dentista;
import Model.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DentistaDAO {


    public void salvarDentista(Dentista dentista) throws SQLException {
        String sql = "INSERT INTO `clint`.`dentista` (`Nome`, `CPF`, `CRO`, `Senha`, `Especialidade`, `NumeroContato`) VALUES (?, ?, ?, ?, ?, ?);";

        // Usando try-with-resources para garantir o fechamento da conexão e PreparedStatement
        try (Connection conexao = Conexao.getConexao();
             PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setString(1, dentista.getNome());
            ps.setString(2, dentista.getCPF());
            ps.setString(3, dentista.getCRO());
            ps.setString(4, dentista.getSenha());
            ps.setString(5, dentista.getEspecialidade());
            ps.setString(6, dentista.getNumeroContato());

            // Executando a instrução SQL
            ps.executeUpdate();
            
            System.out.println("Dentista cadastrado com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao salvar dentista: " + e.getMessage());
            throw e;  // Relançar a exceção após logar o erro
        }
    }

    public boolean existeUsuarioeSenha(Dentista dentista,String sql,String nome,String Senha) throws SQLException {
             Connection conexao = Conexao.getConexao();
             PreparedStatement ps = conexao.prepareStatement(sql); 
             ps.setString(1, nome);
             ps.setString(2,Senha);
             ps.execute();
             ResultSet resultSet=ps.getResultSet();
             return resultSet.next();
}

      public ArrayList lerLista() throws SQLException{
          ArrayList listaDentista = new ArrayList();
          String sql = "SELECT *FROM dentista";
          ResultSet rset = null;
        // Usando try-with-resources para garantir o fechamento da conexão e PreparedStatement
        try (Connection conexao = Conexao.getConexao();
             PreparedStatement ps = conexao.prepareStatement(sql)) {
              rset=ps.executeQuery();
        while(rset.next()){
                  Dentista dentista=new Dentista("", "", "", "");
                  dentista.setIdDentista(rset.getInt("idDentista"));
                  dentista.setNome(rset.getString("Nome"));
                  dentista.setCPF(rset.getString("CPF"));
                  dentista.setCRO(rset.getString("CRO"));
                  dentista.setSenha(rset.getString("Senha"));
                  dentista.setEspecialidade(rset.getString("Especialidade"));
                  dentista.setNumeroContato(rset.getString("NumeroContato"));
                  listaDentista.add(dentista.getIdDentista());
                  listaDentista.add(dentista.getNome());
                  listaDentista.add(dentista.getCPF());
                  listaDentista.add(dentista.getCRO());      
                  listaDentista.add(dentista.getSenha());
                  listaDentista.add(dentista.getEspecialidade());
                  listaDentista.add(dentista.getNumeroContato());
        }
            System.out.println("Lista dentista");

        } catch (SQLException e) {
            System.err.println("Erro ao salvar Funcionario: " + e.getMessage());
            throw e;  // Relançar a exceção após logar o erro
        }
               
        
        
        return listaDentista;
      }
      
       public ArrayList buscarDentista(String Stringsql,String x){    
          ArrayList resultado = new ArrayList();
          String sql=Stringsql;
           
           ResultSet rset = null;
           
          try (Connection conexao = Conexao.getConexao();
          PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1,x );
            rset=ps.executeQuery( );
        if(rset.next()){
              resultado.add("idDentista: "+rset.getString(1));
              resultado.add("\nNome: "+rset.getString(2));
              resultado.add("\nCPF: "+rset.getString(3));
              resultado.add("\nCRO: "+rset.getString(4));
              resultado.add("\nSenha: "+rset.getString("*********"));
              resultado.add("\nEspecialidade: "+rset.getString(6));
              resultado.add("\nNumeroContato: "+rset.getString(7));
        }
                Conexao.fecharConexao();
          }     catch (SQLException ex) {
                    Logger.getLogger(DentistaDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
                return resultado;
}

       public String DeletarDentista(String Stringsql,String x){
         
         
          ResultSet rset = null;
          try (Connection conexao = Conexao.getConexao();
          PreparedStatement ps = conexao.prepareStatement(Stringsql)) {
            ps.setString(1,x );
            ps.executeUpdate();
             Conexao.fecharConexao();
          }     catch (SQLException ex) {
                    Logger.getLogger(DentistaDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
                return null;
        }       
       
        public String AlterarDadosDentista(String Stringsql,String x,int y){
          String sql=Stringsql;
          ResultSet rset = null;
          try (Connection conexao = Conexao.getConexao();
          PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1,x );
            ps.setInt(2, y);
            ps.executeUpdate();
             Conexao.fecharConexao();
          } catch (SQLException ex) { 
            Logger.getLogger(DentistaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                return null;
        }      
       


}