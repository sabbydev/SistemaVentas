package controlador;

import java.util.List;
import modelo.Cliente;
import modelo.dao.impl.ClienteDAOImpl;

public class ControladorCliente {
    
    public static void agregarClientes(List<Cliente> clientes) throws Exception {
        new ClienteDAOImpl().create(clientes);
    }

    public static List<Cliente> obtenerClientes() throws Exception {
        return new ClienteDAOImpl().read();
    }

    public static void modificarClientes(List<Cliente> clientes) throws Exception {
        new ClienteDAOImpl().update(clientes);
    }

    public static void eliminarClientes(List<Cliente> clientes) throws Exception {
        new ClienteDAOImpl().delete(clientes);
    }
}