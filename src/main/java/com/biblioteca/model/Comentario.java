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
  public int Idcomentario;
  public String mensagem;
  public Date comentado;
  public int Comentarista;
  public int doForum;

    /**
     * @return the Idcomentario
     */
    public int getIdcomentario() {
        return Idcomentario;
    }

    /**
     * @param Idcomentario the Idcomentario to set
     */
    public void setIdcomentario(int Idcomentario) {
        this.Idcomentario = Idcomentario;
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
