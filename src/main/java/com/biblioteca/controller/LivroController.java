/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca.controller;

import com.biblioteca.conexao.ConexaoBanco;
import static com.biblioteca.conexao.ConexaoBanco.executeQuery;
import static com.biblioteca.dados.BancoLivros.*;
import com.biblioteca.model.Livro;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author re91529z
 */
@RestController
public class LivroController {

    // será acessivel pela URL: http://localhost:8080/livro
    @GetMapping("/livro")
    public ArrayList<Livro> carregaLivros() throws SQLException {
        return carrega_Livros();
    }

    // será acessivel pela URL: http://localhost:8080/livro/1

    @GetMapping("/livro/{Funcionario}")
    public ArrayList<Livro> carregaLivros(@PathVariable("Funcionario") int Funcionario) throws SQLException {

        return carrega_Livros(Funcionario);
    }

    @RequestMapping(value = "/salvaLivro", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean salvaLivros(@RequestBody Livro livro) throws SQLException {

        return salva_Livros(livro);
    }

    @RequestMapping(value = "/alteraLivro", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean alteraLivros(@RequestBody Livro livro) throws SQLException {
        
        return altera_Livros(livro);
    }

    @DeleteMapping("/excluiLivro/{id}")
    public boolean excluiLivro(@PathVariable("id") int id) throws SQLException {
       
        ArrayList<Livro> livros = carrega_Livros_Esp(id); 
        if (livros.get(0).getLiberacao() == 2){
            return true;
        
        }
        
        else {           
            return exclui_Livros(id);
        }
        
       
        
    }

}
