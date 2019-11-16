package br.com.champtech;

import br.com.champtech.db.ConnectionFactory;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author denis_stiehler
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produtos.main(args);

        /*
        try {
            
            Statement statement = ConnectionFactory.getStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM tb_usuario WHERE usuario = 'valdir'");
            
            while  (result.next()) {
                
                System.out.println(result.getString("email"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }
         */
    }
}
