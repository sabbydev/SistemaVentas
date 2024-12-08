package controlador;

import java.util.List;
import modelo.DetalleVenta;
import modelo.dao.impl.DetalleVentaDAOImpl;
import modelo.dto.DetalleVentaDTO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ControladorDetalleVenta {

    // Logger de Log4j2
    private static final Logger logger = LogManager.getLogger(ControladorDetalleVenta.class);

    public static void agregarDetalleVenta(DetalleVentaDTO dvDTO) throws Exception {
        DetalleVenta dv = new DetalleVenta(-1, dvDTO.getIdVenta(), dvDTO.getIdMetodoPago(), dvDTO.getPrecioUnitario(), dvDTO.getCantidad(), null);
        try {
            new DetalleVentaDAOImpl().create(dv);
            logger.info("Detalle de venta agregado: Venta ID {}", dvDTO.getIdVenta());
        } catch (Exception ex) {
            logger.error("Error al agregar el detalle de venta: Venta ID {}", dvDTO.getIdVenta(), ex);
            throw ex;
        }
    }

    public static List<DetalleVenta> obtenerDetalleVenta() throws Exception {
        try {
            List<DetalleVenta> detalles = new DetalleVentaDAOImpl().read();
            logger.info("Detalles de venta obtenidos correctamente.");
            return detalles;
        } catch (Exception ex) {
            logger.error("Error al obtener los detalles de venta", ex);
            throw ex;
        }
    }

    public static void modificarDetalleVenta(DetalleVenta dv) throws Exception {
        try {
            new DetalleVentaDAOImpl().update(dv);
            logger.info("Detalle de venta modificado: Venta ID {}", dv.getIdVenta());
        } catch (Exception ex) {
            logger.error("Error al modificar el detalle de venta: Venta ID {}", dv.getIdVenta(), ex);
            throw ex;
        }
    }

    public static void eliminarDetalleVenta(long id) throws Exception {
        try {
            new DetalleVentaDAOImpl().delete(id);
            logger.info("Detalle de venta eliminado: ID {}", id);
        } catch (Exception ex) {
            logger.error("Error al eliminar el detalle de venta: ID {}", id, ex);
            throw ex;
        }
    }

    public static long crearDetalleVenta(long idVenta, long idMetodoPago, double precioUnitario, int cantidad) throws Exception {
        DetalleVenta dv = new DetalleVenta(-1, idVenta, idMetodoPago, precioUnitario, cantidad, null);
        try {
            long id = new DetalleVentaDAOImpl().crear(dv);
            logger.info("Detalle de venta creado: Venta ID {}", idVenta);
            return id;
        } catch (Exception ex) {
            logger.error("Error al crear el detalle de venta: Venta ID {}", idVenta, ex);
            throw ex;
        }
    }

    public static DetalleVenta obtenerDetalleVenta(long id) throws Exception {
        try {
            DetalleVenta dv = new DetalleVentaDAOImpl().obtenerDetalleVenta(id);
            logger.info("Detalle de venta obtenido: ID {}", id);
            return dv;
        } catch (Exception ex) {
            logger.error("Error al obtener el detalle de venta: ID {}", id, ex);
            throw ex;
        }
    }
}