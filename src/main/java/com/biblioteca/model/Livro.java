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
public class Livro {
  private int idlivro;
  private String ISBN;
  private String Condicao;
  private int Liberacao;
  private int Usuario;

    /**
     * @return the idlivro
     */
    public int getIdlivro() {
        return idlivro;
    }

    /**
     * @param idlivro the idlivro to set
     */
    public void setIdlivro(int idlivro) {
        this.idlivro = idlivro;
    }

    /**
     * @return the ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * @return the Condicao
     */
    public String getCondicao() {
        return Condicao;
    }

    /**
     * @param Condicao the Condicao to set
     */
    public void setCondicao(String Condicao) {
        this.Condicao = Condicao;
    }

    /**
     * @return the Liberacao
     */
    public int getLiberacao() {
        return Liberacao;
    }

    /**
     * @param Liberacao the Liberacao to set
     */
    public void setLiberacao(int Liberacao) {
        this.Liberacao = Liberacao;
    }

    /**
     * @return the Usuario
     */
    public int getUsuario() {
        return Usuario;
    }

    /**
     * @param Usuario the Usuario to set
     */
    public void setUsuario(int Usuario) {
        this.Usuario = Usuario;
    }

    
}
