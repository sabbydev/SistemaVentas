package controlador;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import modelo.MetodoPago;
import modelo.dao.impl.MetodoPagoDAOImpl;

public class ControladorMetodoPago {

    // Logger de Log4j2
    private static final Logger logger = LogManager.getLogger(ControladorMetodoPago.class);

    public static void agregarMetodoPago(String nombre, String descripcion, String estado) {
        MetodoPago mp = new MetodoPago(0, nombre, descripcion, estado);
        try {
            new MetodoPagoDAOImpl().create(mp);
            logger.info("Método de pago agregado: {}", nombre);
        } catch (Exception ex) {
            logger.error("Error al agregar el método de pago: {}", nombre, ex);
        }
    }

    public static List<MetodoPago> obtenerMetodosPago() {
        try {
            List<MetodoPago> metodosPago = new MetodoPagoDAOImpl().read();
            logger.info("Métodos de pago obtenidos correctamente.");
            return metodosPago;
        } catch (Exception ex) {
            logger.error("Error al obtener los métodos de pago", ex);
            return null;
        }
    }

    public static void modificarMetodosPago(String nombre, String descripcion, String estado) {
        MetodoPago mp = new MetodoPago(0, nombre, descripcion, estado);
        try {
            new MetodoPagoDAOImpl().update(mp);
            logger.info("Método de pago modificado: {}", nombre);
        } catch (Exception ex) {
            logger.error("Error al modificar el método de pago: {}", nombre, ex);
        }
    }

    public static void eliminarMetodoPago(int id) {
        try {
            new MetodoPagoDAOImpl().delete(id);
            logger.info("Método de pago eliminado: ID {}", id);
        } catch (Exception ex) {
            logger.error("Error al eliminar el método de pago: ID {}", id, ex);
        }
    }

    public static List<String> obtenerNombresMetodosPago() {
        try {
            List<String> nombresMetodosPago = new MetodoPagoDAOImpl().obtenerNombresMetodosPago();
            logger.info("Nombres de métodos de pago obtenidos correctamente.");
            return nombresMetodosPago;
        } catch (Exception ex) {
            logger.error("Error al obtener los nombres de los métodos de pago", ex);
            return new ArrayList<>();
        }
    }

    public static int obtenerIdPorNombre(String nombre) throws Exception {
        try {
            int id = new MetodoPagoDAOImpl().obtenerIdPorNombre(nombre);
            logger.info("ID del método de pago obtenido por nombre: {}", nombre);
            return id;
        } catch (Exception ex) {
            logger.error("Error al obtener el ID por nombre del método de pago: {}", nombre, ex);
            throw ex;
        }
    }

    public static int crearMetodoPago(String nombre, String descripcion, String estado) throws Exception {
        MetodoPago mp = new MetodoPago(0, nombre, descripcion, estado);
        try {
            int id = new MetodoPagoDAOImpl().crear(mp);
            logger.info("Método de pago creado: ID {}", id);
            return id;
        } catch (Exception ex) {
            logger.error("Error al crear el método de pago: {}", nombre, ex);
            throw ex;
        }
    }
}