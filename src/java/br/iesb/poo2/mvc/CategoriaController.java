package br.iesb.poo2.mvc;

import br.iesb.poo2.bean.CategoriaBean;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import br.iesb.poo2.dao.ConnectionFactory;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoriaController {


    public boolean inserir(CategoriaBean categoria) {
        String sql = "INSERT INTO categorias (nome, categorias_id) "
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

    public List<CategoriaBean> Listar() {
        String sql = "SELECT * FROM categorias;";
        List<CategoriaBean> retorno = new ArrayList<>();
        PreparedStatement pst = ConnectionFactory.getPreparedStatement(sql);

        try {

            ResultSet res = pst.executeQuery();
            while (res.next()) {
                CategoriaBean item = new CategoriaBean();
                item.setNome(res.getString("nome"));
                item.setId(res.getInt("id"));

                retorno.add(item);
            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(CategoriaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }

    public CategoriaBean Buscar(CategoriaBean categoria) {
        String sql = "SELECT * FROM  categorias where id=?";
        CategoriaBean retorno = null;
        PreparedStatement pst = ConnectionFactory.getPreparedStatement(sql);

        try {
            pst.setInt(1, categoria.getId());
            ResultSet res = pst.executeQuery();
            if (res.next()) {
                retorno = new CategoriaBean();
                retorno.setId(res.getInt("id"));
                retorno.setNome(res.getString("nome"));

            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(CategoriaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }

    public boolean excluir(CategoriaBean categoria) {
        String sql = "DELETE FROM categorias WHERE id=?";
        boolean retorno = false;
        PreparedStatement pst = ConnectionFactory.getPreparedStatement(sql);
        try {
            pst.setInt(1, categoria.getId());

            if (pst.executeUpdate() == 0) {
                retorno = true;
            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(CategoriaController.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        return retorno;
    }
    public boolean alterar (CategoriaBean categoria){
        String sql = "UPDATE categorias set nome = ? WHERE id = ? and categorias_id = ?";                
        boolean retorno = false;
        PreparedStatement pst = ConnectionFactory.getPreparedStatement(sql);
        try{
            
            pst.setString(1, categoria.getNome());
            pst.setInt(2, categoria.getId());
            pst.setInt(3, categoria.getCategorias_id());
         
            if(pst.executeUpdate()==0){
                retorno = true;
            }
            
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(CategoriaController.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        return retorno;
    }
    

}
