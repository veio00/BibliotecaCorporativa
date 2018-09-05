/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblioteca.conexao;

import com.biblioteca.model.Livro;
import com.google.gson.Gson;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.List;
import org.springframework.boot.autoconfigure.jersey.JerseyAutoConfiguration;
import static org.springframework.core.convert.TypeDescriptor.array;

/**
 *
 * @author re91529z
 */
public class ConexaoBanco {
//jdbc:sqlserver://10.232.0.16:1433;databaseName=SELFBK [travelusr em dbo]

    /*
    Conexeão Banco de Dados Logicalis:

    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String connectionStr = "jdbc:sqlserver://10.232.0.16:1433;databaseName=SELFBK";
    private static String usuario = "travelusr";
    private static String senha = "travel";
    */

    // Conexão com Azure
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String connectionStr = "jdbc:sqlserver://aco.database.windows.net:1433;database=Digito";
    private static String usuario = "aco@aco";
    private static String senha = "LogicalisDigito2018";




    public static Connection open() throws SQLException {
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

    public static void close(Connection conn) throws SQLException {
        conn.close();
    }

    public static ResultSet executeQuery(String sql) throws SQLException {

        try {

            Connection conn = open();
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rset = pstm.executeQuery();
            return rset;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }

    public static ResultSet executeQuery(String sql, Connection conn) throws SQLException {

        try {

            //Connection conn = open();
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rset = pstm.executeQuery();
            return rset;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
    
    
    public static boolean executeCommand(String sql) throws SQLException {
        Connection conn = open();
        PreparedStatement pstm = conn.prepareStatement(sql);
        return pstm.executeUpdate() > 0;
    }
}
