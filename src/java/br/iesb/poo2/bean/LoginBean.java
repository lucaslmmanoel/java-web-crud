package br.iesb.poo2.bean;

import br.iesb.poo2.dao.LoginDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginBean {

    // Criando a variavel de conexão
    private Connection conn;
    //Criando a variavel de exeecução de querys
    private PreparedStatement stmt;
    // Criando o executador de querys
    private Statement st;

    // Criando a variavel para receber o resultado
    private ResultSet rs;

    LoginDAO dao = new LoginDAO();
    private String name, password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean validate(){    
        
        if(password.equals("123")){  
            return true;  
        }  
        else{  
            return false;  
        }
    }

   

}
