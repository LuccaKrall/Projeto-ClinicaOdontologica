/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author pc
 */
public class Dentista extends Funcionario {
    private int idDentista;
    private String Login;
    private String senha;
    private String CRO;
    private String Especialidade;

    public Dentista(String Nome, String CPF, String Senha, String NumeroContato) {
        super(Nome, CPF, Senha, NumeroContato);
    }

    
  
    
    public Dentista(String Nome,String CPF,String CRO, String Senha,String Especialidade,String NumeroContato) {
        super(Nome, CPF, Senha, NumeroContato);
        this.CRO = CRO;
        this.Especialidade = Especialidade;
    }

   
    
    
    
    public String getEspecialidade() {
        return Especialidade;
    }

    public void setEspecialidade(String Especialidade) {
        this.Especialidade = Especialidade;
    }

    public String getCRO() {
        return CRO;
    }

    public void setCRO(String CRO) {
        this.CRO = CRO;
    }
     public int getIdDentista() {
        return idDentista;
    }

    public void setIdDentista(int idDentista) {
        this.idDentista = idDentista;
    }
}
