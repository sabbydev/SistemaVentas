package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Producto;
import modelo.dao.impl.ProductoDAOImpl;
import modelo.dto.ProductoDTO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ControladorProducto {

    // Logger de Log4j2
    private static final Logger logger = LogManager.getLogger(ControladorProducto.class);

    public static void agregarProducto(String nombre, String categoria, double precio, String descripcion) {
        Producto p = new Producto(0, nombre, categoria, precio, descripcion, null);
        try {
            new ProductoDAOImpl().create(p);
            logger.info("Producto agregado: {}", nombre);
        } catch (Exception ex) {
            logger.error("Error al agregar el producto: {}", nombre, ex);
        }
    }

    public static List<Producto> obtenerProductos() {
        try {
            List<Producto> productos = new ProductoDAOImpl().read();
            logger.info("Productos obtenidos correctamente");
            return productos;
        } catch (Exception ex) {
            logger.error("Error al obtener los productos", ex);
        }
        return new ArrayList<>();
    }

    public static void modificarProducto(String nombre, String categoria, double precio, String descripcion) {
        Producto p = new Producto(0, nombre, categoria, precio, descripcion, null);
        try {
            new ProductoDAOImpl().update(p);
            logger.info("Producto modificado: {}", nombre);
        } catch (Exception ex) {
            logger.error("Error al modificar el producto: {}", nombre, ex);
        }
    }

    public static void eliminarProducto(long id) {
        try {
            new ProductoDAOImpl().delete(id);
            logger.info("Producto eliminado con ID: {}", id);
        } catch (Exception ex) {
            logger.error("Error al eliminar el producto con ID: {}", id, ex);
        }
    }

    public static List<String> obtenerNombresProductosOrdenados() {
        try {
            List<String> nombres = new ProductoDAOImpl().obtenerNombresProductosOrdenados();
            logger.info("Nombres de productos obtenidos y ordenados correctamente");
            return nombres;
        } catch (Exception ex) {
            logger.error("Error al obtener nombres de productos ordenados", ex);
            return new ArrayList<>();
        }
    }

    public static ProductoDTO buscarPorNombre(String nombre) {
        try {
            Producto p = new ProductoDAOImpl().buscarPorNombre(nombre);
            logger.info("Producto encontrado por nombre: {}", nombre);
            return new ProductoDTO(p.getId(), p.getNombre(), p.getCategoria(), p.getPrecio(), p.getDescripcion(), p.getFechaHoraCreacion());
        } catch (Exception ex) {
            logger.error("Error al buscar el producto por nombre: {}", nombre, ex);
            return null;
        }
    }

    public static double obtenerPrecioPorId(long id) throws Exception {
        try {
            double precio = new ProductoDAOImpl().obtenerPrecioPorId(id);
            logger.info("Precio obtenido para el producto con ID: {}", id);
            return precio;
        } catch (Exception ex) {
            logger.error("Error al obtener el precio del producto con ID: {}", id, ex);
            throw ex;
        }
    }

    public static long crearProducto(String nombre, String categoria, double precio, String descripcion) throws Exception {
        Producto p = new Producto(0, nombre, categoria, precio, descripcion, null);
        try {
            long productoId = new ProductoDAOImpl().crear(p);
            logger.info("Producto creado con ID: {}", productoId);
            return productoId;
        } catch (Exception ex) {
            logger.error("Error al crear el producto: {}", nombre, ex);
            throw ex;
        }
    }
}