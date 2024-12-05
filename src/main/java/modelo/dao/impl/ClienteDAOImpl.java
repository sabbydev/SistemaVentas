package modelo.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.conexion.Conexion;
import modelo.dao.ClienteDAO;

public class ClienteDAOImpl extends Conexion implements ClienteDAO {

    @Override
    public void create(Cliente c) throws Exception {
        PreparedStatement declaracion = null;

        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("INSERT INTO clientes(id_doc, nombre, correo, telefono) VALUES(?, ?, ?, ?)");

            declaracion.setString(1, c.getIdDoc());
            declaracion.setString(2, c.getNombre());
            declaracion.setString(3, c.getCorreo());
            declaracion.setString(4, c.getTelefono());

            int filasAfectadas = declaracion.executeUpdate();
            System.out.println(filasAfectadas + (filasAfectadas > 1 ? " filas afectadas" : " fila afectada"));
        } catch (Exception e) {
            throw e;
        } finally {
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }
    }

    @Override
    public List<Cliente> read() throws Exception {
        List<Cliente> lista;
        PreparedStatement declaracion = null;
        ResultSet resultado = null;

        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("SELECT * FROM clientes");
            resultado = declaracion.executeQuery();

            lista = new ArrayList<>();

            while (resultado.next()) {
                Cliente c = new Cliente(
                        resultado.getInt("id_cliente"),
                        resultado.getString("id_doc"),
                        resultado.getString("nombre"),
                        resultado.getString("correo"),
                        resultado.getString("telefono")
                );
                lista.add(c);
            }

            declaracion.close();
            resultado.close();
        } catch (Exception e) {
            throw e;
        } finally {
            if (declaracion != null) declaracion.close();
            if (resultado != null) resultado.close();
            this.desconectar();
        }

        return lista;
    }

    @Override
    public void update(Cliente c) throws Exception {
        PreparedStatement declaracion = null;

        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("UPDATE clientes SET nombre = ?, correo = ?, telefono = ? WHERE id_cliente = ?");

            declaracion.setString(1, c.getNombre());
            declaracion.setString(2, c.getCorreo());
            declaracion.setString(3, c.getTelefono());
            declaracion.setLong(4, c.getId());

            int filasAfectadas = declaracion.executeUpdate();
            System.out.println(filasAfectadas + (filasAfectadas > 1 ? " filas afectadas" : " fila afectada"));
        } catch (Exception e) {
            throw e;
        } finally {
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }
    }

    @Override
    public void delete(long id) throws Exception {
        PreparedStatement declaracion = null;

        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("DELETE FROM clientes WHERE id_cliente = ?");

            declaracion.setLong(1, id);
            
            int filasAfectadas = declaracion.executeUpdate();
            System.out.println(filasAfectadas + (filasAfectadas > 1 ? " filas afectadas" : " fila afectada"));
        } catch (Exception e) {
            throw e;
        } finally {
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }
    }
    
    
    @Override
    public boolean existeCliente(String idDoc) throws Exception {
        PreparedStatement declaracion = null;
        ResultSet resultado = null;

        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("SELECT 1 FROM clientes WHERE id_doc = ?");
            declaracion.setString(1, idDoc);

            resultado = declaracion.executeQuery();

            return resultado.next();
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (resultado != null) resultado.close();
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }
    }
    
    @Override
    public long obtenerOInsertarClienteId(Cliente c) throws Exception {
        PreparedStatement declaracion = null;
        ResultSet resultado = null;
        long idCliente;

        try {
            this.conectar();

            declaracion = this.conexion.prepareStatement("SELECT id_cliente FROM clientes WHERE id_doc = ?");
            declaracion.setString(1, c.getIdDoc());
            
            resultado = declaracion.executeQuery();

            if (resultado.next()) {
                idCliente = resultado.getLong("id_cliente");
                
                declaracion = this.conexion.prepareStatement("UPDATE clientes SET nombre = ?, correo = ?, telefono = ? WHERE id_cliente = ?");
                declaracion.setString(1, c.getNombre());
                declaracion.setString(2, c.getCorreo());
                declaracion.setString(3, c.getTelefono());
                declaracion.setLong(4, idCliente);
                
                declaracion.executeUpdate();
                
                return idCliente;
            } else {
                declaracion = this.conexion.prepareStatement("INSERT INTO clientes(id_doc, nombre, correo, telefono) VALUES(?, ?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);
                declaracion.setString(1, c.getIdDoc());
                declaracion.setString(2, c.getNombre());
                declaracion.setString(3, c.getCorreo());
                declaracion.setString(4, c.getTelefono());
                
                int filasAfectadas = declaracion.executeUpdate();
                if (filasAfectadas > 0) {
                    resultado = declaracion.getGeneratedKeys();
                    if (resultado.next()) {
                        return resultado.getLong(1);
                    }
                }
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (resultado != null) resultado.close();
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }

        return -1;
    }
    
    public long crear(Cliente c) throws Exception {
        PreparedStatement declaracion = null;
        ResultSet generatedKeys = null;

        try {
            this.conectar();
            
            declaracion = this.conexion.prepareStatement("INSERT INTO clientes(id_doc, nombre, correo, telefono) VALUES(?, ?, ?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);

            declaracion.setString(1, c.getIdDoc());
            declaracion.setString(2, c.getNombre());
            declaracion.setString(3, c.getCorreo());
            declaracion.setString(4, c.getTelefono());

            int filasAfectadas = declaracion.executeUpdate();
            System.out.println(filasAfectadas + (filasAfectadas > 1 ? " filas afectadas" : " fila afectada"));
            
            if (filasAfectadas > 0) {
                generatedKeys = declaracion.getGeneratedKeys();
                if (generatedKeys.next()) {
                    return generatedKeys.getLong(1);
                }
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (generatedKeys != null) generatedKeys.close();
            if (declaracion != null) declaracion.close();
            this.desconectar();
        }
        return -1;
    }
}