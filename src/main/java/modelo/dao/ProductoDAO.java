package modelo.dao;

import java.util.List;
import modelo.Producto;

public interface ProductoDAO {
    public void create(Producto p) throws Exception;
    public List<Producto> read() throws Exception;
    public void update(Producto p) throws Exception;
    public void delete(Producto p) throws Exception;
}
