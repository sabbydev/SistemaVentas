package controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.dao.impl.ClienteDAOImpl;
import modelo.dto.ClienteDTO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ControladorCliente {
    
    private static final Logger logger = LogManager.getLogger(ControladorCliente.class);

    // Método para agregar un cliente
    public static void agregarCliente(String idDoc, String nombre, String correo, String telefono) {
        Cliente c = new Cliente(0, idDoc, nombre, correo, telefono);
        try {
            new ClienteDAOImpl().create(c);
            logger.info("Cliente agregado: {} - {}", nombre, correo);
        } catch (Exception ex) {
            logger.error("Error al agregar cliente: {} - {}", nombre, ex.getMessage(), ex);
        }
    }

    // Método para obtener todos los clientes
    public static List<Cliente> obtenerClientes() {
        try {
            List<Cliente> clientes = new ClienteDAOImpl().read();
            logger.info("Clientes obtenidos exitosamente");
            return clientes;
        } catch (Exception ex) {
            logger.error("Error al obtener clientes: {}", ex.getMessage(), ex);
            return new ArrayList<>();
        }
    }

    // Método para modificar un cliente
    public static void modificarCliente(ClienteDTO cDTO) {
        Cliente c = new Cliente(0, cDTO.getIdDoc(), cDTO.getNombre(), cDTO.getCorreo(), cDTO.getTelefono());
        try {
            new ClienteDAOImpl().update(c);
            logger.info("Cliente modificado: {} - {}", cDTO.getNombre(), cDTO.getCorreo());
        } catch (Exception ex) {
            logger.error("Error al modificar cliente: {} - {}", cDTO.getNombre(), ex.getMessage(), ex);
        }
    }

    // Método para eliminar un cliente
    public static void eliminarCliente(long id) {
        try {
            new ClienteDAOImpl().delete(id);
            logger.info("Cliente eliminado con ID: {}", id);
        } catch (Exception ex) {
            logger.error("Error al eliminar cliente con ID {}: {}", id, ex.getMessage(), ex);
        }
    }

    // Método para verificar si un cliente existe
    public static boolean clienteExiste(String idDoc) {
        try {
            boolean existe = new ClienteDAOImpl().existeCliente(idDoc);
            logger.info("Consulta de existencia de cliente con ID {}: {}", idDoc, existe ? "Encontrado" : "No encontrado");
            return existe;
        } catch (SQLException sqlEx) {
            logger.error("Error al consultar existencia de cliente con ID {}: {}", idDoc, sqlEx.getMessage(), sqlEx);
            return false;
        } catch (Exception ex) {
            logger.error("Error inesperado al consultar existencia de cliente con ID {}: {}", idDoc, ex.getMessage(), ex);
            return false;
        }
    }

    // Método para obtener o insertar el ID de un cliente
    public static long obtenerOInsertarClienteId(ClienteDTO cDTO) {
        Cliente c = new Cliente(0, cDTO.getIdDoc(), cDTO.getNombre(), cDTO.getCorreo(), cDTO.getTelefono());
        try {
            long id = new ClienteDAOImpl().obtenerOInsertarClienteId(c);
            logger.info("ID de cliente obtenido o insertado: {}", id);
            return id;
        } catch (SQLException sqlEx) {
            logger.error("Error al obtener o insertar ID de cliente: {}", sqlEx.getMessage(), sqlEx);
            return 0;
        } catch (Exception ex) {
            logger.error("Error inesperado al obtener o insertar ID de cliente: {}", ex.getMessage(), ex);
            return 0;
        }
    }

    // Método para crear un cliente
    public static long crearCliente(String idDoc, String nombre, String correo, String telefono) throws Exception {
        Cliente c = new Cliente(0, idDoc, nombre, correo, telefono);
        try {
            long id = new ClienteDAOImpl().crear(c);
            logger.info("Cliente creado exitosamente con ID: {}", id);
            return id;
        } catch (Exception ex) {
            logger.error("Error al crear cliente: {} - {}", nombre, ex.getMessage(), ex);
            throw ex;
        }
    }
}
