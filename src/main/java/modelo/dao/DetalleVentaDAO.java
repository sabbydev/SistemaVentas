package modelo.dao;

import java.util.List;
import modelo.DetalleVenta;

public interface DetalleVentaDAO {
    public void create(List<DetalleVenta> dv) throws Exception;
    public List<DetalleVenta> read() throws Exception;
    public void update(List<DetalleVenta> dv) throws Exception;
    public void delete(List<DetalleVenta> dv) throws Exception;
}