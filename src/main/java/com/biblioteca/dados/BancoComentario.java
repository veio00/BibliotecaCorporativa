/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca.dados;

import com.biblioteca.conexao.ConexaoBanco;
import static com.biblioteca.conexao.ConexaoBanco.executeQuery;
import com.biblioteca.model.Comentario;
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
    
    
    public static ArrayList<Comentario> carrega_Comentario () throws SQLException {
        ResultSet rs = executeQuery("Select * from Comentario");
        ArrayList<Comentario> le = new ArrayList<Comentario>();
        
             while (rs.next())
            {
            Comentario  c = new Comentario ();
            c.setIdComentario(rs.getInt("idComentario"));
            c.setMensagem(rs.getString("Mensagem"));
            //c.setComentado(rs.getDate("Comentado"));
            c.setComentarista(rs.getInt("Comentarista"));
            c.setDoForum(rs.getInt("doForum"));
            le.add(c);
               
            }
             
            return le;       
    }
    
        public static boolean salva_Comentario(Comentario comentario) throws SQLException {
        
         return ConexaoBanco.executeCommand("Insert into Comentario (Mensagem,Comentarista,doForum) Values ('"+comentario.getMensagem()+"',"+comentario.getComentarista()+","+comentario.getDoForum()+")");
         
    }
    
}
