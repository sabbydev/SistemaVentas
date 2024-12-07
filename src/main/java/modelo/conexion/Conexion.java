package modelo.conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    protected Connection conexion;
    
    private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/sistemaventas";
    
    private final String USER = "root";
    private final String PASSWORD = "admin";
    
    public void conectar() throws Exception {
        try {
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            Class.forName(JDBC_DRIVER);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void desconectar() throws SQLException{
        if(conexion != null) {
            if(!conexion.isClosed()) {
                conexion.close();
            }
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
}
