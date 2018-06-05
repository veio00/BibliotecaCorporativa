/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca.controller;

import static com.biblioteca.dados.BancoComentario.exclui_Comentarios;
import static com.biblioteca.dados.BancoForum.altera_Forum;
import static com.biblioteca.dados.BancoForum.carrega_Forum;
import static com.biblioteca.dados.BancoForum.exclui_Forum;
import static com.biblioteca.dados.BancoForum.salva_Forum;
import com.biblioteca.model.Forum;
import java.sql.SQLException;
import java.util.ArrayList;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author re91529z
 */
@RestController
public class ForumController {

    // será acessivel pela URL: http://localhost:8080/forum
    @GetMapping("/forum")
    public ArrayList<Forum> carregaForum() throws SQLException {
        return carrega_Forum();
    }

    @RequestMapping(value = "/salvaForum", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean salvaForum(@RequestBody Forum forum) throws SQLException {

        return salva_Forum(forum);
    }

    @RequestMapping(value = "/alteraForum", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean alteraForum(@RequestBody Forum forum) throws SQLException {

        return altera_Forum(forum);
    }

    @DeleteMapping("/excluiForum/{id}")
    public boolean excluiForum(@PathVariable("id") int id) throws SQLException {
        if(true ==  exclui_Comentarios(id)){
            return exclui_Forum(id);
        }else{
            return false;
        }
    }
}
