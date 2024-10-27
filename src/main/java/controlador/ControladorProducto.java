package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Producto;
import modelo.dao.impl.ProductoDAOImpl;

public class ControladorProducto {
    
    //Métodos hacia la base de datos
    public static void agregarProducto(List<Producto> productos) throws Exception {
        new ProductoDAOImpl().create(productos);
    }

    public static List<Producto> obtenerProductos() {
        try {
            return new ProductoDAOImpl().read();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }

    public static void modificarProducto(List<Producto> productos) throws Exception {
        new ProductoDAOImpl().update(productos);
    }

    public static void eliminarProducto(List<Producto> productos) throws Exception {
        new ProductoDAOImpl().delete(productos);
    }
    
    //Métodos hacia la interfaz gráfica
    public static List<String> obtenerNombres() {
        List<Producto> productos = obtenerProductos();
        if (productos == null) {
            return new ArrayList<>();
        }

        List<String> nombresProductos = new ArrayList<>(productos.size());
        for (Producto producto : productos) {
            nombresProductos.add(producto.getNombre());
        }
        return nombresProductos;
    }
}