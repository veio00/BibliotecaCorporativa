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
  public int idReserva;
  public Date Datasolicitada;
  public int Estadoreserva;
  public int livroReservado;
  public int Solicitante;

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
     * @return the Datasolicitada
     */
    public Date getDatasolicitada() {
        return Datasolicitada;
    }

    /**
     * @param Datasolicitada the Datasolicitada to set
     */
    public void setDatasolicitada(Date Datasolicitada) {
        this.Datasolicitada = Datasolicitada;
    }

    /**
     * @return the Estadoreserva
     */
    public int getEstadoreserva() {
        return Estadoreserva;
    }

    /**
     * @param Estadoreserva the Estadoreserva to set
     */
    public void setEstadoreserva(int Estadoreserva) {
        this.Estadoreserva = Estadoreserva;
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
