package controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.dao.impl.ClienteDAOImpl;
import modelo.dto.ClienteDTO;

public class ControladorCliente {
    
    public static void agregarCliente(String idDoc, String nombre, String correo, String telefono) {
        Cliente c = new Cliente(0, idDoc, nombre, correo, telefono);
        try {
            new ClienteDAOImpl().create(c);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public static List<Cliente> obtenerClientes() {
        try {
            return new ClienteDAOImpl().read();
        } catch (Exception ex) {
            System.out.println(ex);
            return new ArrayList<>();
        }
    }
    public static void modificarCliente(ClienteDTO cDTO) {
        Cliente c = new Cliente(0, cDTO.getIdDoc(), cDTO.getNombre(), cDTO.getCorreo(), cDTO.getTelefono());
        try {
            new ClienteDAOImpl().update(c);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public static void eliminarCliente(long id) {
        try {
            new ClienteDAOImpl().delete(id);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    public static boolean clienteExiste(String idDoc) {
        try {
            return new ClienteDAOImpl().existeCliente(idDoc);
        } catch (SQLException sqlEx) {
            System.err.println("Error al consultar en la base de datos: " + sqlEx.getMessage());
            return false;
        } catch (Exception ex) {
            System.err.println("Error inesperado: " + ex.getMessage());
            return false;
        }
    }
    
    public static long obtenerOInsertarClienteId(ClienteDTO cDTO) {
        Cliente c = new Cliente(0, cDTO.getIdDoc(), cDTO.getNombre(), cDTO.getCorreo(), cDTO.getTelefono());
        try {
            return new ClienteDAOImpl().obtenerOInsertarClienteId(c);
        } catch (SQLException sqlEx) {
            System.err.println(sqlEx.getMessage());
            return 0;
        } catch (Exception ex) {
            System.out.println(ex);
            return 0;
        }
    }
    
    public static long crearCliente(String idDoc, String nombre, String correo, String telefono) throws Exception {
        Cliente c = new Cliente(0, idDoc, nombre, correo, telefono);
        try {
            return new ClienteDAOImpl().crear(c);
        } catch (Exception ex) {
            System.out.println(ex);
            throw ex;
        }
    }
}