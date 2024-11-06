/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import Model.Agendamento;
import Model.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class AgendamentoDAO {
    
        public void salvarAgendamento(Agendamento agendamento) throws SQLException {
        String sql = "INSERT INTO `clint`.`agendamento`(`idDentista`,`idPaciente`,`data`,`horario`)VALUES(?,?,?,?);";

        // Usando try-with-resources para garantir o fechamento da conexão e PreparedStatement
        try (Connection conexao = Conexao.getConexao();
             PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setInt(1, agendamento.getIdPaciente());
            ps.setInt(2, agendamento.getIdDentista());
            ps.setDate(3, new java.sql.Date(agendamento.getData().getTime()));
            ps.setString(4,agendamento.getHorario());            
            // Executando a instrução SQL
            ps.executeUpdate();
            
            System.out.println("Dentista cadastrado com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao salvar dentista: " + e.getMessage());
            throw e;  // Relançar a exceção após logar o erro
        }
    }
         
        
        public ArrayList listaAgendamento(Date x){    
          ArrayList listaPaciente = new ArrayList();
          String sql="SELECT * FROM agendamento a INNER JOIN paciente p ON ( a.idPaciente=p.idPaciente ) INNER JOIN dentista d ON(a.idDentista=d.idDentista) WHERE data=? ORDER BY data,horario ASC";
           
           ResultSet rset = null;
           
                try (Connection conexao = Conexao.getConexao();
                PreparedStatement ps = conexao.prepareStatement(sql)) {
                  ps.setDate(1, (java.sql.Date) x);
                  rset=ps.executeQuery( );
                while (rset.next()) {  // Use 'while' para garantir que todos os resultados sejam processados
                  Agendamento agendamento = new Agendamento();
                  agendamento.setIdAgendamento(rset.getInt("idAgendamento"));
                  agendamento.setNomePaciente(rset.getString("p.nome"));
                  agendamento.setIdDentista(rset.getInt("idDentista"));
                  agendamento.setData(rset.getDate("data"));
                  agendamento.setHorario(rset.getString("horario"));

                listaPaciente.add(agendamento); // Adiciona o objeto 'Agendamento' completo
                }
                 Conexao.fecharConexao();
                }catch (SQLException ex) {
                    Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
                 return listaPaciente;
        }

        public ArrayList listaAgendamentoGeral(Date x) {
            ArrayList listaPaciente = new ArrayList();
            String sql="SELECT * FROM agendamento a INNER JOIN paciente p ON ( a.idPaciente=p.idPaciente ) INNER JOIN dentista d ON(a.idDentista=d.idDentista) WHERE data>? ORDER BY horario ASC";
           
           ResultSet rset = null;
           
            try (Connection conexao = Conexao.getConexao();
            PreparedStatement ps = conexao.prepareStatement(sql)) {
                ps.setDate(1, (java.sql.Date) x);
                rset=ps.executeQuery( );
            while (rset.next()) {  // Use 'while' para garantir que todos os resultados sejam processados
                Agendamento agendamento = new Agendamento();
                agendamento.setIdAgendamento(rset.getInt("idAgendamento"));
                agendamento.setNomePaciente(rset.getString("p.nome"));
                agendamento.setIdDentista(rset.getInt("idDentista"));
                agendamento.setData(rset.getDate("data"));
                agendamento.setHorario(rset.getString("horario"));

                listaPaciente.add(agendamento); // Adiciona o objeto 'Agendamento' completo
            }   
                Conexao.fecharConexao();
            }catch (SQLException ex) {
                    Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
                return listaPaciente;

                
                
        }
}
    
    
    
       
        









    

