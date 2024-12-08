package funcionales.unitarias;

import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Empleado;
import modelo.Producto;
import modelo.Restaurante;
import modelo.Venta;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestauranteTest {
    private Restaurante restaurante;

    @BeforeEach
    public void setUp() {
        List<Cliente> clientes = new ArrayList<>();
        List<Empleado> empleados = new ArrayList<>();
        List<Producto> productos = new ArrayList<>();
        List<Venta> ventas = new ArrayList<>();

        // Agregar algunos datos de prueba
        clientes.add(new Cliente(5L, "12345678911", "Juan Perez", "juan.perez@example.com", "123456789"));
        empleados.add(new Empleado(6L, "1234567", "Carlos Garcia", "carlos.garcia@example.com", "Vendedor", 1234.56));
        productos.add(new Producto(7L, "Producto A", "Categoría B", 25.0, "Descripción", LocalDateTime.now()));
        ventas.add(new Venta(1L, 2L, 3L, 4L));

        restaurante = new Restaurante("RUC123456", "Restaurante XYZ", "Restaurante XYZ S.A.", "Av. Principal 123", "987654321", clientes, empleados, productos, ventas);
    }

    @Test
    public void testGetRuc() {
        assertEquals("RUC123456", restaurante.getRuc());
    }

    @Test
    public void testGetNombre() {
        assertEquals("Restaurante XYZ", restaurante.getNombre());
    }

    @Test
    public void testGetRazonSocial() {
        assertEquals("Restaurante XYZ S.A.", restaurante.getRazonSocial());
    }

    @Test
    public void testGetDireccion() {
        assertEquals("Av. Principal 123", restaurante.getDireccion());
    }

    @Test
    public void testGetTelefono() {
        assertEquals("987654321", restaurante.getTelefono());
    }

    @Test
    public void testGetClientes() {
        assertEquals(1, restaurante.getClientes().size());
        assertEquals("Juan Perez", restaurante.getClientes().get(0).getNombre());
    }

    @Test
    public void testGetEmpleados() {
        assertEquals(1, restaurante.getEmpleados().size());
        assertEquals("Carlos Garcia", restaurante.getEmpleados().get(0).getNombre());
    }

    @Test
    public void testGetProductos() {
        assertEquals(1, restaurante.getProductos().size());
        assertEquals("Producto A", restaurante.getProductos().get(0).getNombre());
    }

    @Test
    public void testGetVentas() {
        assertEquals(1, restaurante.getVentas().size());
        assertEquals(1L, restaurante.getVentas().get(0).getId());
    }

    @Test
    public void testSetRuc() {
        restaurante.setRuc("RUC654321");
        assertEquals("RUC654321", restaurante.getRuc());
    }

    @Test
    public void testSetNombre() {
        restaurante.setNombre("Nuevo Restaurante");
        assertEquals("Nuevo Restaurante", restaurante.getNombre());
    }

    @Test
    public void testSetRazonSocial() {
        restaurante.setRazonSocial("Nuevo Restaurante S.A.");
        assertEquals("Nuevo Restaurante S.A.", restaurante.getRazonSocial());
    }

    @Test
    public void testSetDireccion() {
        restaurante.setDireccion("Nueva Av. 456");
        assertEquals("Nueva Av. 456", restaurante.getDireccion());
    }

    @Test
    public void testSetTelefono() {
        restaurante.setTelefono("123456789");
        assertEquals("123456789", restaurante.getTelefono());
    }
}