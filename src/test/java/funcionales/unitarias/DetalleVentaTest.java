package funcionales.unitarias;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import modelo.DetalleVenta;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DetalleVentaTest {
    private DetalleVenta detalleVenta;

    @BeforeEach
    public void setUp() {
        detalleVenta = new DetalleVenta(1L, 100L, 200L, 50.0, 3, LocalDateTime.now());
    }

    @Test
    public void testGetId() {
        assertEquals(1L, detalleVenta.getId());
    }

    @Test
    public void testGetIdVenta() {
        assertEquals(100L, detalleVenta.getIdVenta());
    }

    @Test
    public void testGetIdMetodoPago() {
        assertEquals(200L, detalleVenta.getIdMetodoPago());
    }

    @Test
    public void testGetPrecioUnitario() {
        assertEquals(50.0, detalleVenta.getPrecioUnitario());
    }

    @Test
    public void testGetCantidad() {
        assertEquals(3, detalleVenta.getCantidad());
    }

    @Test
    public void testGetMontoTotal() {
        assertEquals(150.0, detalleVenta.getMontoTotal()); // 50.0 * 3
    }

    @Test
    public void testGetFechaHora() {
        LocalDateTime fechaHora = detalleVenta.getFechaHora();
        assertEquals(LocalDateTime.now().getDayOfMonth(), fechaHora.getDayOfMonth()); // Ejemplo básico de verificación
        assertEquals(LocalDateTime.now().getMonth(), fechaHora.getMonth());
        assertEquals(LocalDateTime.now().getYear(), fechaHora.getYear());
    }
}