import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExemploJDBC {
    public static void main(String[] args) throws SQLException{
        Connection  con = DriverManager.getConnection("jdbc:sqlite:chinook.db");
        System.out.println("Conectado !!!");
        con.close();
    }
}