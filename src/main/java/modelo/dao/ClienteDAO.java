package modelo.dao;

import java.util.List;
import modelo.Cliente;

public interface ClienteDAO {
    public void create(List<Cliente> c) throws Exception;
    public List<Cliente> read() throws Exception;
    public void update(List<Cliente> c) throws Exception;
    public void delete(List<Cliente> c) throws Exception;
}