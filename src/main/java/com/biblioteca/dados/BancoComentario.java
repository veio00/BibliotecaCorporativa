/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca.dados;

import com.biblioteca.conexao.ConexaoBanco;
import static com.biblioteca.conexao.ConexaoBanco.executeQuery;
import com.biblioteca.model.Comentario;
import com.biblioteca.model.Livro;
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
public class BancoComentario {

    public static ArrayList<Comentario> carrega_Comentario() throws SQLException {
        Connection conn = ConexaoBanco.open();
        try{
            ResultSet rs = executeQuery("Select * from Comentario", conn);
            ArrayList<Comentario> le = new ArrayList<Comentario>();

            while (rs.next()) {
                Comentario c = new Comentario();
                c.setIdComentario(rs.getInt("idComentario"));
                c.setMensagem(rs.getString("Mensagem"));
                c.setComentado(rs.getString("Comentado"));
                c.setComentarista(rs.getInt("Comentarista"));
                c.setDoForum(rs.getInt("doForum"));
                le.add(c);

            }

            return le;    
            
        }finally{
            ConexaoBanco.close(conn);
        }
    }

    public static boolean salva_Comentario(Comentario comentario) throws SQLException {

        return ConexaoBanco.executeCommand("Insert into Comentario (Mensagem,Comentado,Comentarista,doForum) Values ('" + comentario.getMensagem() + "','" + comentario.getComentado() + "'," + comentario.getComentarista() + "," + comentario.getDoForum() + ")");

    }

    public static boolean altera_Comentario(Comentario comentario) throws SQLException {

        return ConexaoBanco.executeCommand("update Comentario set Mensagem = '" + comentario.getMensagem() + "',Comentado= '" + comentario.getComentado() + "',Comentarista = " + comentario.getComentarista() + ",doForum =" + comentario.getDoForum() + " where idComentario= " + comentario.getIdComentario() + "");

    }

    public static boolean exclui_Comentario(int id) throws SQLException {

        return ConexaoBanco.executeCommand("delete from Comentario where idComentario = " + id + "");

    }
    
    
    public static boolean exclui_Comentarios(int id) throws SQLException {

        return ConexaoBanco.executeCommand("delete from comentario where idComentario in (select idcomentario from comentario where doForum = " + id + ")");

    }


}
