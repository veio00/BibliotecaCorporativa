/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.boot.autoconfigure.jersey.JerseyAutoConfiguration;

/**
 *
 * @author re91529z
 */
public class ConexaoBanco {
//jdbc:sqlserver://10.232.0.16:1433;databaseName=SELFBK [travelusr em dbo]

    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String connectionStr = "jdbc:sqlserver://10.232.0.16:1433;databaseName=SELFBK";
    private static String usuario = "travelusr";
    private static String senha = "travel";

    private static ConexaoBanco Banco = null;

//    private ConexaoBanco() {
//        try {
//            Class.forName(driver);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public static ConexaoBanco getInstance() {
//        if (Banco == null) {
//            Banco = new ConexaoBanco();
//        }
//
//        return Banco;
//    }
    private static Connection open() throws SQLException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(connectionStr, usuario, senha);
            String open = conn.getSchema();
            return conn;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void close(Connection conn) throws SQLException {
        conn.close();
    }

    public static ResultSet executeQuery(String sql) {
        try {
            Connection conn = open();
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rset = pstm.executeQuery();
            close(conn);
            return rset;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
  
    }

    public static void main(String[] args) throws SQLException {

        ResultSet rs=  executeQuery("Select * from Livro");
        
        System.out.println(rs);

    }
}
