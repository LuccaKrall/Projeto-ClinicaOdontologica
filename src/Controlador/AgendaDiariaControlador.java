/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.AgendamentoDAO;
import Model.Agendamento;
import Views.AgendaDiaria;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AgendaDiariaControlador {

    private final AgendaDiaria view;

    public AgendaDiariaControlador(AgendaDiaria view) {
    this.view=view;
    }
    public void atualizarTabela(ArrayList<Agendamento> listaagenda) {
        
        String[] colunas = {"ID Dentista","Paciente", "Data", "Horário"};
        DefaultTableModel model = new DefaultTableModel(colunas, 0);

        for (Agendamento agenda : listaagenda) {
                Object[] linha = new Object[] {
                    agenda.getIdDentista(),  
                    agenda.getNomePaciente(),
                    agenda.getData(),        
                    agenda.getHorario()      
                };
                model.addRow(linha);
        }   
        view.getjTabela().setModel(model);
    }
        public void AgendaGeral(){
                LocalDate data = LocalDate.now();
                DateTimeFormatter ano = DateTimeFormatter.ofPattern("yyyy-MM-dd", new Locale("pt", "BR"));
                String dataAno = data.format(ano);
                java.sql.Date dataSql = java.sql.Date.valueOf(dataAno);
                ArrayList listaagenda=new ArrayList();
                listaagenda=new AgendamentoDAO().listaAgendamentoGeral(dataSql);
                    atualizarTabela(listaagenda);
                }
        
    
        public void DiaSeguinte(){
                LocalDate dataAtual = LocalDate.now();
                LocalDate diaSeguinte = dataAtual.plusDays(1);
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                String dataFormatada = diaSeguinte.format(formato);
                java.sql.Date dataSql = java.sql.Date.valueOf(diaSeguinte);
                ArrayList listaagenda = new AgendamentoDAO().listaAgendamento(dataSql);
                System.out.println(dataSql);
                atualizarTabela(listaagenda);
        }
        public void DiaAtual(){
                LocalDate dataAtual = LocalDate.now();
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                String dataFormatada = formato.format(dataAtual);
                java.sql.Date dataSql = java.sql.Date.valueOf(dataFormatada);
                ArrayList listaagenda=new ArrayList();
                listaagenda=new AgendamentoDAO().listaAgendamento(dataSql);
                System.out.println(dataSql);
                atualizarTabela(listaagenda);
            }
                
    }                        
        

