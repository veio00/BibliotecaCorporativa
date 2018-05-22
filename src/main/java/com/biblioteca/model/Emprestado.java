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
public class Emprestado {
    
  public int IdEmprestimo;
  public String localLivro;
  public Date Devolucao;
  public Date Retirada;
  public int Retirante;
  public int livroRetirado;

    /**
     * @return the IdEmprestimo
     */
    public int getIdEmprestimo() {
        return IdEmprestimo;
    }

    /**
     * @param IdEmprestimo the IdEmprestimo to set
     */
    public void setIdEmprestimo(int IdEmprestimo) {
        this.IdEmprestimo = IdEmprestimo;
    }

    /**
     * @return the localLivro
     */
    public String getLocalLivro() {
        return localLivro;
    }

    /**
     * @param localLivro the localLivro to set
     */
    public void setLocalLivro(String localLivro) {
        this.localLivro = localLivro;
    }

    /**
     * @return the Devolucao
     */
    public Date getDevolucao() {
        return Devolucao;
    }

    /**
     * @param Devolucao the Devolucao to set
     */
    public void setDevolucao(Date Devolucao) {
        this.Devolucao = Devolucao;
    }

    /**
     * @return the Retirada
     */
    public Date getRetirada() {
        return Retirada;
    }

    /**
     * @param Retirada the Retirada to set
     */
    public void setRetirada(Date Retirada) {
        this.Retirada = Retirada;
    }

    /**
     * @return the Retirante
     */
    public int getRetirante() {
        return Retirante;
    }

    /**
     * @param Retirante the Retirante to set
     */
    public void setRetirante(int Retirante) {
        this.Retirante = Retirante;
    }

    /**
     * @return the livroRetirado
     */
    public int getLivroRetirado() {
        return livroRetirado;
    }

    /**
     * @param livroRetirado the livroRetirado to set
     */
    public void setLivroRetirado(int livroRetirado) {
        this.livroRetirado = livroRetirado;
    }
    
}
