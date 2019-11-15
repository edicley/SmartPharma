/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.farmacia;

/**
 *
 * @author eudes.machado
 */
public class Estoque {
    
    private int ID;
    private String Produto;
    private int Quantidade;
    
    
    public Estoque(int ID ,String Produto ,int Quantidade){
        this.ID = ID;
        this.Produto = Produto;
        this.Quantidade = Quantidade;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the Produto
     */
    public String getProduto() {
        return Produto;
    }

    /**
     * @param Produto the Produto to set
     */
    public void setProduto(String Produto) {
        this.Produto = Produto;
    }

    /**
     * @return the Quantidade
     */
    public int getQuantidade() {
        return Quantidade;
    }

    /**
     * @param Quantidade the Quantidade to set
     */
    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }
    
    
    
}
