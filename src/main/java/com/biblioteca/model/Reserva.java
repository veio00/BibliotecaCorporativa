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
public class Reserva {
  private int idReserva;
  private Date datasSolicitada;
  private int estadoReserva;
  private int livroReservado;
  private int Solicitante;

    /**
     * @return the idReserva
     */
    public int getIdReserva() {
        return idReserva;
    }

    /**
     * @param idReserva the idReserva to set
     */
    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    /**
     * @return the datasSolicitada
     */
    public Date getDatasSolicitada() {
        return datasSolicitada;
    }

    /**
     * @param datasSolicitada the datasSolicitada to set
     */
    public void setDatasSolicitada(Date datasSolicitada) {
        this.datasSolicitada = datasSolicitada;
    }

    /**
     * @return the estadoReserva
     */
    public int getEstadoReserva() {
        return estadoReserva;
    }

    /**
     * @param estadoReserva the estadoReserva to set
     */
    public void setEstadoReserva(int estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    /**
     * @return the livroReservado
     */
    public int getLivroReservado() {
        return livroReservado;
    }

    /**
     * @param livroReservado the livroReservado to set
     */
    public void setLivroReservado(int livroReservado) {
        this.livroReservado = livroReservado;
    }

    /**
     * @return the Solicitante
     */
    public int getSolicitante() {
        return Solicitante;
    }

    /**
     * @param Solicitante the Solicitante to set
     */
    public void setSolicitante(int Solicitante) {
        this.Solicitante = Solicitante;
    }

}
