/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca.dados;

import com.biblioteca.conexao.ConexaoBanco;
import static com.biblioteca.conexao.ConexaoBanco.executeQuery;
import com.biblioteca.model.Funcionario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author re91529z
 */
public class BancoFuncionario {

    public static ArrayList<Funcionario> carrega_Funcionario() throws SQLException {
        Connection conn = ConexaoBanco.open();
        try {

            ResultSet rs = executeQuery("Select * from Funcionario",conn);

            ArrayList<Funcionario> lf = new ArrayList<Funcionario>();

            while (rs.next()) {
                Funcionario f = new Funcionario();
                f.setIdFuncionario(rs.getInt("idFuncionario"));
                f.setNome(rs.getString("Nome"));
                f.setRe(rs.getString("Re"));
                f.setExp(rs.getInt("Exp"));
                lf.add(f);

            }

            return lf;

        } finally {
            ConexaoBanco.close(conn);
        }
    }

    public static boolean salva_Funcionario(Funcionario funcionario) throws SQLException {

        return ConexaoBanco.executeCommand("Insert into Funcionario (Nome,Re,Exp) Values ('" + funcionario.getNome() + "','" + funcionario.getRe() + "'," + funcionario.getExp() + ")");
    }

    public static boolean altera_Funcionario(Funcionario funcionario) throws SQLException {

        return ConexaoBanco.executeCommand("update Funcionario set Nome = '" + funcionario.getNome() + "', Re= '" + funcionario.getRe() + "', Exp=" + funcionario.getExp() + "  where idFuncionario=" + funcionario.getidFuncionario() + "");

    }

    public static boolean exclui_Funcionario(int id) throws SQLException {
    //obs: Exclusão do funcionário será remoção do RE - Analisar essa questão.
        return ConexaoBanco.executeCommand("delete from Funcionario where idFuncionario =  " + id + "");

    }

}
