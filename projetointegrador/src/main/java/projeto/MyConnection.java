package projeto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ferna
 */
public class MyConnection {
    
    static String usuario = "root";
    static String senha = "@Matematica100";
    static String host = "localhost";
    static String porta = "3306";
    static String bd = "quiz_pi";
    
    public static Connection getConnection() {
        
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + bd, usuario, senha);
            System.out.println("Conectado ao banco de dados");
            return con;
        }catch (SQLException e) {
            throw new RuntimeException("Impossível conecetar ao banco de dados", e);
        }
    }
}
