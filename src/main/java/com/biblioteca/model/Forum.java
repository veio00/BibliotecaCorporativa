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
    
  public int idForum;
  public String descricao;
  public String iSBNref;

    /**
     * @return the idForum
     */
    public int getIdForum() {
        return idForum;
    }

    /**
     * @param idForum the idForum to set
     */
    public void setIdForum(int idForum) {
        this.idForum = idForum;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the iSBNref
     */
    public String getiSBNref() {
        return iSBNref;
    }

    /**
     * @param iSBNref the iSBNref to set
     */
    public void setiSBNref(String iSBNref) {
        this.iSBNref = iSBNref;
    }

}
