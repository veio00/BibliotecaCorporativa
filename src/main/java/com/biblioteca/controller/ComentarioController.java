/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca.controller;

import com.biblioteca.dados.BancoComentario;
import static com.biblioteca.dados.BancoComentario.carrega_Comentario;
import static com.biblioteca.dados.BancoComentario.salva_Comentario;
import static com.biblioteca.dados.BancoLivros.salva_Livros;
import com.biblioteca.model.Comentario;

import java.sql.SQLException;
import java.util.ArrayList;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import static com.biblioteca.dados.BancoComentario.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author re91529z
 */
@RestController
public class ComentarioController {

    // será acessivel pela URL: http://localhost:8080/comentario
    @GetMapping("/comentario")
    public ArrayList<Comentario> carregaComentario() throws SQLException {
        return carrega_Comentario();
    }

    @RequestMapping(value = "/salvaComentario", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean salvaComentario(@RequestBody Comentario comentario) throws SQLException {

        return salva_Comentario(comentario);
    }

    @RequestMapping(value = "/alteraComentario", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean alteraComentario(@RequestBody Comentario comentario) throws SQLException {

        return altera_Comentario(comentario);
    }

    @DeleteMapping("/excluiComentario/{id}")
    public boolean excluiComentario(@PathVariable("id") int id) throws SQLException {

        return exclui_Comentario(id);
    }

}
