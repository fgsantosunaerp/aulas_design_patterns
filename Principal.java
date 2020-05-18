import java.sql.SQLException;

public class Principal {
    public static void main(String[] args) throws SQLException{
        Genero g = new Genero();
        g.setNome("Funk");

        GeneroDAO dao = new GeneroDAO();
        dao.insert(g);
        System.out.println("Gravou!");
        
    }
}