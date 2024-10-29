package controlador;

import java.util.List;
import modelo.DetalleVenta;
import modelo.dao.impl.DetalleVentaDAOImpl;

public class ControladorDetalleVenta {
    
    public static void agregarDetalleVenta(DetalleVenta dv) throws Exception {
        new DetalleVentaDAOImpl().create(dv);
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
}
