/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca.bibliotecacorporativa;

import com.biblioteca.conexao.ConexaoBanco;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author re91529z
 */
@RestController
public class LivroController {
    
    
        // será acessivel pela URL: http://localhost:8080/livro/Andre
    @GetMapping("/livro/{nome}")
    public String getLivros(@PathVariable("nome") String nome) {
       
        
        return nome;
    }
    
    @GetMapping("/conexao")

    public String getConexao() {        
        return "foi";
    }
}
