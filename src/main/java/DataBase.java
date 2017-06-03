import java.sql.*;

/**
 * Created by Kekko on 23/05/2017.
 */
public class DataBase {
    private String db;
    private String server;
    private String username;
    private String password;

    static DataBase dataBase = new DataBase();

//    public DataBase(String server, String db, String username, String password) {
//        this.server = server;
//        this.db = db;
//        this.username = username;
//        this.password = password;
//    }

    public DataBase() {

    }

    public Connection connectToDB() throws Exception {
        return DriverManager.getConnection ("jdbc:mysql://" + this.server + "/" + this.db ,this.username, this.password);
    }

//    public boolean checkUserPass(String user) throws Exception{
//        Statement s = new DataBase(this.server,this.db,this.username,this.password).connectToDB().createStatement();
//        ResultSet rs = s.executeQuery ("SELECT * FROM BIBLIOTECARIO");
//        if (rs.getString(5) == user) return true;
//        return false;
//    }

    public boolean checkLogin(String user, String password) {
        try {
            // Connection IP liceu
            // Connection c = DriverManager.getConnection("jdbc:mysql://172.16.7.135/BIBLIOTECA", "root", "123");
            // Connection IP aereopuerto
            Connection c = DriverManager.getConnection("jdbc:mysql://10.82.237.91/BIBLIOTECA", "root", "123");
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT COUNT(USUARIO),COUNT(CONTRASEÑA) FROM BIBLIOTECARIO WHERE USUARIO = '" + user + "' AND CONTRASEÑA = MD5('" + password + "');");
            while (rs.next()) {
                if (rs.getInt(1) == 1) {
                    return true;
                }
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Fallo en el usuario y/o contraseña");
        }
        return false;
    }

    public void insertSocio(int id, String dni, String nombre, String apellido1, String apellido2, String direccion, int cp, String provincia, String pais, int tel1, int tel2, String email) {
        PreparedStatement psInsertar = null;
        try {
            // Connection IP liceu
            // Connection c = DriverManager.getConnection("jdbc:mysql://172.16.7.135/BIBLIOTECA", "root", "123");
            // Connection IP aereopuerto
            Connection c = DriverManager.getConnection("jdbc:mysql://10.82.237.91/BIBLIOTECA", "root", "123");
            // Insert into
            if (null == psInsertar) {
                psInsertar = c.prepareStatement("INSERT INTO SOCIO VALUES ('" + id +
                        "','" + dni +
                        "','" + nombre +
                        "','" + apellido1 +
                        "','" + apellido2 +
                        "',now(),'HOMBRE','" + direccion +
                        "','" + cp +
                        "','" + provincia +
                        "','" + pais +
                        "','" + tel1 +
                        "','"+ tel2 +
                        "','" + email + "');");
                psInsertar.execute();
            }
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
