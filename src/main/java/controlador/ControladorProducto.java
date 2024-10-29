package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Producto;
import modelo.dao.impl.ProductoDAOImpl;
import modelo.dto.ProductoDTO;

public class ControladorProducto {
    
    public static void agregarProducto(ProductoDTO pDTO) {
        Producto p = new Producto(0, pDTO.getNombre(), pDTO.getCategoria(), pDTO.getPrecio(), pDTO.getDescripcion(), null);
        try {
            new ProductoDAOImpl().create(p);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static List<Producto> obtenerProductos() {
        try {
            return new ProductoDAOImpl().read();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }

    public static void modificarProducto(ProductoDTO pDTO) {
        Producto p = new Producto(0, pDTO.getNombre(), pDTO.getCategoria(), pDTO.getPrecio(), pDTO.getDescripcion(), null);
        try {
            new ProductoDAOImpl().update(p);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void eliminarProducto(int id) {
        try {
            new ProductoDAOImpl().delete(id);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    public static List<String> obtenerNombresProductosOrdenados() {
        try {
            return new ProductoDAOImpl().obtenerNombresProductosOrdenados();
        } catch (Exception ex) {
            System.out.println(ex);
            return new ArrayList<>();
        }
    }
}