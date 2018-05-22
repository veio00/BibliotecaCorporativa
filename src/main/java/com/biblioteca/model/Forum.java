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
public class Forum {
    
  public int Idforum;
  public String Descricao;
  public int ISBNref;

    /**
     * @return the Idforum
     */
    public int getIdforum() {
        return Idforum;
    }

    /**
     * @param Idforum the Idforum to set
     */
    public void setIdforum(int Idforum) {
        this.Idforum = Idforum;
    }

    /**
     * @return the Descricao
     */
    public String getDescricao() {
        return Descricao;
    }

    /**
     * @param Descricao the Descricao to set
     */
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    /**
     * @return the ISBNref
     */
    public int getISBNref() {
        return ISBNref;
    }

    /**
     * @param ISBNref the ISBNref to set
     */
    public void setISBNref(int ISBNref) {
        this.ISBNref = ISBNref;
    }

}
