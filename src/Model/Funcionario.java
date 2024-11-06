/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class Funcionario {
    private String Nome;
    private String CPF;
    private String Senha;
    private String NumeroContato;        

    public Funcionario(String Nome, String CPF, String Senha, String NumeroContato) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.Senha = Senha;
        this.NumeroContato = NumeroContato;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getNumeroContato() {
        return NumeroContato;
    }

    public void setNumeroContato(String NumeroContato) {
        this.NumeroContato = NumeroContato;
    }
    
}
