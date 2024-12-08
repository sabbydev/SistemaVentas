package funcionales.integracion;

import java.time.LocalDateTime;
import modelo.DetalleVenta;
import modelo.Venta;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegistrarVentaTest {
    long idCliente;
    long idEmpleado;
    long idProducto;
    int idMetodoPago;
    
    long idVenta;
    long idDetalleVenta;

    @BeforeEach
    public void setUp() throws Exception {
        idCliente = controlador.ControladorCliente.crearCliente("c0000000000000000000", "exampletestCliente", "exampleCliente@example.com", "+C 000 000 000");
        assertTrue(idCliente > 0, "El ID de cliente debería ser un valor positivo.");
        idEmpleado = controlador.ControladorEmpleado.crearEmpleado("eeeeeee", "exampletestEmpleado", "exampleEmpleado@example.com", "+E 000 000 000");
        assertTrue(idEmpleado > 0, "El ID de empleado debería ser un valor positivo.");
        idProducto = controlador.ControladorProducto.crearProducto("exampleProducto", "example", 0, "example");
        assertTrue(idProducto > 0, "El ID de producto debería ser un valor positivo.");
        idMetodoPago = controlador.ControladorMetodoPago.crearMetodoPago("example", "example", "ACTIVO");
        assertTrue(idMetodoPago > 0, "El ID de método de pago debería ser un valor positivo.");
    }

    @Test
    public void testRegistrarVenta() throws Exception {
        idVenta = controlador.ControladorVenta.agregarVenta(idCliente, idEmpleado, idProducto);
        assertNotNull(idVenta, "El ID de venta no debería ser nulo.");
        assertTrue(idVenta > 0, "El ID de venta debería ser un valor positivo.");
        
        idDetalleVenta = controlador.ControladorDetalleVenta.crearDetalleVenta(idVenta, idMetodoPago, 0, 0);
        assertNotNull(idDetalleVenta, "El ID de detalle de venta no debería ser nulo.");
        assertTrue(idDetalleVenta > 0, "El ID de detalle de venta debería ser un valor positivo.");
        
        Venta venta = controlador.ControladorVenta.obtenerVenta(idVenta);
        assertEquals(idCliente, venta.getIdCliente(), "El cliente de la venta no coincide.");
        assertEquals(idEmpleado, venta.getIdEmpleado(), "El empleado de la venta no coincide.");
        assertEquals(idProducto, venta.getIdProducto(), "El producto de la venta no coincide.");
        
        DetalleVenta dv = controlador.ControladorDetalleVenta.obtenerDetalleVenta(idDetalleVenta);
        assertEquals(idDetalleVenta, dv.getId(), "El ID del detalle de venta no coincide.");
        assertEquals(idVenta, dv.getIdVenta(), "El ID de la venta en el detalle no coincide.");
        assertEquals(idMetodoPago, dv.getIdMetodoPago(), "El método de pago del detalle de venta no coincide.");
        assertEquals(0, dv.getPrecioUnitario(), "El precio unitario del detalle de venta no coincide.");
        assertEquals(0, dv.getCantidad(), "La cantidad del detalle de venta no coincide.");
        assertEquals(0, dv.getMontoTotal(), "El monto total del detalle de venta no coincide.");

        assertNotNull(dv.getFechaHora(), "La fecha y hora del detalle de venta no deberían ser nulas.");
        assertTrue(dv.getFechaHora().isBefore(LocalDateTime.now().plusSeconds(1)), "La fecha y hora deberían ser anteriores al momento actual.");
        assertTrue(dv.getFechaHora().isAfter(LocalDateTime.now().minusMinutes(1)), "La fecha y hora deberían ser recientes.");
    }

    @AfterEach
    public void tearDown() throws Exception {
        controlador.ControladorDetalleVenta.eliminarDetalleVenta(idDetalleVenta);
        controlador.ControladorVenta.eliminarVenta(idVenta);
        controlador.ControladorCliente.eliminarCliente(idCliente);
        controlador.ControladorEmpleado.eliminarEmpleado(idEmpleado);
        controlador.ControladorProducto.eliminarProducto(idProducto);
        controlador.ControladorMetodoPago.eliminarMetodoPago(idMetodoPago);
    }
}
