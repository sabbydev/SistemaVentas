package modelo.dao;

import java.util.List;
import modelo.Cliente;

public interface ClienteDAO {
    public void create(Cliente c) throws Exception;
    public List<Cliente> read() throws Exception;
    public void update(Cliente c) throws Exception;
    public void delete(long id) throws Exception;
    
    boolean existeCliente(String idDoc) throws Exception;
    public long obtenerOInsertarClienteId(Cliente c) throws Exception;
}