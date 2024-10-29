package modelo.dao;

import java.util.List;
import modelo.Venta;

public interface VentaDAO {
    public long create(Venta v) throws Exception;
    public List<Venta> read() throws Exception;
    public void update(Venta v) throws Exception;
    public void delete(Venta v) throws Exception;
}