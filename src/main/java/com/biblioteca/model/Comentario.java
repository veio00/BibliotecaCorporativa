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
  public String mensagem;
  public Date comentado;
  public int comentarista;
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
     * @return the mensagem
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * @param mensagem the mensagem to set
     */
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    /**
     * @return the comentado
     */
    public Date getComentado() {
        return comentado;
    }

    /**
     * @param comentado the comentado to set
     */
    public void setComentado(Date comentado) {
        this.comentado = comentado;
    }

    /**
     * @return the comentarista
     */
    public int getComentarista() {
        return comentarista;
    }

    /**
     * @param comentarista the comentarista to set
     */
    public void setComentarista(int comentarista) {
        this.comentarista = comentarista;
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
