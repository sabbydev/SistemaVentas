package modelo.dao;

import java.util.List;
import modelo.Producto;

public interface ProductoDAO {
    public void create(Producto p) throws Exception;
    public List<Producto> read() throws Exception;
    public void update(Producto p) throws Exception;
    public void delete(long id) throws Exception;
    
    public Producto obtenerPorNombre(String nombre) throws Exception;
    public List<String> obtenerNombresProductosOrdenados() throws Exception;
    public Producto buscarPorNombre(String nombre) throws Exception;
    public double obtenerPrecioPorId(long id) throws Exception;
}