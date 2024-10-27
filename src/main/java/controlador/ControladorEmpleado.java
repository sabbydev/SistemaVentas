package controlador;

import java.util.List;
import modelo.Empleado;
import modelo.dao.impl.EmpleadoDAOImpl;

public class ControladorEmpleado {
    
    public static void agregarEmpleado(List<Empleado> empleados) throws Exception {
        new EmpleadoDAOImpl().create(empleados);
    }

    public static List<Empleado> obtenerEmpleados() throws Exception {
        return new EmpleadoDAOImpl().read();
    }

    public static void modificarEmpleados(List<Empleado> empleados) throws Exception {
        new EmpleadoDAOImpl().update(empleados);
    }

    public static void eliminarEmpleados(List<Empleado> empleados) throws Exception {
        new EmpleadoDAOImpl().delete(empleados);
    }
}