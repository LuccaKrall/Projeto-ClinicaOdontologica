/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.Conexao;
import DAO.PacienteDAO;
import Model.Paciente;
import Views.CadastroPaciente;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FormularioPacienteControlador {

    private final CadastroPaciente view;

public FormularioPacienteControlador(CadastroPaciente view){
    this.view=view;
}

public void salvarDadosPaciente(){
    String nome=view.getTxtNome().getText();
    String cpf =view.getTxtCPF().getText();
    String data = view.getTxtdata().getText();
    String Contato=view.getTxtContato().getText();
    String Observacoes=view.getTxtObservacao().getText();
     Paciente paciente=new Paciente(nome, Contato, cpf, data, Observacoes);
     Connection conexao=(Connection)  Conexao.getConexao();
     PacienteDAO pacientedao=new PacienteDAO();
     
        try {
            pacientedao.salvarPaciente(paciente);
        } catch (SQLException ex) {
            Logger.getLogger(FormularioPacienteControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
