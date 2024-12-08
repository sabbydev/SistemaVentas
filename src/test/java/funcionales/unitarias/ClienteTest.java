package funcionales.unitarias;

import modelo.Cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {
    private Cliente cliente;

    @BeforeEach
    public void setUp() {
        cliente = new Cliente(1L, "12345678", "Juan Perez", "juan.perez@example.com", "1234567890");
    }

    @Test
    public void testGetId() {
        assertEquals(1L, cliente.getId());
    }

    @Test
    public void testGetIdDoc() {
        assertEquals("12345678", cliente.getIdDoc());
    }

    @Test
    public void testGetNombre() {
        assertEquals("Juan Perez", cliente.getNombre());
    }

    @Test
    public void testSetNombre() {
        cliente.setNombre("Carlos Lopez");
        assertEquals("Carlos Lopez", cliente.getNombre());
    }

    @Test
    public void testGetCorreo() {
        assertEquals("juan.perez@example.com", cliente.getCorreo());
    }

    @Test
    public void testSetCorreo() {
        cliente.setCorreo("carlos.lopez@example.com");
        assertEquals("carlos.lopez@example.com", cliente.getCorreo());
    }

    @Test
    public void testGetTelefono() {
        assertEquals("1234567890", cliente.getTelefono());
    }

    @Test
    public void testSetTelefono() {
        cliente.setTelefono("0987654321");
        assertEquals("0987654321", cliente.getTelefono());
    }
}