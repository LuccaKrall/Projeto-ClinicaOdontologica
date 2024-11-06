/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.DentistaDAO;
import Views.TelaCrudsDentista;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class DentistaCrud {

    private final TelaCrudsDentista view;
    
    public DentistaCrud(TelaCrudsDentista view){
        this.view=view;
    }

  


    
    
    
    
    
    public String BuscarDentista(String Stringsql,String x){
    DentistaDAO dentistadao=new DentistaDAO();
    ArrayList nome=dentistadao.buscarDentista(Stringsql, x);
    String nomeString = String.join("\n", nome);
    return nomeString;
        
    }
    public String DeletarDentista(String Stringsql,String x){
        
        DentistaDAO dentistadao=new DentistaDAO();
        dentistadao.DeletarDentista(Stringsql, x);
        return null;
    }
    public String AlterarDentista(String Stringsql,String x,int y){
        DentistaDAO dentistadao=new DentistaDAO();
        dentistadao.AlterarDadosDentista(Stringsql, x, y);
        return null;
    }
    
    
    
    
    
}
