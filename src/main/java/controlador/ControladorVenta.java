package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Venta;
import modelo.dao.impl.VentaDAOImpl;

public class ControladorVenta {
    
    public static void agregarVenta(long c, long e, long p) {
        Venta v = new Venta(0, c, e, p);
        try {
            new VentaDAOImpl().create(v);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static List<Venta> obtenerVentas() {
        try {
            return new VentaDAOImpl().read();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return new ArrayList<>();
    }

    public static void modificarVentas(int c, int e, int p) {
        Venta v = new Venta(0, c, e, p);
        try {
            new VentaDAOImpl().update(v);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void eliminarVentas(long id) {
        Venta v = new Venta(id, 0, 0, 0);
        try {
            new VentaDAOImpl().delete(v);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
