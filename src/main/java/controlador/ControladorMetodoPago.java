package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.MetodoPago;
import modelo.dao.impl.MetodoPagoDAOImpl;

public class ControladorMetodoPago {
    
    public static void agregarMetodoPago(String nombre, String descripcion, String estado) {
        MetodoPago mp = new MetodoPago(0, nombre, descripcion, estado);
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

    public static void modificarMetodosPago(String nombre, String descripcion, String estado) {
        MetodoPago mp = new MetodoPago(0, nombre, descripcion, estado);
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
            return new ArrayList<>();
        }
    }
    
    public static int obtenerIdPorNombre(String nombre) throws Exception {
        try {
            return new MetodoPagoDAOImpl().obtenerIdPorNombre(nombre);
        } catch (Exception ex) {
            System.out.println(ex);
            throw ex;
        }
    }

}