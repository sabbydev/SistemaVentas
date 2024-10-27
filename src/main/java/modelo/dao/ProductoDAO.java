package modelo.dao;

import java.util.List;
import modelo.Producto;

public interface ProductoDAO {
    public void create(List<Producto> p) throws Exception;
    public List<Producto> read() throws Exception;
    public void update(List<Producto> p) throws Exception;
    public void delete(List<Producto> p) throws Exception;
}
