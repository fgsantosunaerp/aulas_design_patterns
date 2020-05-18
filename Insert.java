import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Insert {
    public static void main(String[] args) throws SQLException{
        Connection con = ConnectionFactory.getConnection();

        String sql = "insert into genres (name) values (?)";
       
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, "Forro");

        pst.execute();
        pst.close();
        System.out.println("Gravou!");
        con.close();
    }
}