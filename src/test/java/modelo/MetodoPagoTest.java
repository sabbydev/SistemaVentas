package modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MetodoPagoTest {
    private MetodoPago metodoPago;

    @BeforeEach
    public void setUp() {
        // Inicializar el objeto MetodoPago con datos de prueba
        metodoPago = new MetodoPago(1, "TARJETA_DE_CREDITO", "Pago con tarjeta de crédito", "ACTIVO");
    }

    @Test
    public void testGetId() {
        assertEquals(1, metodoPago.getId());
    }

    @Test
    public void testGetNombre() {
        assertEquals("TARJETA_DE_CREDITO", metodoPago.getNombre());
    }

    @Test
    public void testGetDescripcion() {
        assertEquals("Pago con tarjeta de crédito", metodoPago.getDescripcion());
    }

    @Test
    public void testGetEstado() {
        assertEquals("ACTIVO", metodoPago.getEstado());
    }

    @Test
    public void testSetNombre_ValidValue() {
        metodoPago.setNombre("TARJETA_DE_DEBITO");
        assertEquals("TARJETA_DE_DEBITO", metodoPago.getNombre());
    }

    @Test
    public void testSetNombre_InvalidValue() {
        metodoPago.setNombre("TARJETA");
        assertEquals("DESCONOCIDO", metodoPago.getNombre());
    }

    @Test
    public void testSetEstado_ValidValue() {
        metodoPago.setEstado("INACTIVO");
        assertEquals("INACTIVO", metodoPago.getEstado());
    }

    @Test
    public void testSetEstado_InvalidValue() {
        metodoPago.setEstado("INVALIDO");
        assertEquals("ERROR", metodoPago.getEstado());
    }
}