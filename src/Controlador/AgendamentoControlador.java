/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import DAO.AgendamentoDAO;
import DAO.Conexao;
import Model.Agendamento;
import Model.Dentista;
import Views.TelaAgendamento;
import Model.Paciente;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author pc
 */
public class AgendamentoControlador {

    private final TelaAgendamento view;
   

    
   
    
    public AgendamentoControlador(TelaAgendamento view){
        this.view=view;
    }

    public void salvarAgendamento(){
       
        String IdPaciente=view.getTxtNome().getText();
        String IdDentista=view.getTxtDentista().getText();
        Date data=view.getJdata().getDate();
        String horario=view.getTxtHora().getText();
        int idPaciente=Integer.valueOf(IdPaciente);
        int idDentista=Integer.valueOf(IdDentista);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = sdf.format(data);
        Agendamento agendar=new Agendamento(idDentista, idPaciente, dataFormatada, horario);
        AgendamentoDAO agendardao=new AgendamentoDAO();
        Connection conexao=(Connection)  Conexao.getConexao();
        try {
            agendardao.salvarAgendamento(agendar);
        } catch (SQLException ex) {
            Logger.getLogger(AgendamentoControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(horario);
        
        JOptionPane.showMessageDialog(view, "Paciente"+idPaciente+"\nDentista"+idDentista+"\nData"+dataFormatada+"Horario"+horario, horario, idPaciente);
        
    }
    
    
}
