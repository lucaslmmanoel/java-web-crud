package br.iesb.poo2.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String banco
            = "jdbc:mysql://localhost:3306/servlet";

    private static final String driver
            = "com.mysql.jdbc.Driver";

    private static final String usuario = "root";
    private static final String senha = "!Q@W3e4r";

    private static Connection con = null;

    public static Connection getConexao() {
        if (con == null) {
            try {
                Class.forName(driver);
                con = DriverManager.getConnection(banco, usuario, senha);
            } catch (ClassNotFoundException ex) {
                System.out.println("Não encontrou o drive");
            } catch (SQLException ex) {
                System.out.println("Erro ao conectar : " + ex.getMessage());
            }
        }
        return con;
    }

    public static PreparedStatement getPreparedStatement(String sql) {
        if (con == null) {
            con = getConexao();
        }
        try {
            return con.prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println("Erro de SQL: "
                    + e.getMessage());
        }
        return null;

    }
}

