package br.com.champtech.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author denis_stiehler
 */
public final class ConnectionFactory {

    private static Connection CONNECTION;

    static {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/db_champtech?useSSL=false";
            String usuario = "root";
            String senha = "root";

            CONNECTION = DriverManager.getConnection(url, usuario, senha);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static final Statement getStatement() {

        try {

            return CONNECTION.createStatement();

        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
