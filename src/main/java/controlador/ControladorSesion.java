package controlador;

import modelo.dao.impl.EmpleadoDAOImpl;

public class ControladorSesion {
    
    public static String auntenticarUsuario(String correo, String pass) throws Exception {
        return new EmpleadoDAOImpl().getRol(correo, pass);
    }
}