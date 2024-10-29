package modelo.dao;

import java.util.List;
import modelo.MetodoPago;

public interface MetodoPagoDAO {
    public void create(List<MetodoPago> mp) throws Exception;
    public List<MetodoPago> read() throws Exception;
    public void update(List<MetodoPago> mp) throws Exception;
    public void delete(List<MetodoPago> mp) throws Exception;
}