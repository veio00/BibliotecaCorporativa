/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca.bibliotecacorporativa;

import static com.biblioteca.dados.BancoComentario.salva_Comentario;
import static com.biblioteca.dados.BancoReserva.carrega_Reserva;
import static com.biblioteca.dados.BancoReserva.salva_Reserva;
import com.biblioteca.model.Comentario;
import com.biblioteca.model.Reserva;
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
public class ReservaController {
    // será acessivel pela URL: http://localhost:8080/reserva
    @GetMapping("/reserva")
    public ArrayList<Reserva> carregaReserva() throws SQLException {
        return carrega_Reserva();
    }
    
    @RequestMapping(value = "/salvaReserva", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean salvaReserva(@RequestBody Reserva reserva) throws SQLException {

        return salva_Reserva(reserva);
    }


}
