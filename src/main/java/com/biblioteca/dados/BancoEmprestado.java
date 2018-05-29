/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca.dados;

import com.biblioteca.conexao.ConexaoBanco;
import static com.biblioteca.conexao.ConexaoBanco.executeQuery;
import com.biblioteca.model.Comentario;
import com.biblioteca.model.Emprestado;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author re91529z
 */
public class BancoEmprestado {

    public static ArrayList<Emprestado> carrega_Emprestado() throws SQLException {
        ResultSet rs = executeQuery("Select * from Emprestado");
        ArrayList<Emprestado> le = new ArrayList<Emprestado>();

        while (rs.next()) {
            Emprestado e = new Emprestado();
            e.setIdEmprestimo(rs.getInt("idEmprestimo"));
            e.setLocalLivro(rs.getString("localLivro"));
            e.setDevolucao(rs.getDate("Devolucao"));
            e.setRetirada(rs.getDate("Retirada"));
            e.setRetirante(rs.getInt("Retirante"));
            e.setLivroRetirado(rs.getInt("livroRetirado"));
            le.add(e);

        }

        return le;
    }

    public static boolean salva_Emprestado(Emprestado emprestado) throws SQLException {

        return ConexaoBanco.executeCommand("Insert into Emprestado (localLivro,Devolucao,Retirada,Retirante,livroRetirado) Values (" + emprestado.getLocalLivro()
                + ",'" + emprestado.getDevolucao() + "'," + emprestado.getRetirada() + "," + emprestado.getRetirante() + "'," + emprestado.getLivroRetirado() + ")");
    }

}
