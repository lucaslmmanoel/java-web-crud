package br.iesb.poo2.dao;

import br.iesb.poo2.bean.CategoriaBean;
import br.iesb.poo2.mvc.CategoriaController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;

public class CategoriaDAO {

    private Object request;

    public boolean inserir(CategoriaBean categoria) {
        String sql = "INSERT INTO categorias(nome, categorias_id)"
                + "values(?, ?)";
        boolean retorno = false;
        PreparedStatement pst = ConnectionFactory.getPreparedStatement(sql);
        try {
            pst.setString(1, categoria.getNome());
            pst.setInt(2, categoria.getCategorias_id());
            if (pst.executeUpdate() == 0) {
                retorno = true;
            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(CategoriaController.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        return retorno;
    }

}
