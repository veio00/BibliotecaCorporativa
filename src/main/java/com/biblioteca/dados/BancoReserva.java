/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca.dados;

import com.biblioteca.conexao.ConexaoBanco;
import static com.biblioteca.conexao.ConexaoBanco.executeQuery;
import com.biblioteca.model.Funcionario;
import com.biblioteca.model.Reserva;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author re91529z
 */
public class BancoReserva {

    public static ArrayList<Reserva> carrega_Reserva() throws SQLException {
        ResultSet rs = executeQuery("Select * from Reserva");
        ArrayList<Reserva> lr = new ArrayList<Reserva>();

        while (rs.next()) {
            Reserva r = new Reserva();
            r.setIdReserva(rs.getInt("idReserva"));
            r.setDatasSolicitada(rs.getString("dataSolicitada"));
            r.setEstadoReserva(rs.getInt("estadoReserva"));
            r.setLivroReservado(rs.getInt("livroReservado"));
            r.setSolicitante(rs.getInt("Solicitante"));
            lr.add(r);

        }

        return lr;

    }

    public static boolean salva_Reserva(Reserva reserva) throws SQLException {

        return ConexaoBanco.executeCommand("Insert into Reserva (dataSolicitada,estadoReserva,livroReservado,Solicitante) Values ('" + reserva.getDatasSolicitada() + "',"
                + reserva.getEstadoReserva() + "," + reserva.getLivroReservado() + "," + reserva.getSolicitante() + ")");
    }

    public static boolean altera_Reserva(Reserva reserva) throws SQLException {

        return ConexaoBanco.executeCommand("update Reserva set dataSolicitada='" + reserva.getDatasSolicitada() + "',estadoReserva=" + reserva.getEstadoReserva() + ", livroReservado=" + reserva.getLivroReservado() + ",Solicitante=" + reserva.getSolicitante() + " where idReserva=" + reserva.getIdReserva() + "");

    }

    public static boolean exclui_Reserva(int id) throws SQLException {

        return ConexaoBanco.executeCommand("delete from Reserva where idReserva = " + id + "");

    }

}
