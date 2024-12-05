package controlador;

import java.util.List;
import modelo.DetalleVenta;
import modelo.dao.impl.DetalleVentaDAOImpl;
import modelo.dto.DetalleVentaDTO;

public class ControladorDetalleVenta {
    
    public static void agregarDetalleVenta(DetalleVentaDTO dvDTO) throws Exception {
        DetalleVenta dv = new DetalleVenta(-1, dvDTO.getIdVenta(), dvDTO.getIdMetodoPago(), dvDTO.getPrecioUnitario(), dvDTO.getCantidad(), null);
        try {
            new DetalleVentaDAOImpl().create(dv);
        } catch (Exception ex) {
            System.out.println(ex);
            throw ex;
        }
    }

    public static List<DetalleVenta> obtenerDetalleVenta() throws Exception {
        return new DetalleVentaDAOImpl().read();
    }

    public static void modificarDetalleVenta(DetalleVenta dv) throws Exception {
        new DetalleVentaDAOImpl().update(dv);
    }

    public static void eliminarDetalleVenta(long id) throws Exception {
        new DetalleVentaDAOImpl().delete(id);
    }
    
    public static long crearDetalleVenta(long idVenta, long idMetodoPago, double precioUnitario, int cantidad) throws Exception {
        DetalleVenta dv = new DetalleVenta(-1, idVenta, idMetodoPago, precioUnitario, cantidad, null);
        try {
            return new DetalleVentaDAOImpl().crear(dv);
        } catch (Exception ex) {
            System.out.println(ex);
            throw ex;
        }
    }
    
    public static DetalleVenta obtenerDetalleVenta(long id) throws Exception {
        try {
            return new DetalleVentaDAOImpl().obtenerDetalleVenta(id);
        } catch (Exception ex) {
            System.out.println(ex);
            throw ex;
        }
    }
}
