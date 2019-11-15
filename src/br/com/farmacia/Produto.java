/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.farmacia;

import java.util.Date;

/**
 *
 * @author eudes.machado
 */
public class Produto {
    
    private int ID;
    private String Nome;
    private Double Preco;
    private Date Validade;
    private int CodBarra;
    
    public Produto(int ID , String Nome , Double Preco , Date Validade , int CodBarra){
        this.ID = ID;
        this.Nome = Nome;
        this.Preco = Preco;
        this.Validade = Validade;
        this.CodBarra = CodBarra;
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
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Preco
     */
    public Double getPreco() {
        return Preco;
    }

    /**
     * @param Preco the Preco to set
     */
    public void setPreco(Double Preco) {
        this.Preco = Preco;
    }

    /**
     * @return the Validade
     */
    public Date getValidade() {
        return Validade;
    }

    /**
     * @param Validade the Validade to set
     */
    public void setValidade(Date Validade) {
        this.Validade = Validade;
    }

    /**
     * @return the CodBarra
     */
    public int getCodBarra() {
        return CodBarra;
    }

    /**
     * @param CodBarra the CodBarra to set
     */
    public void setCodBarra(int CodBarra) {
        this.CodBarra = CodBarra;
    }
    
    
}
