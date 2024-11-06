/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.PacienteDAO;
import Views.ConsultarPaciente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PacienteCrud {

    private final ConsultarPaciente view;
    public PacienteCrud(ConsultarPaciente view){
        this.view=view;
    }
    public String BuscarPaciente(String Stringsql,String x){
        PacienteDAO pacientedao=new PacienteDAO();
        ArrayList nome=pacientedao.buscarPaciente(Stringsql, x);
        String nomeString = String.join("\n", nome);
        return nomeString;
        
    }
    public String DeletarPaciente(String Stringsql,String x){
        
        PacienteDAO pacientedao=new PacienteDAO();
        pacientedao.DeletarPaciente(Stringsql, x);
        return null;
    }
    public String AlterarPaciente(String Stringsql,String x,int y){
        PacienteDAO pacientedao=new PacienteDAO();
        pacientedao.AlterarDadosPaciente(Stringsql, x, y);
        return null;
    }

}
