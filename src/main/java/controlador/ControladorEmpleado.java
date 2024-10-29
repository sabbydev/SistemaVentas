package controlador;

import java.util.List;
import modelo.Empleado;
import modelo.dao.impl.EmpleadoDAOImpl;

public class ControladorEmpleado {
    
    public static void agregarEmpleado(Empleado e) throws Exception {
        new EmpleadoDAOImpl().create(e);
    }

    public static List<Empleado> obtenerEmpleados() throws Exception {
        return new EmpleadoDAOImpl().read();
    }

    public static void modificarEmpleados(Empleado e) throws Exception {
        new EmpleadoDAOImpl().update(e);
    }

    public static void eliminarEmpleados(Empleado e) throws Exception {
        new EmpleadoDAOImpl().delete(e);
    }
}