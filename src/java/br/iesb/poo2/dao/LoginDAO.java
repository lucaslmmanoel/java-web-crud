package br.iesb.poo2.dao;

import br.iesb.poo2.bean.LoginBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO {
    // Criando a variavel de conexão

    private Connection conn;

    // Criando o executador de querys 
    private PreparedStatement stmnt;

    // Criando o executador de querys 
    private Statement st;

    //Criando a variavel para receber o resultado
    private ResultSet rs;

    public boolean checkLogin(String name, String password)  {
        
        try {
            
        String sql = "SELECT count(*) FROM user where  'name' = '?' and 'password' = '?'; ";

        st = conn.createStatement();
        rs = st.executeQuery(sql);
        st.close();
        
        } catch (Exception e) {
            return false;
        }
        
        
        return true;

    }
 }


