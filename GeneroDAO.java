import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GeneroDAO {
    private Connection con;

    public GeneroDAO(){
        this.con = ConnectionFactory.getConnection();
    }
    
    public void insert(Genero g){
        String sql = "insert into genres (name) values (?)";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, g.getNome());
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            e.getMessage();
        }
    }
}