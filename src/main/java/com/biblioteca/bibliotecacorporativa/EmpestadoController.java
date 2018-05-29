/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca.bibliotecacorporativa;

import static com.biblioteca.dados.BancoEmprestado.carrega_Emprestado;
import static com.biblioteca.dados.BancoEmprestado.salva_Emprestado;
import com.biblioteca.model.Emprestado;
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
public class EmpestadoController {
        // será acessivel pela URL: http://localhost:8080/emprestado
    @GetMapping("/emprestado")
    public ArrayList<Emprestado> carregaEmprestado() throws SQLException {
        return carrega_Emprestado();
    }
    
    @RequestMapping(value = "/salvaEmprestado", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean salvaEmprestado(@RequestBody Emprestado emprestado) throws SQLException {

        return salva_Emprestado(emprestado);
    }
    
}
