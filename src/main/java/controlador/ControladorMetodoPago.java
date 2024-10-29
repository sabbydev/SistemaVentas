package controlador;

import java.util.List;
import modelo.MetodoPago;
import modelo.dao.impl.MetodoPagoDAOImpl;
import modelo.dto.MetodoPagoDTO;

public class ControladorMetodoPago {
    
    public static void agregarMetodoPago(MetodoPagoDTO mpDTO) {
        MetodoPago mp = new MetodoPago(0, mpDTO.getNombre().name(), mpDTO.getDescripcion(), mpDTO.getEstado().name());
        try {
            new MetodoPagoDAOImpl().create(mp);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static List<MetodoPago> obtenerMetodosPago() {
        try {
            return new MetodoPagoDAOImpl().read();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }

    public static void modificarMetodosPago(MetodoPagoDTO mpDTO) {
        MetodoPago mp = new MetodoPago(0, mpDTO.getNombre().name(), mpDTO.getDescripcion(), mpDTO.getEstado().name());
        try {
            new MetodoPagoDAOImpl().update(mp);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void eliminarMetodosPago(int id) {
        try {            
            new MetodoPagoDAOImpl().delete(id);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    public static List<String> obtenerNombresMetodosPago() {
        try {
            return new MetodoPagoDAOImpl().obtenerNombresMetodosPago();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }
}