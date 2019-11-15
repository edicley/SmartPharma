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
public class Funcionario {
    
    private int Matricula;
    private String Senha;
    private Double Salario;
    private String Funcao;
    
    public Funcionario(int Matricula , String Senha , Double Salario , String Funcao){
        
        this.Matricula = Matricula;
        this.Senha = Senha;
        this.Salario = Salario;
        this.Funcao = Funcao;
        
    }

    /**
     * @return the Matricula
     */
    public int getMatricula() {
        return Matricula;
    }

    /**
     * @param Matricula the Matricula to set
     */
    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    /**
     * @return the Senha
     */
    public String getSenha() {
        return Senha;
    }

    /**
     * @param Senha the Senha to set
     */
    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    /**
     * @return the Salario
     */
    public Double getSalario() {
        return Salario;
    }

    /**
     * @param Salario the Salario to set
     */
    public void setSalario(Double Salario) {
        this.Salario = Salario;
    }

    /**
     * @return the Funcao
     */
    public String getFuncao() {
        return Funcao;
    }

    /**
     * @param Funcao the Funcao to set
     */
    public void setFuncao(String Funcao) {
        this.Funcao = Funcao;
    }
            
    
}
