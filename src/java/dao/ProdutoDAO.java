package dao;

import model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;



//Classe que da acesso ao CRUD de produto
public class ProdutoDAO {
   //Conexão com o banco de dados
    private Connection conn;
   // Executador de querys mais performático
    private PreparedStatement stmt;
   // executador de querys mais simples
    private Statement st;
   // Criando um result set recuperar dados
    private ResultSet rs;
    //Criando um array list para armazenar dados
    private ArrayList<Produto> lista = new ArrayList<>();
    
    public ProdutoDAO(){
        conn = new ConnectionFactory().getConexao();
    }
    //metodo de inserção
    public void inserir(Produto produto){
        //Criando uma query sql em uma string
        String sql = "INSERT INTO produto(descr_produto, preco_produto) VALUES (?,?)";
        try {
            // preparando o sql para a execução
            stmt =  conn.prepareStatement(sql);
            //Captando a descrição do produto em string
            stmt.setString(1,produto.getDescr_produto());
            //captando o preço do produto em double
            stmt.setDouble(2, produto.getPreco_produto());
            //Executando a query
            stmt.execute();
            // Fechando a conexão
            stmt.close();
            
        } catch (Exception e) {
            throw new RuntimeException("Erro 2: " + e);
        }
    }
    //metodo de alteração
    public void alterar(Produto produto){
        String sql = "UPDATE produto set descr_produto = ? , preco_produto = ? WHERE cdg_produto = ?";
        try {
            
            // preparando o sql para a execução
            stmt =  conn.prepareStatement(sql);
            //Captando a descrição do produto em string
            stmt.setString(1,produto.getDescr_produto());
            //captando o preço do produto em double
            stmt.setDouble(2, produto.getPreco_produto());
            //captando o preço do produto em double
            stmt.setInt(3, produto.getCdg_produto());
            //Executando a query
            stmt.execute();
            // Fechando a conexão
            stmt.close();
            
        } catch (Exception e) {
            throw new RuntimeException("Erro 3: " + e);
        }
    }
    //metodo de exlusão
    public void excluir(int valor){
        String sql = "DELETE FROM produto WHERE cdg_produto =" + valor;
        try {
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } catch (Exception e) {
            throw new RuntimeException("Erro 4: " + e);
        }
    }
    
    public ArrayList<Produto> listarTodos(){
        String sql = "SELECT * FROM produto;";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Produto produto = new Produto();
                produto.setCdg_produto(rs.getInt("cdg_produto"));
                produto.setDescr_produto(rs.getString("descr_produto"));
                produto.setPreco_produto(rs.getDouble("preco_produto"));
                lista.add(produto);
                
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro 5: " + e);
        }
        return lista;
    }
        public ArrayList<Produto> listarTodosDescricao(String valor){
        String sql = "SELECT * FROM produto WHERE descr_produto LIKE " + valor;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Produto produto = new Produto();
                produto.setCdg_produto(rs.getInt("cdg_produto"));
                produto.setDescr_produto(rs.getString("descr_produto"));
                produto.setPreco_produto(rs.getDouble("preco_produto"));
                lista.add(produto);
                
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro 6: " + e);
        }
        return lista;
    }
    
}
