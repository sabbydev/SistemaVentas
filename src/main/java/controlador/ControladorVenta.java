package controlador;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import modelo.Venta;
import modelo.dao.impl.VentaDAOImpl;

public class ControladorVenta {
    
    // Logger de Log4j2
    private static final Logger logger = LogManager.getLogger(ControladorVenta.class);

    public static long agregarVenta(long clienteId, long empleadoId, long productoId) throws Exception {
        Venta v = new Venta(0, clienteId, empleadoId, productoId);
        try {
            return new VentaDAOImpl().create(v);
        } catch (Exception ex) {
            logger.error("Error al agregar la venta: ", ex);
            throw ex;
        }
    }

    public static List<Venta> obtenerVentas() {
        try {
            return new VentaDAOImpl().read();
        } catch (Exception ex) {
            logger.error("Error al obtener las ventas: ", ex);
        }
        return new ArrayList<>();
    }

    public static void modificarVentas(long clienteId, long empleadoId, long productoId) {
        Venta v = new Venta(0, clienteId, empleadoId, productoId);
        try {
            new VentaDAOImpl().update(v);
        } catch (Exception ex) {
            logger.error("Error al modificar la venta: ", ex);
        }
    }

    public static void eliminarVenta(long id) {
        Venta v = new Venta(id,0, 0, 0);
        try {
            new VentaDAOImpl().delete(v);
        } catch (Exception ex) {
            logger.error("Error al eliminar la venta con ID " + id, ex);
        }
    }
    
    public static List<Object[]> obtenerVentasConDetalles() {
        try {
            return new VentaDAOImpl().obtenerVentasConDetalles();
        } catch (Exception ex) {
            logger.error("Error al obtener ventas con detalles: ", ex);
        }
        return new ArrayList<>();
    }
    
    public static Venta obtenerVenta(long id) throws Exception {
        try {
            return new VentaDAOImpl().obtenerVenta(id);
        } catch (Exception ex) {
            logger.error("Error al obtener la venta con ID " + id, ex);
            throw ex;
        }
    }
}