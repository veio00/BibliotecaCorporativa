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
  public int Idlivro;
  public int ISBN;
  public String Condicao;
  public int Liberacao;
  public int Usuario;

    /**
     * @return the Idlivro
     */
    public int getIdlivro() {
        return Idlivro;
    }

    /**
     * @param Idlivro the Idlivro to set
     */
    public void setIdlivro(int Idlivro) {
        this.Idlivro = Idlivro;
    }

    /**
     * @return the ISBN
     */
    public int getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(int ISBN) {
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
