package modelo.dao;

import java.util.List;
import modelo.MetodoPago;

public interface MetodoPagoDAO {
    public void create(MetodoPago mp) throws Exception;
    public List<MetodoPago> read() throws Exception;
    public void update(MetodoPago mp) throws Exception;
    public void delete(int id) throws Exception;
    
    public List<String> obtenerNombresMetodosPago() throws Exception;
}