/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca.bibliotecacorporativa;


import static com.biblioteca.dados.BancoFuncionario.carrega_Funcionario;
import static com.biblioteca.dados.BancoFuncionario.salva_Funcionario;
import com.biblioteca.model.Funcionario;
import java.sql.SQLException;
import java.util.ArrayList;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author re91529z
 */
@RestController
public class FuncionarioController {
         // será acessivel pela URL: http://localhost:8080/forum
    @GetMapping("/funcionario")
    public ArrayList<Funcionario> carregaFuncionario() throws SQLException {
        ArrayList<Funcionario> f = new ArrayList<>();
        f = carrega_Funcionario();
        return f;
    }
    
   @RequestMapping(value = "/salvaFuncionario", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean salvaFuncionario(@RequestBody Funcionario funcionario) throws SQLException {

        return salva_Funcionario(funcionario);
    }
}
