/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca.dados;

import com.biblioteca.conexao.ConexaoBanco;
import static com.biblioteca.conexao.ConexaoBanco.executeQuery;
import com.biblioteca.model.Forum;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author re91529z
 */
public class BancoForum {

    public static ArrayList<Forum> carrega_Forum() throws SQLException {
        ResultSet rs = executeQuery("Select * from Forum");
        ArrayList<Forum> lfr = new ArrayList<Forum>();

        while (rs.next()) {
            Forum fr = new Forum();
            fr.setIdForum(rs.getInt("IdForum"));
            fr.setDescricao(rs.getString("Descricao"));
            fr.setISBNref(rs.getInt("ISBNref"));
            lfr.add(fr);

        }
        return lfr;

    }

    public static boolean salva_Forum(Forum forum) throws SQLException {

        return ConexaoBanco.executeCommand("Insert into Forum (Descricao,ISBNref) Values ('" + forum.getDescricao() + "'," + forum.getISBNref() + ")");
    }

    public static boolean altera_Forum(Forum forum) throws SQLException {

        return ConexaoBanco.executeCommand("update Forum set Descricao = '" + forum.getDescricao() + "', ISBNref =" + forum.getISBNref() + "  where idForum=" + forum.getIdForum() + "");

    }

    public static boolean exclui_Forum(int id) throws SQLException {

        return ConexaoBanco.executeCommand("delete from Forum where idForum =  " + id + "");

    }

}
