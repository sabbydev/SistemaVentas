package modelo.dao;

import java.util.List;
import modelo.DetalleVenta;

public interface DetalleVentaDAO {
    public void create(DetalleVenta dv) throws Exception;
    public List<DetalleVenta> read() throws Exception;
    public void update(DetalleVenta dv) throws Exception;
    public void delete(long id) throws Exception;
}