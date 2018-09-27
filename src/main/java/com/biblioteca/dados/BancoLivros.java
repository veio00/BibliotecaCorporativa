/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca.dados;

import com.biblioteca.conexao.ConexaoBanco;
import static com.biblioteca.conexao.ConexaoBanco.executeQuery;
import com.biblioteca.model.Livro;
import com.google.gson.Gson;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author re91529z
 */
public class BancoLivros {

    public static ArrayList<Livro> carrega_Livros() throws SQLException {
        Connection conn = ConexaoBanco.open();
        try {

            ArrayList<Livro> lista = new ArrayList<>();
            ResultSet rset = executeQuery("Select * from Livro");

            while (rset.next()) {

                Livro l = new Livro();
                l.setIdlivro(rset.getInt("idLivro"));
                l.setISBN(rset.getString("ISBN"));
                l.setCondicao(rset.getString("Condicao"));
                l.setLiberacao(rset.getInt("Liberacao"));
                l.setUsuario(rset.getInt("Usuario"));
                lista.add(l);

            }

            return lista;

        } finally {
            ConexaoBanco.close(conn);
        }
    }

    public static ArrayList<Livro> carrega_Livros(int Funcionario) throws SQLException {
        Connection conn = ConexaoBanco.open();
        try {

            ArrayList<Livro> lista = new ArrayList<>();
            ResultSet rset = executeQuery("Select * from Livro where usuario = " + Funcionario + "", conn);

            while (rset.next()) {

                Livro l = new Livro();
                l.setIdlivro(rset.getInt("idLivro"));
                l.setISBN(rset.getString("ISBN"));
                l.setCondicao(rset.getString("Condicao"));
                l.setLiberacao(rset.getInt("Liberacao"));
                l.setUsuario(rset.getInt("Usuario"));
                lista.add(l);

            }

            return lista;
        } finally {
            ConexaoBanco.close(conn);
        }
    }



    public static ArrayList<Livro> carrega_Livros_Esp(int livro) throws SQLException {

        ArrayList<Livro> lista = new ArrayList<>();
        ResultSet rset = executeQuery("Select * from Livro where idLivro = " + livro + "");

        while (rset.next()) {

            Livro l = new Livro();
            l.setIdlivro(rset.getInt("idLivro"));
            l.setISBN(rset.getString("ISBN"));
            l.setCondicao(rset.getString("Condicao"));
            l.setLiberacao(rset.getInt("Liberacao"));
            l.setUsuario(rset.getInt("Usuario"));
            lista.add(l);

        }

        return lista;
    }

    public static boolean salva_Livros(Livro livro) throws SQLException {

        return ConexaoBanco.executeCommand("Insert into Livro(ISBN,Condicao,Liberacao,Usuario) Values ('" + livro.getISBN() + "','" + livro.getCondicao() + "'," + livro.getLiberacao() + "," + livro.getUsuario() + ")");

    }

    public static boolean altera_Livros(Livro livro) throws SQLException {

        return ConexaoBanco.executeCommand("update Livro set ISBN = '" + livro.getISBN() + "',Condicao='" + livro.getCondicao() + "',Liberacao=" + livro.getLiberacao() + ",Usuario=" + livro.getUsuario() + "  where idLivro= " + livro.getIdlivro() + "");

    }

    public static boolean exclui_Livros(int id) throws SQLException {
        /*
         Observação nesse contexto ocorre a atuaulização do campo definido campo liberação
         */

        return ConexaoBanco.executeCommand("update livro set Liberacao = 2 where idLivro = " + id + "");

    }
}
