package controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cliente;
import modelo.dao.impl.ClienteDAOImpl;

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
    public static void modificarCliente(String idDoc, String nombre, String correo, String telefono) {
        Cliente c = new Cliente(0, idDoc, nombre, correo, telefono);
        try {
            new ClienteDAOImpl().update(c);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public static void eliminarCliente(String idDoc, String nombre, String correo, String telefono) {
        Cliente c = new Cliente(0, idDoc, nombre, correo, telefono);
        try {
            new ClienteDAOImpl().delete(c);
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
    
    public static int obtenerOInsertarClienteId(String idDoc, String nombre, String correo, String telefono) {
        try {
            return new ClienteDAOImpl().obtenerOInsertarClienteId(idDoc, nombre, correo, telefono);
        } catch (SQLException sqlEx) {
            System.err.println(sqlEx.getMessage());
            return 0;
        } catch (Exception ex) {
            System.out.println(ex);
            return 0;
        }
    }
}