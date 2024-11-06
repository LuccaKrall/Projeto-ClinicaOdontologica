
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {
    
    private static Connection conexao;
    private static final String URL_CONEXAO = "jdbc:mysql://localhost/clint";
    private static final String USUARIO = "root";
    private static final String SENHA = "123";

    public static Connection getConexao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conexao = DriverManager.getConnection(URL_CONEXAO, USUARIO, SENHA);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, "Driver não encontrado", ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, "Erro na conexão", ex);
        }
        
        return conexao;
    }

    public static void fecharConexao() {
        try {
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, "Erro ao fechar conexão", ex);
        }
        
    }
    }

