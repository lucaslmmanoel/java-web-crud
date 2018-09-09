package model;

public class Produto {
    
    private int cdg_produto;
    private String descr_produto;
    private double preco_produto;
    

    public int getCdg_produto() {
        return cdg_produto;
    }

    public void setCdg_produto(int cdg_produto) {
        this.cdg_produto = cdg_produto;
    }

    public String getDescr_produto() {
        return descr_produto;
    }

    public void setDescr_produto(String descr_produto) {
        this.descr_produto = descr_produto;
    }

    public double getPreco_produto() {
        return preco_produto;
    }

    public void setPreco_produto(double preco_produto) {
        this.preco_produto = preco_produto;
    }
    
}
