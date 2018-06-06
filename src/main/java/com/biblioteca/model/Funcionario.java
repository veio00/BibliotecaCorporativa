/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca.model;

/**
 *
 * @author re91528z
 */
public class Funcionario {
    
 public int  idFuncionario;
 public String nome;
 public String re;
 public int exp;

    /**
     * @return the idFuncionario
     */
    public int getidFuncionario() {
        return idFuncionario;
    }

    /**
     * @param idFuncionario the IdFuncionario to set
     */
    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the re
     */
    public String getRe() {
        return re;
    }

    /**
     * @param re the re to set
     */
    public void setRe(String re) {
        this.re = re;
    }

    /**
     * @return the exp
     */
    public int getExp() {
        return exp;
    }

    /**
     * @param exp the exp to set
     */
    public void setExp(int exp) {
        this.exp = exp;
    }
    
}
