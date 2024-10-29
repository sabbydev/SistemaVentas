package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.MetodoPago;
import modelo.dao.impl.MetodoPagoDAOImpl;

public class ControladorMetodoPago {
    
    //Métodos hacia la base de datos
    public static void agregarMetodosPago(List<MetodoPago> metodosPago) throws Exception {
        new MetodoPagoDAOImpl().create(metodosPago);
    }

    public static List<MetodoPago> obtenerMetodosPago() {
        try {
            return new MetodoPagoDAOImpl().read();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }

    public static void modificarMetodosPago(List<MetodoPago> metodosPago) throws Exception {
        new MetodoPagoDAOImpl().update(metodosPago);
    }

    public static void eliminarMetodosPago(List<MetodoPago> metodosPago) throws Exception {
        new MetodoPagoDAOImpl().delete(metodosPago);
    }
    
    //Métodos hacia la interfaz gráfica
    public static List<String> obtenerNombres() {
        List<MetodoPago> metodosPago = obtenerMetodosPago();
        if (metodosPago == null) {
            return new ArrayList<>();
        }

        List<String> nombresMetodosPago = new ArrayList<>(metodosPago.size());
        for (MetodoPago mp : metodosPago) {
            nombresMetodosPago.add(mp.getNombre());
        }
        return nombresMetodosPago;
    }
}