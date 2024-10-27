package controlador;

import java.util.List;
import modelo.Venta;
import modelo.dao.impl.VentaDAOImpl;

public class ControladorVenta {
    
    public static void agregarVentas(List<Venta> ventas) throws Exception {
        new VentaDAOImpl().create(ventas);
    }

    public static List<Venta> obtenerVentas() throws Exception {
        return new VentaDAOImpl().read();
    }

    public static void modificarVentas(List<Venta> ventas) throws Exception {
        new VentaDAOImpl().update(ventas);
    }

    public static void eliminarVentas(List<Venta> ventas) throws Exception {
        new VentaDAOImpl().delete(ventas);
    }
}
