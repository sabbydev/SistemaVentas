package controlador;

import java.util.List;
import modelo.Empleado;
import modelo.dao.impl.EmpleadoDAOImpl;

public class ControladorEmpleado {
    
    public static void agregarEmpleado(Empleado e) throws Exception {
        new EmpleadoDAOImpl().create(e);
    }

    public static List<Empleado> obtenerEmpleado() throws Exception {
        return new EmpleadoDAOImpl().read();
    }

    public static void modificarEmpleado(Empleado e) throws Exception {
        new EmpleadoDAOImpl().update(e);
    }

    public static void eliminarEmpleado(long id) throws Exception {
        new EmpleadoDAOImpl().delete(id);
    }
}