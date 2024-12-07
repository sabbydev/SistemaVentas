package controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Empleado;
import modelo.dao.impl.EmpleadoDAOImpl;

public class ControladorEmpleado {
    
    public static void agregarEmpleado(Empleado e) throws Exception {
        new EmpleadoDAOImpl().create(e);
    }

    public static List<Empleado> obtenerEmpleados() {
        try {
            return new EmpleadoDAOImpl().read();
        } catch (Exception ex) {
            System.out.println(ex);
            return new ArrayList<>();
        }
    }

    public static void modificarEmpleado(Empleado e) throws Exception {
        new EmpleadoDAOImpl().update(e);
    }

    public static void eliminarEmpleado(long id) {
        try {
            new EmpleadoDAOImpl().delete(id);
        } catch (Exception ex) {
            Logger.getLogger(ControladorEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static long crearEmpleado(String idDoc, String nombre, String correo, String telefono) throws Exception {
        Empleado e = new Empleado(0, idDoc, nombre, correo, telefono, 0);
        try {
            return new EmpleadoDAOImpl().crear(e);
        } catch (Exception ex) {
            System.out.println(ex);
            throw ex;
        }
    }
}