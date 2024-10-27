package modelo.dao;

import java.util.List;
import modelo.Venta;

public interface VentaDAO {
    public void create(List<Venta> v) throws Exception;
    public List<Venta> read() throws Exception;
    public void update(List<Venta> v) throws Exception;
    public void delete(List<Venta> v) throws Exception;
}