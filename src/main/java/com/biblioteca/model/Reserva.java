/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca.model;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author re91528z
 */
public class Reserva {
  private int idReserva;
  private String datasSolicitada;
  private int estadoReserva;
  private int livroReservado;
  private int solicitante;

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
    public String getDatasSolicitada() {
        return datasSolicitada;
    }

    /**
     * @param datasSolicitada the datasSolicitada to set
     */
    public void setDatasSolicitada(String datasSolicitada) {
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
     * @return the solicitante
     */
    public int getSolicitante() {
        return solicitante;
    }

    /**
     * @param solicitante the solicitante to set
     */
    public void setSolicitante(int solicitante) {
        this.solicitante = solicitante;
    }

    public void set(java.sql.Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
