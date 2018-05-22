/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca.model;

import java.util.Date;

/**
 *
 * @author re91528z
 */
public class Comentario {
  public int idComentario;
  public String Mensagem;
  public Date Comentado;
  public int Comentarista;
  public int doForum;

    /**
     * @return the idComentario
     */
    public int getIdComentario() {
        return idComentario;
    }

    /**
     * @param idComentario the idComentario to set
     */
    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    /**
     * @return the Mensagem
     */
    public String getMensagem() {
        return Mensagem;
    }

    /**
     * @param Mensagem the Mensagem to set
     */
    public void setMensagem(String Mensagem) {
        this.Mensagem = Mensagem;
    }

    /**
     * @return the Comentado
     */
    public Date getComentado() {
        return Comentado;
    }

    /**
     * @param Comentado the Comentado to set
     */
    public void setComentado(Date Comentado) {
        this.Comentado = Comentado;
    }

    /**
     * @return the Comentarista
     */
    public int getComentarista() {
        return Comentarista;
    }

    /**
     * @param Comentarista the Comentarista to set
     */
    public void setComentarista(int Comentarista) {
        this.Comentarista = Comentarista;
    }

    /**
     * @return the doForum
     */
    public int getDoForum() {
        return doForum;
    }

    /**
     * @param doForum the doForum to set
     */
    public void setDoForum(int doForum) {
        this.doForum = doForum;
    }
    
}
