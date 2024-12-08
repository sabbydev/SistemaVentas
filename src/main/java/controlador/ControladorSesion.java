package controlador;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import modelo.Empleado;
import modelo.dao.impl.EmpleadoDAOImpl;
import modelo.dto.EmpleadoDTO;

public class ControladorSesion {
    private static final Logger logger = LogManager.getLogger(ControladorSesion.class);
    
    public static EmpleadoDTO autenticarUsuario(String correo, String pass) {
        Empleado e = null;
        EmpleadoDTO eDTO = null;
        try {
            e = new EmpleadoDAOImpl().obtenerEmpleado(correo, pass);
            if(e != null) {
                logger.info("Autenticación exitosa para el usuario: {}", correo);
                eDTO = new EmpleadoDTO(e.getId(), "", "", "",e.getRol(), 0);
            }
            logger.warn("Intento de autenticación fallido para el usuario: {}", correo);
            return eDTO;
        } catch (Exception ex) {
            logger.error("Error al autenticar al usuario: {}", correo, ex);
            return null;
        }
    }
}