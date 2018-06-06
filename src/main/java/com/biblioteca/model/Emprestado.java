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

    public int idEmprestimo;
    public String localLivro;
    public String devolucao;

    public String getRetirada() {
        return retirada;
    }

    public void setRetirada(String retirada) {
        this.retirada = retirada;
    }
    public String retirada;
    public int retirante;
    public int livroRetirado;

    public String getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(String devolucao) {
        this.devolucao = devolucao;
    }

    /**
     * @return the idEmprestimo
     */
    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    /**
     * @param idEmprestimo the idEmprestimo to set
     */
    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
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
     * @return the devolucao
     */
    /**
     * @return the retirante
     */
    public int getRetirante() {
        return retirante;
    }

    /**
     * @param retirante the retirante to set
     */
    public void setRetirante(int retirante) {
        this.retirante = retirante;
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
