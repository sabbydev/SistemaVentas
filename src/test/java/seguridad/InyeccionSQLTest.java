package seguridad;

import modelo.dto.EmpleadoDTO;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InyeccionSQLTest {

    String correo = "admin' OR '1'='1";
    String password = "cualquierContraseña";
    
    @Test
    public void testInyeccionSQL() {
        EmpleadoDTO resultado = controlador.ControladorSesion.autenticarUsuario(correo, password);
        assertNull(resultado, "Peligro: El sistema es vulnerable a Inyección SQL");
    }
}