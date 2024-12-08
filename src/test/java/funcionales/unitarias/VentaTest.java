package funcionales.unitarias;

import modelo.Venta;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VentaTest {
    private Venta venta;

    @BeforeEach
    public void setUp() {
        venta = new Venta(1L, 100L, 200L, 300L);
    }

    @Test
    public void testGetId() {
        assertEquals(1L, venta.getId());
    }

    @Test
    public void testGetIdCliente() {
        assertEquals(100L, venta.getIdCliente());
    }

    @Test
    public void testGetIdEmpleado() {
        assertEquals(200L, venta.getIdEmpleado());
    }

    @Test
    public void testGetIdProducto() {
        assertEquals(300L, venta.getIdProducto());
    }
}