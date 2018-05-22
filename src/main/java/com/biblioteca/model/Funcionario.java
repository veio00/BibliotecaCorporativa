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
 public String Nome;
 public String Re;
 public int Exp;

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
     * @return the Re
     */
    public String getRe() {
        return Re;
    }

    /**
     * @param Re the Re to set
     */
    public void setRe(String Re) {
        this.Re = Re;
    }

    /**
     * @return the Exp
     */
    public int getExp() {
        return Exp;
    }

    /**
     * @param Exp the Exp to set
     */
    public void setExp(int Exp) {
        this.Exp = Exp;
    }
    
}
