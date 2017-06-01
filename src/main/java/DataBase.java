import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Kekko on 23/05/2017.
 */
public class DataBase {
    private String db;
    public DataBase(String db) {
        this.db = db;
    }
    public Connection connectToDB(String server, String db, String username, String password) throws Exception {
        return DriverManager.getConnection ("jdbc:mysql://localhost/prueba","root", "la_clave");
    }
    public void InsertPerson(String name) throws Exception {
    }

    public static void main(String[] args) {
        DataBase.
    }
}
