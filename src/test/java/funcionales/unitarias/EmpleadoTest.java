package funcionales.unitarias;

import modelo.Empleado;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadoTest {
    private Empleado empleado;

    @BeforeEach
    public void setUp() {
        // Inicializar el objeto Empleado con datos de prueba
        empleado = new Empleado(1L, "12345678", "Carlos Garcia", "carlos.garcia@example.com", "Cocinero", 2500.00);
    }

    @Test
    public void testGetId() {
        assertEquals(1L, empleado.getId());
    }

    @Test
    public void testGetDni() {
        assertEquals("12345678", empleado.getDni());
    }

    @Test
    public void testGetNombre() {
        assertEquals("Carlos Garcia", empleado.getNombre());
    }

    @Test
    public void testGetCorreo() {
        assertEquals("carlos.garcia@example.com", empleado.getCorreo());
    }

    @Test
    public void testGetRol() {
        assertEquals("Cocinero", empleado.getRol());
    }

    @Test
    public void testGetSalario() {
        assertEquals(2500.00, empleado.getSalario());
    }

    @Test
    public void testSetNombre() {
        empleado.setNombre("Juan Perez");
        assertEquals("Juan Perez", empleado.getNombre());
    }

    @Test
    public void testSetCorreo() {
        empleado.setCorreo("juan.perez@example.com");
        assertEquals("juan.perez@example.com", empleado.getCorreo());
    }

    @Test
    public void testSetRol() {
        empleado.setRol("Gerente");
        assertEquals("Gerente", empleado.getRol());
    }

    @Test
    public void testSetSalario() {
        empleado.setSalario(3000.00);
        assertEquals(3000.00, empleado.getSalario());
    }
}