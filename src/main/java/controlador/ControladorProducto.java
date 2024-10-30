package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Producto;
import modelo.dao.impl.ProductoDAOImpl;
import modelo.dto.ProductoDTO;

public class ControladorProducto {
    
    public static void agregarProducto(String nombre, String categoria, double precio, String descripcion) {
        Producto p = new Producto(0, nombre, categoria, precio, descripcion, null);
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
        return new ArrayList<>();
    }

    public static void modificarProducto(String nombre, String categoria, double precio, String descripcion) {
        Producto p = new Producto(0, nombre, categoria, precio, descripcion, null);
        try {
            new ProductoDAOImpl().update(p);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void eliminarProducto(long id) {
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
    
    public static ProductoDTO buscarPorNombre(String nombre) {
        try {
            Producto p = new ProductoDAOImpl().buscarPorNombre(nombre);
           return new ProductoDTO(p.getId(), p.getNombre(), p.getCategoria(), p.getPrecio(), p.getDescripcion(), p.getFechaHoraCreacion());
        } catch (Exception ex) {
            System.out.println(ex);
            return null;
        }
    }
    
    public static double obtenerPrecioPorId(long id) throws Exception {
        try {
            return new ProductoDAOImpl().obtenerPrecioPorId(id);
        } catch (Exception ex) {
            System.out.println(ex);
            throw ex;
        }
    }
}