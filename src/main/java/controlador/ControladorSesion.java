package controlador;

import modelo.Empleado;
import modelo.dao.impl.EmpleadoDAOImpl;
import modelo.dto.EmpleadoDTO;

public class ControladorSesion {
    
    public static EmpleadoDTO auntenticarUsuario(String correo, String pass) {
        Empleado e;
        try {
            e = new EmpleadoDAOImpl().obtenerEmpleado(correo, pass);
            EmpleadoDTO eDTO = new EmpleadoDTO(e.getId(), "", "", "",e.getRol(), 0);
            return eDTO;
        } catch (Exception ex) {
            System.out.println(ex);
            return null;
        }
    }
}