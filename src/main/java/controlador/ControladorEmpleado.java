package controlador;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import modelo.Empleado;
import modelo.dao.impl.EmpleadoDAOImpl;

public class ControladorEmpleado {

    // Logger de Log4j2
    private static final Logger logger = LogManager.getLogger(ControladorEmpleado.class);

    public static void agregarEmpleado(Empleado e) throws Exception {
        try {
            new EmpleadoDAOImpl().create(e);
            logger.info("Empleado agregado: {}", e.getNombre());
        } catch (Exception ex) {
            logger.error("Error al agregar el empleado: {}", e.getNombre(), ex);
            throw ex;  // Re-throw the exception after logging it
        }
    }

    public static List<Empleado> obtenerEmpleados() {
        try {
            List<Empleado> empleados = new EmpleadoDAOImpl().read();
            logger.info("Empleados obtenidos correctamente.");
            return empleados;
        } catch (Exception ex) {
            logger.error("Error al obtener los empleados", ex);
            return new ArrayList<>();
        }
    }

    public static void modificarEmpleado(Empleado e) throws Exception {
        try {
            new EmpleadoDAOImpl().update(e);
            logger.info("Empleado modificado: {}", e.getNombre());
        } catch (Exception ex) {
            logger.error("Error al modificar el empleado: {}", e.getNombre(), ex);
            throw ex;  // Re-throw the exception after logging it
        }
    }

    public static void eliminarEmpleado(long id) {
        try {
            new EmpleadoDAOImpl().delete(id);
            logger.info("Empleado eliminado: ID {}", id);
        } catch (Exception ex) {
            logger.error("Error al eliminar el empleado: ID {}", id, ex);
        }
    }

    public static long crearEmpleado(String idDoc, String nombre, String correo, String telefono) throws Exception {
        Empleado e = new Empleado(0, idDoc, nombre, correo, telefono, 0);
        try {
            long id = new EmpleadoDAOImpl().crear(e);
            logger.info("Empleado creado: ID {}", id);
            return id;
        } catch (Exception ex) {
            logger.error("Error al crear el empleado: {}", nombre, ex);
            throw ex;  // Re-throw the exception after logging it
        }
    }
}