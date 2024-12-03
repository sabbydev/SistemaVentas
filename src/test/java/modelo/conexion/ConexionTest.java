package modelo.conexion;

import org.junit.jupiter.api.Test;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConexionTest {

    @Test
    public void TestDB() throws Exception {
        Conexion conexionBD = new Conexion();
        conexionBD.conectar();

        // Consultas genéricas
        String crearTablaSQL = "CREATE TEMPORARY TABLE prueba (id INT PRIMARY KEY, valor VARCHAR(50))";
        String insertarSQL = "INSERT INTO prueba (id, valor) VALUES (1, 'Test')";
        String seleccionarSQL = "SELECT valor FROM prueba WHERE id = 1";
        String eliminarSQL = "DELETE FROM prueba WHERE id = 1";

        try {
            // Crear tabla temporal
            PreparedStatement crearTablaStmt = conexionBD.conexion.prepareStatement(crearTablaSQL);
            crearTablaStmt.executeUpdate();

            // **Inserción**
            PreparedStatement insertarStmt = conexionBD.conexion.prepareStatement(insertarSQL);
            int filasInsertadas = insertarStmt.executeUpdate();
            assertEquals(1, filasInsertadas, "La inserción falló: No se insertó ninguna fila.");

            // **Consulta**
            PreparedStatement seleccionarStmt = conexionBD.conexion.prepareStatement(seleccionarSQL);
            ResultSet resultSet = seleccionarStmt.executeQuery();
            String resultado = null;
            if (resultSet.next()) {
                resultado = resultSet.getString("valor");
            }
            assertEquals("Test", resultado, "El valor recuperado no coincide con el esperado.");

            // **Eliminación**
            PreparedStatement eliminarStmt = conexionBD.conexion.prepareStatement(eliminarSQL);
            int filasEliminadas = eliminarStmt.executeUpdate();
            assertEquals(1, filasEliminadas, "La eliminación falló: No se eliminó ninguna fila.");

            // Verificar eliminación
            resultSet = seleccionarStmt.executeQuery();
            boolean existe = resultSet.next();
            assertEquals(false, existe, "La fila no fue eliminada correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexionBD.desconectar();
        }
    }
}