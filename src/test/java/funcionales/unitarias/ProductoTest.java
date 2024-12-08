package funcionales.unitarias;

import java.time.LocalDateTime;
import modelo.Producto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductoTest {
    private Producto producto;

    @BeforeEach
    public void setUp() {
        // Inicializar el objeto Producto con datos de prueba
        producto = new Producto(1L, "Producto A", "Categoría B", 25.0, "Descripción del producto", LocalDateTime.now());
    }

    @Test
    public void testGetId() {
        assertEquals(1L, producto.getId());
    }

    @Test
    public void testGetNombre() {
        assertEquals("Producto A", producto.getNombre());
    }

    @Test
    public void testGetCategoria() {
        assertEquals("Categoría B", producto.getCategoria());
    }

    @Test
    public void testGetPrecio() {
        assertEquals(25.0, producto.getPrecio());
    }

    @Test
    public void testGetDescripcion() {
        assertEquals("Descripción del producto", producto.getDescripcion());
    }

    @Test
    public void testGetFechaHoraCreacion() {
        // Asegurarse de que la fecha de creación no sea nula
        assertEquals(producto.getFechaHoraCreacion().getDayOfYear(), LocalDateTime.now().getDayOfYear());
    }
}