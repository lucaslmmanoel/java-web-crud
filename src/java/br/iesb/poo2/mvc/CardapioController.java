package br.iesb.poo2.mvc;

import br.iesb.poo2.bean.CardapioBean;
import br.iesb.poo2.bean.CategoriaBean;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import br.iesb.poo2.dao.ConnectionFactory;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CardapioController {

    public boolean inserir(CardapioBean cardapio) {
        String sql = "INSERT INTO cardapios (codigo, nome, descricao, qtd, valor_venda, valor_compra, categorias_id) "
                + "values(?,?, ?, ?, ?, ?, ?)";
        boolean retorno = false;
        PreparedStatement pst = ConnectionFactory.getPreparedStatement(sql);
        try {
            pst.setInt(1, cardapio.getCodigo());
            pst.setString(2, cardapio.getNome());
            pst.setString(3, cardapio.getDescricao());
            pst.setInt(4, cardapio.getQuantidade());
            pst.setDouble(5, cardapio.getValor_venda());
            pst.setDouble(6, cardapio.getValor_compra());
            pst.setInt(7, cardapio.getCategorias_id());
            if (pst.executeUpdate() == 0) {
                retorno = true;
            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(CardapioController.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        return retorno;
    }

    public List<CardapioBean> Listar() {
        String sql = "SELECT * FROM cardapios;";
        List<CardapioBean> retorno = new ArrayList<>();
        PreparedStatement pst = ConnectionFactory.getPreparedStatement(sql);

        try {

            ResultSet res = pst.executeQuery();
            while (res.next()) {
                CardapioBean item = new CardapioBean();
                item.setCodigo(res.getInt("codigo"));
                item.setNome(res.getString("nome"));
                item.setDescricao(res.getString("descricao"));
                item.setQuantidade(res.getInt("qtd"));
                item.setValor_venda(res.getDouble("valor_venda"));
                item.setValor_compra(res.getDouble("valor_compra"));
                item.setCategorias_id(res.getInt("categorias_id"));

                retorno.add(item);
            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(CardapioController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }   

    public CardapioBean Buscar(CardapioBean cardapio) {
        String sql = "SELECT * FROM  cardapios where id=?";
        CardapioBean retorno = null;
        PreparedStatement pst = ConnectionFactory.getPreparedStatement(sql);

        try {
            pst.setInt(1, retorno.getId());
            ResultSet res = pst.executeQuery();
            if (res.next()) {
                retorno.setId(res.getInt("id"));
                retorno.setCodigo(res.getInt("codigo"));
                retorno.setNome(res.getString("nome"));
                retorno.setDescricao(res.getString("descricao"));
                retorno.setQuantidade(res.getInt("qtd"));
                retorno.setValor_venda(res.getDouble("valor_venda"));
                retorno.setValor_compra(res.getDouble("valor_compra"));
                retorno.setCategorias_id(res.getInt("categorias_id"));

            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(CardapioController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }

    public boolean excluir(CategoriaBean cardapio) {
        String sql = "DELETE FROM cardapios WHERE id=?";
        boolean retorno = false;
        PreparedStatement pst = ConnectionFactory.getPreparedStatement(sql);
        try {
            pst.setInt(1, cardapio.getId());

            if (pst.executeUpdate() == 0) {
                retorno = true;
            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(CardapioController.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        return retorno;
    }

    public boolean alterar(CardapioBean cardapio) {
        String sql = "UPDATE cardapios set codigo = ?, nome = ?, descricao = ?, qtd = ?, valor_compra = ?, valor_venda = ?,  categorias_id = ? WHERE id = ? ";
        boolean retorno = false;
        PreparedStatement pst = ConnectionFactory.getPreparedStatement(sql);
        try {

            pst.setInt(1, cardapio.getCodigo());
            pst.setString(2, cardapio.getNome());
            pst.setString(3, cardapio.getDescricao());
            pst.setInt(4, cardapio.getQuantidade());
            pst.setDouble(5, cardapio.getValor_compra());
            pst.setDouble(6, cardapio.getValor_venda());
            pst.setInt(7, cardapio.getCategorias_id());
            pst.setInt(8, cardapio.getId());

            if (pst.executeUpdate() == 0) {
                retorno = true;
            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(CardapioController.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        return retorno;
    }

}
